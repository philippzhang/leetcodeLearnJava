# [220. Contains Duplicate III][enTitle]

**Medium**

Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.


**Example 1:** 

```
Input:nums = [1,2,3,1], k = 3, t = 0
Output: true
```


**Example 2:** 

```
Input:nums = [1,0,1,1], k = 1, t = 2
Output: true
```


**Example 3:** 

```
Input:nums = [1,5,9,1,5,9], k = 2, t = 3
Output: false
```








# [220. 存在重复元素 III][cnTitle]

**中等**

给定一个整数数组，判断数组中是否有两个不同的索引  *i*  和  *j* ，使得 **nums [i]**  和 **nums [j]**  的差的绝对值最大为  *t* ，并且  *i*  和  *j*  之间的差的绝对值最大为  *ķ* 。

**示例 1:** 

```
输入: nums = [1,2,3,1], k= 3, t = 0
输出: true
```

**示例 2:** 

```
输入:nums = [1,0,1,1], k=1, t = 2
输出: true
```

**示例 3:** 

```
输入:nums = [1,5,9,1,5,9], k = 2, t = 3
输出: false
```




# 算法思路

# 测试用例
```
220. Contains Duplicate III 220. 存在重复元素 III Medium
Solution.containsNearbyAlmostDuplicate
---
[1,2,3,1]
3
0

=true
---
[1,0,1,1]
1
2

=true
---
[1,5,9,1,5,9]
2
3

=false
---
[0,2147483647]
1
2147483647

=true
```

[enTitle]: https://leetcode.com/problems/contains-duplicate-iii/
[cnTitle]: https://leetcode-cn.com/problems/contains-duplicate-iii/
