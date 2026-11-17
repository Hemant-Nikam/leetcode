SELECT customer_number from(
select customer_number , COUNT(*) OVER(partition by customer_number) as cnt from Orders
) as a order by cnt DESC limit 1