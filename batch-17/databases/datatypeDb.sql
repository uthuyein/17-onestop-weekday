drop database if exists datatypeDb;
create database datatypeDb;
	use datatypeDb ;

	create table number_tbl(
		col1 tinyint,
		col2 boolean,
		col3 decimal(4,2),
		col4 double(4,2),
		col5 bit
		);

	-- for use all columns;
	-- for boolean the zero is false and else are true.
	insert into number_tbl values(127,9,12.236,12.236,0);
	insert into number_tbl(col1,col3,col4) values(-128,12.236,12.236);

	-- for specified columns;
	insert into number_tbl (col3,col4) values(34.55,34.55);
 
	-- show all record.
	select * from number_tbl;
