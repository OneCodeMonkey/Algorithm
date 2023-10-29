# Notice: the char length also contains spaces.
# Write your MySQL query statement below
select tweet_id from Tweets where length(content) > 15;