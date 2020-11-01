# python秋季考核第二次任务

### 任务描述

* 了解python基本语法、编程习惯与规范
* 了解python的基本数据类型（**String字符串**、int整型、float浮点型、bool型、List、Dict、Tuple）
* 掌握字符串的相关操作
  * 基本函数
  * 索引、切片

* 掌握链表的定义及相应操作

### 任务题目

**1、** 定义一个字典 dict = {'Name':’AAAlice‘,'Age':20,'School':'UJS'}

​        1、删除Age = 20

​        2、修改键School对应值为jiangsudaxue

​	    3、插入 Class = 2001

​		4、使用切片操作将Name修改为Alice

​	    5、输出最终dict（遍历字典）

输出结果:

```
Name Alice
School jiangsudaxue
Class 2001
```

**2、** 用链表来表示两个非负的整数。它们是按照逆序的方式存储的，每个节点只能存储 一位数字。将这两个数相加起来，返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。`342`存储为`2 -> 4 -> 3`

> 使用c/c++语言实现

示例：

```
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
```

请完善`addTwoNumbers()`函数。 

```C++
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
}


int main() {
	// test codes example
	ListNode* listA = new ListNode();
	ListNode* listB = new ListNode();
	int a[] = {2, 4, 3};
	int b[] = {5, 6, 4};
	for() {
		// initilise listA and list B
	}
	addTwoNumbers(listA, listB);
}
```

### 其他

​		考核题目并不能覆盖太多知识点，希望同学们在学习过程中有意地多加练习，将python与你正在学习的c/c++多加对比，体会python的简洁与优雅

### 注意事项

* 任务用时两周，截止时间：2020/11/22
* 学习过程中有任何问题可在群里提出，一起交流进步
* 以md方式提交，代码放在代码块中

