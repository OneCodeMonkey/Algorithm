//POJ 1008 Maya Calendar解题报告
//
#include <iostream>
#include <cstring>
#include <cstdio>
#include <cmath>
#include <algorithm>
#include <string>
#include <List>
using namespace std;

/*pop, no, zip, zotz, tzec, xul, yoxkin, mol, chen, yax, zac, ceh, mac, kankin, muan, pax, koyab, cumhu   0 to 19
  uayet and had 5 days  0, 1, 2, 3, 4
  */ 
/*Tzolkin
   13个月
   imix, ik, akbal, kan, chicchan, cimi, manik, lamat, muluk, ok, chuen, eb, ben, ix, mem, cib, caban, eznab, canac, ahau 
每个月的20天：1 imix, 2 ik, 3 akbal, 4 kan, 5 chicchan, 6 cimi, 7 manik, 8 lamat, 9 muluk, 10 ok, 11 chuen, 12 eb, 13 ben, 1 ix, 2 mem, 3 cib, 4 caban, 5 eznab, 6 canac, 7 ahau
   */
    const string Haab[19] = {"pop", "no", "zip", "zotz", "tzec", "xul", "yoxkin", "mol", "chen", "yax", "zac", "ceh", "mac", "kankin", "muan", "pax", "koyab", "cumhu", "uayet"};
const string Toklin[20] = {"imix", "ik", "akbal", "kan", "chicchan", "cimi", "manik", "lamat", "muluk", "ok", "chuen", "eb", "ben", "ix", "mem", "/*cib", "caban", "eznab", "canac", "ahau"};

//haab第几个月
int HaabMonthConvert(string s)
{
    for (int i = 0; i < 19; i++)
        if (s == Haab[i])
            return i + 1;
}
//Toklin的天的名字
string ToklinDayConvert(int n)
{
    return Toklin[n - 1];
}
int main()
{
    int nCase;
    cin >> nCase;
    int HaabDay, HaabYear;
    string HaabMonth, ch;
    int ToklinDay, ToklinYear;
    string ToklinDayName;
    int HaabTotalday;
    for (int i = 1; i <= nCase; i++)
    {
        cin >> HaabDay >> ch >> HaabMonth >> HaabYear;
        //cout << HaabDay << HaabMonth << HaabYear;
        HaabTotalday = HaabYear * 365 + 20 * (HaabMonthConvert(HaabMonth) - 1) + HaabDay + 1;
                //+1是因为Haab是0-19
            ToklinYear = HaabTotalday / 260;
        ToklinDay = (HaabTotalday % 260) % 13;
        ToklinDayName = ToklinDayConvert((HaabTotalday % 260) % 20);
        //cout << HaabTotalday << " " << (HaabTotalday % 260) % 20;
        if (i == 1)
            cout << nCase << endl;
        cout << ToklinDay << " " << ToklinDayName << " " << ToklinYear << endl;
    }
    return 0;
}
