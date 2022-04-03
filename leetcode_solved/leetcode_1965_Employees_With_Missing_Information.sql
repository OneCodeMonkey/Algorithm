# Runtime: 430 ms, faster than 91.26% of MySQL online submissions for Employees With Missing Information.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for Employees With Missing Information.
# Write your MySQL query statement below
select distinct t.employee_id from (select a.employee_id from Employees a left join Salaries b on a.employee_id=b.employee_id where b.salary is null 
union 
select b.employee_id from Employees a right join Salaries b on a.employee_id=b.employee_id where a.name is null) as t order by t.employee_id;