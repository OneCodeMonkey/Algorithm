-- Runtime: 375 ms, faster than 84.29% of MySQL online submissions for Tree Node.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Tree Node.
# Write your MySQL query statement below
select distinct a.id, (case 
              when a.p_id is null then 'Root' 
              when a.p_id is not null and b.id is not null then 'Inner' 
              when b.id is null then 'Leaf' end) as type
from Tree a left join Tree b on a.id=b.p_id;