/**
 * 数独求解程序
 * 输入方式，以行为单位，按照 9*9 宫格的方式，每输入一行按下一个回车，空格用 0 表示
 * 例如： 
 * input >
 *	   000003080   		[Enter]
 *     030000090		[Enter] 
 * 	   800090003		[Enter]
 *	   000080905		[Enter]
 *	   009007800		[Enter]
 *	   106000000		[Enter]
 *	   600040008		[Enter]
 *	   040000010		[Enter]
 *	   090800000		[Enter]
 * output >
 * 9 1 2    4 5 3    6 8 7
 * 5 3 4    6 7 8    1 9 2
 * 8 6 7    2 9 1    4 5 3  
 *
 * 2 7 3    1 8 4    9 6 5
 * 4 5 9    3 6 7    8 2 1
 * 1 8 6    9 2 5    3 7 4
 *
 * 6 2 1    7 4 9    5 3 8
 * 7 4 8    5 3 6    2 1 9
 * 3 9 5    8 1 2    7 4 6
 */
#include <iostream>

using namespace std;

/* 构造完成标志 */
bool sign = false;

/* 创建数独矩阵 */
int num[9][9];

/* 函数声明 */
void Input();
void Output();
bool Check(int n, int key);
int DFS(int n);

/* 主函数 */
int main()
{
	cout << "请输入一个9*9的数独矩阵，空位以0表示:" << endl;
	Input();
	DFS(0);
	Output();
	system("pause");
}

/* 读入数独矩阵 */
void Input()
{
	char temp[9][9];
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			cin >> temp[i][j];
			num[i][j] = temp[i][j] - '0';
		}
	}
}

/* 输出数独矩阵 */
void Output()
{
	cout << endl;
	for (int i = 0; i < 9; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			cout << num[i][j] << " ";
			if (j % 3 == 2)
			{
				cout << "   ";
			}
		}
		cout << endl;
		if (i % 3 == 2)
		{
			cout << endl;
		}
	}
}

/* 判断key填入n时是否满足条件 */
bool Check(int n, int key)
{
	/* 判断n所在横列是否合法 */
	for (int i = 0; i < 9; i++)
	{
		/* j为n竖坐标 */
		int j = n / 9;
		if (num[j][i] == key) return false;
	}

	/* 判断n所在竖列是否合法 */
	for (int i = 0; i < 9; i++)
	{
		/* j为n横坐标 */
		int j = n % 9;
		if (num[i][j] == key) return false;
	}

	/* x为n所在的小九宫格左顶点竖坐标 */
	int x = n / 9 / 3 * 3;

	/* y为n所在的小九宫格左顶点横坐标 */
	int y = n % 9 / 3 * 3;

	/* 判断n所在的小九宫格是否合法 */
	for (int i = x; i < x + 3; i++)
	{
		for (int j = y; j < y + 3; j++)
		{
			if (num[i][j] == key) return false;
		}
	}

	/* 全部合法，返回正确 */
	return true;
}

/* 深搜构造数独 */
int DFS(int n)
{
	/* 所有的都符合，退出递归 */
	if (n > 80)
	{
		sign = true;
		return 0;
	}
	/* 当前位不为空时跳过 */
	if (num[n / 9][n % 9] != 0)
	{
		DFS(n + 1);
	}
	else
	{
		/* 否则对当前位进行枚举测试 */
		for (int i = 1; i <= 9; i++)
		{
			/* 满足条件时填入数字 */
			if (Check(n, i) == true)
			{
				num[n / 9][n % 9] = i;
				/* 继续搜索 */
				DFS(n + 1);
				/* 返回时如果构造成功，则直接退出 */
				if (sign == true) return 0;
				/* 如果构造不成功，还原当前位 */
				num[n / 9][n % 9] = 0;
			}
		}
	}
}
