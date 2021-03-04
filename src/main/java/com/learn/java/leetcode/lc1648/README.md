# [1648. Sell Diminishing-Valued Colored Balls][enTitle]

**Medium**

You have an  *inventory*  of different colored balls, and there is a customer that wants  *orders*  balls of **any**  color.

The customer weirdly values the colored balls. Each colored ball's value is the number of balls **of that color** you currently have in your  *inventory* . For example, if you own  *6*  yellow balls, the customer would pay  *6*  for the first yellow ball. After the transaction, there are only  *5*  yellow balls left, so the next yellow ball is then valued at  *5*  (i.e., the value of the balls decreases as you sell more to the customer).

You are given an integer array,  *inventory* , where  *inventory[i]*  represents the number of balls of the  *ith*  color that you initially own. You are also given an integer  *orders* , which represents the total number of balls that the customer wants. You can sell the balls **in any order** .

Return  *the maximum total value that you can attain after selling*  *orders*  *colored balls* . As the answer may be too large, return it **modulo**  *109 + 7* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/05/jj.gif)

```
Input: inventory = [2,5], orders = 4
Output: 14
Explanation: Sell the 1st color 1 time (2) and the 2nd color 3 times (5 + 4 + 3).
The maximum total value is 2 + 5 + 4 + 3 = 14.

```

**Example 2:** 

```
Input: inventory = [3,5], orders = 6
Output: 19
Explanation:Sell the 1st color 2 times (3 + 2) and the 2nd color 4 times (5 + 4 + 3 + 2).
The maximum total value is 3 + 2 + 5 + 4 + 3 + 2 = 19.

```

**Example 3:** 

```
Input: inventory = [2,8,4,10,6], orders = 20
Output: 110

```

**Example 4:** 


<pre><strong>Input:</strong> inventory = [1000000000], orders = 1000000000
<strong>Output:</strong> 21
<strong>Explanation: </strong>Sell the 1st color 1000000000 times for a total value of 500000000500000000. 500000000500000000 modulo 10<sup>9 </sup>+ 7 = 21.
</pre>



**Constraints:** 

-  *1 <= inventory.length <= 105*  
-  *1 <= inventory[i] <= 109*  
-  *1 <= orders <= min(sum(inventory[i]), 109)* 


# [1648. 销售价值减少的颜色球][cnTitle]

**中等**

你有一些球的库存  *inventory*  ，里面包含着不同颜色的球。一个顾客想要 **任意颜色**  总数为  *orders*  的球。

这位顾客有一种特殊的方式衡量球的价值：每个球的价值是目前剩下的 **同色球**  的数目。比方说还剩下  *6*  个黄球，那么顾客买第一个黄球的时候该黄球的价值为  *6*  。这笔交易以后，只剩下  *5*  个黄球了，所以下一个黄球的价值为  *5*  （也就是球的价值随着顾客购买同色球是递减的）

给你整数数组  *inventory*  ，其中  *inventory[i]*  表示第  *i*  种颜色球一开始的数目。同时给你整数  *orders*  ，表示顾客总共想买的球数目。你可以按照 **任意顺序**  卖球。

请你返回卖了  *orders*  个球以后 **最大**  总价值之和。由于答案可能会很大，请你返回答案对  *109 + 7*  **取余数**  的结果。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/11/08/jj.gif)

```
输入：inventory = [2,5], orders = 4
输出：14
解释：卖 1 个第一种颜色的球（价值为 2 )，卖 3 个第二种颜色的球（价值为 5 + 4 + 3）。
最大总和为 2 + 5 + 4 + 3 = 14 。

```

**示例 2：** 

```
输入：inventory = [3,5], orders = 6
输出：19
解释：卖 2 个第一种颜色的球（价值为 3 + 2），卖 4 个第二种颜色的球（价值为 5 + 4 + 3 + 2）。
最大总和为 3 + 2 + 5 + 4 + 3 + 2 = 19 。

```

**示例 3：** 

```
输入：inventory = [2,8,4,10,6], orders = 20
输出：110

```

**示例 4：** 


<pre><b>输入：</b>inventory = [1000000000], orders = 1000000000
<b>输出：</b>21
<strong>解释：</strong>卖 1000000000 次第一种颜色的球，总价值为 500000000500000000 。 500000000500000000 对 10<sup>9 </sup>+ 7 取余为 21 。
</pre>



**提示：** 

-  *1 <= inventory.length <= 105*  
-  *1 <= inventory[i] <= 109*  
-  *1 <= orders <= min(sum(inventory[i]), 109)* 




# 算法思路

# 测试用例
```
1648. Sell Diminishing-Valued Colored Balls 1648. 销售价值减少的颜色球 Medium
```

[enTitle]: https://leetcode.com/problems/sell-diminishing-valued-colored-balls/
[cnTitle]: https://leetcode-cn.com/problems/sell-diminishing-valued-colored-balls/
