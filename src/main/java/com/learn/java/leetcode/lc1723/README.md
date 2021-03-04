# [1723. Find Minimum Time to Finish All Jobs][enTitle]

**Hard**

You are given an integer array  *jobs* , where  *jobs[i]*  is the amount of time it takes to complete the  *ith*  job.

There are  *k*  workers that you can assign jobs to. Each job should be assigned to **exactly**  one worker. The **working time**  of a worker is the sum of the time it takes to complete all jobs assigned to them. Your goal is to devise an optimal assignment such that the **maximum working time**  of any worker is **minimized** .

 *Return the minimum possible maximum working time of any assignment.* 



**Example 1:** 

```
Input: jobs = [3,2,3], k = 3
Output: 3
Explanation: By assigning each person one job, the maximum time is 3.

```

**Example 2:** 

```
Input: jobs = [1,2,4,7,8], k = 2
Output: 11
Explanation: Assign the jobs the following way:
Worker 1: 1, 2, 8 (working time = 1 + 2 + 8 = 11)
Worker 2: 4, 7 (working time = 4 + 7 = 11)
The maximum working time is 11.
```



**Constraints:** 

-  *1 <= k <= jobs.length <= 12*  
-  *1 <= jobs[i] <= 107* 


# [1723. 完成所有工作的最短时间][cnTitle]

**困难**

给你一个整数数组  *jobs*  ，其中  *jobs[i]*  是完成第  *i*  项工作要花费的时间。

请你将这些工作分配给  *k*  位工人。所有工作都应该分配给工人，且每项工作只能分配给一位工人。工人的 **工作时间**  是完成分配给他们的所有工作花费时间的总和。请你设计一套最佳的工作分配方案，使工人的 **最大工作时间**  得以 **最小化**  。

返回分配方案中尽可能 **最小**  的 **最大工作时间**  。



**示例 1：** 

```
输入：jobs = [3,2,3], k = 3
输出：3
解释：给每位工人分配一项工作，最大工作时间是 3 。

```

**示例 2：** 

```
输入：jobs = [1,2,4,7,8], k = 2
输出：11
解释：按下述方式分配工作：
1 号工人：1、2、8（工作时间 = 1 + 2 + 8 = 11）
2 号工人：4、7（工作时间 = 4 + 7 = 11）
最大工作时间是 11 。
```



**提示：** 

-  *1 <= k <= jobs.length <= 12*  
-  *1 <= jobs[i] <= 107* 




# 算法思路

# 测试用例
```
1723. Find Minimum Time to Finish All Jobs 1723. 完成所有工作的最短时间 Hard
```

[enTitle]: https://leetcode.com/problems/find-minimum-time-to-finish-all-jobs/
[cnTitle]: https://leetcode-cn.com/problems/find-minimum-time-to-finish-all-jobs/
