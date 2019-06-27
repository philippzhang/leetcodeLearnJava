# [196. Delete Duplicate Emails][enTitle]

**Easy**

Write a SQL query to **delete**  all duplicate email entries in a table named  *Person* , keeping only unique emails based on its smallest Id.

```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Id is the primary key column for this table.

```

For example, after running your query, the above  *Person*  table should have the following rows:

```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+

```

**Note:** 

Your output is the whole  *Person*  table after executing your sql. Use  *delete*  statement.


# [196. 删除重复的电子邮箱][cnTitle]

**简单**

编写一个 SQL 查询，来删除  *Person*  表中所有重复的电子邮箱，重复的邮箱里只保留 **Id**  *最小* 的那个。

```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Id 是这个表的主键。

```

例如，在运行你的查询语句之后，上面的  *Person*  表应返回以下几行:

```
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+

```




# 算法思路

# 测试用例
```
196. Delete Duplicate Emails 196. 删除重复的电子邮箱 Easy
Main.runSql
---
["run","select","run","select"]
["create.sql","test.sql","main.sql","test.sql"]
```

[enTitle]: https://leetcode.com/problems/delete-duplicate-emails/
[cnTitle]: https://leetcode-cn.com/problems/delete-duplicate-emails/
