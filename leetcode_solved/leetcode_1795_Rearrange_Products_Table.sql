-- Runtime: 414 ms, faster than 95.67% of MySQL online submissions for Rearrange Products Table.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rearrange Products Table.
# trick: using union
# Write your MySQL query statement below
select product_id,'store1' as store, store1 as price from Products where store1 is not null
union
select product_id,'store2' as store, store2 as price from Products where store2 is not null
union
select product_id,'store3' as store, store3 as price from Products where store3 is not null;