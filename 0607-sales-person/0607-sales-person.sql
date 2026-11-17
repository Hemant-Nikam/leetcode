# Write your MySQL query statement below
SELECT name from SalesPerson where sales_id NOT IN (
select s.sales_id from
Orders o LEFT JOIN 
SalesPerson s ON o.sales_id = s.sales_id
LEFT JOIN Company c ON o.com_id = c.com_id
where c.name = 'RED')