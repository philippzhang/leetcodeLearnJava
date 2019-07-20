# [1124. Longest Well-Performing Interval][enTitle]

**Medium**

We are given  *hours* , a list of the number of hours worked per day for a given employee.

A day is considered to be a  *tiring day*  if and only if the number of hours worked is (strictly) greater than  *8* .

A  *well-performing interval*  is an interval of days for which the number of tiring days is strictly larger than the number of non-tiring days.

Return the length of the longest well-performing interval.



**Example 1:** 

```
Input: hours = [9,9,6,0,6,6,9]
Output: 3
Explanation:The longest well-performing interval is [9,9,6].
```



**Constraints:** 

-  *1 <= hours.length <= 10000*  
-  *0 <= hours[i] <= 16* 


# [1124. 表现良好的最长时间段][cnTitle]

**中等**

给你一份工作时间表  *hours* ，上面记录着某一位员工每天的工作小时数。

我们认为当员工一天中的工作小时数大于  *8*  小时的时候，那么这一天就是「**劳累的一天** 」。

所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格**大于** 「不劳累的天数」。

请你返回「表现良好时间段」的最大长度。



**示例 1：** 

```
输入：hours = [9,9,6,0,6,6,9]
输出：3
解释：最长的表现良好时间段是 [9,9,6]。
```



**提示：** 

-  *1 <= hours.length <= 10000*  
-  *0 <= hours[i] <= 16* 




# 算法思路

# 测试用例
```
1124. Longest Well-Performing Interval 1124. 表现良好的最长时间段 Medium
Solution.longestWPI
---
[9,9,6,0,6,6,9]

=3
```

[enTitle]: https://leetcode.com/problems/longest-well-performing-interval/
[cnTitle]: https://leetcode-cn.com/problems/longest-well-performing-interval/
