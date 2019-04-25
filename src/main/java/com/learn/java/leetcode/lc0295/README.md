# [295. Find Median from Data Stream][enTitle]

**Hard**

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

 *[2,3,4]* , the median is  *3* 

 *[2,3]* , the median is  *(2 + 3) / 2 = 2.5* 

Design a data structure that supports the following two operations:

- void addNum(int num) - Add a integer number from the data stream to the data structure. 
- double findMedian() - Return the median of all elements so far.



**Example:** 

```
addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2

```



**Follow up:** 

1. If all integer numbers from the stream are between 0 and 100, how would you optimize it? 
2. If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?
# [295. 数据流的中位数][cnTitle]

**困难**

中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。

例如，

[2,3,4] 的中位数是 3

[2,3] 的中位数是 (2 + 3) / 2 = 2.5

设计一个支持以下两种操作的数据结构：

- void addNum(int num) - 从数据流中添加一个整数到数据结构中。 
- double findMedian() - 返回目前所有元素的中位数。

**示例：** 

```
addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
```

**进阶:** 

1. 如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？ 
2. 如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？


# 算法思路

# 测试用例
```
295. Find Median from Data Stream 295. 数据流的中位数 Hard
Main.funcListTest
---
["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
[[],[1],[2],[],[3],[]]

=[null,null,null,1.5,null,2.0]
---
["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
[[],[-1],[],[-2],[],[-3],[],[-4],[],[-5],[]]

=[null,null,-1.0,null,-1.5,null,-2.0,null,-2.5,null,-3.0]
```

[enTitle]: https://leetcode.com/problems/find-median-from-data-stream/
[cnTitle]: https://leetcode-cn.com/problems/find-median-from-data-stream/
