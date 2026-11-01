# Write your MySQL query statement below
delete from Person where id NOT IN (select id from(select id ,ROW_NUMBER() OVER( Partition BY email order by id) as num from Person) as temp1 where num = 1) ;