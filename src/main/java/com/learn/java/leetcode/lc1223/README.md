# [1223. Dice Roll Simulation][enTitle]

**Hard**

A die simulator generates a random number from 1 to 6 for each roll. You introduced a constraint to the generator such that it cannot roll the number  *i*  more than  *rollMax[i]*  (1-indexed) **consecutive**  times.

Given an array of integers  *rollMax*  and an integer  *n* , return the number of distinct sequences that can be obtained with exact  *n*  rolls.

Two sequences are considered different if at least one element differs from each other. Since the answer may be too large, return it modulo  *10^9 + 7* .



**Example 1:** 

```
Input: n = 2, rollMax = [1,1,2,2,2,3]
Output: 34
Explanation: There will be 2 rolls of die, if there are no constraints on the die, there are 6 * 6 = 36 possible combinations. In this case, looking at rollMax array, the numbers 1 and 2 appear at most once consecutively, therefore sequences (1,1) and (2,2) cannot occur, so the final answer is 36-2 = 34.

```

**Example 2:** 

```
Input: n = 2, rollMax = [1,1,1,1,1,1]
Output: 30

```

**Example 3:** 

```
Input: n = 3, rollMax = [1,1,1,2,2,3]
Output: 181

```



**Constraints:** 

-  *1 <= n <= 5000*  
-  *rollMax.length == 6*  
-  *1 <= rollMax[i] <= 15* 


# [1223. 掷骰子模拟][cnTitle]

**中等**

有一个骰子模拟器会每次投掷的时候生成一个 1 到 6 的随机数。

不过我们在使用它时有个约束，就是使得投掷骰子时，**连续**  掷出数字  *i*  的次数不能超过  *rollMax[i]* （ *i*  从 1 开始编号）。

现在，给你一个整数数组  *rollMax*  和一个整数  *n* ，请你来计算掷  *n*  次骰子可得到的不同点数序列的数量。

假如两个序列中至少存在一个元素不同，就认为这两个序列是不同的。由于答案可能很大，所以请返回 **模 10^9 + 7**  之后的结果。



**示例 1：** 

```
输入：n = 2, rollMax = [1,1,2,2,2,3]
输出：34
解释：我们掷 2 次骰子，如果没有约束的话，共有 6 * 6 = 36 种可能的组合。但是根据 rollMax 数组，数字 1 和 2 最多连续出现一次，所以不会出现序列 (1,1) 和 (2,2)。因此，最终答案是 36-2 = 34。

```

**示例 2：** 

```
输入：n = 2, rollMax = [1,1,1,1,1,1]
输出：30

```

**示例 3：** 

```
输入：n = 3, rollMax = [1,1,1,2,2,3]
输出：181

```



**提示：** 

-  *1 <= n <= 5000*  
-  *rollMax.length == 6*  
-  *1 <= rollMax[i] <= 15* 




# 算法思路

# 测试用例
```
1223. Dice Roll Simulation 1223. 掷骰子模拟 Hard
```

[enTitle]: https://leetcode.com/problems/dice-roll-simulation/
[cnTitle]: https://leetcode-cn.com/problems/dice-roll-simulation/
