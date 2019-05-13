# [40. Combination Sum II][enTitle]

**Medium**

Given a collection of candidate numbers ( *candidates* ) and a target number ( *target* ), find all unique combinations in  *candidates*  where the candidate numbers sums to  *target* .

Each number in  *candidates*  may only be used **once**  in the combination.

**Note:** 

- All numbers (including  *target* ) will be positive integers. 
- The solution set must not contain duplicate combinations.

**Example 1:** 

```
Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]

```

**Example 2:** 

```
Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]

```
# [40. 组合总和 II][cnTitle]

**中等**

给定一个数组  *candidates*  和一个目标数  *target*  ，找出  *candidates*  中所有可以使数字和为  *target*  的组合。

 *candidates*  中的每个数字在每个组合中只能使用一次。

**说明：** 

- 所有数字（包括目标数）都是正整数。 
- 解集不能包含重复的组合。 

**示例 1:** 

```
输入: candidates = [10,1,2,7,6,1,5], target = 8,
所求解集为:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]

```

**示例 2:** 

```
输入: candidates = [2,5,2,1,2], target = 5,
所求解集为:
[
  [1,2,2],
  [5]
]
```


# 算法思路

# 测试用例
```
40. Combination Sum II 40. 组合总和 II Medium
Solution.combinationSum2
---
[10,1,2,7,6,1,5]
8

=[[1,2,5],[1,7],[1,1,6],[2,6]]
$disorder
---
[14,6,25,9,30,20,33,34,28,30,16,12,31,9,9,12,34,16,25,32,8,7,30,12,33,20,21,29,24,17,27,34,11,17,30,6,32,21,27,17,16,8,24,12,12,28,11,33,10,32,22,13,34,18,12]
27

=[[6,7,14],[6,8,13],[6,9,12],[6,10,11],[6,21],[6,6,7,8],[7,8,12],[7,9,11],[7,20],[8,9,10],[8,8,11],[9,18],[9,9,9],[10,17],[11,16],[13,14],[27]]
$disorder
```

[enTitle]: https://leetcode.com/problems/combination-sum-ii/
[cnTitle]: https://leetcode-cn.com/problems/combination-sum-ii/
