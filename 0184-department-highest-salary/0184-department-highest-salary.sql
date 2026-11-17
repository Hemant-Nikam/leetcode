# Write your MySQL query statement below
select a.name as Department , e.name as Employee , msal as Salary FROM
(select departmentId, d.name , MAX(salary) as msal from Employee JOIN Department d  ON departmentId = d.id group by departmentId ) as a
JOIN Employee e ON a.departmentId = e.departmentId AND msal = e.salary