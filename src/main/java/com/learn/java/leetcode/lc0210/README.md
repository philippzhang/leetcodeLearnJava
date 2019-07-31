# [210. Course Schedule II][enTitle]

**Medium**

There are a total of  *n*  courses you have to take, labeled from  *0*  to  *n-1* .

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair:  *[0,1]* 

Given the total number of courses and a list of prerequisite **pairs** , return the ordering of courses you should take to finish all courses.

There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

**Example 1:** 

```
Input: 2, [[1,0]] 
Output:[0,1]
Explanation: There are a total of 2 courses to take. To take course 1 you should have finished   
             course 0. So the correct course order is [0,1] .
```

**Example 2:** 

```
Input: 4, [[1,0],[2,0],[3,1],[3,2]]
Output:[0,1,2,3] or [0,2,1,3]
Explanation: There are a total of 4 courses to take. To take course 3 you should have finished both     
             courses 1 and 2. Both courses 1 and 2 should be taken after you finished course 0. 
             So one correct course order is [0,1,2,3]. Another correct ordering is [0,2,1,3] .
```

**Note:** 

1. The input prerequisites is a graph represented by **a list of edges** , not adjacency matrices. Read more about how a graph is represented. 
2. You may assume that there are no duplicate edges in the input prerequisites.


# [210. 课程表 II][cnTitle]

**中等**

现在你总共有  *n*  门课需要选，记为  *0*  到  *n-1* 。

在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们:  *[0,1]* 

给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。

可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。

**示例 1:** 

```
输入: 2, [[1,0]] 
输出:[0,1]
解释: 总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
```

**示例 2:** 

```
输入: 4, [[1,0],[2,0],[3,1],[3,2]]
输出:[0,1,2,3] or [0,2,1,3]
解释: 总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
     因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。

```

**说明:** 

1. 输入的先决条件是由**边缘列表** 表示的图形，而不是邻接矩阵。详情请参见图的表示法。 
2. 你可以假定输入的先决条件中没有重复的边。

**提示:** 

1. 这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。 
2. 通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。 
3.  拓扑排序也可以通过 BFS 完成。 




# 算法思路

# 测试用例
```
210. Course Schedule II 210. 课程表 II Medium
Solution.findOrder
---
2
[[1,0]] 

=[0,1]
---
4
[[1,0],[2,0],[3,1],[3,2]]

=[0,1,2,3]
=[0,2,1,3]
```

[enTitle]: https://leetcode.com/problems/course-schedule-ii/
[cnTitle]: https://leetcode-cn.com/problems/course-schedule-ii/
