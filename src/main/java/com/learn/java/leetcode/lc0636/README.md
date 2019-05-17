# [636. Exclusive Time of Functions][enTitle]

**Medium**

On a single threaded CPU, we execute some functions. Each function has a unique id between  *0*  and  *N-1* .

We store logs in timestamp order that describe when a function is entered or exited.

Each log is a string with this format:  *"{function_id}:{"start" | "end"}:{timestamp}"* . For example,  *"0:start:3"*  means the function with id  *0*  started at the beginning of timestamp  *3* .  *"1:end:2"*  means the function with id  *1*  ended at the end of timestamp  *2* .

A function's  *exclusive time*  is the number of units of time spent in this function. Note that this does not include any recursive calls to child functions.

Return the exclusive time of each function, sorted by their function id.



Example 1:



```
Input:
n = 2
logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
Output:[3, 4]
Explanation:
Function 0 starts at the beginning of time 0, then it executes 2 units of time and reaches the end of time 1.
Now function 1 starts at the beginning of time 2, executes 4 units of time and ends at time 5.
Function 0 is running again at the beginning of time 6, and also ends at the end of time 6, thus executing for 1 unit of time. 
So function 0 spends 2 + 1 = 3 units of total time executing, and function 1 spends 4 units of total time executing.

```



Note:

1.  *1 <= n <= 100*  
2. Two functions won't start or end at the same time. 
3. Functions will always log when they exit.


# [636. 函数的独占时间][cnTitle]

**中等**

给出一个非抢占单线程CPU的 **n** 个函数运行日志，找到函数的独占时间。

每个函数都有一个唯一的 Id，从 **0**  到**n-1** ，函数可能会递归调用或者被其他函数调用。

日志是具有以下格式的字符串： *function_id：start_or_end：timestamp* 。例如： *"0:start:0"*  表示函数 0 从 0 时刻开始运行。 *"0:end:0"*  表示函数 0 在 0 时刻结束。

函数的独占时间定义是在该方法中花费的时间，调用其他函数花费的时间不算该函数的独占时间。你需要根据函数的 Id 有序地返回每个函数的独占时间。

**示例 1:** 

```
输入:
n = 2
logs = 
["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
输出:[3, 4]
说明：
函数 0 在时刻 0 开始，在执行了  2个时间单位结束于时刻 1。
现在函数 0 调用函数 1，函数 1 在时刻 2 开始，执行 4 个时间单位后结束于时刻 5。
函数 0 再次在时刻 6 开始执行，并在时刻 6 结束运行，从而执行了 1 个时间单位。
所以函数 0 总共的执行了 2 +1 =3 个时间单位，函数 1 总共执行了 4 个时间单位。

```

**说明：** 

1. 输入的日志会根据时间戳排序，而不是根据日志Id排序。 
2. 你的输出会根据函数Id排序，也就意味着你的输出数组中序号为 0 的元素相当于函数 0 的执行时间。 
3. 两个函数不会在同时开始或结束。 
4. 函数允许被递归调用，直到运行结束。 
5. 1 <= n <= 100


# 算法思路

# 测试用例
```
636. Exclusive Time of Functions 636. 函数的独占时间 Medium
Solution.exclusiveTime
---
2
["0:start:0","1:start:2","1:end:5","0:end:6"]

=[3,4]
---
78
["0:start:0","1:start:4","2:start:9","3:start:13","4:start:15","5:start:20","6:start:22","7:start:24","8:start:25","9:start:27","10:start:30","11:start:32","12:start:37","13:start:38","14:start:43","15:start:46","16:start:50","17:start:51","18:start:53","19:start:55","20:start:56","21:start:59","22:start:60","23:start:65","24:start:68","25:start:72","26:start:73","27:start:75","28:start:76","29:start:80","30:start:85","31:start:90","32:start:95","33:start:100","34:start:104","35:start:105","36:start:110","37:start:111","38:start:113","39:start:114","40:start:118","41:start:121","42:start:123","43:start:128","44:start:133","45:start:137","46:start:138","47:start:141","48:start:145","49:start:150","50:start:152","51:start:155","52:start:156","53:start:159","54:start:164","55:start:169","56:start:173","57:start:178","58:start:183","59:start:188","60:start:191","61:start:196","62:start:198","63:start:199","64:start:204","65:start:209","66:start:214","67:start:215","68:start:217","69:start:222","70:start:225","71:start:227","72:start:229","73:start:230","74:start:233","75:start:234","76:start:238","77:start:239","77:end:246","43:start:250","77:start:254","77:end:255","59:start:259","59:end:264","43:end:266","77:start:268","77:end:273","11:start:276","11:end:277","76:start:282","76:end:283","76:end:284","75:end:287","50:start:288","60:start:291","8:start:295","53:start:297","53:end:300","8:end:302","60:end:305","50:end:306","75:start:311","31:start:315","31:end:320","75:end:323","74:end:326","76:start:327","76:end:329","73:end:334","72:end:338","71:end:340","70:end:345","69:end:349","68:end:353","56:start:354","56:end:357","68:start:361","68:end:364","29:start:368","12:start:371","12:end:373","29:end:377","67:end:379","34:start:382","34:end:384","66:end:385","65:end:390","33:start:394","33:end:397","64:end:402","42:start:403","42:end:405","63:end:407","62:end:412","61:end:415","60:end:419","59:end:423","58:end:425","57:end:430","56:end:434","55:end:439","54:end:441","53:end:442","52:end:443","51:end:447","50:end:448","49:end:452","48:end:456","47:end:457","46:end:460","45:end:461","44:end:462","30:start:466","30:end:467","43:end:471","42:end:476","41:end:478","40:end:481","39:end:485","38:end:488","56:start:491","56:end:494","37:end:497","36:end:501","20:start:506","20:end:507","63:start:510","32:start:511","32:end:515","73:start:519","73:end:523","63:end:525","35:end:527","34:end:529","54:start:533","54:end:535","33:end:536","32:end:541","31:end:545","37:start:546","48:start:548","38:start:550","38:end:551","48:end:552","37:end:556","66:start:561","66:end:563","53:start:568","66:start:571","13:start:572","13:end:575","66:end:579","53:end:582","30:end:586","17:start:589","52:start:594","26:start:599","26:end:604","52:end:609","17:end:614","25:start:616","25:end:618","29:end:620","28:end:625","29:start:628","68:start:632","68:end:637","3:start:642","3:end:643","29:end:644","58:start:647","65:start:650","65:end:653","58:end:655","27:end:660","12:start:664","3:start:665","16:start:666","7:start:670","7:end:672","77:start:676","77:end:679","36:start:680","36:end:684","16:end:685","3:end:686","5:start:690","5:end:693","12:end:696","26:end:699","70:start:704","20:start:707","5:start:712","5:end:713","20:end:717","77:start:718","19:start:721","19:end:722","77:end:726","15:start:728","15:end:733","70:end:735","25:end:740","73:start:743","73:end:746","24:end:747","23:end:751","22:end:753","21:end:756","20:end:760","19:end:761","18:end:763","17:end:764","16:end:767","15:end:771","14:end:772","13:end:774","12:end:779","68:start:781","26:start:785","64:start:790","64:end:794","26:end:798","68:end:802","11:end:806","10:end:808","9:end:811","8:end:812","32:start:817","32:end:822","17:start:825","17:end:830","68:start:833","25:start:838","25:end:840","68:end:842","7:end:847","6:end:849","5:end:854","4:end:856","3:end:858","2:end:862","1:end:864","0:end:869"]

=[9,7,8,8,7,13,4,17,7,6,4,12,16,11,4,14,12,19,4,4,18,4,7,7,7,16,23,10,9,26,19,15,21,12,6,13,10,13,6,8,6,4,13,21,5,2,6,5,12,6,8,5,14,16,10,9,17,10,12,13,16,5,6,13,18,14,12,10,34,7,13,4,5,17,8,14,17,27]
```

[enTitle]: https://leetcode.com/problems/exclusive-time-of-functions/
[cnTitle]: https://leetcode-cn.com/problems/exclusive-time-of-functions/
