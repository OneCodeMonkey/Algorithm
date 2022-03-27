# Write your MySQL query statement below
-- Runtime: 535 ms, faster than 49.98% of MySQL online submissions for Recyclable and Low Fat Products.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Recyclable and Low Fat Products.
select product_id from Products where low_fats = 'Y' and recyclable = 'Y';