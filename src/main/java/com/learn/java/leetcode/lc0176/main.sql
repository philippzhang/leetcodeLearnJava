drop table Employee
Create table Employee (Id int, Salary int)
Truncate table Employee
insert into Employee (Id, Salary) values (1, 100)
insert into Employee (Id, Salary) values (2, 200)
insert into Employee (Id, Salary) values (3, 300)
#mysql
#select distinct IFNULL((select distinct Salary from Employee order by Salary desc limit 1,1),Null) as SecondHighestSalary from Employee
#SELECT IFNULL(max(Salary),Null) as SecondHighestSalary FROM Employee WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employee)
SELECT max(Salary) as SecondHighestSalary FROM Employee WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employee)