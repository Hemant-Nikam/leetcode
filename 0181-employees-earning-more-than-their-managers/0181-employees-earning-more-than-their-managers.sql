# Write your MySQL query statement below

select e.name AS Employee from Employee e JOIN Employee f ON f.id = e.managerId where e.salary > f.salary;