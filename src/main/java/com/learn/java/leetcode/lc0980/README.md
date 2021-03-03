# [980. Unique Paths III][enTitle]

**Hard**

On a 2-dimensional  *grid* , there are 4 types of squares:

-  *1*  represents the starting square. There is exactly one starting square. 
-  *2*  represents the ending square. There is exactly one ending square. 
-  *0*  represents empty squares we can walk over. 
-  *-1*  represents obstacles that we cannot walk over.

Return the number of 4-directional walks from the starting square to the ending square, that **walk over every non-obstacle square exactly once** .




**Example 1:** 

```
Input:[[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
Output: 2
Explanation: We have the following two paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
```


**Example 2:** 

```
Input:[[1,0,0,0],[0,0,0,0],[0,0,0,2]]
Output: 4
Explanation: We have the following four paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
```


**Example 3:** 

```
Input:[[0,1],[2,0]]
Output: 0
Explanation: 
There is no path that walks over every empty square exactly once.
Note that the starting and ending square can be anywhere in the grid.
```









**Note:** 

1.  *1 <= grid.length * grid[0].length <= 20* 


# [980. 不同路径 III][cnTitle]

**困难**

在二维网格  *grid*  上，有 4 种类型的方格：

-  *1*  表示起始方格。且只有一个起始方格。 
-  *2*  表示结束方格，且只有一个结束方格。 
-  *0*  表示我们可以走过的空方格。 
-  *-1*  表示我们无法跨越的障碍。

返回在四个方向（上、下、左、右）上行走时，从起始方格到结束方格的不同路径的数目**。** 

**每一个无障碍方格都要通过一次，但是一条路径中不能重复通过同一个方格** 。



**示例 1：** 

```
输入：[[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
输出：2
解释：我们有以下两条路径：
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
```

**示例 2：** 

```
输入：[[1,0,0,0],[0,0,0,0],[0,0,0,2]]
输出：4
解释：我们有以下四条路径： 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
```

**示例 3：** 

```
输入：[[0,1],[2,0]]
输出：0
解释：
没有一条路能完全穿过每一个空的方格一次。
请注意，起始和结束方格可以位于网格中的任意位置。

```



**提示：** 

-  *1 <= grid.length * grid[0].length <= 20* 




# 算法思路

# 测试用例
```
980. Unique Paths III 980. 不同路径 III Hard
```

[enTitle]: https://leetcode.com/problems/unique-paths-iii/
[cnTitle]: https://leetcode-cn.com/problems/unique-paths-iii/
