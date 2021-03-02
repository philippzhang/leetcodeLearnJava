# [782. Transform to Chessboard][enTitle]

**Hard**

An N x N  *board*  contains only  *0* s and  *1* s. In each move, you can swap any 2 rows with each other, or any 2 columns with each other.

What is the minimum number of moves to transform the board into a "chessboard" - a board where no  *0* s and no  *1* s are 4-directionally adjacent? If the task is impossible, return -1.

```
Examples:
Input: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
Output: 2
Explanation:
One potential sequence of moves is shown below, from left to right:

0110     1010     1010
0110 --> 1010 --> 0101
1001     0101     1010
1001     0101     0101

The first move swaps the first and second column.
The second move swaps the second and third row.


Input: board = [[0, 1], [1, 0]]
Output: 0
Explanation:
Also note that the board with 0 in the top left corner,
01
10

is also a valid chessboard.

Input: board = [[1, 0], [1, 0]]
Output: -1
Explanation:
No matter what sequence of moves you make, you cannot end with a valid chessboard.

```

**Note:** 

-  *board*  will have the same number of rows and columns, a number in the range  *[2, 30]* . 
-  *board[i][j]*  will be only  *0* s or  *1* s.


# [782. 变为棋盘][cnTitle]

**困难**

一个 N x N的  *board*  仅由  *0*  和  *1*  组成 。每次移动，你能任意交换两列或是两行的位置。

输出将这个矩阵变为 “棋盘” 所需的最小移动次数。“棋盘” 是指任意一格的上下左右四个方向的值均与本身不同的矩阵。如果不存在可行的变换，输出 -1。

```
示例:
输入: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
输出: 2
解释:
一种可行的变换方式如下，从左到右：

0110     1010     1010
0110 --> 1010 --> 0101
1001     0101     1010
1001     0101     0101

第一次移动交换了第一列和第二列。
第二次移动交换了第二行和第三行。


输入: board = [[0, 1], [1, 0]]
输出: 0
解释:
注意左上角的格值为0时也是合法的棋盘，如：

01
10

也是合法的棋盘.

输入: board = [[1, 0], [1, 0]]
输出: -1
解释:
任意的变换都不能使这个输入变为合法的棋盘。

```



**提示：** 

-  *board*  是方阵，且行列数的范围是 *[2, 30]* 。 
-  *board[i][j]*  将只包含  *0* 或  *1* 。




# 算法思路

# 测试用例
```
782. Transform to Chessboard 782. 变为棋盘 Hard
```

[enTitle]: https://leetcode.com/problems/transform-to-chessboard/
[cnTitle]: https://leetcode-cn.com/problems/transform-to-chessboard/
