# [1716. Calculate Money in Leetcode Bank][enTitle]

**Easy**

Hercy wants to save money for his first car. He puts money in the Leetcode bank **every day** .

He starts by putting in  *$1*  on Monday, the first day. Every day from Tuesday to Sunday, he will put in  *$1*  more than the day before. On every subsequent Monday, he will put in  *$1*  more than the **previous Monday** .

Given  *n* , return  *the total amount of money he will have in the Leetcode bank at the end of the*  *nth*  *day.* 



**Example 1:** 


<pre><strong>Input:</strong> n = 4
<strong>Output:</strong> 10
<strong>Explanation:</strong> After the 4<sup>th</sup> day, the total is 1 + 2 + 3 + 4 = 10.
</pre>

**Example 2:** 


<pre><strong>Input:</strong> n = 10
<strong>Output:</strong> 37
<strong>Explanation:</strong> After the 10<sup>th</sup> day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2<sup>nd</sup> Monday, Hercy only puts in $2.
</pre>

**Example 3:** 


<pre><strong>Input:</strong> n = 20
<strong>Output:</strong> 96
<strong>Explanation:</strong> After the 20<sup>th</sup> day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
</pre>



**Constraints:** 

-  *1 <= n <= 1000* 


# [1716. 计算力扣银行的钱][cnTitle]

**简单**

Hercy 想要为购买第一辆车存钱。他 **每天**  都往力扣银行里存钱。

最开始，他在周一的时候存入  *1*  块钱。从周二到周日，他每天都比前一天多存入  *1*  块钱。在接下来每一个周一，他都会比 **前一个周一**  多存入  *1*  块钱。

给你  *n*  ，请你返回在第  *n*  天结束的时候他在力扣银行总共存了多少块钱。



**示例 1：** 

```
输入：n = 4
输出：10
解释：第 4 天后，总额为 1 + 2 + 3 + 4 = 10 。

```

**示例 2：** 

```
输入：n = 10
输出：37
解释：第 10 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37 。注意到第二个星期一，Hercy 存入 2 块钱。

```

**示例 3：** 

```
输入：n = 20
输出：96
解释：第 20 天后，总额为 (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96 。

```



**提示：** 

-  *1 <= n <= 1000* 




# 算法思路

# 测试用例
```
1716. Calculate Money in Leetcode Bank 1716. 计算力扣银行的钱 Easy
```

[enTitle]: https://leetcode.com/problems/calculate-money-in-leetcode-bank/
[cnTitle]: https://leetcode-cn.com/problems/calculate-money-in-leetcode-bank/
