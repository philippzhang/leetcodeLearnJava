# [1553. Minimum Number of Days to Eat N Oranges][enTitle]

**Hard**

There are  *n*  oranges in the kitchen and you decided to eat some of these oranges every day as follows:

- Eat one orange. 
- If the number of remaining oranges ( *n* ) is divisible by 2 then you can eat n/2 oranges. 
- If the number of remaining oranges ( *n* ) is divisible by 3 then you can eat 2*(n/3) oranges.

You can only choose one of the actions per day.

Return the minimum number of days to eat  *n*  oranges.



**Example 1:** 

```
Input: n = 10
Output: 4
Explanation: You have 10 oranges.
Day 1: Eat 1 orange,  10 - 1 = 9.  
Day 2: Eat 6 oranges, 9 - 2*(9/3) = 9 - 6 = 3. (Since 9 is divisible by 3)
Day 3: Eat 2 oranges, 3 - 2*(3/3) = 3 - 2 = 1. 
Day 4: Eat the last orange  1 - 1  = 0.
You need at least 4 days to eat the 10 oranges.

```

**Example 2:** 

```
Input: n = 6
Output: 3
Explanation: You have 6 oranges.
Day 1: Eat 3 oranges, 6 - 6/2 = 6 - 3 = 3. (Since 6 is divisible by 2).
Day 2: Eat 2 oranges, 3 - 2*(3/3) = 3 - 2 = 1. (Since 3 is divisible by 3)
Day 3: Eat the last orange  1 - 1  = 0.
You need at least 3 days to eat the 6 oranges.

```

**Example 3:** 

```
Input: n = 1
Output: 1

```

**Example 4:** 

```
Input: n = 56
Output: 6

```



**Constraints:** 

-  *1 <= n <= 2*10^9* 


# [1553. 吃掉 N 个橘子的最少天数][cnTitle]

**困难**

厨房里总共有  *n*  个橘子，你决定每一天选择如下方式之一吃这些橘子：

- 吃掉一个橘子。 
- 如果剩余橘子数  *n*  能被 2 整除，那么你可以吃掉  *n/2*  个橘子。 
- 如果剩余橘子数  *n*  能被 3 整除，那么你可以吃掉  *2*(n/3)*  个橘子。

每天你只能从以上 3 种方案中选择一种方案。

请你返回吃掉所有  *n*  个橘子的最少天数。



**示例 1：** 

```
输入：n = 10
输出：4
解释：你总共有 10 个橘子。
第 1 天：吃 1 个橘子，剩余橘子数 10 - 1 = 9。
第 2 天：吃 6 个橘子，剩余橘子数 9 - 2*(9/3) = 9 - 6 = 3。（9 可以被 3 整除）
第 3 天：吃 2 个橘子，剩余橘子数 3 - 2*(3/3) = 3 - 2 = 1。
第 4 天：吃掉最后 1 个橘子，剩余橘子数 1 - 1 = 0。
你需要至少 4 天吃掉 10 个橘子。

```

**示例 2：** 

```
输入：n = 6
输出：3
解释：你总共有 6 个橘子。
第 1 天：吃 3 个橘子，剩余橘子数 6 - 6/2 = 6 - 3 = 3。（6 可以被 2 整除）
第 2 天：吃 2 个橘子，剩余橘子数 3 - 2*(3/3) = 3 - 2 = 1。（3 可以被 3 整除）
第 3 天：吃掉剩余 1 个橘子，剩余橘子数 1 - 1 = 0。
你至少需要 3 天吃掉 6 个橘子。

```

**示例 3：** 

```
输入：n = 1
输出：1

```

**示例 4：** 

```
输入：n = 56
输出：6

```



**提示：** 

-  *1 <= n <= 2*10^9* 




# 算法思路

# 测试用例
```
1553. Minimum Number of Days to Eat N Oranges 1553. 吃掉 N 个橘子的最少天数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-days-to-eat-n-oranges/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-days-to-eat-n-oranges/
