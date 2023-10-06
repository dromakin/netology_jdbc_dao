CREATE SCHEMA IF NOT EXISTS public;

INSERT INTO public.customers
(name, surname, age, phone_number)
VALUES ('Jane', 'Anderson', 23, '+7936437422'),
       ('Alexey', 'Mayer', 32, '7-906-099-7635'),
       ('Gladys', 'Blackburn', 33, '0-754-235-3657'),
       ('Elle', 'Thomson', 19, '8-816-446-3656'),
       ('Daron', 'Mould', 40, '6-527-547-8518'),
       ('Mason', 'Dobson', 53, '7-702-558-4126');

INSERT INTO public.orders
(date, customer_id, product_name, amount)
VALUES ('Monday, September 4, 2013', 1, 'Comodo', 1397732507),
    ('Thursday, December 24, 2018', 2, 'Leadertech Consulting', 2036582258),
    ('Friday, February 16, 2020', 3, 'Coca-Cola Company', 1215115456),
    ('Saturday, July 23, 2020', 4, 'UPC', 1493392993),
    ('Friday, September 6, 2021', 5, 'Comcast', 321541164);
