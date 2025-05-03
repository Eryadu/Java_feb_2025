CREATE TABLE EMPLOYEE(
                         EMPLOYEE_ID numeric(18, 0) NOT NULL,
                         EMPLOYEE_NAME varchar(50) NULL,
                         EMPLOYEE_ADDRESS varchar(50) NULL,
                         EMPLOYEE_PHONE numeric(18, 0) NULL,
                         EMPLOYEE_SALARY numeric(18, 0) NULL,
                         EMPLOYEE_GENDER char(1) NULL,
                         EMP_JOIN_DATE date NULL
);

CREATE TABLE DEPT_MANAGER(
                             DEPT_NO numeric(18, 0) NOT NULL,
                             EMPLOYEE_ID numeric(18, 0) NOT NULL,
                             FROM_DATE date NULL,
                             TO_DATE date NULL
);

CREATE TABLE SALARY(
                       EMPLOYEE_ID numeric(18, 0) NULL,
                       EMPLOYEE_NAME varchar(50) NULL,
                       EMPLOYEE_SALARY numeric(18, 0) NULL,
                       FROM_DATE date NULL,
                       TO_DATE date NULL
);

CREATE TABLE TITLES(
                       EMPLOYEE_ID numeric(18, 0) NULL,
                       EMPLOYEE_TITLE nvarchar(50) NULL,
                       FROM_DATE date NULL,
                       TO_DATE date NULL
);

INSERT INTO EMPLOYEE values (1001,'Smith','Japan', 647924011, 50000,'M','2017-01-01');
INSERT INTO EMPLOYEE values (1002,'John','Japan', 657924011, 55000,'M','2017-01-01');
INSERT INTO EMPLOYEE values (1003,'Sammy','India', 611924011, 65000,'M','2017-01-01');
INSERT INTO EMPLOYEE values (1004,'Sofia','Canada', 633924011, 75000,'F','2017-01-01');
INSERT INTO EMPLOYEE values (1005,'Veroli','Tokyo', 647944011, 52000,'F','2017-01-01');
INSERT INTO EMPLOYEE values (1006,'Daniel','Singapore', 989624011, 51000,'M','2017-01-01');
INSERT INTO EMPLOYEE values (1007,'Kristy','Chile', 905924011, 30000,'F','2017-01-01');

insert into DEPT_MANAGER values (101,1001,'2012-06-08','2015-06-18');
insert into DEPT_MANAGER values (101,1002,'2014-05-28','2016-06-23');
insert into DEPT_MANAGER values (102,1003,'2015-04-17','2017-06-22');
insert into DEPT_MANAGER values (102,1004,'2016-03-11','2016-12-12');
insert into DEPT_MANAGER values (103,1005,'2011-02-09','2017-06-25');
insert into DEPT_MANAGER values (103,1006,'2010-06-11','2011-09-01');
insert into DEPT_MANAGER values (103,1007,'2012-07-13','2013-08-02');

insert into SALARY values (1001,'Smith',10000,'2012-06-08','2015-06-18');
insert into SALARY values (1002,'John',20000,'2014-05-28','2016-06-23');
insert into SALARY values (1003,'Sammy',30000,'2015-04-17','2017-06-22');
insert into SALARY values (1004,'Sofia',75000,'2016-03-11','2016-12-12');
insert into SALARY values (1005,'Veroli',85000,'2011-02-09','2017-06-25');
insert into SALARY values (1006,'Daniel',12000,'2010-06-11','2011-09-01');
insert into SALARY values (1007,'Kristy',89000,'2012-07-13','2013-08-02');

insert into TITLES values (1001,'Develper','2012-06-08','2015-06-18');
insert into TITLES values (1002,'Sr Develper','2012-06-08','2015-06-18');
insert into TITLES values (1003,'Develper','2012-06-08','2015-06-18');
insert into TITLES values (1004,'Team Lead','2012-06-08','2015-06-18');
insert into TITLES values (1005,'Develper','2012-06-08','2015-06-18');
insert into TITLES values (1006,'Manager','2012-06-08','2015-06-18');
insert into TITLES values (1007,'Director','2012-06-08','2015-06-18');


select  a.employee_name, b.employee_title
from employee a , TITLES b
where a.employee_id = b.employee_id;


select * from  EMPLOYEE;
select * from DEPT_MANAGER;
select * from SALARY;
select * from TITLES;

commit;