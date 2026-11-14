select  a.student_id , a.student_name , a.subject_name ,IFNULL(b.attended_exams,0) as attended_exams
from 
(select * from 
Students s CROSS JOIN Subjects sb ) as a
LEFT JOIN
(select * ,count(*) as attended_exams from Examinations group by student_id , subject_name ) as b
ON a.student_id = b.student_id  AND a.subject_name  = b.subject_name 
order by a.student_id, a.subject_name;