<?php

class Solution {
	// 判断数组 a 是否为数组 b 的子集
	function isSubset($a, $b) {
	    $flag = 1;
	    foreach ($a as $item) {
	        if (in_array($item, $b)) {
	            continue;
	        } else {
	            $flag = 0;
	            break;
	        }
	    }

	    if ($flag) {
	        return 1;
	    } else {
	        return 0;
	    }
	}

	/**
	 * @param String[][] $favoriteCompanies
	 * @return Integer[]
	 */
	function peopleIndexes($favoriteCompanies) {
	    $record = [];
	    for ($i = 0; $i < count($favoriteCompanies); $i++) {
	        if (isset($record[$i])) {
	            continue;
	        }
	        for ($j = 0; $j < count($favoriteCompanies); $j++) {
	            if (isset($record[$j]) || $i == $j) {
	                continue;
	            }
	            if ($this->isSubset($favoriteCompanies[$j], $favoriteCompanies[$i])) {
	                $record[$j] = 1;
	            }
	        }
	    }

	    $ret = [];
	    for ($i = 0; $i < count($favoriteCompanies); $i++) {
	        if (isset($record[$i])) {
	            continue;
	        }
	        $ret[] = $i;
	    }

	    return $ret;
	}
}