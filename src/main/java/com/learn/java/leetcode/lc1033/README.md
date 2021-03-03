# [1033. Moving Stones Until Consecutive][enTitle]

**Easy**

Three stones are on a number line at positions  *a* ,  *b* , and  *c* .

Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone), and move it to an unoccupied position between those endpoints. Formally, let's say the stones are currently at positions  *x, y, z*  with  *x < y < z* . You pick up the stone at either position  *x*  or position  *z* , and move that stone to an integer position  *k* , with  *x < k < z*  and  *k != y* .

The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.

When the game ends, what is the minimum and maximum number of moves that you could have made? Return the answer as an length 2 array:  *answer = [minimum_moves, maximum_moves]* 



**Example 1:** 

```
Input:a = 1, b = 2, c = 5
Output: [1,2]
Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
```


**Example 2:** 

```
Input:a = 4, b = 3, c = 2
Output: [0,0]
Explanation: We cannot make any moves.
```


**Example 3:** 

```
Input:a = 3, b = 5, c = 1
Output: [1,2]
Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
```







**Note:** 

1.  *1 <= a <= 100*  
2.  *1 <= b <= 100*  
3.  *1 <= c <= 100*  
4.  *a != b, b != c, c != a* 













# [1033. 移动石子直到连续][cnTitle]

**简单**

三枚石子放置在数轴上，位置分别为  *a* ， *b* ， *c* 。

每一回合，你可以从两端之一拿起一枚石子（位置最大或最小），并将其放入两端之间的任一空闲位置。形式上，假设这三枚石子当前分别位于位置  *x, y, z*  且  *x < y < z* 。那么就可以从位置  *x*  或者是位置  *z*  拿起一枚石子，并将该石子移动到某一整数位置  *k*  处，其中  *x < k < z*  且  *k != y* 。

当你无法进行任何移动时，即，这些石子的位置连续时，游戏结束。

要使游戏结束，你可以执行的最小和最大移动次数分别是多少？ 以长度为 2 的数组形式返回答案： *answer = [minimum_moves, maximum_moves]* 



**示例 1：** 

```
输入：a = 1, b = 2, c = 5
输出：[1, 2]
解释：将石子从 5 移动到 4 再移动到 3，或者我们可以直接将石子移动到 3。

```

**示例 2：** 

```
输入：a = 4, b = 3, c = 2
输出：[0, 0]
解释：我们无法进行任何移动。

```



**提示：** 

1.  *1 <= a <= 100*  
2.  *1 <= b <= 100*  
3.  *1 <= c <= 100*  
4.  *a != b, b != c, c != a* 




# 算法思路

# 测试用例
```
1033. Moving Stones Until Consecutive 1033. 移动石子直到连续 Easy
```

[enTitle]: https://leetcode.com/problems/moving-stones-until-consecutive/
[cnTitle]: https://leetcode-cn.com/problems/moving-stones-until-consecutive/
