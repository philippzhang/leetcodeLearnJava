# [307. Range Sum Query - Mutable][enTitle]

**Medium**

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

The update(i, val) function modifies nums by updating the element at index i to val.

Example:

```
Given nums = [1, 3, 5]

sumRange(0, 2) -> 9
update(1, 2)
sumRange(0, 2) -> 8

```

Note:

1. The array is only modifiable by the update function. 
2. You may assume the number of calls to update and sumRange function is distributed evenly.
# [307. 区域和检索 - 数组可修改][cnTitle]

**中等**

给定一个整数数组  *nums* ，求出数组从索引  *i* 到  *j* ( *i*  ≤  *j* ) 范围内元素的总和，包含  *i, j* 两点。

 *update(i, val)*  函数可以通过将下标为  *i* 的数值更新为  *val* ，从而对数列进行修改。

**示例:** 

```
Given nums = [1, 3, 5]

sumRange(0, 2) -> 9
update(1, 2)
sumRange(0, 2) -> 8

```

**说明:** 

1. 数组仅可以在  *update* 函数下进行修改。 
2. 你可以假设  *update*  函数与  *sumRange*  函数的调用次数是均匀分布的。


# 算法思路

# 测试用例
```
307. Range Sum Query - Mutable 307. 区域和检索 - 数组可修改 Medium
Main.funcListTest
---
["NumArray","sumRange","update","sumRange"]
[[[1,3,5]],[0,2],[1,2],[0,2]]

=[null,9,null,8]
```

[enTitle]: https://leetcode.com/problems/range-sum-query-mutable/
[cnTitle]: https://leetcode-cn.com/problems/range-sum-query-mutable/
