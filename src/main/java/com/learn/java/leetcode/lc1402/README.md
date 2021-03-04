# [1402. Reducing Dishes][enTitle]

**Hard**

A chef has collected data on the  *satisfaction*  level of his  *n*  dishes. Chef can cook any dish in 1 unit of time.

 *Like-time coefficient*  of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e.  *time[i]* * *satisfaction[i]* 

Return the maximum sum of  *Like-time coefficient* that the chef can obtain after dishes preparation.

Dishes can be prepared in **any** order and the chef can discard some dishes to get this maximum value.



**Example 1:** 

```
Input: satisfaction = [-1,-8,0,5,-9]
Output: 14
Explanation:After Removing the second and last dish, the maximum total Like-time coefficient will be equal to (-1*1 + 0*2 + 5*3 = 14). Each dish is prepared in one unit of time.
```

**Example 2:** 

```
Input: satisfaction = [4,3,2]
Output: 20
Explanation: Dishes can be prepared in any order, (2*1 + 3*2 + 4*3 = 20)

```

**Example 3:** 

```
Input: satisfaction = [-1,-4,-5]
Output: 0
Explanation: People don't like the dishes. No dish is prepared.

```

**Example 4:** 

```
Input: satisfaction = [-2,5,-1,0,3,-3]
Output: 35

```



**Constraints:** 

-  *n == satisfaction.length*  
-  *1 <= n <= 500*  
-  *-10^3 <= satisfaction[i] <= 10^3* 


# [1402. 做菜顺序][cnTitle]

**困难**

一个厨师收集了他  *n*  道菜的满意程度  *satisfaction*  ，这个厨师做出每道菜的时间都是 1 单位时间。

一道菜的 「喜爱时间」系数定义为烹饪这道菜以及之前每道菜所花费的时间乘以这道菜的满意程度，也就是  *time[i]* * *satisfaction[i]*  。

请你返回做完所有菜 「喜爱时间」总和的最大值为多少。

你可以按 **任意**  顺序安排做菜的顺序，你也可以选择放弃做某些菜来获得更大的总和。



**示例 1：** 

```
输入：satisfaction = [-1,-8,0,5,-9]
输出：14
解释：去掉第二道和最后一道菜，最大的喜爱时间系数和为 (-1*1 + 0*2 + 5*3 = 14) 。每道菜都需要花费 1 单位时间完成。
```

**示例 2：** 

```
输入：satisfaction = [4,3,2]
输出：20
解释：按照原来顺序相反的时间做菜 (2*1 + 3*2 + 4*3 = 20)

```

**示例 3：** 

```
输入：satisfaction = [-1,-4,-5]
输出：0
解释：大家都不喜欢这些菜，所以不做任何菜可以获得最大的喜爱时间系数。

```

**示例 4：** 

```
输入：satisfaction = [-2,5,-1,0,3,-3]
输出：35

```



**提示：** 

-  *n == satisfaction.length*  
-  *1 <= n <= 500*  
-  *-10^3 <= satisfaction[i] <= 10^3* 




# 算法思路

# 测试用例
```
1402. Reducing Dishes 1402. 做菜顺序 Hard
```

[enTitle]: https://leetcode.com/problems/reducing-dishes/
[cnTitle]: https://leetcode-cn.com/problems/reducing-dishes/
