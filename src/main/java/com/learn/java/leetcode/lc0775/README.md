# [775. Global and Local Inversions][enTitle]

**Medium**

We have some permutation  *A*  of  *[0, 1, ..., N - 1]* , where  *N*  is the length of  *A* .

The number of (global) inversions is the number of  *i < j*  with  *0 <= i < j < N*  and  *A[i] > A[j]* .

The number of local inversions is the number of  *i*  with  *0 <= i < N*  and  *A[i] > A[i+1]* .

Return  *true*  if and only if the number of global inversions is equal to the number of local inversions.

**Example 1:** 

```
Input: A = [1,0,2]
Output: true
Explanation: There is 1 global inversion, and 1 local inversion.

```

**Example 2:** 

```
Input: A = [1,2,0]
Output: false
Explanation: There are 2 global inversions, and 1 local inversion.

```

**Note:** 

-  *A*  will be a permutation of  *[0, 1, ..., A.length - 1]* . 
-  *A*  will have length in range  *[1, 5000]* . 
- The time limit for this problem has been reduced.


# [775. 全局倒置与局部倒置][cnTitle]

**中等**

数组  *A*  是  *[0, 1, ..., N - 1]*  的一种排列， *N*  是数组  *A*  的长度。全局倒置指的是  *i,j*  满足  *0 <= i < j < N*  并且  *A[i] > A[j]*  ，局部倒置指的是  *i*  满足  *0 <= i < N*  并且  *A[i] > A[i+1]*  。

当数组  *A*  中全局倒置的数量等于局部倒置的数量时，返回  *true*  。



**示例 1:** 

```
输入: A = [1,0,2]
输出: true
解释: 有 1 个全局倒置，和 1 个局部倒置。

```

**示例 2:** 

```
输入: A = [1,2,0]
输出: false
解释: 有 2 个全局倒置，和 1 个局部倒置。

```

**注意:** 

-  *A*  是  *[0, 1, ..., A.length - 1]*  的一种排列 
-  *A*  的长度在  *[1, 5000]* 之间 
- 这个问题的时间限制已经减少了。




# 算法思路

# 测试用例
```
775. Global and Local Inversions 775. 全局倒置与局部倒置 Medium
```

[enTitle]: https://leetcode.com/problems/global-and-local-inversions/
[cnTitle]: https://leetcode-cn.com/problems/global-and-local-inversions/
