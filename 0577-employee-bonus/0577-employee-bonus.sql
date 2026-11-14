# Write your MySQL query statement below
select e.name ,b.bonus 
FROM Employee e LEFT JOIN Bonus b ON e.empId = b.empId
where b.bonus IS NULL or b.bonus < 1000 ;