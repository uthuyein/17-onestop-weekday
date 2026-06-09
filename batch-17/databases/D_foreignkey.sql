drop database if exists testDb;
create database testDb;
	use testDb;

	create table customer_tbl(
		id int primary key auto_increment,
		name varchar(45) not null default 'No Name',
		dob date not null,
		isActive boolean not null default true
		);

	insert into customer_tbl(name,dob)values('Andrew','2002-02-22');
	insert into customer_tbl(name,dob)values('William','1998-10-13');
	insert into customer_tbl(name,dob)values('Peter','1998-10-10');

    create table order_tbl(
		id int primary key auto_increment,
		cu_id int,
		product varchar(45) not null,
		crdDate date not null default(current_date),
		crdTime time not null default(current_time),

		-- add value which is already in customer_tbl.id or null value.
		 foreign key(cu_id) references customer_tbl(id)
    	);

    insert into order_tbl(cu_id,product)values(1,"Orange");
    insert into order_tbl(cu_id,product)values(1,"Lemon");
    insert into order_tbl(cu_id,product)values(1,"Durian");

    insert into order_tbl(cu_id,product)values(2,"Orange");
    insert into order_tbl(cu_id,product)values(2,"Durian");
    
    -- Cannot add or update a child row: a foreign key constraint
    -- insert into order_tbl(cu_id,product)values(4,"Test");

    -- Cannot delete or update a parent row: a foreign key constraint
    -- delete from customer_tbl where id = 1;

    select cu.name,o.product from order_tbl as o 
    join customer_tbl as cu on o.cu_id = cu.id;











