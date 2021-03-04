# [1203. Sort Items by Groups Respecting Dependencies][enTitle]

**Hard**

There are  *n*  items each belonging to zero or one of  *m*  groups where  *group[i]*  is the group that the  *i* -th item belongs to and it's equal to  *-1*  if the  *i* -th item belongs to no group. The items and the groups are zero indexed. A group can have no item belonging to it.

Return a sorted list of the items such that:

- The items that belong to the same group are next to each other in the sorted list. 
- There are some relations between these items where  *beforeItems[i]*  is a list containing all the items that should come before the  *i* -th item in the sorted array (to the left of the  *i* -th item).

Return any solution if there is more than one solution and return an **empty list**  if there is no solution.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2019/09/11/1359_ex1.png)

```
Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
Output: [6,3,4,1,5,2,0,7]

```

**Example 2:** 

```
Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
Output: []
Explanation: This is the same as example 1 except that 4 needs to be before 6 in the sorted list.

```



**Constraints:** 

-  *1 <= m <= n <= 3 * 104*  
-  *group.length == beforeItems.length == n*  
-  *-1 <= group[i] <= m - 1*  
-  *0 <= beforeItems[i].length <= n - 1*  
-  *0 <= beforeItems[i][j] <= n - 1*  
-  *i != beforeItems[i][j]*  
-  *beforeItems[i]* does not contain duplicates elements.


# [1203. 项目管理][cnTitle]

**困难**

有  *n*  个项目，每个项目或者不属于任何小组，或者属于  *m*  个小组之一。 *group[i]*  表示第  *i*  个项目所属的小组，如果第  *i*  个项目不属于任何小组，则  *group[i]*  等于  *-1* 。项目和小组都是从零开始编号的。可能存在小组不负责任何项目，即没有任何项目属于这个小组。

请你帮忙按要求安排这些项目的进度，并返回排序后的项目列表：

- 同一小组的项目，排序后在列表中彼此相邻。 
- 项目之间存在一定的依赖关系，我们用一个列表  *beforeItems*  来表示，其中  *beforeItems[i]*  表示在进行第  *i*  个项目前（位于第  *i*  个项目左侧）应该完成的所有项目。

如果存在多个解决方案，只需要返回其中任意一个即可。如果没有合适的解决方案，就请返回一个 **空列表** 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/09/22/1359_ex1.png)

```
输入：n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
输出：[6,3,4,1,5,2,0,7]

```

**示例 2：** 

```
输入：n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
输出：[]
解释：与示例 1 大致相同，但是在排序后的列表中，4 必须放在 6 的前面。

```



**提示：** 

-  *1 <= m <= n <= 3 * 104*  
-  *group.length == beforeItems.length == n*  
-  *-1 <= group[i] <= m - 1*  
-  *0 <= beforeItems[i].length <= n - 1*  
-  *0 <= beforeItems[i][j] <= n - 1*  
-  *i != beforeItems[i][j]*  
-  *beforeItems[i]*  不含重复元素




# 算法思路

# 测试用例
```
1203. Sort Items by Groups Respecting Dependencies 1203. 项目管理 Hard
```

[enTitle]: https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/
[cnTitle]: https://leetcode-cn.com/problems/sort-items-by-groups-respecting-dependencies/
