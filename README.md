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

-- Using Subquery --

select * from dept where deptno not in(select deptno from employee);

-- Show the dept details along with total employees in each dept --

select d.deptno as 'Dept No', dept_name as 'Dept. Name', location as 'Location', count(e.emp_id) as 'Employee Count' from dept d left join employee e on d.deptno = e.deptno group by d.deptno;

-- Using co-realated subquery --

select d.*,(select count(emp_id) from employee e where e.deptno=d.deptno) as 'Total Employees' from dept d;

-- Display the details of the employees who are working in Software Dept. --

select e.*,dept_name,location from employee e join dept d on e.deptno=d.deptno where dept_name='Software';

select e.*,dept_name,location from employee e, dept d where e.deptno=d.deptno AND dept_name='Software';

select * from employee where deptno in (select deptno from dept where dept_name='Software');


alter table employee add reporting_to varchar(10);

select * from employee;

update employee set reporting_to='e201' where emp_id in('e202');

-- Display the details of all managers (reporting_to) --

select distinct e1.* from employee e1 join employee e2 on e1.emp_id=e2.reporting_to;

-- Count the employees working under each manager --

select e1.emp_id, e1.emp_name, count(*) as 'Total Employess' from employee e1 join employee e2 on  e1.emp_id=e2.reporting_to group by e1.emp_id, e1.emp_name;

-- Subqueries --

-- Display the details of all managers (reporting_to) --

select distinct reporting_to from employee;

select * from employee where emp_id in(select distinct reporting_to from employee);


```

## Java Notes

```text

Keywords - Reserved Word eg - int, void, public 

Intentifiers - Names given to classes, variables, functions etc.

Variables - Named location in the memory to store data

Constants/Literals - values given to variable


How to declare a variable?

Syntax -

data-type variable-name;

eg. int num;

	 float average=3.5F;


Data - Types
------------------
(Primary)
int, byte, short, long
float, double
char
boolean


(Derived/Referrence)
Arrays
String
Class
Object




Decision Making and Branching
-----------------------------
if-else
switch
conditional operator


if-else
-------
if(condition){
	statements;
}
else{
	statements;
}

find wheteher a number is even or odd
-------------------------------------
int num=7;
if(num%2==0){
	System.out.println("Even");
}
else{
	System.out.println("Odd");
}


switch
----------

switch(variable){
	case value1:
		statement;
		break;
	case value2:
		statement;
		break;
	...
	...
	default:
		statement;
		break;
}


Show the names of the week days from numbers
--------------------------------------------

int day=2;
switch(day){
	case 1:
		System.out.println("Mon Day");
		break;
	case 2:
		System.out.println("Tues Day");
		break;
	..
	..
	default:
		System.out.println("Invalid Day");
		break;
}


Conditional Operator
--------------------

?:

expression?value1:value2;

int a=10;
int b=20;

int largest=a>b?a:b;


Looping
---------
while
do-while
for


while
------

while(condition){
	statement;
	...
}

int count=0;
while(count<10){
	System.out.println("Hello World");
	count=count+1;
}

do-while
---------

do{
	statements;
}while(condition);



int count=0;
do{
	System.out.println("Hello World");
	count=count+1;
}while(count<10);


for-loop
---------

for(initialization; test-condition; incr/decr){
	statements;
}


for(int count=0; count<10; count++){
	System.out.println("Hello World");
}


String -
-----------
String str1 = "hello";
String str2 = new String("hello");

















```


