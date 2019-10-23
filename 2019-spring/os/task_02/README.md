# 操作系统02--我么可以用/为操作系统做什么

Author: Peng Jinwei

由于OS是一个庞大的知识体系，对于OS的基础概念，那就持续关注计算机类各专业的主修课程《操作系统原理》。
在这里，我更侧重的是就某个具体的操作系统，了解我们可以用/为它做些什么。

## 任务描述

第一次任务想让大家明白的是：
1）数据结构是软件的灵魂，硬件上的限制，我们可以用软件从逻辑层面突破限制，实现我们的需求；
2）操作系统的底层很多功能的实现，都依赖于多线程。  
下面我们学习如何使用linux，Linux的服务学习路线是：虚拟机的熟练使用 -> Linux基础command -> Linux基础服务 -> 虚拟化编排和容器编排；

1. VMware Workstation Pro -- 学习linux的强有力工具
    完成这一步，你需要的是：
    + linux发行版ISO系统镜像 -- 镜像推荐使用Centos7
    + WMware Workstation Pro虚拟机 -- 这款软件可以直接从官方网站获取，只不过需要注册之后才能下载。当然，你也可以使用VirtualBox或VMware Workstation 15 player。

    你需要抓住的重点是：
    + 你的电脑cpu虚拟化功能是否开启（同时需要关闭window的Hyper-V）
    + VMvare三种网络链接模式的工作原理（Bridge、Host-Only、NAT）
    + 系统快照是什么，他和备份的关系

2. 当你只能使用键盘时 -- 初识linux基础操作
    完成这个任务，你可能需要的工具是：
    + putty终端工具/Xshell终端工具
    + FileZilla文件传输工具

    完成这个任务，你需要抓住的重点是：
    + 目录、文件的操作
    + 网络配置，ip地址查看
    + vim的使用
    + yum软件安装，卸载
    + rpm包管理
    + shell脚本
    + systemd系统服务
    + firewalld防火墙
    ...

3. 我们的本地blog服务器（LNMP) -- 初始linux的第一个服务
如果想清晰的完成这个任务，你需要抓住的重点是：
    + nginx的工作原理
    + php工作环境
    + Mysql数据库安装和配置
    + typecho/wordpress如何安装
    + firewalld配置
你也可以使用宝塔linux面板完成以上博客运行环境的配置。

4. 拓展：<del>阿里云和腾讯云均有学生优惠ECS云服务器示例，可以买一个，将你从前几个任务所学付诸实践。</del>

## 传送门

#### task1

+ [CentOS Download](http://isoredirect.centos.org/centos/7/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
) -- 你所看到的都是下载链接，由不同的镜像站提供，比较推荐使用[aliyun](http://mirrors.aliyun.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
)镜像。
+ [VMware 三种网络工作模式](http://note.youdao.com/noteshare?id=46dc05029d659c51e02c7c69601ca6d6&sub=26F7EB9BA4F241E0AE72420983AEF8B3)常用NAT模式，但对于熟悉网络配置的你，就无所谓了。

#### task2 / task3

+ [Putty Download](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html) -- 比较建议使用Xshell，但是和VMware一样，需要注册后才能下载。
+ [linux就该这么学](https://www.linuxprobe.com) -- 掌握这本书的内容，我会替你高兴。它包含了各种linux基础服务的搭建。

Written in 2019/5/21