# [1462. Course Schedule IV][enTitle]

**Medium**

There are a total of  *n*  courses you have to take, labeled from  *0*  to  *n-1* .

Some courses may have direct prerequisites, for example, to take course 0 you have first to take course 1, which is expressed as a pair:  *[1,0]* 

Given the total number of courses  *n* , a list of direct  *prerequisite*  **pairs**  and a list of  *queries*  **pairs** .

You should answer for each  *queries[i]*  whether the course  *queries[i][0]*  is a prerequisite of the course  *queries[i][1]*  or not.

Return  *a list of boolean* , the answers to the given  *queries* .

Please note that if course **a**  is a prerequisite of course **b**  and course **b**  is a prerequisite of course **c** , then, course **a**  is a prerequisite of course **c** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/04/17/graph.png)

```
Input: n = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
Output: [false,true]
Explanation: course 0 is not a prerequisite of course 1 but the opposite is true.

```

**Example 2:** 

```
Input: n = 2, prerequisites = [], queries = [[1,0],[0,1]]
Output: [false,false]
Explanation: There are no prerequisites and each course is independent.

```

**Example 3:** 

![img](https://assets.leetcode.com/uploads/2020/04/17/graph-1.png)

```
Input: n = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
Output: [true,true]

```

**Example 4:** 

```
Input: n = 3, prerequisites = [[1,0],[2,0]], queries = [[0,1],[2,0]]
Output: [false,true]

```

**Example 5:** 

```
Input: n = 5, prerequisites = [[0,1],[1,2],[2,3],[3,4]], queries = [[0,4],[4,0],[1,3],[3,0]]
Output: [true,false,true,false]

```



**Constraints:** 

-  *2 <= n <= 100*  
-  *0 <= prerequisite.length <= (n * (n - 1) / 2)*  
-  *0 <= prerequisite[i][0], prerequisite[i][1] < n*  
-  *prerequisite[i][0] != prerequisite[i][1]*  
- The prerequisites graph has no cycles. 
- The prerequisites graph has no repeated edges. 
-  *1 <= queries.length <= 10^4*  
-  *queries[i][0] != queries[i][1]* 


# [1462. 课程表 IV][cnTitle]

**中等**

你总共需要上  *n*  门课，课程编号依次为  *0*  到  *n-1*  。

有的课会有直接的先修课程，比如如果想上课程 0 ，你必须先上课程 1 ，那么会以  *[1,0]*  数对的形式给出先修课程数对。

给你课程总数  *n*  和一个直接先修课程数对列表  *prerequisite*  和一个查询对列表  *queries*  。

对于每个查询对  *queries[i]*  ，请判断  *queries[i][0]*  是否是  *queries[i][1]*  的先修课程。

请返回一个布尔值列表，列表中每个元素依次分别对应  *queries*  每个查询对的判断结果。

**注意：** 如果课程 **a**  是课程 **b**  的先修课程且课程 **b**  是课程 **c**  的先修课程，那么课程 **a**  也是课程 **c**  的先修课程。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/30/graph.png)

```
输入：n = 2, prerequisites = [[1,0]], queries = [[0,1],[1,0]]
输出：[false,true]
解释：课程 0 不是课程 1 的先修课程，但课程 1 是课程 0 的先修课程。

```

**示例 2：** 

```
输入：n = 2, prerequisites = [], queries = [[1,0],[0,1]]
输出：[false,false]
解释：没有先修课程对，所以每门课程之间是独立的。

```

**示例 3：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/05/30/graph-1.png)

```
输入：n = 3, prerequisites = [[1,2],[1,0],[2,0]], queries = [[1,0],[1,2]]
输出：[true,true]

```

**示例 4：** 

```
输入：n = 3, prerequisites = [[1,0],[2,0]], queries = [[0,1],[2,0]]
输出：[false,true]

```

**示例 5：** 

```
输入：n = 5, prerequisites = [[0,1],[1,2],[2,3],[3,4]], queries = [[0,4],[4,0],[1,3],[3,0]]
输出：[true,false,true,false]

```



**提示：** 

-  *2 <= n <= 100*  
-  *0 <= prerequisite.length <= (n * (n - 1) / 2)*  
-  *0 <= prerequisite[i][0], prerequisite[i][1] < n*  
-  *prerequisite[i][0] != prerequisite[i][1]*  
- 先修课程图中没有环。 
- 先修课程图中没有重复的边。 
-  *1 <= queries.length <= 10^4*  
-  *queries[i][0] != queries[i][1]* 




# 算法思路

# 测试用例
```
1462. Course Schedule IV 1462. 课程表 IV Medium
```

[enTitle]: https://leetcode.com/problems/course-schedule-iv/
[cnTitle]: https://leetcode-cn.com/problems/course-schedule-iv/
