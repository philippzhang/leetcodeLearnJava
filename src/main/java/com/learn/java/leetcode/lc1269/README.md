# [1269. Number of Ways to Stay in the Same Place After Some Steps][enTitle]

**Hard**

You have a pointer at index  *0*  in an array of size  *arrLen* . At each step, you can move 1 position to the left, 1 position to the right in the array or stay in the same place (The pointer should not be placed outside the array at any time).

Given two integers  *steps*  and  *arrLen* , return the number of ways such that your pointer still at index  *0*  after **exactly**  *steps*  steps.

Since the answer may be too large, return it **modulo**   *10^9 + 7* .



**Example 1:** 

```
Input: steps = 3, arrLen = 2
Output: 4
Explanation:There are 4 differents ways to stay at index 0 after 3 steps.
Right, Left, Stay
Stay, Right, Left
Right, Stay, Left
Stay, Stay, Stay

```

**Example 2:** 

```
Input: steps = 2, arrLen = 4
Output: 2
Explanation: There are 2 differents ways to stay at index 0 after 2 steps
Right, Left
Stay, Stay

```

**Example 3:** 

```
Input: steps = 4, arrLen = 2
Output: 8

```



**Constraints:** 

-  *1 <= steps <= 500*  
-  *1 <= arrLen <= 10^6* 


# [1269. 停在原地的方案数][cnTitle]

**困难**

有一个长度为  *arrLen*  的数组，开始有一个指针在索引  *0*  处。

每一步操作中，你可以将指针向左或向右移动 1 步，或者停在原地（指针不能被移动到数组范围外）。

给你两个整数  *steps*  和  *arrLen*  ，请你计算并返回：在恰好执行  *steps*  次操作以后，指针仍然指向索引  *0*  处的方案数。

由于答案可能会很大，请返回方案数 **模**   *10^9 + 7*  后的结果。



**示例 1：** 

```
输入：steps = 3, arrLen = 2
输出：4
解释：3 步后，总共有 4 种不同的方法可以停在索引 0 处。
向右，向左，不动
不动，向右，向左
向右，不动，向左
不动，不动，不动

```

**示例 2：** 

```
输入：steps = 2, arrLen = 4
输出：2
解释：2 步后，总共有 2 种不同的方法可以停在索引 0 处。
向右，向左
不动，不动

```

**示例 3：** 

```
输入：steps = 4, arrLen = 2
输出：8

```



**提示：** 

-  *1 <= steps <= 500*  
-  *1 <= arrLen <= 10^6* 




# 算法思路

# 测试用例
```
1269. Number of Ways to Stay in the Same Place After Some Steps 1269. 停在原地的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/
