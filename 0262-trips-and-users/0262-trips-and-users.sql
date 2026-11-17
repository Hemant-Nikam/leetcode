# Write your MySQL query statement below
select 
    request_at as Day 
    ,ROUND( SUM(CASE WHEN status = 'completed' then 0 else 1 END)/count(*) , 2) as `Cancellation Rate`
from Trips 
where client_id Not In (select users_id from Users where banned = 'Yes') 
AND driver_id NOT IN (select users_id from Users where banned = 'Yes')
AND request_at IN ('2013-10-01', '2013-10-02', '2013-10-03')
GROUP BY request_at