# [1109. Corporate Flight Bookings][enTitle]

**Medium**

There are  *n*  flights that are labeled from  *1*  to  *n* .

You are given an array of flight bookings  *bookings* , where  *bookings[i] = [firsti, lasti, seatsi]*  represents a booking for flights  *firsti*  through  *lasti*  (**inclusive** ) with  *seatsi*  seats reserved for **each flight**  in the range.

Return  *an array*  *answer*  *of length*  *n*  *, where*  *answer[i]*  *is the total number of seats reserved for flight*  *i* .



**Example 1:** 

```
Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
Output: [10,55,45,25,25]
Explanation:
Flight labels:        1   2   3   4   5
Booking 1 reserved:  10  10
Booking 2 reserved:      20  20
Booking 3 reserved:      25  25  25  25
Total seats:         10  55  45  25  25
Hence, answer = [10,55,45,25,25]

```

**Example 2:** 

```
Input: bookings = [[1,2,10],[2,2,15]], n = 2
Output: [10,25]
Explanation:
Flight labels:        1   2
Booking 1 reserved:  10  10
Booking 2 reserved:      15
Total seats:         10  25
Hence, answer = [10,25]


```



**Constraints:** 

-  *1 <= n <= 2 * 104*  
-  *1 <= bookings.length <= 2 * 104*  
-  *bookings[i].length == 3*  
-  *1 <= firsti <= lasti <= n*  
-  *1 <= seatsi <= 104* 


# [1109. 航班预订统计][cnTitle]

**中等**

这里有  *n*  个航班，它们分别从  *1*  到  *n*  进行编号。

有一份航班预订表  *bookings*  ，表中第  *i*  条预订记录  *bookings[i] = [firsti, lasti, seatsi]*  意味着在从  *firsti*  到  *lasti*  （**包含**   *firsti*  和  *lasti*  ）的 **每个航班**  上预订了  *seatsi*  个座位。

请你返回一个长度为  *n*  的数组  *answer* ，其中  *answer[i]*  是航班  *i*  上预订的座位总数。



**示例 1：** 

```
输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
输出：[10,55,45,25,25]
解释：
航班编号        1   2   3   4   5
预订记录 1 ：   10  10
预订记录 2 ：       20  20
预订记录 3 ：       25  25  25  25
总座位数：      10  55  45  25  25
因此，answer = [10,55,45,25,25]

```

**示例 2：** 

```
输入：bookings = [[1,2,10],[2,2,15]], n = 2
输出：[10,25]
解释：
航班编号        1   2
预订记录 1 ：   10  10
预订记录 2 ：       15
总座位数：      10  25
因此，answer = [10,25]

```



**提示：** 

-  *1 <= n <= 2 * 104*  
-  *1 <= bookings.length <= 2 * 104*  
-  *bookings[i].length == 3*  
-  *1 <= firsti <= lasti <= n*  
-  *1 <= seatsi <= 104* 




# 算法思路

# 测试用例
```
1109. Corporate Flight Bookings 1109. 航班预订统计 Medium
```

[enTitle]: https://leetcode.com/problems/corporate-flight-bookings/
[cnTitle]: https://leetcode-cn.com/problems/corporate-flight-bookings/
