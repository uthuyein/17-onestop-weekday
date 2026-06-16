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
	VALUES 
	('091234567', 'Yangon', 'Hlaing', 'No. 12, Insein Road'),
	('0987654321', 'Mandalay', 'Chanayethazan', '34th Street'),
	('09456789012', 'Shan', 'Taunggyi', 'Myoma Quarter'),
	('0970011223', 'Bago', 'Bago', 'Aung San Road'),
	('0922334455', 'Ayeyarwady', 'Pathein', 'Strand Road');

	create table customer_tbl(
		id int primary key auto_increment,
		contact_id int,
		name varchar(45) not null,
		member_card enum('No Member','Silver','Gold','Diamond') default 'No Member',
		isDelete tinyint(1) not null default 0,
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

	create table category_tbl(
		id int primary key auto_increment,
		name varchar(45) unique,
		category_id int,
		isDelete tinyint(1) not null default 0,
		foreign key(category_id) references category_tbl(id)
		);

	INSERT INTO category_tbl (name,category_id)
	VALUES
	('Fruits',null),
	('Vegetables',null),
	-- Fruits
	('Citrus Fruits', 1),
	('Tropical Fruits', 1),
	('Berries', 1),

	-- Vegetables
	('Leafy Vegetables', 2),
	('Root Vegetables', 2),
	('Fruit Vegetables', 2);

	create table product_tbl(
		id int primary key auto_increment,
		category_id int,
		name varchar(45) not null,
		price double(7,2),
		size enum('Small','Medium','Large'),
		isDelete tinyint(1) not null default 0,
		foreign key(category_id) references category_tbl(id) 
		ON UPDATE CASCADE
		);

	INSERT INTO product_tbl (category_id, name, price, size)
	VALUES
	-- Citrus Fruits (id=3)
	(3, 'Orange', 2.50, 'Medium'),
	(3, 'Lemon', 1.50, 'Small'),

	-- Tropical Fruits (id=4)
	(4, 'Mango', 3.50, 'Large'),
	(4, 'Banana', 1.20, 'Medium'),
	(4, 'Papaya', 2.80, 'Large'),

	-- Berries (id=5)
	(5, 'Strawberry', 4.50, 'Small'),

	-- Leafy Vegetables (id=6)
	(6, 'Spinach', 1.80, 'Medium'),
	(6, 'Mustard Greens', 2.20, 'Large'),

	-- Root Vegetables (id=7)
	(7, 'Carrot', 1.50, 'Small'),
	(7, 'Potato', 1.70, 'Medium'),

	-- Fruit Vegetables (id=8)
	(8, 'Tomato', 2.20, 'Medium'),
	(8, 'Cucumber', 1.80, 'Medium');


	create table sale_tbl(
		vo_num varchar(45),
		customer_id int,
		sale_date date not null default(current_date),
		sale_time time not null default(current_time),
		sub_total double(8,2),
		discount double(4,2),
		total double(8,2),
		isDelete tinyint(1) not null default 0,
		primary key(vo_num,customer_id),
	    foreign key (customer_id) references customer_tbl(id)
		);

	
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

	select * from contact_tbl;
	select * from customer_tbl;
	select * from category_tbl;
	select * from product_tbl;
	select * from sale_tbl;
	select * from sale_detail_tbl ;

	-- Join 
	-- Projection
	select main.name as main_category,sub.name as sub_category,p.name,p.price 
	from product_tbl p 
	join category_tbl sub on sub.id = p.category_id 
	join category_tbl main on main.id = sub.category_id;

	-- Projection with predicate
	select cu.name customer,co.state,co.township from customer_tbl cu 
	join contact_tbl co on cu.contact_id = co.id 
	where co.township in('Taunggyi','Bago','Pathein');

	select p.name,cu.name from customer_tbl cu 
	join sale_tbl s on s.customer_id = cu.id 
	join sale_detail_tbl sd on sd.vo_num = s.vo_num 
	and sd.customer_id = s.customer_id 
	join product_tbl p on p.id = sd.product_id 
	where cu.name = 'Aung Aung';

	-- Prdicate ,Projection with order by
	select cu.name,p.name,p.price,sd.qty,(p.price*sd.qty)as total from product_tbl p 
	join sale_detail_tbl sd on sd.product_id = p.id 
	join sale_tbl s on s.vo_num = sd.vo_num 
	and s.customer_id = sd.customer_id 
	join customer_tbl cu on cu.id = s.customer_id 
	join contact_tbl c on c.id = cu.contact_id 
	where c.township = 'Bago' and s.sale_date = '2026-06-03'
	order by p.name desc;


	-- Aggregate function (sum(),count(),min(),max(),avg())
	select max(total) from sale_tbl;
	select sum(total) from sale_tbl where sale_date = '2026-06-01';
	select sum(total) from sale_tbl where sale_date 
	between '2026-06-01' and '2026-06-05';

	-- Aggregate function with projection
	select p.name as name,sum(sd.qty) as total from product_tbl p 
	join sale_detail_tbl sd on sd.product_id = p.id 
	group by name order by total desc;

	-- 1.who brought most expensive product ?
	select cu.name,p.name,p.price from product_tbl p 
	join sale_detail_tbl sd on sd.product_id = p.id 
	join sale_tbl s on s.vo_num = sd.vo_num and s.customer_id = sd.customer_id 
	join customer_tbl cu on cu.id = s.customer_id 
	where p.price = (select max(p.price) from product_tbl p);

	-- 2.name of product which is the most selling qty between two date.
	select p.name  from product_tbl p 
	join sale_detail_tbl sd on sd.product_id = p.id 
	join sale_tbl s  on s.vo_num = sd.vo_num and s.customer_id = sd.customer_id 
	where sd.qty = (
		select max(sd.qty) from sale_tbl s 
		join sale_detail_tbl sd  
		on s.vo_num = sd.vo_num and s.customer_id = sd.customer_id 
		where s.sale_date  between '2026-06-01' and '2026-06-05') ;

	-- Question for project and predicate
	1.p.name,p.price,sum(sd.qty) 
	where cu.member_card != 'Silver'

	2.cu.name,p.name 
	where c.name = 'Root Vegetables'

	3. select p.name ,p.price
	where p.name is not start with p

	4.select s.sale_date 
	where cu.name is start with 'a'

	select cu.name,p.name,sum(sd.qty) from product_tbl p
	join sale_detail_tbl sd on sd.product_id = p.id 
	join sale_tbl s on s.vo_num = sd.vo_num and s.customer_id = sd.customer_id 
	join customer_tbl cu on cu.id = s.customer_id 
	where sd.qty > (select avg(sd.qty) from sale_detail_tbl sd)
	group by cu.name,p.name;


	-- Like ,member of()
	select * from customer_tbl where lower(name) like lower('A%');

	-- select 'Gold'  member of ('["Silver","Gold"]');




















