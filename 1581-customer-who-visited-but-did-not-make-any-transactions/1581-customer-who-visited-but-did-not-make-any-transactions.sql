# Write your MySQL query statement below
select customer_id ,count(*) as count_no_trans
FROM Visits 
where visit_id NOT IN (select DISTINCT visit_id FROM Transactions)
group by customer_id order by count(*);