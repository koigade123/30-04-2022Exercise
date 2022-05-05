Create database jdbcexercise;
Use jdbcexercise;

Create table Employees 
(
	Empid int primary key,
	Age int not null,
	Firstname nvarchar(250) not null,
	Lastname nvarchar(250) not null
);

insert into Employees values
( 100,  23,  "Raj", "Sharma"),
( 101,  24,  "Bala", "Singh"),
 ( 102,  25,  "Anu", "Priya"),
  ( 103,  26,  "Raj", "Kumar");
  
  


