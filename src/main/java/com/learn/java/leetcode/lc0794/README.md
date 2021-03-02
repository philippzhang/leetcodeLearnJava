# [794. Valid Tic-Tac-Toe State][enTitle]

**Medium**

A Tic-Tac-Toe board is given as a string array  *board* . Return True if and only if it is possible to reach this board position during the course of a valid tic-tac-toe game.

The  *board*  is a 3 x 3 array, and consists of characters  *" "* ,  *"X"* , and  *"O"* . The " " character represents an empty square.

Here are the rules of Tic-Tac-Toe:

- Players take turns placing characters into empty squares (" "). 
- The first player always places "X" characters, while the second player always places "O" characters. 
- "X" and "O" characters are always placed into empty squares, never filled ones. 
- The game ends when there are 3 of the same (non-empty) character filling any row, column, or diagonal. 
- The game also ends if all squares are non-empty. 
- No more moves can be played if the game is over.

```
Example 1:
Input: board = ["O  ", "   ", "   "]
Output: false
Explanation: The first player always plays "X".

Example 2:
Input: board = ["XOX", " X ", "   "]
Output: false
Explanation: Players take turns making moves.

Example 3:
Input: board = ["XXX", "   ", "OOO"]
Output: false

Example 4:
Input: board = ["XOX", "O O", "XOX"]
Output: true

```

**Note:** 

-  *board*  is a length-3 array of strings, where each string  *board[i]*  has length 3. 
- Each  *board[i][j]*  is a character in the set  *{" ", "X", "O"}* .


# [794. 有效的井字游戏][cnTitle]

**中等**

用字符串数组作为井字游戏的游戏板  *board* 。当且仅当在井字游戏过程中，玩家有可能将字符放置成游戏板所显示的状态时，才返回 true。

该游戏板是一个 3 x 3 数组，由字符  *" "* ， *"X"*  和  *"O"*  组成。字符  *" "*  代表一个空位。

以下是井字游戏的规则：

- 玩家轮流将字符放入空位（" "）中。 
- 第一个玩家总是放字符 “X”，且第二个玩家总是放字符 “O”。 
- “X” 和 “O” 只允许放置在空位中，不允许对已放有字符的位置进行填充。 
- 当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。 
- 当所有位置非空时，也算为游戏结束。 
- 如果游戏结束，玩家不允许再放置字符。

```
示例 1:
输入: board = ["O  ", "   ", "   "]
输出: false
解释: 第一个玩家总是放置“X”。

示例 2:
输入: board = ["XOX", " X ", "   "]
输出: false
解释: 玩家应该是轮流放置的。

示例 3:
输入: board = ["XXX", "   ", "OOO"]
输出: false

示例 4:
输入: board = ["XOX", "O O", "XOX"]
输出: true

```

**说明:** 

- 游戏板  *board*  是长度为 3 的字符串数组，其中每个字符串  *board[i]*  的长度为 3。 
-   *board[i][j]*  是集合  *{" ", "X", "O"}*  中的一个字符。




# 算法思路

# 测试用例
```
794. Valid Tic-Tac-Toe State 794. 有效的井字游戏 Medium
```

[enTitle]: https://leetcode.com/problems/valid-tic-tac-toe-state/
[cnTitle]: https://leetcode-cn.com/problems/valid-tic-tac-toe-state/
