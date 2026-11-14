# Write your MySQL query statement below
select tweet_id 
FROM Tweets
where char_length(content) > 15 ;