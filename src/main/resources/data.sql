
INSERT INTO customers (id,firstname, lastname) values (1,'John', 'Doe')
INSERT INTO customers (id,firstname, lastname) values (2,'Iron', 'Man')
INSERT INTO customers (id,firstname, lastname) values (3,'Dr', 'Strange')
INSERT INTO customers (id,firstname, lastname) values (4,'Ancient', 'One')

INSERT INTO CATEGORY (id,TYPE) VALUES (1,'Market')
INSERT INTO CATEGORY (id,TYPE) VALUES (2,'Gas')
INSERT INTO CATEGORY (id,TYPE) VALUES (3,'Pharmacy')
INSERT INTO CATEGORY (id,TYPE) VALUES (4,'Jewelry')

INSERT INTO EXPENSE (id,TRANSACTION_DATE, COMPANY, AMOUNT,customer_id) VALUES (1,'2020-10-05', 'Walmart', 10.5, 1)
INSERT INTO EXPENSE (id,TRANSACTION_DATE, COMPANY, AMOUNT,customer_id) VALUES (2,'2020-10-02', 'BP', 30.8, 2)
INSERT INTO EXPENSE (id,TRANSACTION_DATE, COMPANY, AMOUNT,customer_id) VALUES (3,'2020-10-04', 'Zen', 150.0, 3)