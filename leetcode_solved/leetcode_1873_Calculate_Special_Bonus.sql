-- Runtime: 509 ms, faster than 81.83% of MySQL online submissions for Calculate Special Bonus.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Calculate Special Bonus.
# Write your MySQL query statement below
select employee_id, if(employee_id % 2 = 1 and name not like "M%", salary, 0) as bonus from Employees;