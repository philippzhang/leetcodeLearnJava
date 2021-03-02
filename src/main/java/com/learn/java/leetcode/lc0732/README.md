# [732. My Calendar III][enTitle]

**Hard**

A  *k* -booking happens when  *k*  events have some non-empty intersection (i.e., there is some time that is common to all  *k*  events.)

You are given some events  *[start, end)* , after each given event, return an integer  *k*  representing the maximum  *k* -booking between all the previous events.

Implement the  *MyCalendarThree*  class:

-  *MyCalendarThree()*  Initializes the object. 
-  *int book(int start, int end)*  Returns an integer  *k*  representing the largest integer such that there exists a  *k* -booking in the calendar.



**Example 1:** 

```
Input
["MyCalendarThree", "book", "book", "book", "book", "book", "book"]
[[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
Output
[null, 1, 1, 2, 3, 3, 3]

Explanation
MyCalendarThree myCalendarThree = new MyCalendarThree();
myCalendarThree.book(10, 20); // return 1, The first event can be booked and is disjoint, so the maximum k-booking is a 1-booking.
myCalendarThree.book(50, 60); // return 1, The second event can be booked and is disjoint, so the maximum k-booking is a 1-booking.
myCalendarThree.book(10, 40); // return 2, The third event [10, 40) intersects the first event, and the maximum k-booking is a 2-booking.
myCalendarThree.book(5, 15); // return 3, The remaining events cause the maximum K-booking to be only a 3-booking.
myCalendarThree.book(5, 10); // return 3
myCalendarThree.book(25, 55); // return 3

```



**Constraints:** 

-  *0 <= start < end <= 109*  
- At most  *400*  calls will be made to  *book* .


# [732. 我的日程安排表 III][cnTitle]

**困难**

当  *k*  个日程安排有一些时间上的交叉时（例如  *k*  个日程安排都在同一时间内），就会产生  *k*  次预订。

给你一些日程安排  *[start, end)*  ，请你在每个日程安排添加后，返回一个整数  *k*  ，表示所有先前日程安排会产生的最大  *k*  次预订。

实现一个  *MyCalendarThree*  类来存放你的日程安排，你可以一直添加新的日程安排。

-  *MyCalendarThree()*  初始化对象。 
-  *int book(int start, int end)*  返回一个整数  *k*  ，表示日历中存在的  *k*  次预订的最大值。



**示例：** 

```
输入：
["MyCalendarThree", "book", "book", "book", "book", "book", "book"]
[[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
输出：
[null, 1, 1, 2, 3, 3, 3]

解释：
MyCalendarThree myCalendarThree = new MyCalendarThree();
myCalendarThree.book(10, 20); // 返回 1 ，第一个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
myCalendarThree.book(50, 60); // 返回 1 ，第二个日程安排可以预订并且不存在相交，所以最大 k 次预订是 1 次预订。
myCalendarThree.book(10, 40); // 返回 2 ，第三个日程安排 [10, 40) 与第一个日程安排相交，所以最大 k 次预订是 2 次预订。
myCalendarThree.book(5, 15); // 返回 3 ，剩下的日程安排的最大 k 次预订是 3 次预订。
myCalendarThree.book(5, 10); // 返回 3
myCalendarThree.book(25, 55); // 返回 3

```



**提示：** 

-  *0 <= start < end <= 109*  
- 每个测试用例，调用  *book*  函数最多不超过  *400* 次




# 算法思路

# 测试用例
```
732. My Calendar III 732. 我的日程安排表 III Hard
```

[enTitle]: https://leetcode.com/problems/my-calendar-iii/
[cnTitle]: https://leetcode-cn.com/problems/my-calendar-iii/
