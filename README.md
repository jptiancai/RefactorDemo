# RefactorDemo
在一篇流传甚广的帖子里，有人把《重构》与《设计模式》并列为「Java行业的圣经」。


----------

## 重构实战经验

- 定时器：
- 事件监听：
- 看见循环的时候，想想能不能用变量代替，来提高性能
- 公共的部分，要提取出来：继承，接口，抽象类


--------------


##坑

- [解决ArrayList的ConcurrentModificationException](http://arron-li.iteye.com/blog/645008)

---------------------

## 重构相关的文章

- [编程的智慧-王垠](http://www.yinwang.org/blog-cn/2015/11/21/programming-philosophy/)

---------
## 小建议

`TIP 1`：
如果你发现自己需要为程序添加一个特性，而代码结构使你无法很方便地那么做，那就先重构那个程序，使特性的添加比较容易进行，然后再添加特性。

`TIP 2`：
重构之前，首先检查自己是否有一套可靠的测试机制。这些测试必须有自我检验（self-checking）能力。

`TIP 3`：
重构技术系以微小的步伐修改程序。如果你犯下错误，很容易便可发现它。

`TIP 4`：
任何一个傻瓜都能写出计算机可以理解的代码。惟有写出人类容易理解的代码，才是优秀的程序员。

`Tip 5`：
事不过三，三则重构（Three strikes and you refactor）

`TIP 6`：
不要过早发布（publish）接口。请修改你的代码拥有权政策，使重构更顺畅

`TIP 7`：
当你感觉需要撰写注释，请先尝试重构，试着让所有注释都变得多余。 

`TIP 8`：
确保所有测试都完全自动化，让它们检查自己的测试结果。

`TIP 9`：
一整组（a suite of）测试就是一个强大的「臭虫」侦测器，能够大大缩减查找「臭虫」所耑要的时间。

`TIP 10`：
频繁地运行测试。每次编译请把测试也考虑进去——每天至少执行毎个测试一次。

`TIP 11`：
每当你接获臭虫提报（bug report），请先撰写一个单元测试来揭发这只臭虫。

`TIP 12`：
编写未臻完善的测试并实际运行，好过对完美测试的无尽等待。

`TIP 13`：
考虑可能出错的边界条件，把测试火力集中在那儿。

`TIP 14`： 
当事情被大家认为应该会出错时，别忘了检查彼时是否有异常如预期般地被拋出。


`TIP 15`：
不要因为「测试无法捕捉所有臭虫」，就不撰写测试代码，因为测试的确可以描捉到大多数臭虫。










--------

「重构」助你找到臭虫(bugs) 

 
```
对代码的理解，可以帮助我找到臭虫。我承认我不太擅长调试。有些人只要盯着一大段代码就可以找出里面的臭虫，我可不行。但我发现如果我对代码进行重构，我就可以深入理解代码的作为，并恰到好处地把新的理解反馈回去。搞清楚程序结构的同时，我也清楚了自己所做的一些假设，从这个角度来说，不找到臭虫都难矣。
```
 

何吋不该「重构」？



```
如果项目己经非常接近最后期限，你不应该再分心于重构，因为己经没有时间了。不过多个项目经验显示：重构的确能够提高生产力。如果最后你没有足够时间，通常就表示你其实早该进行重构。

教训：哪怕你完全了解系统，也请实际量测它的性能，不要臆测。臆测会让你学到一些东西，但十有八九你是错的。
```


```
当我要进行重构时，我倚赖程序员的好朋友：单元测试。
```



重构的意义就在于：你永远不必说对不起——只要把出问题的地方修补好就行了。



_ps:使用STS中的WiKiText Editor可以直接编辑观看_

