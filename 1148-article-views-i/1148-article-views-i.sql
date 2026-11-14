# Write your MySQL query statement below
select Distinct author_id as id
FROM Views 
where viewer_id = author_id 
ORDER BY author_id ;