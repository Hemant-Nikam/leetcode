# Write your MySQL query statement below
SELECT DISTINCT class from (
select class , count(*) OVER(partition by class) as cnt from Courses
)as a where cnt >= 5