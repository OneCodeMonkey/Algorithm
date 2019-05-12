#pragma once
// sequence list
#ifndef SEQUENCELIST_H
#define SEQUENCELIST_H

#include<stdio.h>
#include<stdlib.h>
#include "../Status.h"

// macros
#define LIST_INIT_SIZE 100
#define LISTINCREMENT 10

// type define
#ifndef LELEMTYPE_SQ
#define LELEMTYPE_SQ
typedef int LElemType_Sq;
#endif

typedef struct {
	LElemType_Sq *elem;
	int length;
	int listsize;
}SqList;

// functions
// initialize an empty sequence list
Status InitList_Sq(SqList *L);

// clear
void ClearList_Sq(SqList *L);

// destroy
void DestroyList_Sq(SqList *L);

// is empty
Status ListEmpty_Sq(SqList L);

// element count
int ListLength_Sq(SqList L);

// let *e be the i-th element
Status GetElem_Sq(SqList L, int i, LElemType_Sq *e);

// return the first element's position which meet with the comparition detail
int LocateElem_Sq(SqList L, LElemType_Sq e, Status(Compare)(LElemType_Sq, LElemType_Sq));

// let pre_e be the previous element of cur_e
Status PriorElem_Sq(SqList L, LElemType_Sq cur_e, LElemType_Sq *pre_e);

// let next_e be the next element of cur_e
Status NextElem_Sq(SqList L, LElemType_Sq cur_e, LElemType_Sq *next_e);

// insert e at the i-th position of sequence list
Status ListInsert_Sq(SqList *L, int i, LElemType_Sq e);

// delete i-th element of sequence list, and return the deleted element
Status ListDelete_Sq(SqList *L, int i, LElemType_Sq *e);

// travel list with function "visit"
Status ListTraverse_Sq(SqList L, void(Visist)(LElemType_Sq));

#endif