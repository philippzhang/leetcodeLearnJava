# [1590. Make Sum Divisible by P][enTitle]

**Medium**

Given an array of positive integers  *nums* , remove the **smallest**  subarray (possibly **empty** ) such that the **sum**  of the remaining elements is divisible by  *p* . It is **not**  allowed to remove the whole array.

Return  *the length of the smallest subarray that you need to remove, or*  *-1*  *if it's impossible* .

A **subarray**  is defined as a contiguous block of elements in the array.



**Example 1:** 

```
Input: nums = [3,1,4,2], p = 6
Output: 1
Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.

```

**Example 2:** 

```
Input: nums = [6,3,5,2], p = 9
Output: 2
Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.

```

**Example 3:** 

```
Input: nums = [1,2,3], p = 3
Output: 0
Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.

```

**Example 4:** 

```
Input: nums = [1,2,3], p = 7
Output: -1
Explanation: There is no way to remove a subarray in order to get a sum divisible by 7.

```

**Example 5:** 

```
Input: nums = [1000000000,1000000000,1000000000], p = 3
Output: 0

```



**Constraints:** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 109*  
-  *1 <= p <= 109* 


# [1590. 使数组和能被 P 整除][cnTitle]

**中等**

给你一个正整数数组  *nums* ，请你移除 **最短**  子数组（可以为 **空** ），使得剩余元素的 **和**  能被  *p*  整除。 **不允许**  将整个数组都移除。

请你返回你需要移除的最短子数组的长度，如果无法满足题目要求，返回  *-1*  。

**子数组**  定义为原数组中连续的一组元素。



**示例 1：** 

```
输入：nums = [3,1,4,2], p = 6
输出：1
解释：nums 中元素和为 10，不能被 p 整除。我们可以移除子数组 [4] ，剩余元素的和为 6 。

```

**示例 2：** 

```
输入：nums = [6,3,5,2], p = 9
输出：2
解释：我们无法移除任何一个元素使得和被 9 整除，最优方案是移除子数组 [5,2] ，剩余元素为 [6,3]，和为 9 。

```

**示例 3：** 

```
输入：nums = [1,2,3], p = 3
输出：0
解释：和恰好为 6 ，已经能被 3 整除了。所以我们不需要移除任何元素。

```

**示例 4：** 

```
输入：nums = [1,2,3], p = 7
输出：-1
解释：没有任何方案使得移除子数组后剩余元素的和被 7 整除。

```

**示例 5：** 

```
输入：nums = [1000000000,1000000000,1000000000], p = 3
输出：0

```



**提示：** 

-  *1 <= nums.length <= 105*  
-  *1 <= nums[i] <= 109*  
-  *1 <= p <= 109* 




# 算法思路

# 测试用例
```
1590. Make Sum Divisible by P 1590. 使数组和能被 P 整除 Medium
```

[enTitle]: https://leetcode.com/problems/make-sum-divisible-by-p/
[cnTitle]: https://leetcode-cn.com/problems/make-sum-divisible-by-p/
