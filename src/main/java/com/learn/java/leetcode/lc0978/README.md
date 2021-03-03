# [978. Longest Turbulent Subarray][enTitle]

**Medium**

Given an integer array  *arr* , return  *the length of a maximum size turbulent subarray of*   *arr* .

A subarray is **turbulent**  if the comparison sign flips between each adjacent pair of elements in the subarray.

More formally, a subarray  *[arr[i], arr[i + 1], ..., arr[j]]*  of  *arr*  is said to be turbulent if and only if:

- For  *i <= k < j* : 
 <ul> 
  -  *arr[k] > arr[k + 1]*  when  *k*  is odd, and 
  -  *arr[k] < arr[k + 1]*  when  *k*  is even. 
 </ul>  
- Or, for  *i <= k < j* : 
 <ul> 
  -  *arr[k] > arr[k + 1]*  when  *k*  is even, and 
  -  *arr[k] < arr[k + 1]*  when  *k*  is odd. 
 </ul> 



**Example 1:** 

```
Input: arr = [9,4,2,10,7,8,8,1,9]
Output: 5
Explanation: arr[1] > arr[2] < arr[3] > arr[4] < arr[5]

```

**Example 2:** 

```
Input: arr = [4,8,12,16]
Output: 2

```

**Example 3:** 

```
Input: arr = [100]
Output: 1

```



**Constraints:** 

-  *1 <= arr.length <= 4 * 104*  
-  *0 <= arr[i] <= 109* 


# [978. 最长湍流子数组][cnTitle]

**中等**

当  *A*  的子数组  *A[i], A[i+1], ..., A[j]*  满足下列条件时，我们称其为 *湍流子数组* ：

- 若  *i <= k < j* ，当  *k*  为奇数时，  *A[k] > A[k+1]* ，且当  *k*  为偶数时， *A[k] < A[k+1]* ； 
- **或** 若  *i <= k < j* ，当  *k*  为偶数时， *A[k] > A[k+1]*  ，且当  *k*  为奇数时，  *A[k] < A[k+1]* 。

也就是说，如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。

返回  *A*  的最大湍流子数组的**长度** 。



**示例 1：** 

```
输入：[9,4,2,10,7,8,8,1,9]
输出：5
解释：(A[1] > A[2] < A[3] > A[4] < A[5])

```

**示例 2：** 

```
输入：[4,8,12,16]
输出：2

```

**示例 3：** 

```
输入：[100]
输出：1

```



**提示：** 

1.  *1 <= A.length <= 40000*  
2.  *0 <= A[i] <= 10^9* 




# 算法思路

# 测试用例
```
978. Longest Turbulent Subarray 978. 最长湍流子数组 Medium
```

[enTitle]: https://leetcode.com/problems/longest-turbulent-subarray/
[cnTitle]: https://leetcode-cn.com/problems/longest-turbulent-subarray/
