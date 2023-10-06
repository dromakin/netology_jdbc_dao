CREATE TABLE IF NOT EXISTS public.customers (
    id int NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    name varchar(255) NOT NULL,
    surname varchar(255) NOT NULL,
    age int NOT NULL,
    phone_number varchar(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.orders (
    id int NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    date varchar(255) NOT NULL,
    customer_id int,
    product_name varchar(255) NOT NULL,
    amount int NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES public.customers(id)
);

-- CREATE TABLE IF NOT EXISTS public.orders (
--     id int NOT NULL GENERATED BY DEFAULT AS IDENTITY,
--     date varchar(255) NOT NULL,
--     customer_id int REFERENCES public.customers(id),
--     product_name varchar(255) NOT NULL,
--     amount int NOT NULL,
--     PRIMARY KEY (id)
-- );