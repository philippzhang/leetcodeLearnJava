# [1000. Minimum Cost to Merge Stones][enTitle]

**Hard**

There are  *N*  piles of stones arranged in a row. The  *i* -th pile has  *stones[i]*  stones.

A  *move*  consists of merging **exactly K consecutive**  piles into one pile, and the cost of this move is equal to the total number of stones in these  *K*  piles.

Find the minimum cost to merge all piles of stones into one pile. If it is impossible, return  *-1* .




**Example 1:** 

```
Input:stones = [3,2,4,1], K = 2
Output: 20
Explanation: 
We start with [3, 2, 4, 1].
We merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].
We merge [4, 1] for a cost of 5, and we are left with [5, 5].
We merge [5, 5] for a cost of 10, and we are left with [10].
The total cost was 20, and this is the minimum possible.
```


**Example 2:** 

```
Input:stones = [3,2,4,1], K = 3
Output: -1
Explanation: After any merge operation, there are 2 piles left, and we can't merge anymore.  So the task is impossible.
```


**Example 3:** 

```
Input:stones = [3,5,1,2,6], K = 3
Output: 25
Explanation: 
We start with [3, 5, 1, 2, 6].
We merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].
We merge [3, 8, 6] for a cost of 17, and we are left with [17].
The total cost was 25, and this is the minimum possible.
```



**Note:** 

-  *1 <= stones.length <= 30*  
-  *2 <= K <= 30*  
-  *1 <= stones[i] <= 100* 








# [1000. 合并石头的最低成本][cnTitle]

**困难**

有  *N*  堆石头排成一排，第  *i*  堆中有  *stones[i]*  块石头。

每次 *移动（move）* 需要将**连续的**   *K*  堆石头合并为一堆，而这个移动的成本为这  *K*  堆石头的总数。

找出把所有石头合并成一堆的最低成本。如果不可能，返回  *-1*  。



**示例 1：** 

```
输入：stones = [3,2,4,1], K = 2
输出：20
解释：
从 [3, 2, 4, 1] 开始。
合并 [3, 2]，成本为 5，剩下 [5, 4, 1]。
合并 [4, 1]，成本为 5，剩下 [5, 5]。
合并 [5, 5]，成本为 10，剩下 [10]。
总成本 20，这是可能的最小值。

```

**示例 2：** 

```
输入：stones = [3,2,4,1], K = 3
输出：-1
解释：任何合并操作后，都会剩下 2 堆，我们无法再进行合并。所以这项任务是不可能完成的。.

```

**示例 3：** 

```
输入：stones = [3,5,1,2,6], K = 3
输出：25
解释：
从 [3, 5, 1, 2, 6] 开始。
合并 [5, 1, 2]，成本为 8，剩下 [3, 8, 6]。
合并 [3, 8, 6]，成本为 17，剩下 [17]。
总成本 25，这是可能的最小值。

```



**提示：** 

-  *1 <= stones.length <= 30*  
-  *2 <= K <= 30*  
-  *1 <= stones[i] <= 100* 




# 算法思路

# 测试用例
```
1000. Minimum Cost to Merge Stones 1000. 合并石头的最低成本 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-cost-to-merge-stones/
[cnTitle]: https://leetcode-cn.com/problems/minimum-cost-to-merge-stones/
