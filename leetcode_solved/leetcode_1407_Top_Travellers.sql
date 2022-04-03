-- Runtime: 668 ms, faster than 74.71% of MySQL online submissions for Top Travellers.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Top Travellers.
# Write your MySQL query statement below
select a.name,sum(case when b.distance is null then 0 else b.distance end) as travelled_distance from Users a left join Rides b on a.id=b.user_id group by a.name order by travelled_distance desc,a.name;