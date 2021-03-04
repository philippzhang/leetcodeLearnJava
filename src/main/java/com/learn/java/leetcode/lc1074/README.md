# [1074. Number of Submatrices That Sum to Target][enTitle]

**Hard**

Given a  *matrix*  and a  *target* , return the number of non-empty submatrices that sum to target.

A submatrix  *x1, y1, x2, y2*  is the set of all cells  *matrix[x][y]*  with  *x1 <= x <= x2*  and  *y1 <= y <= y2* .

Two submatrices  *(x1, y1, x2, y2)*  and  *(x1', y1', x2', y2')*  are different if they have some coordinate that is different: for example, if  *x1 != x1'* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/02/mate1.jpg)

```
Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
Output: 4
Explanation: The four 1x1 submatrices that only contain 0.

```

**Example 2:** 

```
Input: matrix = [[1,-1],[-1,1]], target = 0
Output: 5
Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.

```

**Example 3:** 

```
Input: matrix = [[904]], target = 0
Output: 0

```



**Constraints:** 

-  *1 <= matrix.length <= 100*  
-  *1 <= matrix[0].length <= 100*  
-  *-1000 <= matrix[i] <= 1000*  
-  *-10^8 <= target <= 10^8* 


# [1074. 元素和为目标值的子矩阵数量][cnTitle]

**困难**

给出矩阵  *matrix*  和目标值  *target* ，返回元素总和等于目标值的非空子矩阵的数量。

子矩阵  *x1, y1, x2, y2*  是满足  *x1 <= x <= x2*  且  *y1 <= y <= y2*  的所有单元  *matrix[x][y]*  的集合。

如果  *(x1, y1, x2, y2)*  和  *(x1', y1', x2', y2')*  两个子矩阵中部分坐标不同（如： *x1 != x1'* ），那么这两个子矩阵也不同。



**示例 1：** 

```
输入：matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
输出：4
解释：四个只含 0 的 1x1 子矩阵。

```

**示例 2：** 

```
输入：matrix = [[1,-1],[-1,1]], target = 0
输出：5
解释：两个 1x2 子矩阵，加上两个 2x1 子矩阵，再加上一个 2x2 子矩阵。

```



**提示：** 

1.  *1 <= matrix.length <= 300*  
2.  *1 <= matrix[0].length <= 300*  
3.  *-1000 <= matrix[i] <= 1000*  
4.  *-10^8 <= target <= 10^8* 




# 算法思路

# 测试用例
```
1074. Number of Submatrices That Sum to Target 1074. 元素和为目标值的子矩阵数量 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
[cnTitle]: https://leetcode-cn.com/problems/number-of-submatrices-that-sum-to-target/
