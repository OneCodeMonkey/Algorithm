# Runtime: 693 ms, faster than 35.69% of MySQL online submissions for The Latest Login in 2020.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for The Latest Login in 2020.
# Write your MySQL query statement below
select user_id, max(time_stamp) as last_stamp from Logins where time_stamp >= '2020-01-01 00:00:00' and time_stamp < '2021-01-01 00:00:00' group by user_id;