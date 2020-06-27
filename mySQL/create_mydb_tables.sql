use mydb;

create table product(
id int AUTO_INCREMENT,
name varchar(20),
description varchar(100),
price decimal(8,3),
PRIMARY KEY(id)
);

create table coupon(
id int AUTO_INCREMENT,
code varchar(40),
discount decimal(8,3),
exp_date varchar(100),
primary key(id)
);

select * from product;
select * from coupon;