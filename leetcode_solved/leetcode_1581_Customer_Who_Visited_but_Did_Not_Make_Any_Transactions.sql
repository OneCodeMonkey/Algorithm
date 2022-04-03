-- Runtime: 1151 ms, faster than 59.93% of MySQL online submissions for Customer Who Visited but Did Not Make Any Transactions.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customer Who Visited but Did Not Make Any Transactions.
# Write your MySQL query statement below
select customer_id,count(*) as count_no_trans from Visits a left join Transactions b on a.visit_id=b.visit_id where b.transaction_id is null group by a.customer_id;