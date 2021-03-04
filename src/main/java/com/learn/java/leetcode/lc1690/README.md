# [1690. Stone Game VII][enTitle]

**Medium**

Alice and Bob take turns playing a game, with **Alice starting first** .

There are  *n*  stones arranged in a row. On each player's turn, they can **remove**  either the leftmost stone or the rightmost stone from the row and receive points equal to the **sum**  of the remaining stones' values in the row. The winner is the one with the higher score when there are no stones left to remove.

Bob found that he will always lose this game (poor Bob, he always loses), so he decided to **minimize the score's difference** . Alice's goal is to **maximize the difference**  in the score.

Given an array of integers  *stones*  where  *stones[i]*  represents the value of the  *ith*  stone **from the left** , return  *the difference in Alice and Bob's score if they both play optimally.* 



**Example 1:** 

```
Input: stones = [5,3,1,4,2]
Output: 6
Explanation: 
- Alice removes 2 and gets 5 + 3 + 1 + 4 = 13 points. Alice = 13, Bob = 0, stones = [5,3,1,4].
- Bob removes 5 and gets 3 + 1 + 4 = 8 points. Alice = 13, Bob = 8, stones = [3,1,4].
- Alice removes 3 and gets 1 + 4 = 5 points. Alice = 18, Bob = 8, stones = [1,4].
- Bob removes 1 and gets 4 points. Alice = 18, Bob = 12, stones = [4].
- Alice removes 4 and gets 0 points. Alice = 18, Bob = 12, stones = [].
The score difference is 18 - 12 = 6.

```

**Example 2:** 

```
Input: stones = [7,90,5,1,100,10,10,2]
Output: 122
```



**Constraints:** 

-  *n == stones.length*  
-  *2 <= n <= 1000*  
-  *1 <= stones[i] <= 1000* 


# [1690. 石子游戏 VII][cnTitle]

**中等**

石子游戏中，爱丽丝和鲍勃轮流进行自己的回合，**爱丽丝先开始**  。

有  *n*  块石子排成一排。每个玩家的回合中，可以从行中 **移除**  最左边的石头或最右边的石头，并获得与该行中剩余石头值之 **和**  相等的得分。当没有石头可移除时，得分较高者获胜。

鲍勃发现他总是输掉游戏（可怜的鲍勃，他总是输），所以他决定尽力 **减小得分的差值**  。爱丽丝的目标是最大限度地 **扩大得分的差值**  。

给你一个整数数组  *stones*  ，其中  *stones[i]*  表示 **从左边开始**  的第  *i*  个石头的值，如果爱丽丝和鲍勃都 **发挥出最佳水平**  ，请返回他们 **得分的差值**  。



**示例 1：** 

```
输入：stones = [5,3,1,4,2]
输出：6
解释：
- 爱丽丝移除 2 ，得分 5 + 3 + 1 + 4 = 13 。游戏情况：爱丽丝 = 13 ，鲍勃 = 0 ，石子 = [5,3,1,4] 。
- 鲍勃移除 5 ，得分 3 + 1 + 4 = 8 。游戏情况：爱丽丝 = 13 ，鲍勃 = 8 ，石子 = [3,1,4] 。
- 爱丽丝移除 3 ，得分 1 + 4 = 5 。游戏情况：爱丽丝 = 18 ，鲍勃 = 8 ，石子 = [1,4] 。
- 鲍勃移除 1 ，得分 4 。游戏情况：爱丽丝 = 18 ，鲍勃 = 12 ，石子 = [4] 。
- 爱丽丝移除 4 ，得分 0 。游戏情况：爱丽丝 = 18 ，鲍勃 = 12 ，石子 = [] 。
得分的差值 18 - 12 = 6 。

```

**示例 2：** 

```
输入：stones = [7,90,5,1,100,10,10,2]
输出：122
```



**提示：** 

-  *n == stones.length*  
-  *2 <= n <= 1000*  
-  *1 <= stones[i] <= 1000* 




# 算法思路

# 测试用例
```
1690. Stone Game VII 1690. 石子游戏 VII Medium
```

[enTitle]: https://leetcode.com/problems/stone-game-vii/
[cnTitle]: https://leetcode-cn.com/problems/stone-game-vii/
