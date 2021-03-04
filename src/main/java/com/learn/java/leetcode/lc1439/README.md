# [1439. Find the Kth Smallest Sum of a Matrix With Sorted Rows][enTitle]

**Hard**

You are given an  *m * n*  matrix,  *mat* , and an integer  *k* , which has its rows sorted in non-decreasing order.

You are allowed to choose exactly 1 element from each row to form an array. Return the Kth **smallest**  array sum among all possible arrays.



**Example 1:** 

```
Input: mat = [[1,3,11],[2,4,6]], k = 5
Output: 7
Explanation:Choosing one element from each row, the first k smallest sum are:
[1,2], [1,4], [3,2], [3,4], [1,6]. Where the 5th sum is 7.  
```

**Example 2:** 

```
Input: mat = [[1,3,11],[2,4,6]], k = 9
Output: 17

```

**Example 3:** 

```
Input: mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
Output: 9
Explanation: Choosing one element from each row, the first k smallest sum are:
[1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]. Where the 7th sum is 9.  

```

**Example 4:** 

```
Input: mat = [[1,1,10],[2,2,9]], k = 7
Output: 12

```



**Constraints:** 

-  *m == mat.length*  
-  *n == mat.length[i]*  
-  *1 <= m, n <= 40*  
-  *1 <= k <= min(200, n ^ m)*  
-  *1 <= mat[i][j] <= 5000*  
-  *mat[i]*  is a non decreasing array.


# [1439. 有序矩阵中的第 k 个最小数组和][cnTitle]

**困难**

给你一个  *m * n*  的矩阵  *mat* ，以及一个整数  *k*  ，矩阵中的每一行都以非递减的顺序排列。

你可以从每一行中选出 1 个元素形成一个数组。返回所有可能数组中的第 k 个 **最小**  数组和。



**示例 1：** 

```
输入：mat = [[1,3,11],[2,4,6]], k = 5
输出：7
解释：从每一行中选出一个元素，前 k 个和最小的数组分别是：
[1,2], [1,4], [3,2], [3,4], [1,6]。其中第 5 个的和是 7 。  
```

**示例 2：** 

```
输入：mat = [[1,3,11],[2,4,6]], k = 9
输出：17

```

**示例 3：** 

```
输入：mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
输出：9
解释：从每一行中选出一个元素，前 k 个和最小的数组分别是：
[1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]。其中第 7 个的和是 9 。 

```

**示例 4：** 

```
输入：mat = [[1,1,10],[2,2,9]], k = 7
输出：12

```



**提示：** 

-  *m == mat.length*  
-  *n == mat.length[i]*  
-  *1 <= m, n <= 40*  
-  *1 <= k <= min(200, n ^ m)*  
-  *1 <= mat[i][j] <= 5000*  
-  *mat[i]*  是一个非递减数组




# 算法思路

# 测试用例
```
1439. Find the Kth Smallest Sum of a Matrix With Sorted Rows 1439. 有序矩阵中的第 k 个最小数组和 Hard
```

[enTitle]: https://leetcode.com/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/
[cnTitle]: https://leetcode-cn.com/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/
