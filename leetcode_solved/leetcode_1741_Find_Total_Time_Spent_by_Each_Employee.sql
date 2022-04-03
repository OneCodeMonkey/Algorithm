-- Runtime: 643 ms, faster than 20.80% of MySQL online submissions for Find Total Time Spent by Each Employee.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Find Total Time Spent by Each Employee.
# Write your MySQL query statement below
select event_day as day, emp_id, sum(out_time - in_time) as total_time from Employees group by emp_id, event_day;