# [855. Exam Room][enTitle]

**Medium**

In an exam room, there are  *N*  seats in a single row, numbered  *0, 1, 2, ..., N-1* .

When a student enters the room, they must sit in the seat that maximizes the distance to the closest person. If there are multiple such seats, they sit in the seat with the lowest number. (Also, if no one is in the room, then the student sits at seat number 0.)

Return a class  *ExamRoom(int N)*  that exposes two functions:  *ExamRoom.seat()*  returning an  *int*  representing what seat the student sat in, and  *ExamRoom.leave(int p)*  representing that the student in seat number  *p*  now leaves the room. It is guaranteed that any calls to  *ExamRoom.leave(p)*  have a student sitting in seat  *p* .



**Example 1:** 

```
Input:["ExamRoom","seat","seat","seat","seat","leave","seat"], [[10],[],[],[],[],[4],[]]
Output: [null,0,9,4,2,null,5]
Explanation:
ExamRoom(10) -> null
seat() -> 0, no one is in the room, then the student sits at seat number 0.
seat() -> 9, the student sits at the last seat number 9.
seat() -> 4, the student sits at the last seat number 4.
seat() -> 2, the student sits at the last seat number 2.
leave(4) -> null
seat() -> 5, the student sits at the last seat number 5.
```

​​​​​​​

**Note:** 

1.  *1 <= N <= 10^9*  
2.  *ExamRoom.seat()*  and  *ExamRoom.leave()*  will be called at most  *10^4*  times across all test cases. 
3. Calls to  *ExamRoom.leave(p)*  are guaranteed to have a student currently sitting in seat number  *p* .


# [855. 考场就座][cnTitle]

**中等**

在考场里，一排有  *N*  个座位，分别编号为  *0, 1, 2, ..., N-1*  。

当学生进入考场后，他必须坐在能够使他与离他最近的人之间的距离达到最大化的座位上。如果有多个这样的座位，他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在 0 号座位上。)

返回  *ExamRoom(int N)*  类，它有两个公开的函数：其中，函数  *ExamRoom.seat()*  会返回一个  *int*  （整型数据），代表学生坐的位置；函数  *ExamRoom.leave(int p)*  代表坐在座位  *p*  上的学生现在离开了考场。每次调用  *ExamRoom.leave(p)*  时都保证有学生坐在座位  *p*  上。



**示例：** 

```
输入：["ExamRoom","seat","seat","seat","seat","leave","seat"], [[10],[],[],[],[],[4],[]]
输出：[null,0,9,4,2,null,5]
解释：
ExamRoom(10) -> null
seat() -> 0，没有人在考场里，那么学生坐在 0 号座位上。
seat() -> 9，学生最后坐在 9 号座位上。
seat() -> 4，学生最后坐在 4 号座位上。
seat() -> 2，学生最后坐在 2 号座位上。
leave(4) -> null
seat() -> 5，学生最后坐在 5 号座位上。

```



**提示：** 

1.  *1 <= N <= 10^9*  
2. 在所有的测试样例中  *ExamRoom.seat()*  和  *ExamRoom.leave()*  最多被调用  *10^4*  次。 
3. 保证在调用  *ExamRoom.leave(p)*  时有学生正坐在座位  *p*  上。




# 算法思路

# 测试用例
```
855. Exam Room 855. 考场就座 Medium
```

[enTitle]: https://leetcode.com/problems/exam-room/
[cnTitle]: https://leetcode-cn.com/problems/exam-room/
