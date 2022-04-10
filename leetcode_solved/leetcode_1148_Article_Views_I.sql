-- Runtime: 345 ms, faster than 95.47% of MySQL online submissions for Article Views I.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Article Views I.
# Write your MySQL query statement below
select distinct author_id as id from Views where author_id = viewer_id order by author_id;