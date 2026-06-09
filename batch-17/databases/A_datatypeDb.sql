drop database if exists datatypeDb;
create database datatypeDb;
	use datatypeDb ;


	create table date_tbl(
		col1 date,
		col2 time,
		col3 dateTime
		);

	-- date, can  used any specifier or without specifier
	-- time, can only be used : and without specifier
	-- datetime, date can be used :,_,; and time :
	insert into date_tbl values('70_02_10','1223022','201_02_10 09:30:22');

	select * from date_tbl;

	-- SET dec 		8     4       2      1
	--		0000  'DD'	'CC'	'BB'	'AA'
	--  3   0011    0    0       1        1 
    --  5   0101    0    1       0        1
    --  15  1111	1    1       1        1

	-- create table string_tbl(
	-- 	col1 set('AA','BB','CC','DD'),
	-- 	col2 enum('AA','BB','CC','DD')
	-- 	);
	-- insert into string_tbl values('AA','AA');
	-- insert into string_tbl values(15,4);
	-- insert into string_tbl values('CC,BB,AA',4);
	
	-- select * from string_tbl ;

	-- create table string_tbl(
	-- 	col1 char(4),
	-- 	col2 varchar(4)
	-- 	);
	-- insert into string_tbl(col1,col2)values('AA','AA');
	-- insert into string_tbl(col1,col2)values('AA  ','AA  ');
	-- insert into string_tbl(col1,col2)values('  AA','  AA');

	-- select col1,char_length(col1),col2,char_length(col2) from string_tbl ;

	-- create table number_tbl(
	-- 	col1 tinyint,
	-- 	col2 boolean,
	-- 	col3 decimal(4,2),
	-- 	col4 double(4,2),
	-- 	col5 bit
	-- 	);

	-- -- for use all columns;
	-- -- for boolean the zero is false and else are true.
	-- insert into number_tbl values(127,9,12.236,12.236,0);
	-- insert into number_tbl(col1,col3,col4) values(-128,12.236,12.236);

	-- -- for specified columns;
	-- insert into number_tbl (col3,col4) values(34.55,34.55);
 
	-- -- show all record.
	-- select * from number_tbl;
