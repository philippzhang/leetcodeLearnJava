# [913. Cat and Mouse][enTitle]

**Hard**

A game on an **undirected**  graph is played by two players, Mouse and Cat, who alternate turns.

The graph is given as follows:  *graph[a]*  is a list of all nodes  *b*  such that  *ab*  is an edge of the graph.

The mouse starts at node  *1*  and goes first, the cat starts at node  *2*  and goes second, and there is a hole at node  *0* .

During each player's turn, they **must**  travel along one edge of the graph that meets where they are. For example, if the Mouse is at node 1, it **must**  travel to any node in  *graph[1]* .

Additionally, it is not allowed for the Cat to travel to the Hole (node 0.)

Then, the game can end in three ways:

- If ever the Cat occupies the same node as the Mouse, the Cat wins. 
- If ever the Mouse reaches the Hole, the Mouse wins. 
- If ever a position is repeated (i.e., the players are in the same position as a previous turn, and it is the same player's turn to move), the game is a draw.

Given a  *graph* , and assuming both players play optimally, return

-  *1*  if the mouse wins the game, 
-  *2*  if the cat wins the game, or 
-  *0*  if the game is a draw.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/11/17/cat1.jpg)

```
Input: graph = [[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
Output: 0

```

**Example 2:** 

![img](https://assets.leetcode.com/uploads/2020/11/17/cat2.jpg)

```
Input: graph = [[1,3],[0],[3],[0,2]]
Output: 1

```



**Constraints:** 

-  *3 <= graph.length <= 50*  
-  *1 <= graph[i].length < graph.length*  
-  *0 <= graph[i][j] < graph.length*  
-  *graph[i][j] != i*  
-  *graph[i]*  is unique. 
- The mouse and the cat can always move. 


# [913. 猫和老鼠][cnTitle]

**困难**

两个玩家分别扮演猫（Cat）和老鼠（Mouse）在**无向** 图上进行游戏，他们轮流行动。

该图按下述规则给出： *graph[a]*  是所有结点  *b*  的列表，使得  *ab*  是图的一条边。

老鼠从结点 1 开始并率先出发，猫从结点 2 开始且随后出发，在结点 0 处有一个洞。

在每个玩家的回合中，他们**必须** 沿着与他们所在位置相吻合的图的一条边移动。例如，如果老鼠位于结点  *1* ，那么它只能移动到  *graph[1]*  中的（任何）结点去。

此外，猫无法移动到洞（结点 0）里。

然后，游戏在出现以下三种情形之一时结束：

- 如果猫和老鼠占据相同的结点，猫获胜。 
- 如果老鼠躲入洞里，老鼠获胜。 
- 如果某一位置重复出现（即，玩家们的位置和移动顺序都与上一个回合相同），游戏平局。

给定  *graph* ，并假设两个玩家都以最佳状态参与游戏，如果老鼠获胜，则返回  *1* ；如果猫获胜，则返回  *2* ；如果平局，则返回  *0* 。





**示例：** 

```
输入：[[2,5],[3],[0,4,5],[1,4,5],[2,3],[0,2,3]]
输出：0
解释：
4---3---1
|   |
2---5
 \ /
  0

```



**提示：** 

1.  *3 <= graph.length <= 200*  
2. 保证  *graph[1]*  非空。 
3. 保证  *graph[2]*  包含非零元素。




# 算法思路

# 测试用例
```
913. Cat and Mouse 913. 猫和老鼠 Hard
```

[enTitle]: https://leetcode.com/problems/cat-and-mouse/
[cnTitle]: https://leetcode-cn.com/problems/cat-and-mouse/
