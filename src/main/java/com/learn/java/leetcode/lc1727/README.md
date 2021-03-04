# [1727. Largest Submatrix With Rearrangements][enTitle]

**Medium**

You are given a binary matrix  *matrix*  of size  *m x n* , and you are allowed to rearrange the **columns**  of the  *matrix*  in any order.

Return  *the area of the largest submatrix within*  *matrix*  *where every element of the submatrix is*  *1*  *after reordering the columns optimally.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/12/29/screenshot-2020-12-30-at-40536-pm.png)

```
Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]
Output: 4
Explanation: You can rearrange the columns as shown above.
The largest submatrix of 1s, in bold, has an area of 4.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/12/29/screenshot-2020-12-30-at-40852-pm.png)

```
Input: matrix = [[1,0,1,0,1]]
Output: 3
Explanation: You can rearrange the columns as shown above.
The largest submatrix of 1s, in bold, has an area of 3.

```

**Example 3:** 

```
Input: matrix = [[1,1,0],[1,0,1]]
Output: 2
Explanation: Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
```

**Example 4:** 

```
Input: matrix = [[0,0],[0,0]]
Output: 0
Explanation: As there are no 1s, no submatrix of 1s can be formed and the area is 0.
```



**Constraints:** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m * n <= 105*  
-  *matrix[i][j]*  is  *0*  or  *1* .


# [1727. 重新排列后的最大子矩阵][cnTitle]

**中等**

给你一个二进制矩阵  *matrix*  ，它的大小为  *m x n*  ，你可以将  *matrix*  中的 **列**  按任意顺序重新排列。

请你返回最优方案下将  *matrix*  重新排列后，全是  *1*  的子矩阵面积。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/17/screenshot-2020-12-30-at-40536-pm.png)

```
输入：matrix = [[0,0,1],[1,1,1],[1,0,1]]
输出：4
解释：你可以按照上图方式重新排列矩阵的每一列。
最大的全 1 子矩阵是上图中加粗的部分，面积为 4 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/17/screenshot-2020-12-30-at-40852-pm.png)

```
输入：matrix = [[1,0,1,0,1]]
输出：3
解释：你可以按照上图方式重新排列矩阵的每一列。
最大的全 1 子矩阵是上图中加粗的部分，面积为 3 。

```

**示例 3：** 

```
输入：matrix = [[1,1,0],[1,0,1]]
输出：2
解释：由于你只能整列整列重新排布，所以没有比面积为 2 更大的全 1 子矩形。
```

**示例 4：** 

```
输入：matrix = [[0,0],[0,0]]
输出：0
解释：由于矩阵中没有 1 ，没有任何全 1 的子矩阵，所以面积为 0 。
```



**提示：** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m * n <= 105*  
-  *matrix[i][j]*  要么是  *0*  ，要么是  *1*  。




# 算法思路

# 测试用例
```
1727. Largest Submatrix With Rearrangements 1727. 重新排列后的最大子矩阵 Medium
```

[enTitle]: https://leetcode.com/problems/largest-submatrix-with-rearrangements/
[cnTitle]: https://leetcode-cn.com/problems/largest-submatrix-with-rearrangements/
