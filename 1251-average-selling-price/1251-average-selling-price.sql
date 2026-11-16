# Write your MySQL query statement below
select a.product_id  , IFNULL(ROUND (SUM(sum1)/SUM(a.units),2),0) as average_price from (
select p.product_id , u.units , u.purchase_date, SUM(p.price * u.units) as sum1
from Prices p LEFT JOIN (select product_id , purchase_date , SUM(units) as units from UnitsSold group by product_id , purchase_date ) as u on p.product_id = u.product_id AND u.purchase_date >= p.start_date AND u.purchase_date <= p.end_date 
group by p.product_id , u.purchase_date 
) as a group by a.product_id;
