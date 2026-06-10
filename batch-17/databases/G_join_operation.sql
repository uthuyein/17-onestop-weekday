drop database if exists testDb;
create database testDb;
	use testDb;

	create table tableOne(
		col1 int,
		col2 int,
		col3 int
		);
	insert into tableOne values(1,1,1);
	insert into tableOne values(2,2,2);
	insert into tableOne values(3,3,3);

	create table tableTwo(
		col1 int,
		col2 int,
		col3 int
		);
	insert into tableTwo values(2,2,2);
	insert into tableTwo values(3,3,3);
	insert into tableTwo values(4,4,4);

	create table tableThree(
		col4 int,
		col5 int,
		col6 int
		);
	insert into tableThree values(2,2,2);
	insert into tableThree values(3,3,3);
	insert into tableThree values(4,4,4);
	
	-- Inner Join
	-- Natural Join
	-- difference column name,work with cartesian product.
	-- if have same columns,work with natrual (select records that have both tables)
	-- select * from tableOne natural join tableTwo;

	-- Thida Join
	-- select * from tableOne join tableThree 
	-- on tableOne.col1 > tableThree.col4;

	-- Equal Join
	-- select * from tableOne join tableThree 
	-- on tableOne.col1 = tableThree.col4;

	-- Outer Join
	-- Left Join
	select * from tableOne left outer join tableTwo 
	on tableOne.col1 = tableTwo.col1;

	-- Right Join
	select * from tableOne right join tableTwo 
	on tableOne.col1 = tableTwo.col1;

	-- Full Join
	select * from tableOne left outer join tableTwo 
	on tableOne.col1 = tableTwo.col1 
	union 
	select * from tableOne right join tableTwo 
	on tableOne.col1 = tableTwo.col1;









