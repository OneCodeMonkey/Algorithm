<?php

/**
 * AC：
 *
 * 适合用 PHP 的 array_multisort() 多字段排序，但因为不熟悉此函数，导致两次罚时。
 *
 */
class Solution {

    /**
     * @param String $text
     * @return String
     */
    function arrangeWords($text) {
        $arr = explode(' ', $text);
        $record = [];
        $lengthArr = [];
        $arrIndexArr = [];
        $isFirst = 1;
        foreach ($arr as $key => $item) {
        	$length = strlen($item);
        	$record[] = [
        		'length' => $length, 
        		'arrIndex' => $key, 
        	];

        	$lengthArr[$key] = $length;
        	$arrIndexArr[$key] = $key;
        }

        array_multisort($lengthArr, SORT_ASC, $arrIndexArr, SORT_ASC, $record);

        $ret = "";
        foreach ($record as $key => $item) {
        	if ($isFirst) {
        		$ret .= ucfirst($arr[$item['arrIndex']]) . " ";
        		$isFirst = 0;
        	} else {
        		$ret .= lcfirst($arr[$item['arrIndex']]) . " ";
        	}
        }

        return trim($ret);
    }
}