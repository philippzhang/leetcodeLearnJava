# [1145. Binary Tree Coloring Game][enTitle]

**Medium**

Two players play a turn based game on a binary tree. We are given the  *root*  of this binary tree, and the number of nodes  *n*  in the tree.  *n*  is odd, and each node has a distinct value from  *1*  to  *n* .

Initially, the first player names a value  *x*  with  *1 <= x <= n* , and the second player names a value  *y*  with  *1 <= y <= n*  and  *y != x* . The first player colors the node with value  *x*  red, and the second player colors the node with value  *y*  blue.

Then, the players take turns starting with the first player. In each turn, that player chooses a node of their color (red if player 1, blue if player 2) and colors an **uncolored**  neighbor of the chosen node (either the left child, right child, or parent of the chosen node.)

If (and only if) a player cannot choose such a node in this way, they must pass their turn. If both players pass their turn, the game ends, and the winner is the player that colored more nodes.

You are the second player. If it is possible to choose such a  *y*  to ensure you win the game, return  *true* . If it is not possible, return  *false* .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/08/01/1480-binary-tree-coloring-game.png)

```
Input: root = [1,2,3,4,5,6,7,8,9,10,11], n = 11, x = 3
Output: true
Explanation:The second player can choose the node with value 2.

```



**Constraints:** 

-  *root*  is the root of a binary tree with  *n*  nodes and distinct node values from  *1*  to  *n* . 
-  *n*  is odd. 
-  *1 <= x <= n <= 100* 


# [1145. 二叉树着色游戏][cnTitle]

**中等**

有两位极客玩家参与了一场「二叉树着色」的游戏。游戏中，给出二叉树的根节点  *root* ，树上总共有  *n*  个节点，且  *n*  为奇数，其中每个节点上的值从  *1*  到  *n*  各不相同。



游戏从「一号」玩家开始（「一号」玩家为红色，「二号」玩家为蓝色），最开始时，

「一号」玩家从  *[1, n]*  中取一个值  *x* （ *1 <= x <= n* ）；

「二号」玩家也从  *[1, n]*  中取一个值  *y* （ *1 <= y <= n* ）且  *y != x* 。

「一号」玩家给值为  *x*  的节点染上红色，而「二号」玩家给值为  *y*  的节点染上蓝色。



之后两位玩家轮流进行操作，每一回合，玩家选择一个他之前涂好颜色的节点，将所选节点一个 **未着色** 的邻节点（即左右子节点、或父节点）进行染色。

如果当前玩家无法找到这样的节点来染色时，他的回合就会被跳过。

若两个玩家都没有可以染色的节点时，游戏结束。着色节点最多的那位玩家获得胜利 ✌️。



现在，假设你是「二号」玩家，根据所给出的输入，假如存在一个  *y*  值可以确保你赢得这场游戏，则返回  *true* ；若无法获胜，就请返回  *false* 。



**示例：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/08/04/1480-binary-tree-coloring-game.png)

```
输入：root = [1,2,3,4,5,6,7,8,9,10,11], n = 11, x = 3
输出：True
解释：第二个玩家可以选择值为 2 的节点。

```



**提示：** 

- 二叉树的根节点为  *root* ，树上由  *n*  个节点，节点上的值从  *1*  到  *n*  各不相同。 
-  *n*  为奇数。 
-  *1 <= x <= n <= 100* 




# 算法思路

# 测试用例
```
1145. Binary Tree Coloring Game 1145. 二叉树着色游戏 Medium
```

[enTitle]: https://leetcode.com/problems/binary-tree-coloring-game/
[cnTitle]: https://leetcode-cn.com/problems/binary-tree-coloring-game/
