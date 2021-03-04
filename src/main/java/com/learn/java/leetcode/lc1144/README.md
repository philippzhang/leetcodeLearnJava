# [1144. Decrease Elements To Make Array Zigzag][enTitle]

**Medium**

Given an array  *nums*  of integers, a  *move*  consists of choosing any element and **decreasing it by 1** .

An array  *A*  is a  *zigzag array*  if either:

- Every even-indexed element is greater than adjacent elements, ie.  *A[0] > A[1] < A[2] > A[3] < A[4] > ...*  
- OR, every odd-indexed element is greater than adjacent elements, ie.  *A[0] < A[1] > A[2] < A[3] > A[4] < ...* 

Return the minimum number of moves to transform the given array  *nums*  into a zigzag array.



**Example 1:** 

```
Input: nums = [1,2,3]
Output: 2
Explanation: We can decrease 2 to 0 or 3 to 1.

```

**Example 2:** 

```
Input: nums = [9,6,1,6,2]
Output: 4

```



**Constraints:** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 1000* 


# [1144. 递减元素使数组呈锯齿状][cnTitle]

**中等**

给你一个整数数组  *nums* ，每次 **操作**  会从中选择一个元素并 **将该元素的值减少 1** 。

如果符合下列情况之一，则数组  *A*  就是 **锯齿数组** ：

- 每个偶数索引对应的元素都大于相邻的元素，即  *A[0] > A[1] < A[2] > A[3] < A[4] > ...*  
- 或者，每个奇数索引对应的元素都大于相邻的元素，即  *A[0] < A[1] > A[2] < A[3] > A[4] < ...* 

返回将数组  *nums*  转换为锯齿数组所需的最小操作次数。



**示例 1：** 

```
输入：nums = [1,2,3]
输出：2
解释：我们可以把 2 递减到 0，或把 3 递减到 1。

```

**示例 2：** 

```
输入：nums = [9,6,1,6,2]
输出：4

```



**提示：** 

-  *1 <= nums.length <= 1000*  
-  *1 <= nums[i] <= 1000* 




# 算法思路

# 测试用例
```
1144. Decrease Elements To Make Array Zigzag 1144. 递减元素使数组呈锯齿状 Medium
```

[enTitle]: https://leetcode.com/problems/decrease-elements-to-make-array-zigzag/
[cnTitle]: https://leetcode-cn.com/problems/decrease-elements-to-make-array-zigzag/
