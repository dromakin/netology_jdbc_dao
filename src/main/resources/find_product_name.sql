SELECT product_name
FROM public.orders
WHERE customer_id IN
      (SELECT id FROM public.customers WHERE name = :username);