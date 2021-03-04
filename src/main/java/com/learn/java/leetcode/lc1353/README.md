# [1353. Maximum Number of Events That Can Be Attended][enTitle]

**Medium**

Given an array of  *events*  where  *events[i] = [startDayi, endDayi]* . Every event  *i*  starts at  *startDayi* <sub> </sub>and ends at  *endDayi* .

You can attend an event  *i*  at any day  *d*  where  *startTimei <= d <= endTimei* . Notice that you can only attend one event at any time  *d* .

Return  *the maximum number of events* you can attend.



**Example 1:** 

![img](https://assets.leetcode.com/uploads/2020/02/05/e1.png)

```
Input: events = [[1,2],[2,3],[3,4]]
Output: 3
Explanation: You can attend all the three events.
One way to attend them all is as shown.
Attend the first event on day 1.
Attend the second event on day 2.
Attend the third event on day 3.

```

**Example 2:** 

```
Input: events= [[1,2],[2,3],[3,4],[1,2]]
Output: 4

```

**Example 3:** 

```
Input: events = [[1,4],[4,4],[2,2],[3,4],[1,1]]
Output: 4

```

**Example 4:** 

```
Input: events = [[1,100000]]
Output: 1

```

**Example 5:** 

```
Input: events = [[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]]
Output: 7

```



**Constraints:** 

-  *1 <= events.length <= 105*  
-  *events[i].length == 2*  
-  *1 <= startDayi <= endDayi <= 105* 


# [1353. 最多可以参加的会议数目][cnTitle]

**中等**

给你一个数组  *events* ，其中  *events[i] = [startDayi, endDayi]*  ，表示会议  *i*  开始于  *startDayi*  ，结束于  *endDayi*  。

你可以在满足  *startDayi <= d <= endDayi* <sub> </sub>中的任意一天  *d*  参加会议  *i*  。注意，一天只能参加一个会议。

请你返回你可以参加的 **最大** 会议数目。



**示例 1：** 

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2020/02/16/e1.png)

```
输入：events = [[1,2],[2,3],[3,4]]
输出：3
解释：你可以参加所有的三个会议。
安排会议的一种方案如上图。
第 1 天参加第一个会议。
第 2 天参加第二个会议。
第 3 天参加第三个会议。

```

**示例 2：** 

```
输入：events= [[1,2],[2,3],[3,4],[1,2]]
输出：4

```

**示例 3：** 

```
输入：events = [[1,4],[4,4],[2,2],[3,4],[1,1]]
输出：4

```

**示例 4：** 

```
输入：events = [[1,100000]]
输出：1

```

**示例 5：** 

```
输入：events = [[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]]
输出：7

```



**提示：** 

-  *1 <= events.length <= 10^5*  
-  *events[i].length == 2*  
-  *1 <= events[i][0] <= events[i][1] <= 10^5* 




# 算法思路

# 测试用例
```
1353. Maximum Number of Events That Can Be Attended 1353. 最多可以参加的会议数目 Medium
```

[enTitle]: https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/
[cnTitle]: https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended/
