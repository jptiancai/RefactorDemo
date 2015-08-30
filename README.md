# RefactorDemo
在一篇流传甚广的帖子里，有人把《重构》与《设计模式》并列为「Java行业的圣经」。


---------

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






_ps:使用STS中的WiKiText Editor可以直接编辑观看_

