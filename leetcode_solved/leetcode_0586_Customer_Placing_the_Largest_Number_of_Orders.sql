-- Runtime: 498 ms, faster than 43.07% of MySQL online submissions for Customer Placing the Largest Number of Orders.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customer Placing the Largest Number of Orders.
# Write your MySQL query statement below
select customer_number from Orders group by customer_number order by count(order_number) desc limit 1;