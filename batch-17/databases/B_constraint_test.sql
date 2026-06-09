drop database if exists productDb;

create database productDb;

	use productDb;

	create table key_tbl(
		id int primary key auto_increment,
		name varchar(45) ,
		nrc varchar(45) ,
		age int
		-- primary key (name,nrc) -- composite key
		
		) engine = InnoDb;
	
	insert into key_tbl(name,nrc,age) values('Andrew','8/ff-423426',23);
	insert into key_tbl(name,nrc,age) values('Andrew','7/ua-223336',23);
	select * from key_tbl;

	truncate key_tbl;-- id restart from 1
	insert into key_tbl(name,nrc,age) values('William','5/yy-342342',33);
	select * from key_tbl;

-- current column can used check constraint in column level or table level
-- two or more columns can used check constraint in table level.
-- can use constraint name or default constraint name in check.
	
	-- create table product_tbl(
	-- 		id int not null unique,
	-- 		name varchar(45) not null,
	-- 		rs_price double(6,2)not null check(rs_price > 0),
	-- 		ws_price double(6,2)not null ,
	-- 		size enum('Small','Medium','Large') not null default 'Medium',
	-- 		createDate date not null default (current_date),
	-- 		createTime time not null default (current_time),
	-- 		isActive boolean not null default true,
	-- 		constraint chk_rs_price check(ws_price > 0),
	-- 		check(rs_price >= ws_price)
	-- 	);

	-- insert into product_tbl values (1,'Orange',3000.00,3000.00,2,'2026-06-08','02:01:30',1);
	-- insert into product_tbl(id,name,rs_price,ws_price)values(2,'Mango','1000','500');


	-- select * from product_tbl;

	-- show create table product_tbl;


