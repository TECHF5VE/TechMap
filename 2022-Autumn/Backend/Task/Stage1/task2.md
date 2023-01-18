# Java 语法学习

## 任务要求

1. 掌握基本的Java语法
2. 掌握面向对象编程的基本思想与实践
3. 能用Java编写基本的算法，或者使用Java提供的算法完成基本的题目
4. 掌握基本的系统设计方法

## 任务阶段

1. 第一阶段：基础语法学习（预期时间1~2周）
   1. Java 基础数据类型，基础语法（参考prepare部分）
   2. 面向对象编程基本思想
      1. 封装
      2. 继承
      3. 多态
   3. 常用对象类型
      1. String（常用api掌握）
         1. indexOf
         2. valueOf
         3. charAt
         4. substring
         5. ...
      2. 集合框架基础使用
         1. List  
         2. Map
         3. Set
         4. Queue
         5. Stack
   4. 迭代器
2. 第二阶段：基础算法（预期时间1周）
   1. 递归与遍历
   2. 排序
   3. 完成LeetCode题目
3. 第三阶段：系统设计（学生管理系统）（预期时间1周）

## 任务内容

### 运用Java完成LeetCode算法题目

题目链接（提示：都是有答案的，不涉及复杂算法，**请尽量使用api完成**）：

- [合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/)
- [有效的括号](https://leetcode.cn/problems/valid-parentheses/)

### 设计一个学生管理系统

一个学校有不同的班级，每个学生属于某一个班级  
每个学生有自己的个人信息，姓名，性别，还有其它你能想到的信息

请你设计一个学生类，一个班级类，一个学校类，并且在此基础上完成以下业务要求：

1. 查询班级里是否有某一个学生
2. 统计班级人数
3. 统计性别人数以及比例
4. 统计姓氏与人数

## 扩展内容

### 编程基础

1. 异常try catch
2. 日志

### 系统设计基础

1. 设计模式
   1. 单例模式
   2. 原型模式
   3. 简单工厂模式

## 参考资料

- [廖雪峰Java教程](https://www.liaoxuefeng.com/wiki/1252599548343744) 里面很全，基本什么都有了（包括扩展内容）
- [慕课免费教程](https://www.imooc.com/learn/124) 我没看过，给喜欢看视频的同学，基础部分内容建议看文档，视频比较浪费时间
- [Maven 基础用法](https://zhuanlan.zhihu.com/p/54422351#:~:text=Maven%E5%85%A5%E9%97%A8%E6%95%99%E7%A8%8B%201%20%E7%A4%BA%E4%BE%8B%E4%BB%A3%E7%A0%81%20%E6%9C%AC%E6%96%87%E7%A4%BA%E4%BE%8B%E4%BB%A3%E7%A0%81%E9%83%BD%E5%9C%A8GitHub%E4%BB%93%E5%BA%93%20Fundebug%2Fmaven-tutorial%20%E3%80%82%20%E4%BD%BF%E7%94%A8%20tree,pom.xml%20...%204%20%E4%BD%BF%E7%94%A8mvn%E6%89%93%E5%8C%85%20...%205%20%E4%BD%BF%E7%94%A8mvn%E8%BF%90%E8%A1%8C%20) 今天找了才知道maven教程都是答辩，建议会科学上网的同学改用gradle
- [Gradle 教程](https://www.w3cschool.cn/gradle/) 学习基础的初始化项目和怎么安装依赖即可

## 可能遇到的坑

- maven下载包失败
  - 需要配置阿里镜像加速 [参考文档](https://zhuanlan.zhihu.com/p/350857381)
  - 使用idea的同学参考这篇文档 [maven详细配置](https://blog.csdn.net/qq_42057154/article/details/106114515)
- gradle网络问题
  - 最简单的解决方法是连VPN
  - 如果没有，参考maven，百度gradle镜像加速自己搞定