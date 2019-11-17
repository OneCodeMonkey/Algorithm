#pragma once
#ifndef _BTREE_H
#define _BTREE_H
#define MAXM 10		// 定义b树的最大阶数

const int m = 4;
const int Max = m - 1;
const int Min = (m - 1) / 2;
typedef int KeyType;

// Typedef of btree
typedef struct node {
	int keynum;
	KeyType key[MAXM];
	struct node *parent;
	struct node *ptr[MAXM];
}BTNode, *BTree;

typedef struct {
	BTNode *pt;
	int i;
	int tag;
}Result;

typedef struct LNode {
	BTree data;
	struct LNode *next;
}LNode, *LinkList;

typedef enum status {
	TRUE,
	FALSE,
	OK,
	ERROR,
	OVERFLOW,
	EMPTY
}Status;

// basic operations
// 初始化B树
Status InitBTree(BTree &t);

// 在节点p中查找关键字 k 的插入位置 i，返回 i
int SearchBTNode(BTNode *p, KeyType k);

// 在树t上查找关键字k,返回结果(pt,i,tag)。若查找成功,则特征值
// tag = 1, 关键字k是指针pt所指结点中第i个关键字；否则特征值tag = 0,
// 关键字k的插入位置为pt结点的第i个
Result SearchBTree(BTree t, KeyType k);

// 将关键字k和结点q分别插入到p->key[i+1]和p->ptr[i+1]中
void InsertBTNode(BTNode *&p, int i, KeyType k, BTNode *q);

// 将结点p分裂成两个结点,前一半保留,后一半移入结点q
void SplitBTNode(BTNode *&p, BTNode *&q);

// 生成新的根结点t,原结点p和结点q为子树指针
void NewRoot(BTNode *&t, KeyType k, BTNode *p, BTNode *q);

// 在树t上结点q的key[i]与key[i+1]之间插入关键字k。若引起
// 结点过大, 则沿双亲链进行必要的结点分裂调整, 使t仍是B树
void InsertBTree(BTree &t, int i, KeyType k, BTNode *p);

// 从p结点删除key[i]和它的孩子指针ptr[i]
void Remove(BTNode *p, int i);

// 查找被删关键字p->key[i](在非叶子结点中)的替代叶子结点(右子树中值最小的关键字)
void Substitution(BTNode *p, int i);

// 将双亲结点p中的最后一个关键字移入右结点q中，将左结点aq中的最后一个关键字移入双亲结点p中
void MoveRight(BTNode *p, int i);

// 将双亲结点p中的第一个关键字移入结点aq中，将结点q中的第一个关键字移入双亲结点p中
void MoveLeft(BTNode *p, int i);

// 将双亲结点p、右结点q合并入左结点aq，并调整双亲结点p中的剩余关键字的位置
void Combine(BTNode *p, int i);

// 删除结点p中的第i个关键字后,调整B树
void AdjustBTree(BTNode *p, int i);

// 反映是否在结点p中是否查找到关键字k
int FindBTNode(BTNode *p, KeyType k, int &i);

// 在结点p中查找并删除关键字k
int BTNodeDelete(BTNode *p, KeyType k);

// 构建删除框架，执行删除操作
void BTreeDelete(BTree &t, KeyType k);

// 递归释放B树
void DestroyBTree(BTree &t);

// 初始化队列
Status InitQueue(LinkList &L);

// 新建一个结点 
LNode* CreateNode(BTNode *t);

// 元素q入队列
Status Enqueue(LNode *p, BTNode *t);

// 出队列，并以q返回值
Status Dequeue(LNode *p, BTNode *&q);

// 判空
Status IfEmpty(LinkList L);

// 销毁队列 
void DestroyQueue(LinkList L);

// 遍历输出B树
Status Traverse(BTree t, LinkList L, int newline, int sum);

// 打印 B 树
Status PrintBTree(BTree t);

void Test1();

void Test2();

#endif