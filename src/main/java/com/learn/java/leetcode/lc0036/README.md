# [36. Valid Sudoku][enTitle]

**Medium**

Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated **according to the following rules** :

1. Each row must contain the digits  *1-9*  without repetition. 
2. Each column must contain the digits  *1-9*  without repetition. 
3. Each of the 9  *3x3*  sub-boxes of the grid must contain the digits  *1-9*  without repetition.

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png) A partially filled sudoku which is valid.

The Sudoku board could be partially filled, where empty cells are filled with the character  *'.'* .

**Example 1:** 

```
Input:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true

```

**Example 2:** 

```
Input:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being 
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.

```

**Note:** 

- A Sudoku board (partially filled) could be valid but is not necessarily solvable. 
- Only the filled cells need to be validated according to the mentioned rules. 
- The given board contain only digits  *1-9*  and the character  *'.'* . 
- The given board size is always  *9x9* .
# [36. 有效的数独][cnTitle]

**中等**

判断一个 9x9 的数独是否有效。只需要**根据以下规则** ，验证已经填入的数字是否有效即可。

1. 数字  *1-9*  在每一行只能出现一次。 
2. 数字  *1-9*  在每一列只能出现一次。 
3. 数字  *1-9*  在每一个以粗实线分隔的  *3x3*  宫内只能出现一次。

![img](https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png)

上图是一个部分填充的有效的数独。

数独部分空格内已填入了数字，空白格用  *'.'*  表示。

**示例 1:** 

```
输入:
[
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
输出: true

```

**示例 2:** 

```
输入:
[
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
输出: false
解释: 除了第一行的第一个数字从5 改为 8以外，空格内其他数字均与 示例1 相同。
     但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
```

**说明:** 

- 一个有效的数独（部分已被填充）不一定是可解的。 
- 只需要根据以上规则，验证已经填入的数字是否有效即可。 
- 给定数独序列只包含数字  *1-9*  和字符  *'.'*  。 
- 给定数独永远是  *9x9*  形式的。


# 算法思路

# 测试用例
```
36. Valid Sudoku 36. 有效的数独 Medium
```

[enTitle]: https://leetcode.com/problems/valid-sudoku/
[cnTitle]: https://leetcode-cn.com/problems/valid-sudoku/
