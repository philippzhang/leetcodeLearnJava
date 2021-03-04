# [1288. Remove Covered Intervals][enTitle]

**Medium**

Given a list of  *intervals* , remove all intervals that are covered by another interval in the list.

Interval  *[a,b)*  is covered by interval  *[c,d)*  if and only if  *c <= a*  and  *b <= d* .

After doing so, return  *the number of remaining intervals* .



**Example 1:** 

```
Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation:Interval [3,6] is covered by [2,8], therefore it is removed.

```

**Example 2:** 

```
Input: intervals = [[1,4],[2,3]]
Output: 1

```

**Example 3:** 

```
Input: intervals = [[0,10],[5,12]]
Output: 2

```

**Example 4:** 

```
Input: intervals = [[3,10],[4,10],[5,11]]
Output: 2

```

**Example 5:** 

```
Input: intervals = [[1,2],[1,4],[3,4]]
Output: 1

```



**Constraints:** 

-  *1 <= intervals.length <= 1000*  
-  *intervals[i].length == 2*  
-  *0 <= intervals[i][0] < intervals[i][1] <= 10^5*  
- All the intervals are **unique** .


# [1288. 删除被覆盖区间][cnTitle]

**中等**

给你一个区间列表，请你删除列表中被其他区间所覆盖的区间。

只有当  *c <= a*  且  *b <= d*  时，我们才认为区间  *[a,b)*  被区间  *[c,d)*  覆盖。

在完成所有删除操作后，请你返回列表中剩余区间的数目。



**示例：** 

```
输入：intervals = [[1,4],[3,6],[2,8]]
输出：2
解释：区间 [3,6] 被区间 [2,8] 覆盖，所以它被删除了。

```



**提示：** ​​​​​​

-  *1 <= intervals.length <= 1000*  
-  *0 <= intervals[i][0] < intervals[i][1] <= 10^5*  
- 对于所有的  *i != j* ： *intervals[i] != intervals[j]* 




# 算法思路

# 测试用例
```
1288. Remove Covered Intervals 1288. 删除被覆盖区间 Medium
```

[enTitle]: https://leetcode.com/problems/remove-covered-intervals/
[cnTitle]: https://leetcode-cn.com/problems/remove-covered-intervals/
