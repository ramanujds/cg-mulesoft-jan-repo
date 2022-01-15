# DBMS - SQL

```sql



-- DDL Commands --
create database cg_mulesoft_jan;
use cg_mulesoft_jan;

create table employee(emp_id varchar(10), emp_name varchar(50), salary numeric(7,2), join_date date, deptno numeric(2));

desc employee;

alter table employee add primary key(emp_id);

alter table employee modify emp_name varchar(100);

alter table employee add constraint uk_emp_name unique(emp_name);

drop table employee;

truncate table employee;

create table employee(emp_id varchar(10) primary key, emp_name varchar(50) not null, salary numeric(7,2), join_date date, deptno numeric(2));

-- Date - YYYY-MM-DD --

-- DML Commands --
insert into employee values('e101','Rajesh Dutta',43000,'2020-07-10',10);
insert into employee values('e102','Priya Bhatt',46000,'2020-01-10',10);
insert into employee values('e103','Rohit Reddy',56000,'2019-04-10',10);
insert into employee values('e201','Nived Sahoo',51000,'2020-04-10',30);
insert into employee values('e301','Harsh Verma',59000,'2020-05-15',50);

insert into employee(emp_id,emp_name,salary,deptno) values('e104','Mahesh Shetty',38000,10);

update employee set deptno=20 where emp_id='e103';

delete from employee where emp_id='e102';

-- DQL Command --
select * from employee;


-- TCL Commands --
set autocommit=false;

savepoint p1;
delete from employee where emp_id='e102';
select * from employee;
rollback to p1;

select * from employee;
commit;

set autocommit=true;

-- Find all the employees working in dept no 10 --
select * from employee where deptno=10;

-- Find all the employees joined after 2019 --
select * from employee where join_date>'2019-12-31';
select * from employee where extract(year from join_date)>2019;

-- Find the name of the employees joined in the month of april--
select emp_name, join_date from employee where extract(month from join_date)=4;

-- Find all the employees who did not join in 2019 --
select * from employee where extract(year from join_date) <> 2019;

-- <> means != --

-- Find the employee where join date is not mentioned --

select * from employee where join_date is null;

update employee set join_date='2021-02-15' where emp_id='e104';

-- Find the employees joined in 2020 to 2021 --

select * from employee where join_date >= '2020-01-01' AND join_date <= '2021-12-31';

select * from employee where join_date between '2020-01-01' AND '2021-12-31';

-- Find the employees joined in 2020 or 2022 --

select * from employee where extract(year from join_date) = 2020 OR extract(year from join_date) = 2022;

select * from employee where extract(year from join_date) in (2020,2022);

-- Sorting --
select * from employee order by salary asc;

select * from employee order by salary desc;

select * from employee order by 3 asc;

-- Selecting unique elements --

select distinct deptno from employee;

-- Count the records --

-- Find total no of records --

select count(*) as 'Total Employees' from employee;

-- Find total no of dept --

select count(distinct deptno) as 'Total Depts' from employee;

select * from employee;


select max(salary) as 'Highest Salary' from employee;

select deptno, max(salary) as 'Top Salary' from employee group by deptno; 

select deptno, min(salary) as 'Lowest Salary' from employee group by deptno; 

select deptno, round(avg(salary),2) as 'Average Salary' from employee group by deptno; 

select deptno, sum(salary) as 'Total Salary' from employee group by deptno; 

select deptno, count(*) as 'Total Employees' from employee group by deptno; 


-- HAVING Clause --

-- Find the total employees belonging to each dept except dept 20 --

select deptno, count(*) as 'Total Employees' from employee where deptno <> 20 group by deptno; 

-- Find the total employees belonging to each dept where two or more employees are working --

select deptno, count(*) as 'Total Employees' from employee group by deptno having count(*)>=2; 

-- Find the dept, average salary, max salary, min salary where min salary>40000 --

select deptno, avg(salary) as 'Average Salary', max(salary) as 'Maximum Salary', min(salary) as 'Minimum Salary' from employee group by deptno having min(salary)>40000;


create table dept(deptno numeric(2), dept_name varchar(20), location varchar(30));

insert into dept values(10,'Software','Bangalore');
insert into dept values(20,'Accounts','Delhi');
insert into dept values(30,'Sales','Mumbai');
insert into dept values(40,'Management','Kolkata');

select * from dept;

alter table dept add primary key(deptno);

desc dept;

alter table employee add constraint fk_deptno foreign key(deptno) references dept(deptno);

desc employee;

-- SQL Joins --

-- Show the details of each employees along with dept details --

select e.*, dept_name, location from employee e left join dept d on e.deptno=d.deptno; 

-- Show the dept details which doesn't have any employee

select dept.deptno, dept_name, location from dept left join employee on dept.deptno=employee.deptno where emp_id is null;

-- Show the dept details along with total employees in each dept --


```
