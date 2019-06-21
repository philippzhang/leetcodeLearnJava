CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct a.Salary from Employee a order by  a.Salary desc limit N,1
  );
END