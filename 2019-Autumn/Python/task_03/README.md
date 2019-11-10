# python秋季考核第三次任务

### 任务描述

* 掌握链表的定义及相应操作
* 了解排序算法
* List、Tuple、Dict的基本操作与方法

### 任务题目

**1、** 用链表来表示两个非负的整数。它们是按照逆序的方式存储的，每个节点只能存储 一位数字。将这两个数相加起来，返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。`342`存储为`2 -> 4 -> 3`

> 使用c/c++语言实现

示例：

```
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
```

请完善`addTwoNumbers()`函数。 

```
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

**2、**给定一个整数数组 nums，将该数组升序排列。

示例 ：

```
输入：[5,2,3,1,4]
输出：[1,2,3,4,5]
```

> 要求：使用两种排序算法（除冒泡排序）
>
> 使用c/c++语言实现

**3、** 定义一个字典 dict = {'Name':’Alice‘,'Age':20,'School':'UJS'}

​        1、删除Age = 20

​        2、修改键School对应值为jiangsudaxue

​	3、插入 Class = 1901

​	4、输出最终dict（遍历字典）

输出结果:

```
Name Alice
School jiangsudaxue
Class 1901
```

**4、**  杨辉三角定义如下：

```
          1
         / \
        1   1
       / \ / \
      1   2   1
     / \ / \ / \
    1   3   3   1
   / \ / \ / \ / \
  1   4   6   4   1
 / \ / \ / \ / \ / \
1   5   10  10  5   1
```

定义函数`triangles()`把每一行看做一个list，试写一个generator（生成器），不断输出下一行的list：

调用结果如下：

```
>>> o = triangles()
>>> next(o)
[1]
>>> next(o)
[1, 1]
>>> next(o)
[1, 2, 1]
```



### 注意事项

- 任务用时两周，截止时间：2019/11/24
- 学习过程中有任何问题可在群里提出，一起交流进步
- 以.md文件提交,代码写在代码块中

------

- by promefire 于2019/11/10

