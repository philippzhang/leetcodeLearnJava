# [992. Subarrays with K Different Integers][enTitle]

**Hard**

Given an array  *A*  of positive integers, call a (contiguous, not necessarily distinct) subarray of  *A*   *good*  if the number of different integers in that subarray is exactly  *K* .

(For example,  *[1,2,3,1,2]*  has  *3*  different integers:  *1* ,  *2* , and  *3* .)

Return the number of good subarrays of  *A* .



**Example 1:** 

```
Input:A = [1,2,1,2,3], K = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].
```

**Example 2:** 

```
Input:A = [1,2,1,3,4], K = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
```



**Note:** 

1.  *1 <= A.length <= 20000*  
2.  *1 <= A[i] <= A.length*  
3.  *1 <= K <= A.length* 


# [992. K 个不同整数的子数组][cnTitle]

**困难**

给定一个正整数数组  *A* ，如果  *A*  的某个子数组中不同整数的个数恰好为  *K* ，则称  *A*  的这个连续、不一定不同的子数组为 *好子数组* 。

（例如， *[1,2,3,1,2]*  中有  *3*  个不同的整数： *1* ， *2* ，以及  *3* 。）

返回  *A*  中 *好子数组* 的数目。



**示例 1：** 

```
输入：A = [1,2,1,2,3], K = 2
输出：7
解释：恰好由 2 个不同整数组成的子数组：[1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2].

```

**示例 2：** 

```
输入：A = [1,2,1,3,4], K = 3
输出：3
解释：恰好由 3 个不同整数组成的子数组：[1,2,1,3], [2,1,3], [1,3,4].

```



**提示：** 

1.  *1 <= A.length <= 20000*  
2.  *1 <= A[i] <= A.length*  
3.  *1 <= K <= A.length* 




# 算法思路

# 测试用例
```
992. Subarrays with K Different Integers 992. K 个不同整数的子数组 Hard
```

[enTitle]: https://leetcode.com/problems/subarrays-with-k-different-integers/
[cnTitle]: https://leetcode-cn.com/problems/subarrays-with-k-different-integers/
