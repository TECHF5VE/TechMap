# 一些环境 + 软件的准备

## 任务要求

1. **按照要求安装软件**
2. 必要的话注册对应平台的账号密码（请注意保管）
3. 部分可选项目，根据个人需要进行安装，不确定可以到群里咨询
4. 每份文档都有安装成功之后的验证过程，**请务必验证安装成功**

## 任务内容

1. Linux环境
   1. 【MAC】 不需要额外步骤
   2. 【WINDOWS】WSL2
   3. **Docker**（必须）
2. 版本管理（参考[task1.MD](./task1.md) ）
   1. GIT
   2. 注册Github账号，完成基本设置
3. Java编程环境
   1. JDK
   2. （可选）JetBrains Intelij idea
   3. （可选）VS Code
4. 数据库
   1. （可选）Mysql 本机安装
   2. （可选）Mysql Docker安装(推荐)
   3. Mysql可视化工具（可选）
      1. VS Code 插件
      2. JetBrains DataGrip
      3. mysql workbench

## 参考资料

### WSL2
- [微软官方文档： WSL安装](https://learn.microsoft.com/zh-cn/windows/wsl/install) 步骤中有开启虚拟化这一步，可能会有点麻烦，请务必耐心尝试


### Docker

- [Install Docker On Windows](https://docs.docker.com/desktop/install/windows-install/) 请注意，Windows安装需要先完成WSL安装
- [Install Docker On MAC](https://docs.docker.com/desktop/install/mac-install/) 根据不同芯片有不同要求

如果读英文资料有困难可以尝试自己搜索中文教程，不过**强烈建议**根据官方文档来，首先资料最新，其次阅读英文资料有助于获取第一手知识，其他人翻译的资料多少会有些偏差，要习惯以官网为准（可以找一份中文的教程对照着看，不确定的地方以官方文档为准）

### Git

- 参考[task1.MD](./task1.md) 

### VS Code

- [VS Code官网](https://code.visualstudio.com/)
- [VS Code 入门设置](https://code.visualstudio.com/docs/setup/windows)
- [VS Code Java配置](https://code.visualstudio.com/docs/java/java-tutorial)

### Intelij idea
- [Idea官网](https://www.jetbrains.com/zh-cn/idea/) idea可以下载Ultimate版本，但是需要申请学生license，配合下一个link操作，如果江苏大学的edu邮箱被禁用了的话建议直接用vscode，不建议买盗版key，不稳定并且违反商业协议
- [IDEA 学生license申请](https://www.jetbrains.com/zh-cn/community/education/)
- [学生license申请教学（仅供参考）](https://www.jianshu.com/p/3029ed92b446)


### Java

- [JDK下载](https://www.oracle.com/cn/java/technologies/downloads/#jdk19-windows) 建议下载LTS（Long Time Support，长期支持版本，具体了解请自行搜索）版本，不建议直接用最新版本
- [Java环境变量配置](https://zhuanlan.zhihu.com/p/354289291#:~:text=JDK%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%E9%85%8D%E7%BD%AE%20%E9%BC%A0%E6%A0%87%E5%8F%B3%E5%87%BB%20%E8%AE%A1%E7%AE%97%E6%9C%BA%EF%BC%88%E6%AD%A4%E7%94%B5%E8%84%91%EF%BC%89%20-%3E%20%E5%B1%9E%E6%80%A7%20-%3E%20%E9%AB%98%E7%BA%A7%E7%B3%BB%E7%BB%9F%E8%AE%BE%E7%BD%AE%20-%3E,%E9%AB%98%E7%BA%A7%20-%3E%20%E7%8E%AF%E5%A2%83%E5%8F%98%E9%87%8F%20%E5%9C%A8%E7%B3%BB%E7%BB%9F%E5%8F%98%E9%87%8F%E4%B8%AD%EF%BC%8C%E7%82%B9%E5%87%BB%20%E6%96%B0%E5%BB%BA%20%EF%BC%8C%E6%96%B0%E5%BB%BA%20JAVA_HOME%20%E5%8F%98%E9%87%8F%EF%BC%8C%E5%8F%98%E9%87%8F%E7%9A%84%E5%80%BC%EF%BC%9AJDK%E7%9A%84%E5%AE%89%E8%A3%85%E7%9B%AE%E5%BD%95) 只看环境变量配置部分，忽略下载部分（请学会有选择性地阅读自己需要的内容）

### Mysql

- [Mysql 一般下载安装方式](https://dev.mysql.com/downloads/installer/)
- [Mysql Docker安装方式](https://hub.docker.com/_/mysql/) 官方用例，略复杂，可以自己搜一条能用的命令出来（参考官网的命令，前提是懂docker的基本用法）


### Mysql可视化

- [DataGrip](https://www.jetbrains.com/datagrip/)
- [Mysql WorkBench](https://dev.mysql.com/downloads/workbench/)

vscode插件请自行搜索，教程参考vscode官方教程