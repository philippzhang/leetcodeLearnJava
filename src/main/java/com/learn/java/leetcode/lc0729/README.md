# [729. My Calendar I][enTitle]

**Medium**

Implement a  *MyCalendar*  class to store your events. A new event can be added if adding the event will not cause a double booking.

Your class will have the method,  *book(int start, int end)* . Formally, this represents a booking on the half open interval  *[start, end)* , the range of real numbers  *x*  such that  *start <= x < end* .

A double booking happens when two events have some non-empty intersection (ie., there is some time that is common to both events.)

For each call to the method  *MyCalendar.book* , return  *true*  if the event can be added to the calendar successfully without causing a double booking. Otherwise, return  *false*  and do not add the event to the calendar.



Example 1:

```
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(15, 25); // returns false
MyCalendar.book(20, 30); // returns true
Explanation: 
The first event can be booked.  The second can't because time 15 is already booked by another event.
The third event can be booked, as the first event takes every time less than 20, but not including 20.

```



Note:

- The number of calls to  *MyCalendar.book*  per test case will be at most  *1000* . 
- In calls to  *MyCalendar.book(start, end)* ,  *start*  and  *end*  are integers in the range  *[0, 10^9]* .




# [729. 我的日程安排表 I][cnTitle]

**中等**

实现一个  *MyCalendar*  类来存放你的日程安排。如果要添加的时间内没有其他安排，则可以存储这个新的日程安排。

 *MyCalendar*  有一个  *book(int start, int end)* 方法。它意味着在 start 到 end 时间内增加一个日程安排，注意，这里的时间是半开区间，即  *[start, end)* , 实数  *x*  的范围为，  *start <= x < end* 。

当两个日程安排有一些时间上的交叉时（例如两个日程安排都在同一时间内），就会产生重复预订。

每次调用  *MyCalendar.book* 方法时，如果可以将日程安排成功添加到日历中而不会导致重复预订，返回  *true* 。否则，返回  *false*  并且不要将该日程安排添加到日历中。

请按照以下步骤调用  *MyCalendar*  类:  *MyCalendar cal = new MyCalendar();*   *MyCalendar.book(start, end)* 

**示例 1:** 

```
MyCalendar();
MyCalendar.book(10, 20); // returns true
MyCalendar.book(15, 25); // returns false
MyCalendar.book(20, 30); // returns true
解释: 
第一个日程安排可以添加到日历中.  第二个日程安排不能添加到日历中，因为时间 15 已经被第一个日程安排预定了。
第三个日程安排可以添加到日历中，因为第一个日程安排并不包含时间 20 。

```

**说明:** 

- 每个测试用例，调用  *MyCalendar.book*  函数最多不超过  *100* 次。 
- 调用函数  *MyCalendar.book(start, end)* 时，  *start*  和  *end*  的取值范围为  *[0, 10^9]* 。




# 算法思路

# 测试用例
```
729. My Calendar I 729. 我的日程安排表 I Medium
```

[enTitle]: https://leetcode.com/problems/my-calendar-i/
[cnTitle]: https://leetcode-cn.com/problems/my-calendar-i/
