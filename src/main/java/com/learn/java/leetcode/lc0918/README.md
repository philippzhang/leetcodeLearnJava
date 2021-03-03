# [918. Maximum Sum Circular Subarray][enTitle]

**Medium**

Given a **circular array**  **C**  of integers represented by  *A* , find the maximum possible sum of a non-empty subarray of **C** .

Here, a  *circular array*  means the end of the array connects to the beginning of the array. (Formally,  *C[i] = A[i]*  when  *0 <= i < A.length* , and  *C[i+A.length] = C[i]*  when  *i >= 0* .)

Also, a subarray may only include each element of the fixed buffer  *A*  at most once. (Formally, for a subarray  *C[i], C[i+1], ..., C[j]* , there does not exist  *i <= k1, k2 <= j*  with  *k1 % A.length = k2 % A.length* .)




**Example 1:** 

```
Input:[1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3
```


**Example 2:** 

```
Input:[5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10
```


**Example 3:** 

```
Input:[3,-1,2,-1]
Output: 4
Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4
```


**Example 4:** 

```
Input:[3,-2,2,-3]
Output: 3
Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3
```

**Example 5:** 

```
Input:[-2,-3,-1]
Output: -1
Explanation: Subarray [-1] has maximum sum -1
```



**Note:** 

1.  *-30000 <= A[i] <= 30000*  
2.  *1 <= A.length <= 30000* 










# [918. 环形子数组的最大和][cnTitle]

**中等**

给定一个由整数数组  *A*  表示的**环形数组 C** ，求  *C*  的非空子数组的最大可能和。

在此处， *环形数组* 意味着数组的末端将会与开头相连呈环状。（形式上，当 *0 <= i < A.length*  时  *C[i] = A[i]* ，且当  *i >= 0*  时  *C[i+A.length] = C[i]* ）

此外，子数组最多只能包含固定缓冲区  *A*  中的每个元素一次。（形式上，对于子数组  *C[i], C[i+1], ..., C[j]* ，不存在  *i <= k1, k2 <= j*  其中  *k1 % A.length = k2 % A.length* ）



**示例 1：** 

```
输入：[1,-2,3,-2]
输出：3
解释：从子数组 [3] 得到最大和 3

```

**示例 2：** 

```
输入：[5,-3,5]
输出：10
解释：从子数组 [5,5] 得到最大和 5 + 5 = 10

```

**示例 3：** 

```
输入：[3,-1,2,-1]
输出：4
解释：从子数组 [2,-1,3] 得到最大和 2 + (-1) + 3 = 4

```

**示例 4：** 

```
输入：[3,-2,2,-3]
输出：3
解释：从子数组 [3] 和 [3,-2,2] 都可以得到最大和 3

```

**示例 5：** 

```
输入：[-2,-3,-1]
输出：-1
解释：从子数组 [-1] 得到最大和 -1

```



**提示：** 

1.  *-30000 <= A[i] <= 30000*  
2.  *1 <= A.length <= 30000* 




# 算法思路

# 测试用例
```
918. Maximum Sum Circular Subarray 918. 环形子数组的最大和 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-sum-circular-subarray/
[cnTitle]: https://leetcode-cn.com/problems/maximum-sum-circular-subarray/
