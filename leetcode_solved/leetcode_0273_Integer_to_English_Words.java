// AC: 
// Runtime: 2 ms, faster than 94.81% of Java online submissions for Integer to English Words.
// Memory Usage: 38.5 MB, less than 84.90% of Java online submissions for Integer to English Words.
// verbose to create english words array...
// T:O(logn), S:O(logn)
// 
class Solution {
    String[] units = new String[]{"Hundred", "Thousand", "Million", "Billion"};
    String[] numbers = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine", "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine", "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine", "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four", "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine", "Sixty", "Sixty One", "Sixty Two", "Sixty Three", "Sixty Four", "Sixty Five", "Sixty Six", "Sixty Seven", "Sixty Eight", "Sixty Nine", "Seventy", "Seventy One", "Seventy Two", "Seventy Three", "Seventy Four", "Seventy Five", "Seventy Six", "Seventy Seven", "Seventy Eight", "Seventy Nine", "Eighty", "Eighty One", "Eighty Two", "Eighty Three", "Eighty Four", "Eighty Five", "Eighty Six", "Eighty Seven", "Eighty Eight", "Eighty Nine", "Ninety", "Ninety One", "Ninety Two", "Ninety Three", "Ninety Four", "Ninety Five", "Ninety Six", "Ninety Seven", "Ninety Eight", "Ninety Nine"};

    public String numberToWords(int num) {
        if (num == 0) {
            return numbers[num];
        }
        int one = num % 1000,
                thousand = (num >= 1000) ? ((num - one) / 1000) % 1000 : 0,
                million = (num >= 1000_000) ? ((num - one - thousand * 1000) / 1000_000) % 1000 : 0,
                billion = (num >= 1000_000_000) ? ((num - one - thousand * 1000 - million * 1000_000) / 1000_000_000) % 1000 : 0;

        StringBuilder ret = new StringBuilder();
        if (billion > 0) {
            ret.append(convertBelowThousand(billion));
            ret.append(" ");
            ret.append(units[3]);
        }
        if (million > 0) {
            if (billion > 0) {
                ret.append(" ");
            }
            ret.append(convertBelowThousand(million));
            ret.append(" ");
            ret.append(units[2]);
        }
        if (thousand > 0) {
            if (billion > 0 || million > 0) {
                ret.append(" ");
            }
            ret.append(convertBelowThousand(thousand));
            ret.append(" ");
            ret.append(units[1]);
        }
        if (one > 0) {
            if (billion > 0 || million > 0 || thousand > 0) {
                ret.append(" ");
            }
            ret.append(convertBelowThousand(one));
        }

        return ret.toString();
    }

    private String convertBelowThousand(int num) {
        StringBuilder ret = new StringBuilder();
        int one = num % 100, hundred = ((num - one) / 100) % 10;
        if (hundred > 0) {
            ret.append(numbers[hundred]);
            ret.append(" ");
            ret.append(units[0]);
        }
        if (one > 0) {
            if (hundred > 0) {
                ret.append(" ");
            }
            ret.append(numbers[one]);
        }

        return ret.toString();
    }
}