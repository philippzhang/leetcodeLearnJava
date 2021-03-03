# [995. Minimum Number of K Consecutive Bit Flips][enTitle]

**Hard**

In an array  *A*  containing only 0s and 1s, a K-bit flipconsists of choosing a (contiguous) subarray of length  *K*  and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.

Return the minimum number of  *K* -bit flips required so that there is no 0 in the array. If it is not possible, return  *-1* .



**Example 1:** 

```
Input:A = [0,1,0], K = 1
Output: 2
Explanation: Flip A[0], then flip A[2].
```


**Example 2:** 

```
Input:A = [1,1,0], K = 2
Output: -1
Explanation: No matter how we flip subarrays of size 2, we can't make the array become [1,1,1].
```


**Example 3:** 

```
Input:A = [0,0,0,1,0,1,1,0], K = 3
Output: 3
Explanation:
Flip A[0],A[1],A[2]: A becomes [1,1,1,1,0,1,1,0]
Flip A[4],A[5],A[6]: A becomes [1,1,1,1,1,0,0,0]
Flip A[5],A[6],A[7]: A becomes [1,1,1,1,1,1,1,1]
```







**Note:** 

1.  *1 <= A.length <= 30000*  
2.  *1 <= K <= A.length* 


# [995. K 连续位的最小翻转次数][cnTitle]

**困难**

在仅包含  *0*  和  *1*  的数组  *A*  中，一次  *K 位翻转* 包括选择一个长度为  *K*  的（连续）子数组，同时将子数组中的每个  *0*  更改为  *1* ，而每个  *1*  更改为  *0* 。

返回所需的  *K*  位翻转的最小次数，以便数组没有值为  *0*  的元素。如果不可能，返回  *-1* 。



**示例 1：** 

```
输入：A = [0,1,0], K = 1
输出：2
解释：先翻转 A[0]，然后翻转 A[2]。

```

**示例 2：** 

```
输入：A = [1,1,0], K = 2
输出：-1
解释：无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。

```

**示例 3：** 

```
输入：A = [0,0,0,1,0,1,1,0], K = 3
输出：3
解释：
翻转 A[0],A[1],A[2]: A变成 [1,1,1,1,0,1,1,0]
翻转 A[4],A[5],A[6]: A变成 [1,1,1,1,1,0,0,0]
翻转 A[5],A[6],A[7]: A变成 [1,1,1,1,1,1,1,1]

```



**提示：** 

1.  *1 <= A.length <= 30000*  
2.  *1 <= K <= A.length* 




# 算法思路

# 测试用例
```
995. Minimum Number of K Consecutive Bit Flips 995. K 连续位的最小翻转次数 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/
[cnTitle]: https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/
