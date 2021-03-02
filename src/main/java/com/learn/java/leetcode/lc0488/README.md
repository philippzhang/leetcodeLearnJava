# [488. Zuma Game][enTitle]

**Hard**

Think about Zuma Game. You have a row of balls on the table, colored red(R), yellow(Y), blue(B), green(G), and white(W). You also have several balls in your hand.

Each time, you may choose a ball in your hand, and insert it into the row (including the leftmost place and rightmost place). Then, if there is a group of 3 or more balls in the same color touching, remove these balls. Keep doing this until no more balls can be removed.

Find the minimal balls you have to insert to remove all the balls on the table. If you cannot remove all the balls, output -1.



**Example 1:** 

```
Input: board = "WRRBBW", hand = "RB"
Output: -1
Explanation: WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW

```

**Example 2:** 

```
Input: board = "WWRRBBWW", hand = "WRBRW"
Output: 2
Explanation: WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty

```

**Example 3:** 

```
Input: board = "G", hand = "GGGGG"
Output: 2
Explanation: G -> G[G] -> GG[G] -> empty 

```

**Example 4:** 

```
Input: board = "RBYYBBRRB", hand = "YRBGB"
Output: 3
Explanation: RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B] -> BB[B] -> empty 

```



**Constraints:** 

- You may assume that the initial row of balls on the table won’t have any 3 or more consecutive balls with the same color. 
-  *1 <= board.length <= 16*  
-  *1 <= hand.length <= 5*  
- Both input strings will be non-empty and only contain characters 'R','Y','B','G','W'.


# [488. 祖玛游戏][cnTitle]

**困难**

回忆一下祖玛游戏。现在桌上有一串球，颜色有红色(R)，黄色(Y)，蓝色(B)，绿色(G)，还有白色(W)。 现在你手里也有几个球。

每一次，你可以从手里的球选一个，然后把这个球插入到一串球中的某个位置上（包括最左端，最右端）。接着，如果有出现三个或者三个以上颜色相同的球相连的话，就把它们移除掉。重复这一步骤直到桌上所有的球都被移除。

找到插入并可以移除掉桌上所有球所需的最少的球数。如果不能移除桌上所有的球，输出 -1 。



**示例 1：** 

```
输入：board = "WRRBBW", hand = "RB"
输出：-1
解释：WRRBBW -> WRR[R]BBW -> WBBW -> WBB[B]W -> WW

```

**示例 2：** 

```
输入：board = "WWRRBBWW", hand = "WRBRW"
输出：2
解释：WWRRBBWW -> WWRR[R]BBWW -> WWBBWW -> WWBB[B]WW -> WWWW -> empty

```

**示例 3：** 

```
输入：board = "G", hand = "GGGGG"
输出：2
解释：G -> G[G] -> GG[G] -> empty 

```

**示例 4：** 

```
输入：board = "RBYYBBRRB", hand = "YRBGB"
输出：3
解释：RBYYBBRRB -> RBYY[Y]BBRRB -> RBBBRRB -> RRRB -> B -> B[B] -> BB[B] -> empty 

```



**提示：** 

- 你可以假设桌上一开始的球中，不会有三个及三个以上颜色相同且连着的球。 
-  *1 <= board.length <= 16*  
-  *1 <= hand.length <= 5*  
- 输入的两个字符串均为非空字符串，且只包含字符 'R','Y','B','G','W'。




# 算法思路

# 测试用例
```
488. Zuma Game 488. 祖玛游戏 Hard
```

[enTitle]: https://leetcode.com/problems/zuma-game/
[cnTitle]: https://leetcode-cn.com/problems/zuma-game/
