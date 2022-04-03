-- Runtime: 635 ms, faster than 30.75% of MySQL online submissions for Game Play Analysis I.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Game Play Analysis I.
# Write your MySQL query statement below
select player_id, min(event_date) as first_login from Activity group by player_id;