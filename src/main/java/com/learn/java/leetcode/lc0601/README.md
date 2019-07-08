# [601. Human Traffic of Stadium][enTitle]

**Hard**

SQL Schema 



X city built a new stadium, each day many people visit it and the stats are saved as these columns: id, **visit_** date, people

Please write a query to display the records which have 3 or more consecutive rows and the amount of people more than 100(inclusive).


```
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 1    | 2017-01-01 | 10        |
| 2    | 2017-01-02 | 109       |
| 3    | 2017-01-03 | 150       |
| 4    | 2017-01-04 | 99        |
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+

```

For the sample data above, the output is:

```
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+

```

Note: Each day only have one row record, and the dates are increasing with id increasing.


# [601. 体育馆的人流量][cnTitle]

**困难**

SQL架构 



X 市建了一个新的体育馆，每日人流量信息被记录在这三列信息中：**序号**  (id)、**日期**  (visit_date)、 **人流量**  (people)。

请编写一个查询语句，找出人流量的高峰期。高峰期时，至少连续三行记录中的人流量不少于100。

例如，表  *stadium* ：

```
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 1    | 2017-01-01 | 10        |
| 2    | 2017-01-02 | 109       |
| 3    | 2017-01-03 | 150       |
| 4    | 2017-01-04 | 99        |
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+

```

对于上面的示例数据，输出为：

```
+------+------------+-----------+
| id   | visit_date | people    |
+------+------------+-----------+
| 5    | 2017-01-05 | 145       |
| 6    | 2017-01-06 | 1455      |
| 7    | 2017-01-07 | 199       |
| 8    | 2017-01-08 | 188       |
+------+------------+-----------+

```



**提示：**  每天只有一行记录，日期随着 id 的增加而增加。




# 算法思路

# 测试用例
```
601. Human Traffic of Stadium 601. 体育馆的人流量 Hard
Main.runSql
---
["run","select"]
["create.sql","main.sql"]
```

[enTitle]: https://leetcode.com/problems/human-traffic-of-stadium/
[cnTitle]: https://leetcode-cn.com/problems/human-traffic-of-stadium/
