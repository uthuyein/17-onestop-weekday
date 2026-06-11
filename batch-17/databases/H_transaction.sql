drop database if exists testDb;
create database testDb;
	use testDb;

	create table account_tbl(
		name varchar(45),
		balance int
		);

	insert into account_tbl values('Andrew',20000);
	insert into account_tbl values('William',20000);

	select * from account_tbl ;

	-- Transaction
	-- start transaction => start transaction | begin
	-- savepoint         => savepoint (name) 
	-- end transaction   =>  commit | rollback 


	-- Correct Transfer
	-- begin;
	-- 	select * from account_tbl where name = 'Andrew';
	-- 	update account_tbl set balance = balance - 10000 where name = 'Andrew';
	-- 	update account_tbl set balance = balance + 10000 where name = 'William';
	-- 	select * from account_tbl ;	
	-- commit;


	-- -- Wrong Transfer
	-- begin;
	-- 	select * from account_tbl where name = 'Andrew';
	-- 	update account_tbl set balance = balance - 10000 where name = 'Andrew';
	-- 	update account_tbl set balance = balance + 1000 where name = 'William';
	-- 	select * from account_tbl ;	
	-- rollback;


	-- begin ;		
	-- 	select * from account_tbl where name = 'Andrew';
	-- 	update account_tbl set balance = balance - 10000 where name = 'William';
	-- 	update account_tbl set balance = balance + 10000 where name = 'Andrew';
	-- savepoint William;
	-- 	update account_tbl set balance = balance - 5000 where name = 'William';
	-- 	update account_tbl set balance = balance + 500 where name = 'Andrew';

	-- 	select * from account_tbl ;	
	-- rollback to William;


	-- Isolation level
	-- show level
	-- select @@global.transaction_isolation,@@transaction_isolation;
	
	-- set level
	-- set [global | session] transaction isolation level 
	-- READ UNCOMMITTED |
	-- READ COMMITTED |
	-- REPEATABLE READ |
	-- SERIALIZABLE










