# 为什么少了一分钱？

Author：DominikYang 于 2019/04/02

## 问题描述

有这么一段Java程序：
```Java
public class Main
    public static void main(String[] args) {
        double a = 1.0;
        double b = 0.9;
        System.out.println(a-b);
    }
}
```
输出的结果会是什么？  
你可以自己复制这段代码试试看，结果可能并不是你想的这样。  
为什么会出现这种情况呢？

## 提示
+ IEEE754
+ 在学习完之后写一篇博客

**注意： 额外任务不可替代你的主线任务，请务必先完成主线任务再来尝试**