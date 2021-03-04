# [1728. Cat and Mouse II][enTitle]

**Hard**

A game is played by a cat and a mouse named Cat and Mouse.

The environment is represented by a  *grid*  of size  *rows x cols* , where each element is a wall, floor, player (Cat, Mouse), or food.

- Players are represented by the characters  *'C'* (Cat) *,'M'* (Mouse). 
- Floors are represented by the character  *'.'*  and can be walked on. 
- Walls are represented by the character  *'#'*  and cannot be walked on. 
- Food is represented by the character  *'F'*  and can be walked on. 
- There is only one of each character  *'C'* ,  *'M'* , and  *'F'*  in  *grid* .

Mouse and Cat play according to the following rules:

- Mouse **moves first** , then they take turns to move. 
- During each turn, Cat and Mouse can jump in one of the four directions (left, right, up, down). They cannot jump over the wall nor outside of the  *grid* . 
-  *catJump, mouseJump*  are the maximum lengths Cat and Mouse can jump at a time, respectively. Cat and Mouse can jump less than the maximum length. 
- Staying in the same position is allowed. 
- Mouse can jump over Cat.

The game can end in 4 ways:

- If Cat occupies the same position as Mouse, Cat wins. 
- If Cat reaches the food first, Cat wins. 
- If Mouse reaches the food first, Mouse wins. 
- If Mouse cannot get to the food within 1000 turns, Cat wins.

Given a  *rows x cols*  matrix  *grid*  and two integers  *catJump*  and  *mouseJump* , return  *true*  *if Mouse can win the game if both Cat and Mouse play optimally, otherwise return*  *false* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/09/12/sample_111_1955.png)

```
Input: grid = ["####F","#C...","M...."], catJump = 1, mouseJump = 2
Output: true
Explanation: Cat cannot catch Mouse on its turn nor can it get the food before Mouse.

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/09/12/sample_2_1955.png)

```
Input: grid = ["M.C...F"], catJump = 1, mouseJump = 4
Output: true

```

**Example 3:** 

```
Input: grid = ["M.C...F"], catJump = 1, mouseJump = 3
Output: false

```

**Example 4:** 

```
Input: grid = ["C...#","...#F","....#","M...."], catJump = 2, mouseJump = 5
Output: false

```

**Example 5:** 

```
Input: grid = [".M...","..#..","#..#.","C#.#.","...#F"], catJump = 3, mouseJump = 1
Output: true

```



**Constraints:** 

-  *rows == grid.length*  
-  *cols = grid[i].length*  
-  *1 <= rows, cols <= 8*  
-  *grid[i][j]*  consist only of characters  *'C'* ,  *'M'* ,  *'F'* ,  *'.'* , and  *'#'* . 
- There is only one of each character  *'C'* ,  *'M'* , and  *'F'*  in  *grid* . 
-  *1 <= catJump, mouseJump <= 8* 


# [1728. 猫和老鼠 II][cnTitle]

**困难**

一只猫和一只老鼠在玩一个叫做猫和老鼠的游戏。

它们所处的环境设定是一个  *rows x cols*  的方格  *grid*  ，其中每个格子可能是一堵墙、一块地板、一位玩家（猫或者老鼠）或者食物。

- 玩家由字符  *'C'*  （代表猫）和  *'M'*  （代表老鼠）表示。 
- 地板由字符  *'.'*  表示，玩家可以通过这个格子。 
- 墙用字符  *'#'*  表示，玩家不能通过这个格子。 
- 食物用字符  *'F'*  表示，玩家可以通过这个格子。 
- 字符  *'C'*  ，  *'M'*  和  *'F'*  在  *grid*  中都只会出现一次。

猫和老鼠按照如下规则移动：

- 老鼠 **先移动**  ，然后两名玩家轮流移动。 
- 每一次操作时，猫和老鼠可以跳到上下左右四个方向之一的格子，他们不能跳过墙也不能跳出  *grid*  。 
-  *catJump*  和  *mouseJump*  是猫和老鼠分别跳一次能到达的最远距离，它们也可以跳小于最大距离的长度。 
- 它们可以停留在原地。 
- 老鼠可以跳跃过猫的位置。

游戏有 4 种方式会结束：

- 如果猫跟老鼠处在相同的位置，那么猫获胜。 
- 如果猫先到达食物，那么猫获胜。 
- 如果老鼠先到达食物，那么老鼠获胜。 
- 如果老鼠不能在 1000 次操作以内到达食物，那么猫获胜。

给你  *rows x cols*  的矩阵  *grid*  和两个整数  *catJump*  和  *mouseJump*  ，双方都采取最优策略，如果老鼠获胜，那么请你返回  *true*  ，否则返回  *false*  。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/17/sample_111_1955.png)

```
输入：grid = ["####F","#C...","M...."], catJump = 1, mouseJump = 2
输出：true
解释：猫无法抓到老鼠，也没法比老鼠先到达食物。

```

**示例 2：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2021/01/17/sample_2_1955.png)

```
输入：grid = ["M.C...F"], catJump = 1, mouseJump = 4
输出：true

```

**示例 3：** 

```
输入：grid = ["M.C...F"], catJump = 1, mouseJump = 3
输出：false

```

**示例 4：** 

```
输入：grid = ["C...#","...#F","....#","M...."], catJump = 2, mouseJump = 5
输出：false

```

**示例 5：** 

```
输入：grid = [".M...","..#..","#..#.","C#.#.","...#F"], catJump = 3, mouseJump = 1
输出：true

```



**提示：** 

-  *rows == grid.length*  
-  *cols = grid[i].length*  
-  *1 <= rows, cols <= 8*  
-  *grid[i][j]*  只包含字符  *'C'*  ， *'M'*  ， *'F'*  ， *'.'*  和  *'#'*  。 
-  *grid*  中只包含一个  *'C'*  ， *'M'*  和  *'F'*  。 
-  *1 <= catJump, mouseJump <= 8* 




# 算法思路

# 测试用例
```
1728. Cat and Mouse II 1728. 猫和老鼠 II Hard
```

[enTitle]: https://leetcode.com/problems/cat-and-mouse-ii/
[cnTitle]: https://leetcode-cn.com/problems/cat-and-mouse-ii/
