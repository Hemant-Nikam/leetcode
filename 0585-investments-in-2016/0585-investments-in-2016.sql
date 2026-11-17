# Write your MySQL query statement below
select ROUND(SUM(tiv_2016),2) as tiv_2016 from (
    select * , COUNT(*) OVER ( partition by lat , lon ) as pos ,COUNT(tiv_2015) OVER ( partition by tiv_2015 ) as cnt from Insurance 
) as a where cnt > 1 AND pos = 1