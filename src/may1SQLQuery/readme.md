Cloud Formation
Aws Rds
Terraform
Kinesis
Amazon Cloud-Front
Amazon ElastiCache


RDS - Relational database service

Dynamo DB - alternate to MangoDB
Redis ? - Caching database in-memory database

Front End --> BackEnd 
                     Redis         MySQl
fetch the userinfo [Cached] ---> database []- permanent storage

## Types of cache ?
client side
server side

## database ??
Relational database
1. MySQL, PostgreSQl, Oracle, SQl Server

Normalization - remove the redundant data
ACID properties 
A - Atomicity --> transaction happens, it happens completely or not at all
C - Consistency --> Same state before and after transaction
I - Isolation --> independent transactions can happen
D - Durability --> during the system failure, changes in transaction happen


Blue Green Deployment ?
Dbeaver - Open source DB to create client
datagrip- Open source DB to create client


Interview Questions from DB ?
1. joins
2. find the highest salary from the employee, second highest, 3rd highest
3. total number of employees from a specific database


==== database queries

show databases ;

use Employee;

show tables ;

-- fetch all the data from EMPLOYEE

select * from EMPLOYEE; select EMPLOYEE_NAME, EMPLOYEE_ADDRESS from EMPLOYEE;

-- give me all the employees from Japan -- where clause select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan';

-- fetch employees from Japan and name is John select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'Japan' AND EMPLOYEE_NAME = 'John';

-- fetch all the employees from Canada or Name is John select * from EMPLOYEE where EMPLOYEE_ADDRESS = 'India' OR EMPLOYEE_NAME = 'Sofia';

-- list all the employees which are not from Canada select * from EMPLOYEE where NOT EMPLOYEE_ADDRESS = 'Canada';

-- limit select * from EMPLOYEE limit 4;

create database mydatabase;

show databases ;

use Employee;

drop database mydatabase;

create table Product(product_id int, product_name varchar(255));

show tables; select * from Product;

-- insert data to the product insert into Product (product_id , product_name) values (101, 'Iphone');

drop table Product;


https://www.w3schools.com/sql/sql_alter.asp