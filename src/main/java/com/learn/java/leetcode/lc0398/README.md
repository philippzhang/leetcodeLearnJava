# [398. Random Pick Index][enTitle]

**Medium**

Given an array of integers with possible duplicates, randomly output the index of a given target number. You can assume that the given target number must exist in the array.

Note: The array size can be very large. Solution that uses too much extra space will not pass the judge.

Example:

```
int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
solution.pick(3);

// pick(1) should return 0. Since in the array only nums[0] is equal to 1.
solution.pick(1);

```


# [398. 随机数索引][cnTitle]

**中等**

给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。

**注意：**  数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。

**示例:** 

```
int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
solution.pick(3);

// pick(1) 应该返回 0。因为只有nums[0]等于1。
solution.pick(1);

```




# 算法思路

# 测试用例
```
398. Random Pick Index 398. 随机数索引 Medium
```

[enTitle]: https://leetcode.com/problems/random-pick-index/
[cnTitle]: https://leetcode-cn.com/problems/random-pick-index/
