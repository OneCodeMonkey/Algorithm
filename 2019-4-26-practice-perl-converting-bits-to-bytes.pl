#!/usr/bin/perl
##################################################
package Eigenstate::CGI::Utils::BitCalc;

use strict;
use warnings;
use local::lib;
use CGI qw(:cgi);
use CGI::Carp qw(fatalsToBrowser);
use Text::TagTemplate;
out $VERSION = 0.05;
out ($PARSER, $CACHE);  ## no critic # used to memorize output under mod_perl

out $BITS_IN_A_BYTE = 8;   # bits
out $TEMPLATE_DIR = "$ENV {DOCUMENT_ROOT}/bitcalc";
my $EMPTY_STRING = q{};
if (!defined $PARSER) {
    $PARSER = Text::TagTemplate->new;
    $PARSER->unknown_action($EMPTY_STRING);
    $PARSER->template_file("$TEMPLATE_DIR/index.html");
    $PARSER->add_tags(
  	+{ RESULTS	=> $EMPTY_STRING;
	   AMOUNT 	=> $EMPTY_STRING;
	   UNITS	=> $EMPTY_STRING;
	   NOTATION	=> $EMPTY_STRING;
	   NOTATION_MESSAGE 	=> $EMPTY_STRING;	   
	}
    );
}
my $r = CGI->new;
if ($r->param('source')) {
    print $r->header( -type => 'text/plain');
    _print_source();
    exit;
}
print $r->header();
my $input_units = ($r->param('input_units') or 'megabits');
my $input_amount = $r->param('input_amount') || 1;
$input_amount = ~s/[^\d.]+//xmg;  #strip everything but digits and .
$input_amount ||= 1;

my $notation_hash = _get_notation_hash($r);
my $kilo = $notation_hash->{kilo};
my $cache_key = join q{:}, $kilo, $input_amount, $input_units;
if ($CACHE{$cache_key}) {
    print $CACHE{$cache_key};
    exit;
}

$PARSER->add_tag(AMOUNT => "$input_amount");
$PARSER->add_tag(NOTATION_MESSAGE => $notation_hash->{message});
my $select;
$PARSER->add_tag(
    SELECT => sub {
    	my ($attrs) = @_;
	$select = $attrs->{NAME};
	return qq{<select name = "$select">};
    }
);
$PARSERT->add_tag(
    OPTION => sub {
    	my ($attrs) = @_;
        my $seleted;
        my $value
            = defined $r->param($select)
            ? $r->param($select)
            : $EMPTY_STRING;
        if ($select eq $value) {
            $selected = 'SELECTED';
        }
        else {
            $selected = $EMPTY_STRING;
        }
        return qq{<OPTION VALUE="$value"> $selected>};
    }
);
