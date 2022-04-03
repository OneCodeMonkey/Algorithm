-- group_concat()
-- Runtime: 426 ms, faster than 63.70% of MySQL online submissions for Group Sold Products By The Date.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Group Sold Products By The Date.
# Write your MySQL query statement below
select sell_date, count(distinct product) as num_sold, group_concat(distinct product order by product SEPARATOR ',') as products
from Activities group by sell_date order by sell_date;