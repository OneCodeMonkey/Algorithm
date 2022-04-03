# Runtime: 664 ms, faster than 18.85% of MySQL online submissions for Capital Gain/Loss.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for Capital Gain/Loss.
# Write your MySQL query statement below
select stock_name, SUM(case when operation="Buy" then -price else price end) as capital_gain_loss from Stocks group by stock_name;