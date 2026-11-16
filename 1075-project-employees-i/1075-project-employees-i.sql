# Write your MySQL query statement below
select p.project_id  ,ROUND( SUM(experience_years)/count(*), 2) as average_years 
from Project p LEFT JOIN Employee e on p.employee_id = e.employee_id group by project_id;