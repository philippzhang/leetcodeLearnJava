# [419. Battleships in a Board][enTitle]

**Medium**



- You receive a valid board, made of only battleships or empty slots. 
- Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape  *1xN*  (1 row, N columns) or  *Nx1*  (N rows, 1 column), where N can be of any size. 
- At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.

Example:

```
X..X
...X
...X

```

Invalid Example:

```
...X
XXXX
...X

```



Follow up:Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?


# [419. 甲板上的战舰][cnTitle]

**中等**

给定一个二维的甲板， 请计算其中有多少艘战舰。 战舰用  *'X'* 表示，空位用  *'.'* 表示。 你需要遵守以下规则：

- 给你一个有效的甲板，仅由战舰或者空位组成。 
- 战舰只能水平或者垂直放置。换句话说,战舰只能由  *1xN*  (1 行, N 列)组成，或者  *Nx1*  (N 行, 1 列)组成，其中N可以是任意大小。 
- 两艘战舰之间至少有一个水平或垂直的空位分隔 - 即没有相邻的战舰。

**示例 :** 

```
X..X
...X
...X

```

在上面的甲板中有2艘战舰。

**无效样例 :** 

```
...X
XXXX
...X

```

你不会收到这样的无效甲板 - 因为战舰之间至少会有一个空位将它们分开。

**进阶:** 

你可以用**一次扫描算法** ，只使用**O(1)额外空间，** 并且**不修改** 甲板的值来解决这个问题吗？




# 算法思路

# 测试用例
```
419. Battleships in a Board 419. 甲板上的战舰 Medium
```

[enTitle]: https://leetcode.com/problems/battleships-in-a-board/
[cnTitle]: https://leetcode-cn.com/problems/battleships-in-a-board/
