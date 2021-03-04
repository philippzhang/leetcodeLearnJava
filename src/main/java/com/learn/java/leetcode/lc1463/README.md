# [1463. Cherry Pickup II][enTitle]

**Hard**

Given a  *rows x cols*  matrix  *grid*  representing a field of cherries. Each cell in  *grid*  represents the number of cherries that you can collect.

You have two robots that can collect cherries for you, Robot #1 is located at the top-left corner (0,0) , and Robot #2 is located at the top-right corner (0, cols-1) of the grid.

Return the maximum number of cherries collection using both robots by following the rules below:

- From a cell (i,j), robots can move to cell (i+1, j-1) , (i+1, j) or (i+1, j+1). 
- When any robot is passing through a cell, It picks it up all cherries, and the cell becomes an empty cell (0). 
- When both robots stay on the same cell, only one of them takes the cherries. 
- Both robots cannot move outside of the grid at any moment. 
- Both robots should reach the bottom row in the  *grid* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/04/29/sample_1_1802.png)

```
Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
Output: 24
Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
Cherries taken by Robot #1, (3 + 2 + 5 + 2) = 12.
Cherries taken by Robot #2, (1 + 5 + 5 + 1) = 12.
Total of cherries: 12 + 12 = 24.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/04/23/sample_2_1802.png)

```
Input: grid = [[1,0,0,0,0,0,1],[2,0,0,0,0,3,0],[2,0,9,0,0,0,0],[0,3,0,5,4,0,0],[1,0,2,3,0,0,6]]
Output: 28
Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
Cherries taken by Robot #1, (1 + 9 + 5 + 2) = 17.
Cherries taken by Robot #2, (1 + 3 + 4 + 3) = 11.
Total of cherries: 17 + 11 = 28.

```

**Example 3:** 

```
Input: grid = [[1,0,0,3],[0,0,0,3],[0,0,3,3],[9,0,3,3]]
Output: 22

```

**Example 4:** 

```
Input: grid = [[1,1],[1,1]]
Output: 4

```



**Constraints:** 

-  *rows == grid.length*  
-  *cols == grid[i].length*  
-  *2 <= rows, cols <= 70*  
-  *0 <= grid[i][j] <= 100* 


# [1463. 摘樱桃 II][cnTitle]

**困难**

给你一个  *rows x cols*  的矩阵  *grid*  来表示一块樱桃地。  *grid*  中每个格子的数字表示你能获得的樱桃数目。

你有两个机器人帮你收集樱桃，机器人 1 从左上角格子  *(0,0)*  出发，机器人 2 从右上角格子  *(0, cols-1)*  出发。

请你按照如下规则，返回两个机器人能收集的最多樱桃数目：

- 从格子  *(i,j)*  出发，机器人可以移动到格子  *(i+1, j-1)* ， *(i+1, j)*  或者  *(i+1, j+1)*  。 
- 当一个机器人经过某个格子时，它会把该格子内所有的樱桃都摘走，然后这个位置会变成空格子，即没有樱桃的格子。 
- 当两个机器人同时到达同一个格子时，它们中只有一个可以摘到樱桃。 
- 两个机器人在任意时刻都不能移动到  *grid*  外面。 
- 两个机器人最后都要到达  *grid*  最底下一行。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/30/sample_1_1802.png)

```
输入：grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
输出：24
解释：机器人 1 和机器人 2 的路径在上图中分别用绿色和蓝色表示。
机器人 1 摘的樱桃数目为 (3 + 2 + 5 + 2) = 12 。
机器人 2 摘的樱桃数目为 (1 + 5 + 5 + 1) = 12 。
樱桃总数为： 12 + 12 = 24 。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/30/sample_2_1802.png)

```
输入：grid = [[1,0,0,0,0,0,1],[2,0,0,0,0,3,0],[2,0,9,0,0,0,0],[0,3,0,5,4,0,0],[1,0,2,3,0,0,6]]
输出：28
解释：机器人 1 和机器人 2 的路径在上图中分别用绿色和蓝色表示。
机器人 1 摘的樱桃数目为 (1 + 9 + 5 + 2) = 17 。
机器人 2 摘的樱桃数目为 (1 + 3 + 4 + 3) = 11 。
樱桃总数为： 17 + 11 = 28 。

```

**示例 3：** 

```
输入：grid = [[1,0,0,3],[0,0,0,3],[0,0,3,3],[9,0,3,3]]
输出：22

```

**示例 4：** 

```
输入：grid = [[1,1],[1,1]]
输出：4

```



**提示：** 

-  *rows == grid.length*  
-  *cols == grid[i].length*  
-  *2 <= rows, cols <= 70*  
-  *0 <= grid[i][j] <= 100* 




# 算法思路

# 测试用例
```
1463. Cherry Pickup II 1463. 摘樱桃 II Hard
```

[enTitle]: https://leetcode.com/problems/cherry-pickup-ii/
[cnTitle]: https://leetcode-cn.com/problems/cherry-pickup-ii/
