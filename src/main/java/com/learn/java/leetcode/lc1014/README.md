# [1014. Best Sightseeing Pair][enTitle]

**Medium**

You are given an integer array  *values*  where values[i] represents the value of the  *ith*  sightseeing spot. Two sightseeing spots  *i*  and  *j*  have a **distance**   *j - i*  between them.

The score of a pair ( *i < j* ) of sightseeing spots is  *values[i] + values[j] + i - j* : the sum of the values of the sightseeing spots, minus the distance between them.

Return  *the maximum score of a pair of sightseeing spots* .



**Example 1:** 

```
Input: values = [8,1,5,2,6]
Output: 11
Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11

```

**Example 2:** 

```
Input: values = [1,2]
Output: 2

```



**Constraints:** 

-  *2 <= values.length <= 5 * 104*  
-  *1 <= values[i] <= 1000* 


# [1014. 最佳观光组合][cnTitle]

**中等**

给你一个正整数数组  *values* ，其中  *values[i]*  表示第  *i*  个观光景点的评分，并且两个景点  *i*  和  *j*  之间的 **距离**  为  *j - i* 。

一对景点（ *i < j* ）组成的观光组合的得分为  *values[i] + values[j] + i - j*  ，也就是景点的评分之和**减去** 它们两者之间的距离。

返回一对观光景点能取得的最高分。



**示例 1：** 

```
输入：values = [8,1,5,2,6]
输出：11
解释：i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11

```

**示例 2：** 

```
输入：values = [1,2]
输出：2

```



**提示：** 

-  *2 <= values.length <= 5 * 104*  
-  *1 <= values[i] <= 1000* 




# 算法思路

# 测试用例
```
1014. Best Sightseeing Pair 1014. 最佳观光组合 Medium
```

[enTitle]: https://leetcode.com/problems/best-sightseeing-pair/
[cnTitle]: https://leetcode-cn.com/problems/best-sightseeing-pair/
