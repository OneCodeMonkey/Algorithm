-- Runtime: 458 ms, faster than 66.69% of MySQL online submissions for Find Customer Referee.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Find Customer Referee.
# Write your MySQL query statement below
select name from Customer where referee_id is null or referee_id != 2;