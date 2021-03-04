# [1140. Stone Game II][enTitle]

**Medium**

Alice and Bob continue their games with piles of stones. There are a number of piles **arranged in a row** , and each pile has a positive integer number of stones  *piles[i]* . The objective of the game is to end with the most stones.

Alice and Bob take turns, with Alice starting first. Initially,  *M = 1* .

On each player's turn, that player can take **all the stones**  in the **first**   *X*  remaining piles, where  *1 <= X <= 2M* . Then, we set  *M = max(M, X)* .

The game continues until all the stones have been taken.

Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.



**Example 1:** 

```
Input: piles = [2,7,9,4,4]
Output: 10
Explanation:  If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 piles in total. If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice get 2 + 7 = 9 piles in total. So we return 10 since it's larger. 

```

**Example 2:** 

```
Input: piles = [1,2,3,4,5,100]
Output: 104

```



**Constraints:** 

-  *1 <= piles.length <= 100*  
-  *1 <= piles[i] <= 104* 


# [1140. 石子游戏 II][cnTitle]

**中等**

亚历克斯和李继续他们的石子游戏。许多堆石子 **排成一行** ，每堆都有正整数颗石子  *piles[i]* 。游戏以谁手中的石子最多来决出胜负。

亚历克斯和李轮流进行，亚历克斯先开始。最初， *M = 1* 。

在每个玩家的回合中，该玩家可以拿走剩下的 **前**   *X*  堆的所有石子，其中  *1 <= X <= 2M* 。然后，令  *M = max(M, X)* 。

游戏一直持续到所有石子都被拿走。

假设亚历克斯和李都发挥出最佳水平，返回亚历克斯可以得到的最大数量的石头。



**示例：** 

```
输入：piles = [2,7,9,4,4]
输出：10
解释：如果亚历克斯在开始时拿走一堆石子，李拿走两堆，接着亚历克斯也拿走两堆。在这种情况下，亚历克斯可以拿到 2 + 4 + 4 = 10 颗石子。 
如果亚历克斯在开始时拿走两堆石子，那么李就可以拿走剩下全部三堆石子。在这种情况下，亚历克斯可以拿到 2 + 7 = 9 颗石子。
所以我们返回更大的 10。 

```



**提示：** 

-  *1 <= piles.length <= 100*  
-  *1 <= piles[i] <= 10 ^ 4* 




# 算法思路

# 测试用例
```
1140. Stone Game II 1140. 石子游戏 II Medium
```

[enTitle]: https://leetcode.com/problems/stone-game-ii/
[cnTitle]: https://leetcode-cn.com/problems/stone-game-ii/
