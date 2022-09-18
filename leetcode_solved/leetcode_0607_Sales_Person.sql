-- AC: Runtime: 1565 ms, faster than 44.34% of MySQL online submissions for Sales Person.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Sales Person.
select name from SalesPerson where sales_id not in (Select a.sales_id from Orders a left join Company b on a.com_id=b.com_id where b.name="RED");