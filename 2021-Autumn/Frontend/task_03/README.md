# JavaScript

## 引言

从上一次的学习中，我们知道了HTML是页面的框架，CSS是页面的呈现效果，HTML+CSS能做出漂亮的静态页面，然而如果需要让页面有更多丰富的动效和强互动性，就需要继续学习JavaScript了。

**JavaScript**控制网页的行为，是前端领域最重要的编程语言。

毫不夸张地说，学好了JS，你就学好了前端，在现代Web前端应用开发时，JS几乎可以处理所有的工作，在JS中你甚至可以写HTML和CSS。

所以JS请务必好好学学，不要局限在本次任务中，在今后的前端学习中也可以多学学JS延伸出的知识点。

## 任务目标

- 基础：掌握JavaScript基础语法（包括关键字/语句结构，常用数据类型/方法，JS函数与对象，变量提升和作用域等）
- 基础：掌握JavaScript的HTML DOM基础（包括获取指定节点对象，DOM事件，创建DOM元素等）
- 附加：学习正则表达式
- 附加：学习ES6、学习异步编程（主要是Promise）、了解ECMAScript
- 附加：学习JSON、了解网络请求相关API（XMLHttpRequest和Fetch）

## 任务时间 11.22-12.20

## 任务内容

1. 算法篇
   - Easy：[有效的括号](https://leetcode-cn.com/problems/valid-parentheses/)
   - Easy：[爬楼梯](https://leetcode-cn.com/problems/climbing-stairs/)
   - Medium：[Pow(x, n)](https://leetcode-cn.com/problems/powx-n/)
   - Medium：[不同路径](https://leetcode-cn.com/problems/unique-paths/)
   - Hard：[正则表达式匹配](https://leetcode-cn.com/problems/regular-expression-matching/)
   - 要求：使用JavaScript语言，前三个必做，后两个选做，会做尽量做，不难的
2. DOM篇
   - 针对上一次任务中的致敬页：将页面中的所有元素以JavaScript的方式插入（HTML只保留一个body标签，要求使用getElementBy... & createElement & appendChild等API）
   - 针对上一次任务中的调差问卷：做一个form表单的提交验证机制（点击提交按钮后，用JS捕获，手动验证邮箱/手机号码的正确性，对不正确的提交alert弹窗/console提示，对正确的提交alert弹窗/console显示表单对应的JSON）
   - 例如：`{"username":"tagbug","password":"qqqqaaaaa","sex":"男","email":"1242135295@qq.com","phone":"15811112222"}`
3. 附加篇（选做）
   1. 思考题
      1. 按照加法常识来说，我们知道：0.1 + 0.2的结果应该是0.3，所以在代码中：`0.1 + 0.2 == 0.3`的结果应该是`true`，然而事实似乎并非如此，你可以自己试试，在js或java或者其他编程语言中写这样一段代码，验证一下是否符合你的预期。你可能会惊讶的发现，在某些语言中，计算结果是符合你预期的，然而在另一些语言中，却发生了违背常识的事，你可以查阅资料，思考&总结。
      2. 通过对js的学习，我们知道字符串、数字等基本类型变量也可以调用方法他们自己的方法，就像对象一样，比如：`'aa'.toUpperCase()`，然而你真的了解基本类型调用方法的内部细节吗，思考：
         ```js
         let str = new String('abc');
         console.log(str.toUpperCase()); // 'ABC'
         str.test = function(){ return 'test' }
         console.log(str.test); // f() { return 'test' }
         
         let anotherStr = String('abc');
         console.log(anotherStr.toUpperCase()); // 'ABC'
         anotherStr.test = function(){ return 'test' }
         console.log(anotherStr.test); // undefined  Why??
         ```
   2. 综合应用题
      - 给出后端API，比如 http://example.com/api/getPosts ，接收后端API返回的JSON对象，比如`{"success":true,"msg":"success","data":[{"title":"文章1","content":"# Hello, world!"},{},...]}`，将其在页面上渲染为markdown文档，要求必须动态渲染，且有加载过程、异常处理以及用户提示信息
      - 其实就是做个博客的雏形，如果有自己的想法也可以自己实现，比方说做个动态的留言板啥的...
      - 如果需要提供后端API可以联系我，或者自己整个服务器试试

## 任务要求

- 提交任务时，需要将算法篇、DOM篇、附加篇的内容分成三个markdown文档
- 算法篇的内容要求以markdown文档的形式提交你的算法，并有清楚的题目间隔和适当的注释，最好可以写写思路啥的，请确保在leetcode上已通过
- DOM篇的内容要求还是在CodePen上写（单独开项目），并按照上次的格式提交
- 附加篇的内容可以在CodePen上或者自己的服务器上，CodePen请按照格式，服务器上的话就换成对应的URL即可，格式不变

## 参考资料

这次的任务没有学习路线的限制，你可以根据自己的喜好选择合适的网站/教程/书本学习

### JavaScript

- [freeCodeCamp](https://chinese.freecodecamp.org/learn/javascript-algorithms-and-data-structures/)
- [现代 JavaScript 教程](https://zh.javascript.info/)
- [MDN](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript)
- [菜鸟教程](https://www.runoob.com/js/js-tutorial.html)
- [W3school](https://www.w3school.com.cn/js/index.asp)
- JavaScript权威指南（第七版）

### IDE推荐

- [VSCode](https://code.visualstudio.com/)

### VSCode 插件推荐

- JavaScript相关：
  - Bracket Pair Colorizer 2 `彩虹括号，让你的括号易于区分`
  - Live Server `热更新`
  - Project Manager `快速切换你的项目`

- AI智能语法补全
  - Tabnine

## 结语

有什么不懂的可以优先Google，请尽量学会使用Google搜索（中文&英文），培养独立思考、解决问题的能力

在无法解决时可以提问，在提问时请注意礼貌，谢谢
