-- Runtime: 529 ms, faster than 91.25% of MySQL online submissions for Fix Names in a Table.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Fix Names in a Table.
# Write your MySQL query statement below
select user_id, concat(upper(substring(name, 1, 1)), lower(substring(name, 2, length(name) - 1))) as name from Users order by user_id;