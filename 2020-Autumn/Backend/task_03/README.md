# 数组&算法

> 如何根据需要，以最优解完成对数组的操作

## 2020-Autumn 纳新考核 task-03

## 任务目的

- 进一步熟悉`数组`和`指针`的操作。
- 理解`不同的算法`对程序`时间复杂度`、`空间复杂度`的影响。

## 任务说明

本任务是面向零基础的同学，如果已经有一定的基础，可以尽快完成，并给予我们反馈，我们将会针对你们的反馈做进度和内容上的调整。

## 任务时间

预计4周时间，于**12月28日**之前完成

__注： 起始时间为该md文档上传至[仓库](https://github.com/TECHF5VE/TechMap)的时间__

## 任务内容

1. 了解不同算法对完成同一操作的影响。
2. 在`README.md中`记录下每个任务对应的时间、空间复杂度的计算。
3. 每一小题对应一个c/cpp文件
4. 把对任务的心得以及学习笔记均写在README.md中并且完成下面任务作业中的题目，将源代码上传至[仓库](https://github.com/TECHF5VE/TechMap-Works)。

## 任务作业

>请务必仔细阅读[仓库说明](https://github.com/TECHF5VE/TechMap-Works/blob/master/README.md)，了解相关提交的格式。今后的任务也会发布在相应的[仓库](https://github.com/TECHF5VE/TechMap)

1. 有序数组中查找某数字出现的次数

说明：

- 最好能实现时间复杂度 O(log₂N)

```c
// 参考提交函数格式
int findNumberInArray(int* arr,int length,int target) {
  // code
}
```

2. 统计位数为偶数的数字：给你一个整数数组 `nums`，请你返回其中位数为 **偶数** 的数字的个数。

```c
/**
 * 样例：
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 因此只有 12 和 7896 是位数为偶数的数字
 */

// 参考提交函数格式
int findNumbers(int* nums,int length) {
  //code
}
```

3. 二维数组中查找：在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序,查找目标数字是否出现。

说明：

- 最好能实现时间复杂度O(n+m)

```c
/**
 * 样例：
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * 给定 target = 20，返回 false。
 */

// 参考提交函数格式
bool findNumberIn2DArray(int** matrix,int n,int m, int target) {
 // code
}
```

4. 给定一个数组 `nums`和已知数组长度`length`，编写一个函数将数组中所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。

说明:

- 要求必须在原数组上操作，不能拷贝额外的数组。

```c
/**
 * 样例:
 * 输入: nums=[0,1,0,3,12],length=5
 *
 * 输出: [1,3,12,0,0]
 */

// 参考提交函数格式
void moveZeroes(int* nums, int length){
  // code
}

```

5. 统计好三元组：

```c
/**
 * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 * 
 * 样例：
 * 输入：arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * 输出：4
 * 解释：一共有 4 个好三元组：[(3,0,1), (3,0,1), (3,1,1), (0,1,1)] 。
 */

// 参考提交函数格式
int countGoodTriplets(int* arr,int length, int a,int b, int c) {
  // code
}
```

6. 排序数组

说明：

- 最好能实现时间复杂度不为O(n²)

```c
// 参考提交函数格式
void sort(int* arr,int length){
  // code
}
```

7. 智力题（可选）：1000瓶水，有一瓶是毒药，你有10只小白鼠，喝了毒药一个礼拜后毒发，怎样在一周内知道哪瓶水有毒。

8. 最大间距（可选）：给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。

- 时间复杂度为：O(N),N为数组长度
- 空间复杂度为：O(N),N为数组长度

```c
/**
 * 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * 如果数组元素个数小于 2，则返回 0。
 * 样例：
 * 输入: [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 */

// 参考提交函数格式
int maximumGap(int* nums,int length) {
  // code
}
```

9. 搭建个人博客。(可选)

### 参考资料

- [数据结构可视化学习工具网站](https://visualgo.net/zh)
- [中国大学MOOC](https://www.icourse163.org/)
- [菜鸟教程-指针](https://www.runoob.com/cprogramming/c-pointers.html)
- [菜鸟教程-数组(C中数组详解部分)](https://www.runoob.com/cprogramming/c-arrays.html)
- [题库 - 力扣 (LeetCode) ](https://leetcode-cn.com/problemset/all/)
- [手把手教你从0开始搭建自己的个人博客 |无坑版视频教程| hexo](https://www.bilibili.com/video/av44544186?from=search&seid=9598797698914573217)

