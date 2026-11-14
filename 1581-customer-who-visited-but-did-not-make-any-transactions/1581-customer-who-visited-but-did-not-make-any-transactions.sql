# Write your MySQL query statement below
select customer_id ,count(*) as count_no_trans
FROM Visits v LEFT JOIN Transactions t ON v.visit_id = t.visit_id
where transaction_id IS NULL
group by customer_id order by count(*);