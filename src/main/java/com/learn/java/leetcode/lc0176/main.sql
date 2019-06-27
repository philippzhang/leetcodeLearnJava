# Write your MySQL query statement below
select distinct IFNULL((select distinct Salary from Employee order by Salary desc limit 1,1),Null) as SecondHighestSalary from Employee