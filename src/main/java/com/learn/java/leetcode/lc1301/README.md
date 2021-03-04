# [1301. Number of Paths with Max Score][enTitle]

**Hard**

You are given a square  *board*  of characters. You can move on the board starting at the bottom right square marked with the character  *'S'* .

You need to reach the top left square marked with the character  *'E'* . The rest of the squares are labeled either with a numeric character  *1, 2, ..., 9*  or with an obstacle  *'X'* . In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.

Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum, **taken modulo 10^9 + 7** .

In case there is no path, return  *[0, 0]* .



**Example 1:** 

```
Input: board = ["E23","2X2","12S"]
Output: [7,1]

```

**Example 2:** 

```
Input: board = ["E12","1X1","21S"]
Output: [4,2]

```

**Example 3:** 

```
Input: board = ["E11","XXX","11S"]
Output: [0,0]

```



**Constraints:** 

-  *2 <= board.length == board[i].length <= 100* 


# [1301. 最大得分的路径数目][cnTitle]

**困难**

给你一个正方形字符数组  *board*  ，你从数组最右下方的字符  *'S'*  出发。

你的目标是到达数组最左上角的字符  *'E'*  ，数组剩余的部分为数字字符  *1, 2, ..., 9*  或者障碍  *'X'* 。在每一步移动中，你可以向上、向左或者左上方移动，可以移动的前提是到达的格子没有障碍。

一条路径的 「得分」 定义为：路径上所有数字的和。

请你返回一个列表，包含两个整数：第一个整数是 「得分」 的最大值，第二个整数是得到最大得分的方案数，请把结果对 **10^9 + 7**  **取余** 。

如果没有任何路径可以到达终点，请返回  *[0, 0]*  。



**示例 1：** 

```
输入：board = ["E23","2X2","12S"]
输出：[7,1]

```

**示例 2：** 

```
输入：board = ["E12","1X1","21S"]
输出：[4,2]

```

**示例 3：** 

```
输入：board = ["E11","XXX","11S"]
输出：[0,0]

```



**提示：** 

-  *2 <= board.length == board[i].length <= 100* 




# 算法思路

# 测试用例
```
1301. Number of Paths with Max Score 1301. 最大得分的路径数目 Hard
```

[enTitle]: https://leetcode.com/problems/number-of-paths-with-max-score/
[cnTitle]: https://leetcode-cn.com/problems/number-of-paths-with-max-score/
