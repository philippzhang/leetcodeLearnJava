# [1155. Number of Dice Rolls With Target Sum][enTitle]

**Medium**

You have  *d*  dice, and each die has  *f*  faces numbered  *1, 2, ..., f* .

Return the number of possible ways (out of  *fd*  total ways) **modulo 10^9 + 7**  to roll the dice so the sum of the face up numbers equals  *target* .



**Example 1:** 

```
Input: d = 1, f = 6, target = 3
Output: 1
Explanation:
You throw one die with 6 faces.  There is only one way to get a sum of 3.

```

**Example 2:** 

```
Input: d = 2, f = 6, target = 7
Output: 6
Explanation:
You throw two dice, each with 6 faces.  There are 6 ways to get a sum of 7:
1+6, 2+5, 3+4, 4+3, 5+2, 6+1.

```

**Example 3:** 

```
Input: d = 2, f = 5, target = 10
Output: 1
Explanation:
You throw two dice, each with 5 faces.  There is only one way to get a sum of 10: 5+5.

```

**Example 4:** 

```
Input: d = 1, f = 2, target = 3
Output: 0
Explanation:
You throw one die with 2 faces.  There is no way to get a sum of 3.

```

**Example 5:** 

```
Input: d = 30, f = 30, target = 500
Output: 222616187
Explanation:
The answer must be returned modulo 10^9 + 7.

```



**Constraints:** 

-  *1 <= d, f <= 30*  
-  *1 <= target <= 1000* 


# [1155. 掷骰子的N种方法][cnTitle]

**中等**

这里有  *d*  个一样的骰子，每个骰子上都有  *f*  个面，分别标号为  *1, 2, ..., f* 。

我们约定：掷骰子的得到总点数为各骰子面朝上的数字的总和。

如果需要掷出的总点数为  *target* ，请你计算出有多少种不同的组合情况（所有的组合情况总共有  *f^d*  种），**模 10^9 + 7**  后返回。



**示例 1：** 

```
输入：d = 1, f = 6, target = 3
输出：1

```

**示例 2：** 

```
输入：d = 2, f = 6, target = 7
输出：6

```

**示例 3：** 

```
输入：d = 2, f = 5, target = 10
输出：1

```

**示例 4：** 

```
输入：d = 1, f = 2, target = 3
输出：0

```

**示例 5：** 

```
输入：d = 30, f = 30, target = 500
输出：222616187
```



**提示：** 

-  *1 <= d, f <= 30*  
-  *1 <= target <= 1000* 




# 算法思路

# 测试用例
```
1155. Number of Dice Rolls With Target Sum 1155. 掷骰子的N种方法 Medium
```

[enTitle]: https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
[cnTitle]: https://leetcode-cn.com/problems/number-of-dice-rolls-with-target-sum/
