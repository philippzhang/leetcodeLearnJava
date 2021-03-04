# [1642. Furthest Building You Can Reach][enTitle]

**Medium**

You are given an integer array  *heights*  representing the heights of buildings, some  *bricks* , and some  *ladders* .

You start your journey from building  *0*  and move to the next building by possibly using bricks or ladders.

While moving from building  *i*  to building  *i+1*  (**0-indexed** ),

- If the current building's height is **greater than or equal**  to the next building's height, you do **not**  need a ladder or bricks. 
- If the current building's height is less than the next building's height, you can either use **one ladder**  or  *(h[i+1] - h[i])*  **bricks** .

 *Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.* 



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/10/27/q4.gif)

```
Input: heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
Output: 4
Explanation: Starting at building 0, you can follow these steps:
- Go to building 1 without using ladders nor bricks since 4 >= 2.
- Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
- Go to building 3 without using ladders nor bricks since 7 >= 6.
- Go to building 4 using your only ladder. You must use either bricks or ladders because 6 < 9.
It is impossible to go beyond building 4 because you do not have any more bricks or ladders.

```

**Example 2:** 

```
Input: heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
Output: 7

```

**Example 3:** 

```
Input: heights = [14,3,19,3], bricks = 17, ladders = 0
Output: 3

```



**Constraints:** 

-  *1 <= heights.length <= 105*  
-  *1 <= heights[i] <= 106*  
-  *0 <= bricks <= 109*  
-  *0 <= ladders <= heights.length* 


# [1642. 可以到达的最远建筑][cnTitle]

**中等**

给你一个整数数组  *heights*  ，表示建筑物的高度。另有一些砖块  *bricks*  和梯子  *ladders*  。

你从建筑物  *0*  开始旅程，不断向后面的建筑物移动，期间可能会用到砖块或梯子。

当从建筑物  *i*  移动到建筑物  *i+1* （下标**从 0 开始** ）时：

- 如果当前建筑物的高度 **大于或等于**  下一建筑物的高度，则不需要梯子或砖块 
- 如果当前建筑的高度 **小于**  下一个建筑的高度，您可以使用 **一架梯子**  或 **(h[i+1] - h[i]) 个砖块** 




**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/10/31/q4.gif)

```
输入：heights = [4,2,7,6,9,14,12], bricks = 5, ladders = 1
输出：4
解释：从建筑物 0 出发，你可以按此方案完成旅程：
- 不使用砖块或梯子到达建筑物 1 ，因为 4 >= 2
- 使用 5 个砖块到达建筑物 2 。你必须使用砖块或梯子，因为 2 < 7
- 不使用砖块或梯子到达建筑物 3 ，因为 7 >= 6
- 使用唯一的梯子到达建筑物 4 。你必须使用砖块或梯子，因为 6 < 9
无法越过建筑物 4 ，因为没有更多砖块或梯子。

```

**示例 2：** 

```
输入：heights = [4,12,2,7,3,18,20,3,19], bricks = 10, ladders = 2
输出：7

```

**示例 3：** 

```
输入：heights = [14,3,19,3], bricks = 17, ladders = 0
输出：3

```



**提示：** 

-  *1 <= heights.length <= 105*  
-  *1 <= heights[i] <= 106*  
-  *0 <= bricks <= 109*  
-  *0 <= ladders <= heights.length* 




# 算法思路

# 测试用例
```
1642. Furthest Building You Can Reach 1642. 可以到达的最远建筑 Medium
```

[enTitle]: https://leetcode.com/problems/furthest-building-you-can-reach/
[cnTitle]: https://leetcode-cn.com/problems/furthest-building-you-can-reach/
