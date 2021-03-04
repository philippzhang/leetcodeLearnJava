# [1743. Restore the Array From Adjacent Pairs][enTitle]

**Medium**

There is an integer array  *nums*  that consists of  *n*  **unique** elements, but you have forgotten it. However, you do remember every pair of adjacent elements in  *nums* .

You are given a 2D integer array  *adjacentPairs*  of size  *n - 1*  where each  *adjacentPairs[i] = [ui, vi]*  indicates that the elements  *ui*  and  *vi*  are adjacent in  *nums* .

It is guaranteed that every adjacent pair of elements  *nums[i]*  and  *nums[i+1]*  will exist in  *adjacentPairs* , either as  *[nums[i], nums[i+1]]*  or  *[nums[i+1], nums[i]]* . The pairs can appear **in any order** .

Return  *the original array*  *nums*  *. If there are multiple solutions, return any of them* .



**Example 1:** 

```
Input: adjacentPairs = [[2,1],[3,4],[3,2]]
Output: [1,2,3,4]
Explanation: This array has all its adjacent pairs in adjacentPairs.
Notice that adjacentPairs[i] may not be in left-to-right order.

```

**Example 2:** 

```
Input: adjacentPairs = [[4,-2],[1,4],[-3,1]]
Output: [-2,4,1,-3]
Explanation: There can be negative numbers.
Another solution is [-3,1,4,-2], which would also be accepted.

```

**Example 3:** 

```
Input: adjacentPairs = [[100000,-100000]]
Output: [100000,-100000]

```



**Constraints:** 

-  *nums.length == n*  
-  *adjacentPairs.length == n - 1*  
-  *adjacentPairs[i].length == 2*  
-  *2 <= n <= 105*  
-  *-105 <= nums[i], ui, vi <= 105*  
- There exists some  *nums*  that has  *adjacentPairs*  as its pairs.


# [1743. 从相邻元素对还原数组][cnTitle]

**中等**

存在一个由  *n*  个不同元素组成的整数数组  *nums*  ，但你已经记不清具体内容。好在你还记得  *nums*  中的每一对相邻元素。

给你一个二维整数数组  *adjacentPairs*  ，大小为  *n - 1*  ，其中每个  *adjacentPairs[i] = [ui, vi]*  表示元素  *ui*  和  *vi*  在  *nums*  中相邻。

题目数据保证所有由元素  *nums[i]*  和  *nums[i+1]*  组成的相邻元素对都存在于  *adjacentPairs*  中，存在形式可能是  *[nums[i], nums[i+1]]*  ，也可能是  *[nums[i+1], nums[i]]*  。这些相邻元素对可以 **按任意顺序**  出现。

返回 **原始数组**  *nums* 。如果存在多种解答，返回 **其中任意一个**  即可。



**示例 1：** 

```
输入：adjacentPairs = [[2,1],[3,4],[3,2]]
输出：[1,2,3,4]
解释：数组的所有相邻元素对都在 adjacentPairs 中。
特别要注意的是，adjacentPairs[i] 只表示两个元素相邻，并不保证其 左-右 顺序。

```

**示例 2：** 

```
输入：adjacentPairs = [[4,-2],[1,4],[-3,1]]
输出：[-2,4,1,-3]
解释：数组中可能存在负数。
另一种解答是 [-3,1,4,-2] ，也会被视作正确答案。

```

**示例 3：** 

```
输入：adjacentPairs = [[100000,-100000]]
输出：[100000,-100000]

```



**提示：** 

-  *nums.length == n*  
-  *adjacentPairs.length == n - 1*  
-  *adjacentPairs[i].length == 2*  
-  *2 <= n <= 105*  
-  *-105 <= nums[i], ui, vi <= 105*  
- 题目数据保证存在一些以  *adjacentPairs*  作为元素对的数组  *nums* 




# 算法思路

# 测试用例
```
1743. Restore the Array From Adjacent Pairs 1743. 从相邻元素对还原数组 Medium
```

[enTitle]: https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
[cnTitle]: https://leetcode-cn.com/problems/restore-the-array-from-adjacent-pairs/
