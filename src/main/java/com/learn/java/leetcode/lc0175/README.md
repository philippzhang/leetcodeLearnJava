# [175. Combine Two Tables][enTitle]

**Easy**

SQL Schema 



Table:  *Person* 

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.

```

Table:  *Address* 

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.

```



Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

```
FirstName, LastName, City, State

```


# [175. 组合两个表][cnTitle]

**简单**

SQL架构 



表1:  *Person* 

```
+-------------+---------+
| 列名         | 类型     |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId 是上表主键

```

表2:  *Address* 

```
+-------------+---------+
| 列名         | 类型    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId 是上表主键

```



编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息：



```
FirstName, LastName, City, State

```




# 算法思路

# 测试用例
```
175. Combine Two Tables 175. 组合两个表 Easy
Main.runSql
---
["run","select"]
["create.sql","main.sql"]
```

[enTitle]: https://leetcode.com/problems/combine-two-tables/
[cnTitle]: https://leetcode-cn.com/problems/combine-two-tables/
