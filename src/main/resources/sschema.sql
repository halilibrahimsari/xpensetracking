
CREATE TABLE customers (
    id bigint NOT NULL primary key auto_increment,
    firstname varchar(30) NOT NULL,
    lastname varchar(30) NOT NULL
);

CREATE TABLE CATEGORY (
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    TYPE VARCHAR(30) NOT NULL
);

CREATE TABLE EXPENSE (
    ID BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    TRANSACTION_DATE DATE,
    COMPANY VARCHAR(30),
    AMOUNT DOUBLE,
    CUSTOMERS_ID BIGINT,
    CONSTRAINT FK_CUSTOMERS FOREIGN KEY CUSTOMERS_ID REFERENCES CUSTOMERS
);