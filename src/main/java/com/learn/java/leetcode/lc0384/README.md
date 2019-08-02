# [384. Shuffle an Array][enTitle]

**Medium**

Shuffle a set of numbers without duplicates.

Example:

```
// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();

```




# [384. 打乱数组][cnTitle]

**中等**

打乱一个没有重复元素的数组。

**示例:** 

```
// 以数字集合 1, 2 和 3 初始化数组。
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
solution.shuffle();

// 重设数组到它的初始状态[1,2,3]。
solution.reset();

// 随机返回数组[1,2,3]打乱后的结果。
solution.shuffle();

```




# 算法思路

# 测试用例
```
384. Shuffle an Array 384. 打乱数组 Medium
Main.funcListTest
---
["Solution","shuffle","reset","shuffle"]
[[[1,2,3]],[],[],[]]

=[null,[1,2,3],[1,2,3],[1,2,3]]
=[null,[1,3,2],[1,2,3],[1,2,3]]
=[null,[2,1,3],[1,2,3],[1,2,3]]
=[null,[2,3,1],[1,2,3],[1,2,3]]
=[null,[3,1,2],[1,2,3],[1,2,3]]
=[null,[3,2,1],[1,2,3],[1,2,3]]

=[null,[1,2,3],[1,2,3],[1,3,2]]
=[null,[1,3,2],[1,2,3],[1,3,2]]
=[null,[2,1,3],[1,2,3],[1,3,2]]
=[null,[2,3,1],[1,2,3],[1,3,2]]
=[null,[3,1,2],[1,2,3],[1,3,2]]
=[null,[3,2,1],[1,2,3],[1,3,2]]

=[null,[1,2,3],[1,2,3],[2,1,3]]
=[null,[1,3,2],[1,2,3],[2,1,3]]
=[null,[2,1,3],[1,2,3],[2,1,3]]
=[null,[2,3,1],[1,2,3],[2,1,3]]
=[null,[3,1,2],[1,2,3],[2,1,3]]
=[null,[3,2,1],[1,2,3],[2,1,3]]

=[null,[1,2,3],[1,2,3],[2,3,1]]
=[null,[1,3,2],[1,2,3],[2,3,1]]
=[null,[2,1,3],[1,2,3],[2,3,1]]
=[null,[2,3,1],[1,2,3],[2,3,1]]
=[null,[3,1,2],[1,2,3],[2,3,1]]
=[null,[3,2,1],[1,2,3],[2,3,1]]

=[null,[1,2,3],[1,2,3],[3,1,2]]
=[null,[1,3,2],[1,2,3],[3,1,2]]
=[null,[2,1,3],[1,2,3],[3,1,2]]
=[null,[2,3,1],[1,2,3],[3,1,2]]
=[null,[3,1,2],[1,2,3],[3,1,2]]
=[null,[3,2,1],[1,2,3],[3,1,2]]

=[null,[1,2,3],[1,2,3],[3,2,1]]
=[null,[1,3,2],[1,2,3],[3,2,1]]
=[null,[2,1,3],[1,2,3],[3,2,1]]
=[null,[2,3,1],[1,2,3],[3,2,1]]
=[null,[3,1,2],[1,2,3],[3,2,1]]
=[null,[3,2,1],[1,2,3],[3,2,1]]
```

[enTitle]: https://leetcode.com/problems/shuffle-an-array/
[cnTitle]: https://leetcode-cn.com/problems/shuffle-an-array/
