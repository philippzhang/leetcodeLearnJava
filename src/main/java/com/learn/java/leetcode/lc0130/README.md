# [130. Surrounded Regions][enTitle]

**Medium**

Given a 2D board containing  *'X'*  and  *'O'*  (**the letter O** ), capture all regions surrounded by  *'X'* .

A region is captured by flipping all  *'O'* s into  *'X'* s in that surrounded region.

**Example:** 

```
X X X X
X O O X
X X O X
X O X X

```

After running your function, the board should be:

```
X X X X
X X X X
X X X X
X O X X

```

**Explanation:** 

Surrounded regions shouldn’t be on the border, which means that any  *'O'*  on the border of the board are not flipped to  *'X'* . Any  *'O'*  that is not on the border and it is not connected to an  *'O'*  on the border will be flipped to  *'X'* . Two cells are connected if they are adjacent cells connected horizontally or vertically.


# [130. 被围绕的区域][cnTitle]

**中等**

给定一个二维的矩阵，包含  *'X'*  和  *'O'* （**字母 O** ）。

找到所有被  *'X'*  围绕的区域，并将这些区域里所有的  *'O'*  用  *'X'*  填充。

**示例:** 

```
X X X X
X O O X
X X O X
X O X X

```

运行你的函数后，矩阵变为：

```
X X X X
X X X X
X X X X
X O X X

```

**解释:** 

被围绕的区间不会存在于边界上，换句话说，任何边界上的  *'O'*  都不会被填充为  *'X'* 。 任何不在边界上，或不与边界上的  *'O'*  相连的  *'O'*  最终都会被填充为  *'X'* 。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。




# 算法思路

# 测试用例
```
130. Surrounded Regions 130. 被围绕的区域 Medium
```

[enTitle]: https://leetcode.com/problems/surrounded-regions/
[cnTitle]: https://leetcode-cn.com/problems/surrounded-regions/
