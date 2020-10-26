# Task_01

## 0x01 自我介绍

我是来自*江苏大学计算机科学与技术学院*`软件工程2003班`的**陈欣阳**,在`TECH F5VE`中加入了前端小组，我的爱好有动漫、音乐、打代码、~~摸鱼~~，喜欢尝试新鲜的未知的事物，乐于接受挑战。

## 0x02 刚学的fetch

```
function getRequest(url) {
    var opts = {
        method:"GET"
    }
    fetch(url,opts).then(function(res) {
            return res.json();
        }).then(function (data) {
            if (data.code == 403) {
            } else {
              console.log(data);
            }
        })
}

function tryFind(){
	for(i=100336889;i<=100336989;i++){
	var url="http://45.113.201.36/api/ctf/5?uid="+i;
	getRequest(url);
	i++;
	}
	return null;
}
```

## 0x03 下面是我的个人链接

- [哔哩哔哩](https://space.bilibili.com/2822332)
- [GitHub](https://github.com/tagbug)

## 0x04 ~~最后再来张表情包~~

![](https://raw.githubusercontent.com/tagbug/TechMap/master/2019-Autumn/Frontend/cxy/img/lese.jpg)
