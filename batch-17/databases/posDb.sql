drop database if exists posDb;
create database posDb;
	use posDb;

	create table contact_tbl(
		id int primary key auto_increment,
		phone varchar(12) not null check(char_length(phone)>= 7),
		state varchar(45) not null,
		township varchar(45) not null,
		address varchar(45) not null
		);

	INSERT INTO contact_tbl (phone, state, township, address)
	VALUES ('091234567', 'Yangon', 'Hlaing', 'No. 12, Insein Road');

	INSERT INTO contact_tbl (phone, state, township, address)
	VALUES('0987654321', 'Mandalay', 'Chanayethazan', '34th Street');

	INSERT INTO contact_tbl (phone, state, township, address)
	VALUES('09456789012', 'Shan', 'Taunggyi', 'Myoma Quarter');

	INSERT INTO contact_tbl (phone, state, township, address)
	VALUES('0970011223', 'Bago', 'Bago', 'Aung San Road');

	INSERT INTO contact_tbl (phone, state, township, address)
	VALUES('0922334455', 'Ayeyarwady', 'Pathein', 'Strand Road');

	select * from contact_tbl;

	create table customer_tbl(
		id int primary key auto_increment,
		contact_id int,
		name varchar(45) not null,
		member_card enum('No Member','Silver','Gold','Diamond') default 'No Member',
		isDelete tinyint(1) not null default 1,
		foreign key(contact_id) references contact_tbl(id) 
		ON DELETE CASCADE
		);
	-- Customer data
	INSERT INTO customer_tbl (contact_id, name, member_card)
	VALUES
	(1, 'John Smith', 'Gold'),
	(2, 'Mary Johnson', 'Silver'),
	(3, 'David Lee', 'Diamond'),
	(4, 'Aung Aung', 'No Member'),
	(5, 'Su Su', 'Silver');

	select * from customer_tbl;

	create table category_tbl(
		id int primary key auto_increment,
		name varchar(45) unique,
		isDelete tinyint(1) not null default 1
		);

	INSERT INTO category_tbl (name)
	VALUES
	('Fruits'),
	('Vegetables');

	select * from category_tbl;

	create table product_tbl(
		id int primary key auto_increment,
		category_id int,
		name varchar(45) not null,
		price double(7,2),
		size set('Small','Medium','Large'),
		isDelete tinyint(1) not null default 1,
		foreign key(category_id) references category_tbl(id) 
		ON UPDATE CASCADE
		);

	INSERT INTO product_tbl (category_id, name, price, size)
	VALUES
	-- Fruits
	(1, 'Apple', 2.50, 'Small'),
	(1, 'Banana', 1.20, 'Medium'),
	(1, 'Orange', 2.00, 'Medium'),
	(1, 'Mango', 3.50, 'Large'),
	(1, 'Watermelon', 5.00, 'Large'),

	-- Vegetables
	(2, 'Carrot', 1.50, 'Small'),
	(2, 'Potato', 1.80, 'Medium'),
	(2, 'Tomato', 2.20, 'Medium'),
	(2, 'Cabbage', 2.80, 'Large'),
	(2, 'Broccoli', 3.20, 'Large');

	select * from product_tbl;

	create table sale_tbl(
		vo_num varchar(45),
		customer_id int,
		sale_date date not null default(current_date),
		sale_time time not null default(current_time),
		sub_total double(8,2),
		discount double(4,2),
		total double(8,2),
		isDelete tinyint(1) not null default 1,
		primary key(vo_num,customer_id),
	    foreign key (customer_id) references customer_tbl(id)
		);

	select * from sale_tbl;

	INSERT INTO sale_tbl
	(vo_num, customer_id, sale_date, sale_time, sub_total, discount, total)
	VALUES
	('VO004', 4, '2026-06-01', '09:15:30', 18.00, 1.00, 17.00),
	('VO005', 5, '2026-06-01', '11:20:45', 25.50, 2.50, 23.00),
	('VO006', 1, '2026-06-02', '08:45:10', 14.80, 0.80, 14.00),
	('VO007', 2, '2026-06-02', '14:30:25', 30.00, 3.00, 27.00),
	('VO008', 3, '2026-06-03', '16:05:50', 22.40, 1.40, 21.00),
	('VO009', 4, '2026-06-03', '18:10:15', 19.50, 1.50, 18.00),
	('VO010', 5, '2026-06-04', '10:25:40', 12.00, 1.00, 11.00),
	('VO011', 1, '2026-06-04', '13:40:20', 18.00, 2.00, 16.00),
	('VO012', 2, '2026-06-05', '09:50:35', 28.00, 3.00, 25.00),
	('VO013', 3, '2026-06-05', '15:35:55', 22.00, 2.00, 20.00);

	create table sale_detail_tbl(
		product_id int,
		vo_num varchar(45),
		customer_id int,
		qty int,
		total double(8,2),
		primary key(product_id,vo_num,customer_id),
		foreign key(product_id) references product_tbl(id),
		foreign key(vo_num,customer_id) references 
		sale_tbl(vo_num,customer_id) ON DELETE CASCADE
		);


	INSERT INTO sale_detail_tbl
	(product_id, vo_num, customer_id, qty, total)
	VALUES
	(1, 'VO009', 4, 2, 5.00),
	(6, 'VO009', 4, 3, 4.50),
	(8, 'VO009', 4, 2, 4.40),

	(4, 'VO010', 5, 2, 7.00),
	(2, 'VO010', 5, 3, 3.60),

	(5, 'VO011', 1, 2, 10.00),
	(7, 'VO011', 1, 2, 3.60),
	(10,'VO011', 1, 1, 3.20),

	(3, 'VO012', 2, 4, 8.00),
	(4, 'VO012', 2, 2, 7.00),
	(9, 'VO012', 2, 3, 8.40),

	(1, 'VO013', 3, 2, 5.00),
	(2, 'VO013', 3, 5, 6.00),
	(8, 'VO013', 3, 3, 6.60);

	select * from sale_detail_tbl ;






