-- Runtime: 522 ms, faster than 95.81% of MySQL online submissions for Bank Account Summary II.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Bank Account Summary II.
# Write your MySQL query statement below
select a.name, sum(b.amount) as balance from Users a left join Transactions b on a.account=b.account group by a.name having balance >10000;