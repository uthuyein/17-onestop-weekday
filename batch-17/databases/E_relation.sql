drop database if exists testDb;
create database testDb;
	use testDb;

	-- Unary Relation
	create table category_tbl(
		id int primary key auto_increment,
		name varchar(45) not null unique,
		cat_id int,
		foreign key(cat_id) references category_tbl(id)
		);

	insert into category_tbl(name,cat_id) values('Horror',null);
	insert into category_tbl(name,cat_id) values('Supernatural',1);
	insert into category_tbl(name,cat_id) values('Psychological',1);
	insert into category_tbl(name,cat_id) values('Demon',2);
	insert into category_tbl(name,cat_id) values('science',2);

	select * from category_tbl;

	-- Binay Relationship

	-- One-To-Many or Many-To-One
	create table author_tbl(
		id int primary key auto_increment,
		name varchar(45) not null
		);
	insert into author_tbl(name) values("Andrew");
	insert into author_tbl(name) values("William");

	create table book_tbl(
		id int primary key,
		author_id int ,
		name varchar(45) not null,
		cat_id int,
		constraint fk_book_category 
		foreign key(cat_id) references category_tbl(id),
		constraint fk_book_auther 
		foreign key(author_id) references author_tbl(id)
		);
	insert into book_tbl(id,author_id,cat_id,name) values(1,1,4,'Ghost story');
	insert into book_tbl(id,author_id,cat_id,name) values(2,1,5,'AA sss');
	insert into book_tbl(id,author_id,cat_id,name) values(2,2,2,'Supernatural');
	
	
	-- One-To_One
	create table author_card_tbl(
		id varchar(45) primary key ,
		issue_date date not null default(current_date),
		valid_date date ,
		author_id int unique,
		check(valid_date > issue_date),
		foreign key(author_id) references author_tbl(id)
		);

	insert into author_card_tbl(id,author_id,valid_date)
	values('AB-988',1,'2028-06-09');
	insert into author_card_tbl(id,author_id,valid_date)
	values('AB-999',2,'2028-06-09');

	select * from author_card_tbl ;

	-- Many-To-Many
	create table publisher_tbl(
		id int primary key auto_increment,
		name varchar(45) not null
		);

	insert into publisher_tbl(name) values("Aung Thapyay");
	insert into publisher_tbl(name) values("Ngar");

	create table author_publisher_tbl(
		author_id int,
		publisher_id int,
		primary key(author_id,publisher_id),
		foreign key(author_id) references author_tbl(id),
		foreign key(publisher_id) references publisher_tbl(id)
		);

	insert into author_publisher_tbl(author_id,publisher_id) 
	values(1,1);
	insert into author_publisher_tbl(author_id,publisher_id) 
	values(2,1);
	insert into author_publisher_tbl(author_id,publisher_id) 
	values(1,2);

	select * from author_publisher_tbl ;


	-- Tanary Relations

	create table sale_tbl(
		id int primary key auto_increment,
		sale_date date default(current_date),
		sale_time time default (current_time)
		);
	insert into sale_tbl(sale_date,sale_time) values(now(),now());

	-- Tanary
	create table sale_detail_tbl(
		sale_id int,
		book_id int,
		publisher_id int,
		qty int,
		primary key(sale_id,book_id,publisher_id),
		constraint fk_sd_sale foreign key(sale_id) references sale_tbl(id),
		constraint fk_sd_book foreign key(book_id) references book_tbl(id),
		constraint fk_sd_publisher foreign key (publisher_id) references publisher_tbl(id)
		);
	insert into sale_detail_tbl values(1,1,1,3);
	insert into sale_detail_tbl values(1,2,1,1);
	insert into sale_detail_tbl values(1,2,2,3);
	
	select * from sale_detail_tbl;
	
	

















