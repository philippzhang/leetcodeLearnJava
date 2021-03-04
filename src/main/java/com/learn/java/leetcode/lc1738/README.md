# [1738. Find Kth Largest XOR Coordinate Value][enTitle]

**Medium**

You are given a 2D  *matrix*  of size  *m x n* , consisting of non-negative integers. You are also given an integer  *k* .

The **value**  of coordinate  *(a, b)*  of the matrix is the XOR of all  *matrix[i][j]*  where  *0 <= i <= a < m*  and  *0 <= j <= b < n*  **(0-indexed)** .

Find the  *kth*  largest value **(1-indexed)**  of all the coordinates of  *matrix* .



**Example 1:** 

```
Input: matrix = [[5,2],[1,6]], k = 1
Output: 7
Explanation: The value of coordinate (0,1) is 5 XOR 2 = 7, which is the largest value.
```

**Example 2:** 

```
Input: matrix = [[5,2],[1,6]], k = 2
Output: 5
Explanation:The value of coordinate (0,0) is 5 = 5, which is the 2nd largest value.
```

**Example 3:** 

```
Input: matrix = [[5,2],[1,6]], k = 3
Output: 4
Explanation: The value of coordinate (1,0) is 5 XOR 1 = 4, which is the 3rd largest value.
```

**Example 4:** 

```
Input: matrix = [[5,2],[1,6]], k = 4
Output: 0
Explanation: The value of coordinate (1,1) is 5 XOR 2 XOR 1 XOR 6 = 0, which is the 4th largest value.
```



**Constraints:** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 1000*  
-  *0 <= matrix[i][j] <= 106*  
-  *1 <= k <= m * n* 


# [1738. 找出第 K 大的异或坐标值][cnTitle]

**中等**

给你一个二维矩阵  *matrix*  和一个整数  *k*  ，矩阵大小为  *m x n*  由非负整数组成。

矩阵中坐标  *(a, b)*  的 **值**  可由对所有满足  *0 <= i <= a < m*  且  *0 <= j <= b < n*  的元素  *matrix[i][j]* （**下标从 0 开始计数** ）执行异或运算得到。

请你找出  *matrix*  的所有坐标中第  *k*  大的值（<strong> *k*  的值从 1 开始计数</strong>）。



**示例 1：** 

```
输入：matrix = [[5,2],[1,6]], k = 1
输出：7
解释：坐标 (0,1) 的值是 5 XOR 2 = 7 ，为最大的值。
```

**示例 2：** 

```
输入：matrix = [[5,2],[1,6]], k = 2
输出：5
解释：坐标 (0,0) 的值是 5 = 5 ，为第 2 大的值。
```

**示例 3：** 

```
输入：matrix = [[5,2],[1,6]], k = 3
输出：4
解释：坐标 (1,0) 的值是 5 XOR 1 = 4 ，为第 3 大的值。
```

**示例 4：** 

```
输入：matrix = [[5,2],[1,6]], k = 4
输出：0
解释：坐标 (1,1) 的值是 5 XOR 2 XOR 1 XOR 6 = 0 ，为第 4 大的值。
```



**提示：** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 1000*  
-  *0 <= matrix[i][j] <= 106*  
-  *1 <= k <= m * n* 




# 算法思路

# 测试用例
```
1738. Find Kth Largest XOR Coordinate Value 1738. 找出第 K 大的异或坐标值 Medium
```

[enTitle]: https://leetcode.com/problems/find-kth-largest-xor-coordinate-value/
[cnTitle]: https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/
