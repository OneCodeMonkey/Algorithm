-- Runtime: 611 ms, faster than 34.38% of MySQL online submissions for Find Followers Count.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Find Followers Count.
# Write your MySQL query statement below
select user_id, count(follower_id) as followers_count from Followers group by user_id order by user_id;