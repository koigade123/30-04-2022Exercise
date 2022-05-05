create database Emp;
use Emp;
CREATE TABLE Employees
(
    id INT primary Key,
    age int,
   first VARCHAR(33),
   last varchar(20)
);

insert into Employees values
(1,20,"rushi","koigade"),
(2,20,"rushi","koigade"),
(3,20,"rushi","koigade"),
(4,20,"rushi","koigade");

select *from Employees;