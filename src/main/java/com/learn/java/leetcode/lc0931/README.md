# [931. Minimum Falling Path Sum][enTitle]

**Medium**

Given an  *n x n*  array of integers  *matrix* , return  *the minimum sum of any falling path through*   *matrix* .

A **falling path**  starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position  *(row, col)*  will be  *(row + 1, col - 1)* ,  *(row + 1, col)* , or  *(row + 1, col + 1)* .



**Example 1:** 

```
Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
Output: 13
Explanation: There are two falling paths with a minimum sum underlined below:
[[2,1,3],      [[2,1,3],
 [6,5,4],       [6,5,4],
 [7,8,9]]       [7,8,9]]

```

**Example 2:** 

```
Input: matrix = [[-19,57],[-40,-5]]
Output: -59
Explanation: The falling path with a minimum sum is underlined below:
[[-19,57],
 [-40,-5]]

```

**Example 3:** 

```
Input: matrix = [[-48]]
Output: -48

```



**Constraints:** 

-  *n == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= n <= 100*  
-  *-100 <= matrix[i][j] <= 100* 


# [931. 下降路径最小和][cnTitle]

**中等**

给你一个  *n x n*  的**方形** 整数数组  *matrix*  ，请你找出并返回通过  *matrix*  的**下降路径** 的**** **最小和**  。

**下降路径**  可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列（即位于正下方或者沿对角线向左或者向右的第一个元素）。具体来说，位置  *(row, col)*  的下一个元素应当是  *(row + 1, col - 1)* 、 *(row + 1, col)*  或者  *(row + 1, col + 1)*  。



**示例 1：** 

```
输入：matrix = [[2,1,3],[6,5,4],[7,8,9]]
输出：13
解释：下面是两条和最小的下降路径，用加粗标注：
[[2,1,3],      [[2,1,3],
 [6,5,4],       [6,5,4],
 [7,8,9]]       [7,8,9]]

```

**示例 2：** 

```
输入：matrix = [[-19,57],[-40,-5]]
输出：-59
解释：下面是一条和最小的下降路径，用加粗标注：
[[-19,57],
 [-40,-5]]

```

**示例 3：** 

```
输入：matrix = [[-48]]
输出：-48

```



**提示：** 

-  *n == matrix.length*  
-  *n == matrix[i].length*  
-  *1 <= n <= 100*  
-  *-100 <= matrix[i][j] <= 100* 




# 算法思路

# 测试用例
```
931. Minimum Falling Path Sum 931. 下降路径最小和 Medium
```

[enTitle]: https://leetcode.com/problems/minimum-falling-path-sum/
[cnTitle]: https://leetcode-cn.com/problems/minimum-falling-path-sum/
