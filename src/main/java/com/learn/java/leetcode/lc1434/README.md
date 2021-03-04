# [1434. Number of Ways to Wear Different Hats to Each Other][enTitle]

**Hard**

There are  *n*  people and 40 types of hats labeled from 1 to 40.

Given a list of list of integers  *hats* , where  *hats[i]*  is a list of all hats preferred by the  *i-th*  person.

Return the number of ways that the n people wear different hats to each other.

Since the answer may be too large, return it modulo  *10^9 + 7* .



**Example 1:** 

```
Input: hats = [[3,4],[4,5],[5]]
Output: 1
Explanation:There is only one way to choose hats given the conditions. 
First person choose hat 3, Second person choose hat 4 and last one hat 5.
```

**Example 2:** 

```
Input: hats = [[3,5,1],[3,5]]
Output: 4
Explanation:There are 4 ways to choose hats
(3,5), (5,3), (1,3) and (1,5)

```

**Example 3:** 

```
Input: hats = [[1,2,3,4],[1,2,3,4],[1,2,3,4],[1,2,3,4]]
Output: 24
Explanation:Each person can choose hats labeled from 1 to 4.
Number of Permutations of (1,2,3,4) = 24.

```

**Example 4:** 

```
Input: hats = [[1,2,3],[2,3,5,6],[1,3,7,9],[1,8,9],[2,5,7]]
Output: 111

```



**Constraints:** 

-  *n == hats.length*  
-  *1 <= n <= 10*  
-  *1 <= hats[i].length <= 40*  
-  *1 <= hats[i][j] <= 40*  
-  *hats[i]*  contains a list of **unique**  integers.


# [1434. 每个人戴不同帽子的方案数][cnTitle]

**困难**

总共有  *n*  个人和  *40*  种不同的帽子，帽子编号从  *1*  到  *40*  。

给你一个整数列表的列表  *hats*  ，其中  *hats[i]*  是第  *i*  个人所有喜欢帽子的列表。

请你给每个人安排一顶他喜欢的帽子，确保每个人戴的帽子跟别人都不一样，并返回方案数。

由于答案可能很大，请返回它对  *10^9 + 7*  取余后的结果。



**示例 1：** 

```
输入：hats = [[3,4],[4,5],[5]]
输出：1
解释：给定条件下只有一种方法选择帽子。
第一个人选择帽子 3，第二个人选择帽子 4，最后一个人选择帽子 5。
```

**示例 2：** 

```
输入：hats = [[3,5,1],[3,5]]
输出：4
解释：总共有 4 种安排帽子的方法：
(3,5)，(5,3)，(1,3) 和 (1,5)

```

**示例 3：** 

```
输入：hats = [[1,2,3,4],[1,2,3,4],[1,2,3,4],[1,2,3,4]]
输出：24
解释：每个人都可以从编号为 1 到 4 的帽子中选。
(1,2,3,4) 4 个帽子的排列方案数为 24 。

```

**示例 4：** 

```
输入：hats = [[1,2,3],[2,3,5,6],[1,3,7,9],[1,8,9],[2,5,7]]
输出：111

```



**提示：** 

-  *n == hats.length*  
-  *1 <= n <= 10*  
-  *1 <= hats[i].length <= 40*  
-  *1 <= hats[i][j] <= 40*  
-  *hats[i]*  包含一个数字互不相同的整数列表。




# 算法思路

# 测试用例
```
1434. Number of Ways to Wear Different Hats to Each Other 1434. 每个人戴不同帽子的方案数 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-ways-to-wear-different-hats-to-each-other/
[cnTitle]: https://leetcode-cn.com/problems/number-of-ways-to-wear-different-hats-to-each-other/
