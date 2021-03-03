# [1040. Moving Stones Until Consecutive II][enTitle]

**Medium**

On an **infinite**  number line, the position of the i-th stone is given by  *stones[i]* . Call a stone an  *endpoint stone*  if it has the smallest or largest position.

Each turn, you pick up an endpoint stone and move it to an unoccupied position so that it is no longer an endpoint stone.

In particular, if the stones are at say,  *stones = [1,2,5]* , you **cannot**  move the endpoint stone at position 5, since moving it to any position (such as 0, or 3) will still keep that stone as an endpoint stone.

The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.

When the game ends, what is the minimum and maximum number of moves that you could have made? Return the answer as an length 2 array:  *answer = [minimum_moves, maximum_moves]* 



**Example 1:** 

```
Input:[7,4,9]
Output: [1,2]
Explanation: 
We can move 4 -> 8 for one move to finish the game.
Or, we can move 9 -> 5, 4 -> 6 for two moves to finish the game.
```


**Example 2:** 

```
Input:[6,5,4,3,10]
Output: [2,3]
We can move 3 -> 8 then 10 -> 7 to finish the game.
Or, we can move 3 -> 7, 4 -> 8, 5 -> 9 to finish the game.
Notice we cannot move 10 -> 2 to finish the game, because that would be an illegal move.
```


**Example 3:** 

```
Input:[100,101,104,102,103]
Output: [0,0]
```







**Note:** 

1.  *3 <= stones.length <= 10^4*  
2.  *1 <= stones[i] <= 10^9*  
3.  *stones[i]*  have distinct values.











# [1040. 移动石子直到连续 II][cnTitle]

**中等**

在一个长度**无限** 的数轴上，第  *i*  颗石子的位置为  *stones[i]* 。如果一颗石子的位置最小/最大，那么该石子被称作**端点石子** 。

每个回合，你可以将一颗端点石子拿起并移动到一个未占用的位置，使得该石子不再是一颗端点石子。

值得注意的是，如果石子像  *stones = [1,2,5]*  这样，你将**无法** 移动位于位置 5 的端点石子，因为无论将它移动到任何位置（例如 0 或 3），该石子都仍然会是端点石子。

当你无法进行任何移动时，即，这些石子的位置连续时，游戏结束。

要使游戏结束，你可以执行的最小和最大移动次数分别是多少？ 以长度为 2 的数组形式返回答案： *answer = [minimum_moves, maximum_moves]*  。



**示例 1：** 

```
输入：[7,4,9]
输出：[1,2]
解释：
我们可以移动一次，4 -> 8，游戏结束。
或者，我们可以移动两次 9 -> 5，4 -> 6，游戏结束。

```

**示例 2：** 

```
输入：[6,5,4,3,10]
输出：[2,3]
解释：
我们可以移动 3 -> 8，接着是 10 -> 7，游戏结束。
或者，我们可以移动 3 -> 7, 4 -> 8, 5 -> 9，游戏结束。
注意，我们无法进行 10 -> 2 这样的移动来结束游戏，因为这是不合要求的移动。

```

**示例 3：** 

```
输入：[100,101,104,102,103]
输出：[0,0]
```



**提示：** 

1.  *3 <= stones.length <= 10^4*  
2.  *1 <= stones[i] <= 10^9*  
3.  *stones[i]*  的值各不相同。






# 算法思路

# 测试用例
```
1040. Moving Stones Until Consecutive II 1040. 移动石子直到连续 II Medium
```

[enTitle]: https://leetcode.com/problems/moving-stones-until-consecutive-ii/
[cnTitle]: https://leetcode-cn.com/problems/moving-stones-until-consecutive-ii/
