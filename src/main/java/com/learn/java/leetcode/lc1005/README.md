# [1005. Maximize Sum Of Array After K Negations][enTitle]

**Easy**

Given an array  *A*  of integers, we **must**  modify the array in the following way: we choose an  *i*  and replace  *A[i]*  with  *-A[i]* , and we repeat this process  *K*  times in total. (We may choose the same index  *i*  multiple times.)

Return the largest possible sum of the array after modifying it in this way.



**Example 1:** 

```
Input:A = [4,2,3], K = 1
Output: 5
Explanation: Choose indices (1,) and A becomes [4,-2,3].
```


**Example 2:** 

```
Input:A = [3,-1,0,2], K = 3
Output: 6
Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
```


**Example 3:** 

```
Input:A = [2,-3,-1,5,-4], K = 2
Output: 13
Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
```







**Note:** 

1.  *1 <= A.length <= 10000*  
2.  *1 <= K <= 10000*  
3.  *-100 <= A[i] <= 100* 


# [1005. K 次取反后最大化的数组和][cnTitle]

**简单**

给定一个整数数组 A，我们**只能** 用以下方法修改该数组：我们选择某个索引  *i*  并将  *A[i]*  替换为  *-A[i]* ，然后总共重复这个过程  *K*  次。（我们可以多次选择同一个索引  *i* 。）

以这种方式修改数组后，返回数组可能的最大和。



**示例 1：** 

```
输入：A = [4,2,3], K = 1
输出：5
解释：选择索引 (1,) ，然后 A 变为 [4,-2,3]。

```

**示例 2：** 

```
输入：A = [3,-1,0,2], K = 3
输出：6
解释：选择索引 (1, 2, 2) ，然后 A 变为 [3,1,0,2]。

```

**示例 3：** 

```
输入：A = [2,-3,-1,5,-4], K = 2
输出：13
解释：选择索引 (1, 4) ，然后 A 变为 [2,3,-1,5,4]。

```



**提示：** 

1.  *1 <= A.length <= 10000*  
2.  *1 <= K <= 10000*  
3.  *-100 <= A[i] <= 100* 




# 算法思路

# 测试用例
```
1005. Maximize Sum Of Array After K Negations 1005. K 次取反后最大化的数组和 Easy
```

[enTitle]: https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
[cnTitle]: https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations/
