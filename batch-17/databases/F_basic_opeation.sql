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


	-- Set Theory In Relational Algebra
	-- Union
	-- must be the same number of columns.Doesn't need to same column name.
	-- same value will be select one times.
	select * from tableOne union select * from tableTwo;

	-- Difference
	-- select from left table which is difference from right. 
	select * from tableOne except select * from tableTwo ;

	-- Interset
	-- select from left table which is the same from right.
	select * from tableOne intersect select * from tableTwo;

	-- Cartesian product
	-- column name must not be the same.
	-- 
	select * from tableOne,tableTwo;
	select * from tableOne cross join tableTwo;



	







