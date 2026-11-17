# Write your MySQL query statement below
select Department, Employee , Salary from
(select d.name as Department ,e.name as Employee , salary as Salary ,  DENSE_RANK() OVER(Partition By departmentId order by salary DESC) as rank_num from Employee e LEFT JOIN Department d ON departmentId = d.id) as a where rank_num <= 3