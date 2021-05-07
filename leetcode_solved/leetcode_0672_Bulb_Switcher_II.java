// AC:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Bulb Switcher II.
// Memory Usage: 35.5 MB, less than 78.31% of Java online submissions for Bulb Switcher II.
// 思路：分情况讨论：首先把四个按钮定义为 操作 A,B,C,D。可以得到如下结论：
//		1.每个操作操作偶数次，等于没影响。操作奇数次，等于操作一次
//      2. A,B,C 操作之间存在等效：A+B=C, A+C=B, B+C=A
//      所以等于考虑 A,B,C,D 各自在操作一次或0次的情况下的排列组合情况。
// 		首先排除几种特殊情况：
//      1. presses == 0, 不能操作， return 1
//  	2. 当 n <= 2 时，C 操作与 D 操作体现不出差别，所以单独讨论，n = 1 时结果只有两种，
//		   n = 2 时，若 press=1 则有三种情况即 00，01，10, 若 press=2 时，可以两个同样操作抵消，有四种情况 00，11，10，01
//		3. 当 n > =3 时，若 press = 1，则只有 A, B, C, D 四个各操作一次的情况，结果比如 111，101，010，100 四种
//			若 press = 2，则只有 0, A, B, C, A+D, B+D, C+D 四种情况
//			若 press > 2，则比等于 2 时多一种情况，单独的 D。因为奇数时可以相同的抵消，剩一次有效的 D操作，
//					偶数时，任选 ABC操作为一组，也等同于抵消。剩下的奇数次操作等效一次 D 操作
//															                         		
// 复杂度：T:O(1), S:O(1)
// 
class Solution {
    public int flipLights(int n, int presses) {
        if (presses == 0) {
            return 1;
        } else {
            if (n == 1) {
                return 2;
            } else if (n == 2) {
                if (presses == 1) {
                    return 3;
                } else {
                    return 4;
                }
            } else {
                if (presses == 1) {
                    return 4;
                } else if (presses == 2) {
                    return 7;
                } else {
                    return 8;
                }
            }
        }
    }
}