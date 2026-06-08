drop database if exists testDb;
create database testDb;
	use testDb;

	create table char_tbl(
		col1 varchar(45)
		)engine = InnoDb 
		charset = utf8mb3 
		collate = utf8mb3_general_ci ;

	insert into char_tbl values('Cafe');-- accent
	insert into char_tbl values('cafe');
	insert into char_tbl values('coffee');
	insert into char_tbl values('Café');

	select * from char_tbl where col1 = 'Cafe';

	-- show charset;
	-- show engines;