# Write your MySQL query statement below

select a1.machine_id , ROUND(AVG(a2.timestamp - a1.timestamp ) ,3) AS processing_time 
FROM Activity a1 join Activity a2 on a1.machine_id = a2.machine_id
where a1.process_id = a2.process_id AND a1.activity_type = "start" And a2.activity_type = "end"
group by a1.machine_id