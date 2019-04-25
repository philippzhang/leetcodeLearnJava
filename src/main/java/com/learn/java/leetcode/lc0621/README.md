# [621. Task Scheduler][enTitle]

**Medium**

Given a char array representing tasks CPU need to do. It contains capital letters A to Z where different letters represent different tasks. Tasks could be done without original order. Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.

However, there is a non-negative cooling interval n that means between two same tasks, there must be at least n intervals that CPU are doing different tasks or just be idle.

You need to return the least number of intervals the CPU will take to finish all the given tasks.



Example:

```
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.

```



Note:

1. The number of tasks is in the range [1, 10000]. 
2. The integer n is in the range [0, 100].
# [621. 任务调度器][cnTitle]

**中等**

给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26 种不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。

然而，两个**相同种类** 的任务之间必须有长度为**n** 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。

你需要计算完成所有任务所需要的**最短时间** 。

**示例 1：** 

```
输入: tasks = ["A","A","A","B","B","B"], n = 2
输出: 8
执行顺序: A -> B -> (待命) -> A -> B -> (待命) -> A -> B.

```

**注：** 

1. 任务的总个数为 [1, 10000]。 
2. n 的取值范围为 [0, 100]。


# 算法思路

# 测试用例
```
621. Task Scheduler 621. 任务调度器 Medium
Solution.leastInterval
---
["A","A","A","B","B","B"]
2

=8
```

[enTitle]: https://leetcode.com/problems/task-scheduler/
[cnTitle]: https://leetcode-cn.com/problems/task-scheduler/
