# [766. Toeplitz Matrix][enTitle]

**Easy**

Given an  *m x n*   *matrix* , return  *true if the matrix is Toeplitz. Otherwise, return false.* 

A matrix is **Toeplitz**  if every diagonal from top-left to bottom-right has the same elements.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/04/ex1.jpg)

```
Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/11/04/ex2.jpg)

```
Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.

```



**Constraints:** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 20*  
-  *0 <= matrix[i][j] <= 99* 



**Follow up:** 

- What if the  *matrix*  is stored on disk, and the memory is limited such that you can only load at most one row of the matrix into the memory at once? 
- What if the  *matrix*  is so large that you can only load up a partial row into the memory at once?


# [766. 托普利茨矩阵][cnTitle]

**简单**

给你一个  *m x n*  的矩阵  *matrix*  。如果这个矩阵是托普利茨矩阵，返回  *true*  ；否则，返回 *false*  *。* 

如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是**托普利茨矩阵**  。



**示例 1：** 

![img](https://assets.leetcode.com/uploads/2020/11/04/ex1.jpg)

```
输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
输出：true
解释：
在上述矩阵中, 其对角线为: 
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。 
各条对角线上的所有元素均相同, 因此答案是 True 。

```

**示例 2：** 

![img](https://assets.leetcode.com/uploads/2020/11/04/ex2.jpg)

```
输入：matrix = [[1,2],[2,2]]
输出：false
解释：
对角线 "[1, 2]" 上的元素不同。
```



**提示：** 

-  *m == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= m, n <= 20*  
-  *0 <= matrix[i][j] <= 99* 



**进阶：** 

- 如果矩阵存储在磁盘上，并且内存有限，以至于一次最多只能将矩阵的一行加载到内存中，该怎么办？ 
- 如果矩阵太大，以至于一次只能将不完整的一行加载到内存中，该怎么办？




# 算法思路

# 测试用例
```
766. Toeplitz Matrix 766. 托普利茨矩阵 Easy
```

[enTitle]: https://leetcode.com/problems/toeplitz-matrix/
[cnTitle]: https://leetcode-cn.com/problems/toeplitz-matrix/
