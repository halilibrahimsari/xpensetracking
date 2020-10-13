
INSERT INTO customer (customer_id ,firstname, lastname) values (1,'John', 'Doe')
INSERT INTO customer (customer_id ,firstname, lastname) values (2,'Iron', 'Man')
INSERT INTO customer (customer_id ,firstname, lastname) values (3,'Dr', 'Strange')
INSERT INTO customer (customer_id ,firstname, lastname) values (4,'Ancient', 'One')

INSERT INTO CATEGORY (category_id,TYPE) VALUES (1,'Market')
INSERT INTO CATEGORY (category_id,TYPE) VALUES (2,'Gas')
INSERT INTO CATEGORY (category_id,TYPE) VALUES (3,'Pharmacy')
INSERT INTO CATEGORY (category_id,TYPE) VALUES (4,'Jewelry')

INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (1,'2020-10-02', 'BP', 30.8, 1, 1)
INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (2,'2020-10-02', 'BP', 20.1, 1, 2)
INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (3,'2020-10-02', 'BP', 40.8, 1, 3)
INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (4,'2020-10-02', 'BP', 32.9, 1, 1)
INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (5,'2020-10-05', 'Walmart', 10.5, 2, 4)
INSERT INTO EXPENSE (expense_id, expense_DATE, COMPANY, AMOUNT, customer_id, CATEGORY_ID) VALUES (6,'2020-10-04', 'Zen', 150.0, 3, 1)