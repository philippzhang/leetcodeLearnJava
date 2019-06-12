# [37. Sudoku Solver][enTitle]

**Hard**

Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy **all of the following rules** :

1. Each of the digits  *1-9*  must occur exactly once in each row. 
2. Each of the digits  *1-9*  must occur exactly once in each column. 
3. Each of the the digits  *1-9*  must occur exactly once in each of the 9  *3x3*  sub-boxes of the grid.

Empty cells are indicated by the character  *'.'* .

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png) A sudoku puzzle...

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png) ...and its solution numbers marked in red.

**Note:** 

- The given board contain only digits  *1-9*  and the character  *'.'* . 
- You may assume that the given Sudoku puzzle will have a single unique solution. 
- The given board size is always  *9x9* .
# [37. 解数独][cnTitle]

**困难**

编写一个程序，通过已填充的空格来解决数独问题。

一个数独的解法需**遵循如下规则** ：

1. 数字  *1-9*  在每一行只能出现一次。 
2. 数字  *1-9*  在每一列只能出现一次。 
3. 数字  *1-9*  在每一个以粗实线分隔的  *3x3*  宫内只能出现一次。

空白格用  *'.'*  表示。

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png)

一个数独。

![img](http://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png)

答案被标成红色。

**Note:** 

- 给定的数独序列只包含数字  *1-9*  和字符  *'.'*  。 
- 你可以假设给定的数独只有唯一解。 
- 给定数独永远是  *9x9*  形式的。


# 算法思路

# 测试用例
```
37. Sudoku Solver 37. 解数独 Hard
Solution.solveSudoku
---
[["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]

I0=[["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
```

[enTitle]: https://leetcode.com/problems/sudoku-solver/
[cnTitle]: https://leetcode-cn.com/problems/sudoku-solver/
