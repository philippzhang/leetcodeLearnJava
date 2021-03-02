# [790. Domino and Tromino Tiling][enTitle]

**Medium**

We have two types of tiles: a 2x1 domino shape, and an "L" tromino shape. These shapes may be rotated.

```
XX  <- domino

XX  <- "L" tromino
X

```

Given N, how many ways are there to tile a 2 x N board? **Return your answer modulo 10^9 + 7** .

(In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.)

```
Example:
Input: 3
Output: 5
Explanation: 
The five different ways are listed below, different letters indicates different tiles:
XYZ XXZ XYY XXY XYY
XYZ YYZ XZZ XYY XXY
```

**Note:** 

- N will be in range  *[1, 1000]* .




# [790. 多米诺和托米诺平铺][cnTitle]

**中等**

有两种形状的瓷砖：一种是 2x1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。

```
XX  <- 多米诺

XX  <- "L" 托米诺
X

```

给定 N 的值，有多少种方法可以平铺 2 x N 的面板？**返回值 mod 10^9 + 7** 。

（平铺指的是每个正方形都必须有瓷砖覆盖。两个平铺不同，当且仅当面板上有四个方向上的相邻单元中的两个，使得恰好有一个平铺有一个瓷砖占据两个正方形。）

```
示例:
输入: 3
输出: 5
解释: 
下面列出了五种不同的方法，不同字母代表不同瓷砖：
XYZ XXZ XYY XXY XYY
XYZ YYZ XZZ XYY XXY
```

**提示：** 

- N 的范围是  *[1, 1000]* 






# 算法思路

# 测试用例
```
790. Domino and Tromino Tiling 790. 多米诺和托米诺平铺 Medium
```

[enTitle]: https://leetcode.com/problems/domino-and-tromino-tiling/
[cnTitle]: https://leetcode-cn.com/problems/domino-and-tromino-tiling/
