#include <stdio.h>  
#include <string.h>  
#include <algorithm>  
#include <math.h>  
#include <queue>  
#define dist(a, b) sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y))  
#define cross(a, b, c) (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x)  
#define dot(a, b, c) (b.x - a.x) * (c.x - a.x) + (b.y - a.y) * (c.y - a.y)  
#define delt(a) fabs(a)<eps ? 0 : a> 0 ? 1 : -1  
#define pi acos(-1.0)  
#define eps 1e-8  
#define inf 1e20  
#define N 1005  
using namespace std;

int n, m, t, nl, ml;
struct TPoint  
{
    double x, y;
}pt[N], st;

void scan()  
{
    scanf("%lf%lf%d", &st.x, &st.y, &n); 
    for (int i = 0; i < n; i++)
        scanf("%lf%lf", &pt[i].x, &pt[i].y); 
}

double getang(TPoint a, TPoint b)  
{    
    double ang1 = atan2(a.y, a.x), ang2 = atan2(b.y, b.x);    
    if (ang1 - ang2 > pi) 
        ang2 += 2 * pi;   
    if (ang2 - ang1 > pi) 
        ang1 += 2 * pi;    
    return ang1 - ang2;  
}

void solve()  
{    
    double minf = 0, maxf = 0, sumf = 0;    
    pt[n] = pt[0];    
    for (int i = 0; i < n; i++)    
    {         
        sumf += getang(pt[i], pt[i + 1]);       
        maxf = max(sumf, maxf);       
        minf = min(sumf, minf);        
        if (maxf - minf > 2 * pi)        
        {           
            maxf = minf + 2 * pi;
            break;     
        }
    }
    printf("%.2f\n", (maxf - minf) * st.x * st.y);  
}

int main()  
{   
    scan();   
    solve();   
    return 0; 
}
