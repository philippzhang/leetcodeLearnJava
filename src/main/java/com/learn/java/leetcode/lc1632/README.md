# [1632. Rank Transform of a Matrix][enTitle]

**Hard**

Given an  *m x n*   *matrix* , return  *a new matrix*  *answer*  *where*  *answer[row][col]*  *is the*  *rank of*  *matrix[row][col]* .

The **rank**  is an **integer**  that represents how large an element is compared to other elements. It is calculated using the following rules:

- The rank is an integer starting from  *1* . 
- If two elements  *p*  and  *q*  are in the **same row or column** , then: 
 <ul> 
  - If  *p < q*  then  *rank(p) < rank(q)*  
  - If  *p == q*  then  *rank(p) == rank(q)*  
  - If  *p > q*  then  *rank(p) > rank(q)*  
 </ul>  
- The **rank**  should be as **small**  as possible.

It is guaranteed that  *answer*  is unique under the given rules.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/18/rank1.jpg)

```
Input: matrix = [[1,2],[3,4]]
Output: [[1,2],[2,3]]
Explanation:
The rank of matrix[0][0] is 1 because it is the smallest integer in its row and column.
The rank of matrix[0][1] is 2 because matrix[0][1] > matrix[0][0] and matrix[0][0] is rank 1.
The rank of matrix[1][0] is 2 because matrix[1][0] > matrix[0][0] and matrix[0][0] is rank 1.
The rank of matrix[1][1] is 3 because matrix[1][1] > matrix[0][1], matrix[1][1] > matrix[1][0], and both matrix[0][1] and matrix[1][0] are rank 2.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/10/18/rank2.jpg)

```
Input: matrix = [[7,7],[7,7]]
Output: [[1,1],[1,1]]

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/10/18/rank3.jpg)

```
Input: matrix = [[20,-21,14],[-19,4,19],[22,-47,24],[-19,4,19]]
Output: [[4,2,3],[1,3,4],[5,1,6],[1,3,4]]

```

**Example 4:** 

![img](https://assets.leetcode.com/uploads/2020/10/18/rank4.jpg)

```
Input: matrix = [[7,3,6],[1,4,5],[9,8,2]]
Output: [[5,1,4],[1,2,3],[6,3,1]]

```



**Constraints:** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 500*  
-  *-109 <= matrix[row][col] <= 109* 


# [1632. 矩阵转换后的秩][cnTitle]

**困难**

给你一个  *m x n*  的矩阵  *matrix*  ，请你返回一个新的矩阵 *answer*  ，其中 *answer[row][col]*  是  *matrix[row][col]*  的秩。

每个元素的 秩 是一个整数，表示这个元素相对于其他元素的大小关系，它按照如下规则计算：

- 秩是从 1 开始的一个整数。 
- 如果两个元素  *p*  和  *q*  在 **同一行**  或者 **同一列**  ，那么： 
 <ul> 
  - 如果  *p < q*  ，那么  *rank(p) < rank(q)*  
  - 如果  *p == q*  ，那么  *rank(p) == rank(q)*  
  - 如果  *p > q*  ，那么  *rank(p) > rank(q)*  
 </ul>  
- 秩 需要越 **小**  越好。

题目保证按照上面规则  *answer*  数组是唯一的。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/rank1.jpg)

```
输入：matrix = [[1,2],[3,4]]
输出：[[1,2],[2,3]]
解释：
matrix[0][0] 的秩为 1 ，因为它是所在行和列的最小整数。
matrix[0][1] 的秩为 2 ，因为 matrix[0][1] > matrix[0][0] 且 matrix[0][0] 的秩为 1 。
matrix[1][0] 的秩为 2 ，因为 matrix[1][0] > matrix[0][0] 且 matrix[0][0] 的秩为 1 。
matrix[1][1] 的秩为 3 ，因为 matrix[1][1] > matrix[0][1]， matrix[1][1] > matrix[1][0] 且 matrix[0][1] 和 matrix[1][0] 的秩都为 2 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/rank2.jpg)

```
输入：matrix = [[7,7],[7,7]]
输出：[[1,1],[1,1]]

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/rank3.jpg)

```
输入：matrix = [[20,-21,14],[-19,4,19],[22,-47,24],[-19,4,19]]
输出：[[4,2,3],[1,3,4],[5,1,6],[1,3,4]]

```

**示例 4：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/25/rank4.jpg)

```
输入：matrix = [[7,3,6],[1,4,5],[9,8,2]]
输出：[[5,1,4],[1,2,3],[6,3,1]]

```



**提示：** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 500*  
-  *-109 <= matrix[row][col] <= 109* 




# 算法思路

# 测试用例
```
1632. Rank Transform of a Matrix 1632. 矩阵转换后的秩 Hard
```

[enTitle]: https://leetcode.com/problems/rank-transform-of-a-matrix/
[cnTitle]: https://leetcode-cn.com/problems/rank-transform-of-a-matrix/
