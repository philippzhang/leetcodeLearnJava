# [861. Score After Flipping Matrix][enTitle]

**Medium**

We have a two dimensional matrix  *A*  where each value is  *0*  or  *1* .

A move consists of choosing any row or column, and toggling each value in that row or column: changing all  *0* s to  *1* s, and all  *1* s to  *0* s.

After making any number of moves, every row of this matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.

Return the highest possible score.






**Example 1:** 

```
Input:[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
Output: 39
Explanation:
Toggled to [[1,1,1,1],[1,0,0,1],[1,1,1,1]].
0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
```



**Note:** 

1.  *1 <= A.length <= 20*  
2.  *1 <= A[0].length <= 20*  
3.  *A[i][j]*  is  *0*  or  *1* .




# [861. 翻转矩阵后的得分][cnTitle]

**中等**

有一个二维矩阵  *A*  其中每个元素的值为  *0*  或  *1*  。

移动是指选择任一行或列，并转换该行或列中的每一个值：将所有  *0*  都更改为  *1* ，将所有  *1*  都更改为  *0* 。

在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。

返回尽可能高的分数。





**示例：** 

```
输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
输出：39
解释：转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
```



**提示：** 

1.  *1 <= A.length <= 20*  
2.  *1 <= A[0].length <= 20*  
3.  *A[i][j]*  是  *0*  或  *1* 




# 算法思路

# 测试用例
```
861. Score After Flipping Matrix 861. 翻转矩阵后的得分 Medium
```

[enTitle]: https://leetcode.com/problems/score-after-flipping-matrix/
[cnTitle]: https://leetcode-cn.com/problems/score-after-flipping-matrix/
