# [207. Course Schedule][enTitle]

**Medium**

There are a total of n courses you have to take, labeled from  *0*  to  *n-1* .

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair:  *[0,1]* 

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

**Example 1:** 

```
Input: 2, [[1,0]] 
Output:true
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0. So it is possible.
```

**Example 2:** 

```
Input: 2, [[1,0],[0,1]]
Output:false
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.

```

Note:

1. The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented. 
2. You may assume that there are no duplicate edges in the input prerequisites.
# [207. 课程表][cnTitle]

**中等**

现在你总共有  *n*  门课需要选，记为  *0*  到  *n-1* 。

在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们:  *[0,1]* 

给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？

**示例 1:** 

```
输入: 2, [[1,0]] 
输出:true
解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
```

**示例 2:** 

```
输入: 2, [[1,0],[0,1]]
输出:false
解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。
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
207. Course Schedule 207. 课程表 Medium
Solution.canFinish
Solution.canFinish2
---
2
[[1,0]]

=true
---
2
[[1,0],[0,1]]

=false
```

[enTitle]: https://leetcode.com/problems/course-schedule/
[cnTitle]: https://leetcode-cn.com/problems/course-schedule/
