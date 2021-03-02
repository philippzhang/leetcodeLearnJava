# [436. Find Right Interval][enTitle]

**Medium**

You are given an array of  *intervals* , where  *intervals[i] = [starti, endi]*  and each  *starti*  is **unique** .

The **r** **ight** **interval**  for an interval  *i*  is an interval  *j*  such that  *startj*  *>= endi*  and  *startj*  is **minimized** .

Return  *an array of right interval indices for each interval i* . If no **right interval**  exists for interval  *i* , then put  *-1*  at index  *i* .



**Example 1:** 

```
Input: intervals = [[1,2]]
Output: [-1]
Explanation: There is only one interval in the collection, so it outputs -1.

```

**Example 2:** 


<pre><strong>Input:</strong> intervals = [[3,4],[2,3],[1,2]]
<strong>Output:</strong> [-1,0,1]
<strong>Explanation:</strong> There is no right interval for [3,4].
The right interval for [2,3] is [3,4] since start<sub>0</sub> = 3 is the smallest start that is >= end<sub>1</sub> = 3.
The right interval for [1,2] is [2,3] since start<sub>1</sub> = 2 is the smallest start that is >= end<sub>2</sub> = 2.
</pre>

**Example 3:** 


<pre><strong>Input:</strong> intervals = [[1,4],[2,3],[3,4]]
<strong>Output:</strong> [-1,2,-1]
<strong>Explanation:</strong> There is no right interval for [1,4] and [3,4].
The right interval for [2,3] is [3,4] since start<sub>2</sub> = 3 is the smallest start that is >= end<sub>1</sub> = 3.
</pre>



**Constraints:** 

-  *1 <= intervals.length <= 2 * 104*  
-  *intervals[i].length == 2*  
-  *-106 <= starti <= endi <= 106*  
- The start point of each interval is **unique** .


# [436. 寻找右区间][cnTitle]

**中等**

给你一个区间数组  *intervals*  ，其中  *intervals[i] = [starti, endi]*  ，且每个  *starti*  都 **不同**  。

区间  *i*  的 **右侧区间**  可以记作区间  *j*  ，并满足  *startj*  *>= endi*  ，且  *startj*  **最小化** 。

返回一个由每个区间  *i*  的 **右侧区间**  的最小起始位置组成的数组。如果某个区间  *i*  不存在对应的 **右侧区间**  ，则下标  *i*  处的值设为  *-1*  。

**示例 1：** 

```
输入：intervals = [[1,2]]
输出：[-1]
解释：集合中只有一个区间，所以输出-1。

```

**示例 2：** 

```
输入：intervals = [[3,4],[2,3],[1,2]]
输出：[-1, 0, 1]
解释：对于 [3,4] ，没有满足条件的“右侧”区间。
对于 [2,3] ，区间[3,4]具有最小的“右”起点;
对于 [1,2] ，区间[2,3]具有最小的“右”起点。

```

**示例 3：** 

```
输入：intervals = [[1,4],[2,3],[3,4]]
输出：[-1, 2, -1]
解释：对于区间 [1,4] 和 [3,4] ，没有满足条件的“右侧”区间。
对于 [2,3] ，区间 [3,4] 有最小的“右”起点。

```



**提示：** 

-  *1 <= intervals.length <= 2 * 104*  
-  *intervals[i].length == 2*  
-  *-106 <= starti <= endi <= 106*  
- 每个间隔的起点都 **不相同** 




# 算法思路

# 测试用例
```
436. Find Right Interval 436. 寻找右区间 Medium
```

[enTitle]: https://leetcode.com/problems/find-right-interval/
[cnTitle]: https://leetcode-cn.com/problems/find-right-interval/
