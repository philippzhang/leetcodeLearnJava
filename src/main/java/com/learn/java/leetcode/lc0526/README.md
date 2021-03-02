# [526. Beautiful Arrangement][enTitle]

**Medium**

Suppose you have  *n*  integers labeled  *1*  through  *n* . A permutation of those  *n*  integers  *perm*  (**1-indexed** ) is considered a **beautiful arrangement**  if for every  *i*  ( *1 <= i <= n* ), **either**  of the following is true:

-  *perm[i]*  is divisible by  *i* . 
-  *i*  is divisible by  *perm[i]* .

Given an integer  *n* , return  *the number of the beautiful arrangements that you can construct* .



**Example 1:** 

```
Input: n = 2
Output: 2
Explanation: 
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1

```

**Example 2:** 

```
Input: n = 1
Output: 1

```



**Constraints:** 

-  *1 <= n <= 15* 


# [526. 优美的排列][cnTitle]

**中等**

假设有从 1 到 N 的 **N** 个整数，如果从这 **N** 个数字中成功构造出一个数组，使得数组的第 **i**  位 (1 <= i <= N) 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：

1. 第 **i** 位的数字能被 **i** 整除 
2. **i**  能被第 **i**  位上的数字整除

现在给定一个整数 N，请问可以构造多少个优美的排列？

**示例1:** 

```
输入: 2
输出: 2
解释: 

第 1 个优美的排列是 [1, 2]:
  第 1 个位置（i=1）上的数字是1，1能被 i（i=1）整除
  第 2 个位置（i=2）上的数字是2，2能被 i（i=2）整除

第 2 个优美的排列是 [2, 1]:
  第 1 个位置（i=1）上的数字是2，2能被 i（i=1）整除
  第 2 个位置（i=2）上的数字是1，i（i=2）能被 1 整除

```

**说明:** 

1. **N**  是一个正整数，并且不会超过15。




# 算法思路

# 测试用例
```
526. Beautiful Arrangement 526. 优美的排列 Medium
```

[enTitle]: https://leetcode.com/problems/beautiful-arrangement/
[cnTitle]: https://leetcode-cn.com/problems/beautiful-arrangement/
