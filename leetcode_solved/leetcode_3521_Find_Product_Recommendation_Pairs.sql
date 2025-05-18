# Time: 618 ms Beats 66.00%
# 精髓点：考察两张表以上的表做 join 操作， 考察同一张表自己和自己的字段进行对比，group by + having 使用。
select p1.product_id as product1_id, 
p2.product_id as product2_id, 
pInfo1.category as product1_category, 
pInfo2.category as product2_category, 
count(*) as customer_count 

from ProductPurchases p1 

left join ProductPurchases p2 on p1.user_id = p2.user_id and p1.product_id < p2.product_id 
join ProductInfo pInfo1 on p1.product_id = pInfo1.product_id 
join ProductInfo pInfo2 on p2.product_id = pInfo2.product_id 

group by product1_id, product2_id
having customer_count > 2 

order by customer_count desc, product1_id, product2_id;
