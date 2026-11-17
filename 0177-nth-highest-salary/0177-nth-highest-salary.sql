CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT salary  as `getNthHighestSalary(2)` from(
        select * , DENSE_RANK() OVER(order By salary DESC) as rank_num from Employee ) as a where rank_num = N
  );
END