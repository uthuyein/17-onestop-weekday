drop database if exists hotelDb;
create database hotelDb;
	use hotelDb;

	create table guest_tbl(
		id int primary key auto_increment,
		name varchar(45) not null,
		dob date not null,
		nrc varchar(45) not null,
		isActive boolean default true
		);

	create table address_tbl(
		id int primary key auto_increment,
		city varchar(45) ,
		township varchar(45),
		street varchar(45)
		);

	create table contact_tbl(
		id int primary key auto_increment,
		pri_phone varchar(12) not null check(pri_phone >= 7),
		sec_phone varchar(12) ,
		email varchar(20)
		);

	create table guest_info_tbl(
		guest_id int,
		contact_id int,
		address_id int,
		primary key(guest_id,contact_id),
		foreign key(guest_id) references guest_tbl(id),
		foreign key(contact_id) references contact_tbl(id),
		foreign key(address_id) references address_tbl(id)
		);

	create table facility_tbl(
		id int primary key auto_increment,
		aircon boolean not null default true,
		freezer boolean not null default true,
	 	bathroom boolean not null default true,
	 	breakfast boolean not null default true
	 	);

	create table room_tbl(
		id int primary key auto_increment,
		facility_id int ,
		room_number varchar(45) not null,
		room_type enum('Single','Double','Dulex','family'),
		status enum('Available','Booked','Maintenace'),
		price int not null ,
		max_occupancy int not null default 1,
		foreign key (facility_id) references facility_tbl(id)
		);

	create table hotel_tbl(
		id  int primary key auto_increment,
		address_id int,
		name varchar(45) not null,
		foreign key(address_id) references address_tbl(id)
		);

	create table booking_tbl(
		id  int primary key auto_increment,
		guest_id int,
		booking_date date,
		status enum('Confirmed','Cancelled','Checked_in','Checked_out'),
		foreign key(guest_id) references guest_tbl(id)
		);

	create table booking_detail_tbl(
		booking_id int,
		room_id int,
		guest_request text,
		price_per_day int,
		check_in_date date,
		check_in_time time,
		check_out_date date,
		check_out_time time,
		totalAmount int,
		primary key(booking_id,room_id),
		foreign key(booking_id) references booking_tbl(id),
		foreign key(room_id) references room_tbl(id)
		);

	create table payment_tbl(
		id int primary key auto_increment ,
		book_detail_id int,
		payment_date date,
		payment_time time,
		payment_method enum('Cash','Kpay','AyaPay','WavePay'),
		amount int
		);

-- database => hotelDb
-- table => 
-- 	1.guest_tbl(id,name,dob,nrc,isActive)
-- 	2.address_tbl(id,city,township,street)
-- 	3.contact_tbl(id,pri_phone,sec_phone,email)
-- 	4.guest_info_tbl(id,cu_id(fk),address_id(fk),contact_id(id))

-- 	5.facility_tbl(id,name,aircon,freezer,bathroom,breakfast,remark)
-- 	6.room_type_tbl(id,name,facility_id(fk),price,max_occupancy(3))
-- 	7.rooms_tbl(id,name,room_type_id(fk),status(Available,Booked,Maintenace),remark)

-- 	8.hotel_tbl(id,name,phone,address)

-- 	9.booking_tbl(id,guest_id(fk),check_in_date,check_out_date,totalAmount,status(Confirmed,Cancelled,Checked_in,check_out))

-- 	10.booking_detail_tbl(id,booking_id(fk),room_id(fk),price)

-- 	11.payment_tbl(id,booking_id(fk),payment_date,payment_method(Kpay,AyaPay,Wave,Cash),amount)

	