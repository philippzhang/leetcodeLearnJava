# [1681. Minimum Incompatibility][enTitle]

**Hard**

You are given an integer array  *nums* ​​​ and an integer  *k* . You are asked to distribute this array into  *k*  subsets of **equal size**  such that there are no two equal elements in the same subset.

A subset's **incompatibility**  is the difference between the maximum and minimum elements in that array.

Return  *the minimum possible sum of incompatibilities of the*  *k*   *subsets after distributing the array optimally, or return*  *-1*  *if it is not possible.* 

A subset is a group integers that appear in the array with no particular order.



**Example 1:** 

```
Input: nums = [1,2,1,4], k = 2
Output: 4
Explanation: The optimal distribution of subsets is [1,2] and [1,4].
The incompatibility is (2-1) + (4-1) = 4.
Note that [1,1] and [2,4] would result in a smaller sum, but the first subset contains 2 equal elements.
```

**Example 2:** 

```
Input: nums = [6,3,8,1,3,1,2,2], k = 4
Output: 6
Explanation: The optimal distribution of subsets is [1,2], [2,3], [6,8], and [1,3].
The incompatibility is (2-1) + (3-2) + (8-6) + (3-1) = 6.

```

**Example 3:** 

```
Input: nums = [5,3,3,6,3,3], k = 3
Output: -1
Explanation: It is impossible to distribute nums into 3 subsets where no two elements are equal in the same subset.

```



**Constraints:** 

-  *1 <= k <= nums.length <= 16*  
-  *nums.length*  is divisible by  *k*  
-  *1 <= nums[i] <= nums.length* 


# [1681. 最小不兼容性][cnTitle]

**困难**

给你一个整数数组  *nums* ​​​ 和一个整数  *k*  。你需要将这个数组划分到  *k*  个相同大小的子集中，使得同一个子集里面没有两个相同的元素。

一个子集的 **不兼容性**  是该子集里面最大值和最小值的差。

请你返回将数组分成  *k*  个子集后，各子集 **不兼容性** 的**和**  的 **最小值**  ，如果无法分成分成  *k*  个子集，返回  *-1*  。

子集的定义是数组中一些数字的集合，对数字顺序没有要求。



**示例 1：** 

```
输入：nums = [1,2,1,4], k = 2
输出：4
解释：最优的分配是 [1,2] 和 [1,4] 。
不兼容性和为 (2-1) + (4-1) = 4 。
注意到 [1,1] 和 [2,4] 可以得到更小的和，但是第一个集合有 2 个相同的元素，所以不可行。
```

**示例 2：** 

```
输入：nums = [6,3,8,1,3,1,2,2], k = 4
输出：6
解释：最优的子集分配为 [1,2]，[2,3]，[6,8] 和 [1,3] 。
不兼容性和为 (2-1) + (3-2) + (8-6) + (3-1) = 6 。

```

**示例 3：** 

```
输入：nums = [5,3,3,6,3,3], k = 3
输出：-1
解释：没办法将这些数字分配到 3 个子集且满足每个子集里没有相同数字。

```



**提示：** 

-  *1 <= k <= nums.length <= 16*  
-  *nums.length*  能被  *k*  整除。 
-  *1 <= nums[i] <= nums.length* 




# 算法思路

# 测试用例
```
1681. Minimum Incompatibility 1681. 最小不兼容性 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-incompatibility/
[cnTitle]: https://leetcode-cn.com/problems/minimum-incompatibility/
