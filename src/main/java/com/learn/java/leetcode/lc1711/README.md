# [1711. Count Good Meals][enTitle]

**Medium**

A **good meal**  is a meal that contains **exactly two different food items**  with a sum of deliciousness equal to a power of two.

You can pick **any**  two different foods to make a good meal.

Given an array of integers  *deliciousness*  where  *deliciousness[i]*  is the deliciousness of the  *ith* ​​​​ item of food, return  *the number of different good meals you can make from this list modulo*   *109 + 7* .

Note that items with different indices are considered different even if they have the same deliciousness value.



**Example 1:** 

```
Input: deliciousness = [1,3,5,7,9]
Output: 4
Explanation:The good meals are (1,3), (1,7), (3,5) and, (7,9).
Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.

```

**Example 2:** 

```
Input: deliciousness = [1,1,1,3,3,3,7]
Output: 15
Explanation:The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.
```



**Constraints:** 

-  *1 <= deliciousness.length <= 105*  
-  *0 <= deliciousness[i] <= 220* 


# [1711. 大餐计数][cnTitle]

**中等**

**大餐**  是指 **恰好包含两道不同餐品**  的一餐，其美味程度之和等于 2 的幂。

你可以搭配 **任意**  两道餐品做一顿大餐。

给你一个整数数组  *deliciousness*  ，其中  *deliciousness[i]*  是第  *i* ​​​​ 道餐品的美味程度，返回你可以用数组中的餐品做出的不同 **大餐**  的数量。结果需要对  *109 + 7*  取余。

注意，只要餐品下标不同，就可以认为是不同的餐品，即便它们的美味程度相同。



**示例 1：** 

```
输入：deliciousness = [1,3,5,7,9]
输出：4
解释：大餐的美味程度组合为 (1,3) 、(1,7) 、(3,5) 和 (7,9) 。
它们各自的美味程度之和分别为 4 、8 、8 和 16 ，都是 2 的幂。

```

**示例 2：** 

```
输入：deliciousness = [1,1,1,3,3,3,7]
输出：15
解释：大餐的美味程度组合为 3 种 (1,1) ，9 种 (1,3) ，和 3 种 (1,7) 。
```



**提示：** 

-  *1 <= deliciousness.length <= 105*  
-  *0 <= deliciousness[i] <= 220* 




# 算法思路

# 测试用例
```
1711. Count Good Meals 1711. 大餐计数 Medium
```

[enTitle]: https://leetcode.com/problems/count-good-meals/
[cnTitle]: https://leetcode-cn.com/problems/count-good-meals/
