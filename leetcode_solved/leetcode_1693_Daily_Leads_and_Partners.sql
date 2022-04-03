# Runtime: 607 ms, faster than 30.10% of MySQL online submissions for Daily Leads and Partners.
# Memory Usage: 0B, less than 100.00% of MySQL online submissions for Daily Leads and Partners.
# Write your MySQL query statement below
select date_id, make_name, count(distinct lead_id) as unique_leads, count(distinct partner_id) as unique_partners from DailySales group by date_id, make_name;