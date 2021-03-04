# [1335. Minimum Difficulty of a Job Schedule][enTitle]

**Hard**

You want to schedule a list of jobs in  *d*  days. Jobs are dependent (i.e To work on the  *i-th*  job, you have to finish all the jobs  *j*  where  *0 <= j < i* ).

You have to finish **at least**  one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the  *d*  days. The difficulty of a day is the maximum difficulty of a job done in that day.

Given an array of integers  *jobDifficulty*  and an integer  *d* . The difficulty of the  *i-th*  job is  *jobDifficulty[i]* .

Return  *the minimum difficulty*  of a job schedule. If you cannot find a schedule for the jobs return **-1** .



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/01/16/untitled.png)

```
Input: jobDifficulty = [6,5,4,3,2,1], d = 2
Output: 7
Explanation: First day you can finish the first 5 jobs, total difficulty = 6.
Second day you can finish the last job, total difficulty = 1.
The difficulty of the schedule = 6 + 1 = 7 

```

**Example 2:** 

```
Input: jobDifficulty = [9,9,9], d = 4
Output: -1
Explanation: If you finish a job per day you will still have a free day. you cannot find a schedule for the given jobs.

```

**Example 3:** 

```
Input: jobDifficulty = [1,1,1], d = 3
Output: 3
Explanation: The schedule is one job per day. total difficulty will be 3.

```

**Example 4:** 

```
Input: jobDifficulty = [7,1,7,1,7,1], d = 3
Output: 15

```

**Example 5:** 

```
Input: jobDifficulty = [11,111,22,222,33,333,44,444], d = 6
Output: 843

```



**Constraints:** 

-  *1 <= jobDifficulty.length <= 300*  
-  *0 <= jobDifficulty[i] <= 1000*  
-  *1 <= d <= 10* 


# [1335. 工作计划的最低难度][cnTitle]

**困难**

你需要制定一份  *d*  天的工作计划表。工作之间存在依赖，要想执行第  *i*  项工作，你必须完成全部  *j*  项工作（  *0 <= j < i* ）。

你每天 **至少**  需要完成一项任务。工作计划的总难度是这  *d*  天每一天的难度之和，而一天的工作难度是当天应该完成工作的最大难度。

给你一个整数数组  *jobDifficulty*  和一个整数  *d* ，分别代表工作难度和需要计划的天数。第  *i*  项工作的难度是  *jobDifficulty[i]* 。

返回整个工作计划的 **最小难度**  。如果无法制定工作计划，则返回 **-1** 。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/01/26/untitled.png)

```
输入：jobDifficulty = [6,5,4,3,2,1], d = 2
输出：7
解释：第一天，您可以完成前 5 项工作，总难度 = 6.
第二天，您可以完成最后一项工作，总难度 = 1.
计划表的难度 = 6 + 1 = 7 

```

**示例 2：** 

```
输入：jobDifficulty = [9,9,9], d = 4
输出：-1
解释：就算你每天完成一项工作，仍然有一天是空闲的，你无法制定一份能够满足既定工作时间的计划表。

```

**示例 3：** 

```
输入：jobDifficulty = [1,1,1], d = 3
输出：3
解释：工作计划为每天一项工作，总难度为 3 。

```

**示例 4：** 

```
输入：jobDifficulty = [7,1,7,1,7,1], d = 3
输出：15

```

**示例 5：** 

```
输入：jobDifficulty = [11,111,22,222,33,333,44,444], d = 6
输出：843

```



**提示：** 

-  *1 <= jobDifficulty.length <= 300*  
-  *0 <= jobDifficulty[i] <= 1000*  
-  *1 <= d <= 10* 




# 算法思路

# 测试用例
```
1335. Minimum Difficulty of a Job Schedule 1335. 工作计划的最低难度 Hard
```

[enTitle]: https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
[cnTitle]: https://leetcode-cn.com/problems/minimum-difficulty-of-a-job-schedule/
