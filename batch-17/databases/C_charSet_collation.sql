drop database if exists testDb;
create database testDb;
	use testDb;

	create table char_tbl(
		col1 varchar(45)
		)engine = InnoDb 
		charset = utf8mb4
		collate = utf8mb4_0900_as_cs ;

	insert into char_tbl values('Cafe');-- accent
	insert into char_tbl values('cafe');
	insert into char_tbl values('Café');
	insert into char_tbl values('coffee');
	
	select * from char_tbl where col1 = 'Cafe';

	-- show charset;
	-- show engines;