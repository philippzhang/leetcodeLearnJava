# [1263. Minimum Moves to Move a Box to Their Target Location][enTitle]

**Hard**

Storekeeper is a game in which the player pushes boxes around in a warehouse trying to get them to target locations.

The game is represented by a  *grid*  of size  *m x n* , where each element is a wall, floor, or a box.

Your task is move the box  *'B'*  to the target position  *'T'*  under the following rules:

- Player is represented by character  *'S'*  and can move up, down, left, right in the  *grid*  if it is a floor (empy cell). 
- Floor is represented by character  *'.'*  that means free cell to walk. 
- Wall is represented by character  *'#'*  that means obstacle (impossible to walk there).  
- There is only one box  *'B'*  and one target cell  *'T'*  in the  *grid* . 
- The box can be moved to an adjacent free cell by standing next to the box and then moving in the direction of the box. This is a **push** . 
- The player cannot walk through the box.

Return the minimum number of **pushes**  to move the box to the target. If there is no way to reach the target, return  *-1* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/11/06/sample_1_1620.png)

```
Input: grid = [["#","#","#","#","#","#"],
               ["#","T","#","#","#","#"],
               ["#",".",".","B",".","#"],
               ["#",".","#","#",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
Output: 3
Explanation:We return only the number of times the box is pushed.
```

**Example 2:** 

```
Input: grid = [["#","#","#","#","#","#"],
               ["#","T","#","#","#","#"],
               ["#",".",".","B",".","#"],
               ["#","#","#","#",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
Output: -1

```

**Example 3:** 

```
Input: grid = [["#","#","#","#","#","#"],
               ["#","T",".",".","#","#"],
               ["#",".","#","B",".","#"],
               ["#",".",".",".",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
Output: 5
Explanation:  push the box down, left, left, up and up.

```

**Example 4:** 

```
Input: grid = [["#","#","#","#","#","#","#"],
               ["#","S","#",".","B","T","#"],
               ["#","#","#","#","#","#","#"]]
Output: -1

```



**Constraints:** 

-  *m == grid.length*  
-  *n == grid[i].length*  
-  *1 <= m <= 20*  
-  *1 <= n <= 20*  
-  *grid*  contains only characters  *'.'* ,  *'#'* ,  *'S'*  ,  *'T'* , or  *'B'* . 
- There is only one character  *'S'* ,  *'B'*  and *'T'*  in the  *grid* .


# [1263. 推箱子][cnTitle]

**困难**

「推箱子」是一款风靡全球的益智小游戏，玩家需要将箱子推到仓库中的目标位置。

游戏地图用大小为  *n * m*  的网格  *grid*  表示，其中每个元素可以是墙、地板或者是箱子。

现在你将作为玩家参与游戏，按规则将箱子  *'B'*  移动到目标位置  *'T'*  ：

- 玩家用字符  *'S'*  表示，只要他在地板上，就可以在网格中向上、下、左、右四个方向移动。 
- 地板用字符  *'.'*  表示，意味着可以自由行走。 
- 墙用字符  *'#'*  表示，意味着障碍物，不能通行。  
- 箱子仅有一个，用字符  *'B'*  表示。相应地，网格上有一个目标位置  *'T'* 。 
- 玩家需要站在箱子旁边，然后沿着箱子的方向进行移动，此时箱子会被移动到相邻的地板单元格。记作一次「推动」。 
- 玩家无法越过箱子。

返回将箱子推到目标位置的最小 **推动**  次数，如果无法做到，请返回  *-1* 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/11/16/sample_1_1620.png)

```
输入：grid = [["#","#","#","#","#","#"],
             ["#","T","#","#","#","#"],
             ["#",".",".","B",".","#"],
             ["#",".","#","#",".","#"],
             ["#",".",".",".","S","#"],
             ["#","#","#","#","#","#"]]
输出：3
解释：我们只需要返回推箱子的次数。
```

**示例 2：** 

```
输入：grid = [["#","#","#","#","#","#"],
             ["#","T","#","#","#","#"],
             ["#",".",".","B",".","#"],
             ["#","#","#","#",".","#"],
             ["#",".",".",".","S","#"],
             ["#","#","#","#","#","#"]]
输出：-1

```

**示例 3：** 

```
输入：grid = [["#","#","#","#","#","#"],
             ["#","T",".",".","#","#"],
             ["#",".","#","B",".","#"],
             ["#",".",".",".",".","#"],
             ["#",".",".",".","S","#"],
             ["#","#","#","#","#","#"]]
输出：5
解释：向下、向左、向左、向上再向上。

```

**示例 4：** 

```
输入：grid = [["#","#","#","#","#","#","#"],
             ["#","S","#",".","B","T","#"],
             ["#","#","#","#","#","#","#"]]
输出：-1

```



**提示：** 

-  *1 <= grid.length <= 20*  
-  *1 <= grid[i].length <= 20*  
-  *grid*  仅包含字符  *'.'* ,  *'#'* ,  *'S'*  ,  *'T'* , 以及  *'B'* 。 
-  *grid*  中  *'S'* ,  *'B'*  和  *'T'*  各只能出现一个。




# 算法思路

# 测试用例
```
1263. Minimum Moves to Move a Box to Their Target Location 1263. 推箱子 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-moves-to-move-a-box-to-their-target-location/
[cnTitle]: https://leetcode-cn.com/problems/minimum-moves-to-move-a-box-to-their-target-location/
