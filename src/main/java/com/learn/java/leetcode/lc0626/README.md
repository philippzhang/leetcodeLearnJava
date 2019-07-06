# [626. Exchange Seats][enTitle]

**Medium**

SQL Schema 



Mary is a teacher in a middle school and she has a table  *seat*  storing students' names and their corresponding seat ids.








```
+---------+---------+
|    id   | student |
+---------+---------+
|    1    | Abbot   |
|    2    | Doris   |
|    3    | Emerson |
|    4    | Green   |
|    5    | Jeames  |
+---------+---------+

```



```
+---------+---------+
|    id   | student |
+---------+---------+
|    1    | Doris   |
|    2    | Abbot   |
|    3    | Green   |
|    4    | Emerson |
|    5    | Jeames  |
+---------+---------+

```

Note: If the number of students is odd, there is no need to change the last one's seat.


# [626. 换座位][cnTitle]

**中等**

SQL架构 



小美是一所中学的信息科技老师，她有一张  *seat*  座位表，平时用来储存学生名字和与他们相对应的座位 id。

其中纵列的 **id** 是连续递增的

小美想改变相邻俩学生的座位。

你能不能帮她写一个 SQL query 来输出小美想要的结果呢？



**示例：** 

```
+---------+---------+
|    id   | student |
+---------+---------+
|    1    | Abbot   |
|    2    | Doris   |
|    3    | Emerson |
|    4    | Green   |
|    5    | Jeames  |
+---------+---------+

```

假如数据输入的是上表，则输出结果如下：

```
+---------+---------+
|    id   | student |
+---------+---------+
|    1    | Doris   |
|    2    | Abbot   |
|    3    | Green   |
|    4    | Emerson |
|    5    | Jeames  |
+---------+---------+
```

**注意：** 

如果学生人数是奇数，则不需要改变最后一个同学的座位。




# 算法思路

# 测试用例
```
626. Exchange Seats 626. 换座位 Medium
```

[enTitle]: https://leetcode.com/problems/exchange-seats/
[cnTitle]: https://leetcode-cn.com/problems/exchange-seats/
