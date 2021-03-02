# [435. Non-overlapping Intervals][enTitle]

**Medium**

Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.





Example 1:

```
Input: [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.

```

Example 2:

```
Input: [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of intervals non-overlapping.

```

Example 3:

```
Input: [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.

```



Note:

1. You may assume the interval's end point is always bigger than its start point. 
2. Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.


# [435. 无重叠区间][cnTitle]

**中等**

给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。

**注意:** 

1. 可以认为区间的终点总是大于它的起点。 
2. 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。

**示例 1:** 

```
输入: [ [1,2], [2,3], [3,4], [1,3] ]

输出: 1

解释: 移除 [1,3] 后，剩下的区间没有重叠。

```

**示例 2:** 

```
输入: [ [1,2], [1,2], [1,2] ]

输出: 2

解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。

```

**示例 3:** 

```
输入: [ [1,2], [2,3] ]

输出: 0

解释: 你不需要移除任何区间，因为它们已经是无重叠的了。

```




# 算法思路

# 测试用例
```
435. Non-overlapping Intervals 435. 无重叠区间 Medium
```

[enTitle]: https://leetcode.com/problems/non-overlapping-intervals/
[cnTitle]: https://leetcode-cn.com/problems/non-overlapping-intervals/
