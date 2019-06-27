# [197. Rising Temperature][enTitle]

**Easy**

SQL Schema 



Given a  *Weather*  table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

```
+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+

```

For example, return the following Ids for the above  *Weather*  table:

```
+----+
| Id |
+----+
|  2 |
|  4 |
+----+

```


# [197. 上升的温度][cnTitle]

**简单**

SQL架构 



给定一个  *Weather*  表，编写一个 SQL 查询，来查找与之前（昨天的）日期相比温度更高的所有日期的 Id。

```
+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
```

例如，根据上述给定的  *Weather*  表格，返回如下 Id:

```
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
```




# 算法思路

# 测试用例
```
197. Rising Temperature 197. 上升的温度 Easy
Main.runSql
---
["run","select"]
["create.sql","main.sql"]
```

[enTitle]: https://leetcode.com/problems/rising-temperature/
[cnTitle]: https://leetcode-cn.com/problems/rising-temperature/
