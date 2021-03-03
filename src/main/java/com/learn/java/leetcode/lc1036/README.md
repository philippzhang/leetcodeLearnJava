# [1036. Escape a Large Maze][enTitle]

**Hard**

There is a 1 million by 1 million grid on an XY-plane, and the coordinates of each grid square are  *(x, y)* .

We start at the  *source = [sx, sy]*  square and want to reach the  *target = [tx, ty]*  square. There is also an array of  *blocked*  squares, where each  *blocked[i] = [xi, yi]*  represents a blocked square with coordinates  *(xi, yi)* .

Each move, we can walk one square north, east, south, or west if the square is **not**  in the array of  *blocked*  squares. We are also not allowed to walk outside of the grid.

Return  *true*  *if and only if it is possible to reach the*  *target*  *square from the*  *source*  *square through a sequence of valid moves* .



**Example 1:** 

```
Input: blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
Output: false
Explanation: The target square is inaccessible starting from the source square because we cannot move.
We cannot move north or east because those squares are blocked.
We cannot move south or west because we cannot go outside of the grid.

```

**Example 2:** 

```
Input: blocked = [], source = [0,0], target = [999999,999999]
Output: true
Explanation: Because there are no blocked cells, it is possible to reach the target square.

```



**Constraints:** 

-  *0 <= blocked.length <= 200*  
-  *blocked[i].length == 2*  
-  *0 <= xi, yi < 106*  
-  *source.length == target.length == 2*  
-  *0 <= sx, sy, tx, ty < 106*  
-  *source != target*  
- It is guaranteed that  *source*  and  *target*  are not blocked.


# [1036. 逃离大迷宫][cnTitle]

**困难**

在一个 10<sup>6</sup> x 10<sup>6</sup> 的网格中，每个网格上方格的坐标为  *(x, y)*  。

现在从源方格  *source = [sx, sy]*  开始出发，意图赶往目标方格  *target = [tx, ty]*  。数组  *blocked*  是封锁的方格列表，其中每个  *blocked[i] = [xi, yi]*  表示坐标为  *(xi, yi)*  的方格是禁止通行的。

每次移动，都可以走到网格中在四个方向上相邻的方格，只要该方格 **不**  在给出的封锁列表  *blocked*  上。同时，不允许走出网格。

只有在可以通过一系列的移动从源方格  *source*  到达目标方格  *target*  时才返回  *true* 。否则，返回  *false* 。



**示例 1：** 

```
输入：blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
输出：false
解释：
从源方格无法到达目标方格，因为我们无法在网格中移动。
无法向北或者向东移动是因为方格禁止通行。
无法向南或者向西移动是因为不能走出网格。
```

**示例 2：** 

```
输入：blocked = [], source = [0,0], target = [999999,999999]
输出：true
解释：
因为没有方格被封锁，所以一定可以到达目标方格。

```



**提示：** 

-  *0 <= blocked.length <= 200*  
-  *blocked[i].length == 2*  
-  *0 <= xi, yi < 106*  
-  *source.length == target.length == 2*  
-  *0 <= sx, sy, tx, ty < 106*  
-  *source != target*  
- 题目数据保证  *source*  和  *target*  不在封锁列表内




# 算法思路

# 测试用例
```
1036. Escape a Large Maze 1036. 逃离大迷宫 Hard
```

[enTitle]: https://leetcode.com/problems/escape-a-large-maze/
[cnTitle]: https://leetcode-cn.com/problems/escape-a-large-maze/
