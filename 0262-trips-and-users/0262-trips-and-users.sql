# Write your MySQL query statement below
select 
    request_at as Day 
    ,ROUND( SUM(CASE WHEN status = 'completed' then 0 else 1 END)/count(*) , 2) as `Cancellation Rate`
from Trips t
JOIN Users c On t.client_id = c.users_id
JOIN Users d on t.driver_id  = d.users_id
WHERE  c.banned = 'No' AND d.banned = 'No' AND t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY request_at