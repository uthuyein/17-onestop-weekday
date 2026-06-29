INSERT INTO category_tbl (id, name, isDelete) VALUES(1, 'Coffee', 0);
INSERT INTO category_tbl (id, name, isDelete) VALUES(2, 'Tea', 0);
INSERT INTO category_tbl (id, name, isDelete) VALUES(3, 'Dessert', 0);

INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(1, 1, 'Americano', 'SMALL', 2.50, 0);
INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(2, 1, 'Americano', 'LARGE', 3.50, 0);
INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(3, 1, 'Latte', 'MEDIUM', 4.00, 0);
INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(4, 2, 'Green Tea', 'MEDIUM', 2.75, 0);
INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(5, 2, 'Milk Tea', 'LARGE', 4.50, 0);
INSERT INTO product_tbl (id, category_id, name, size, price, isDelete) VALUES(6, 3, 'Cheese Cake', 'MEDIUM', 5.00, 0);

INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(1, 'John Doe', 'SILVER', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(2, 'Alice Smith', 'GOLD', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(3, 'Bob Johnson', 'NONE', 0);

INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(4, 'Michael Brown', 'SILVER', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(5, 'Emma Wilson', 'GOLD', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(6, 'Daniel Taylor', 'NONE', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(7, 'Sophia Lee', 'DIAMOND', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(8, 'William Clark', 'SILVER', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(9, 'Olivia Davis', 'GOLD', 0);
INSERT INTO customer_tbl (id, name, member_card, isDelete) VALUES(10, 'James White', 'NONE', 0);

INSERT INTO contact_tbl (id, customer_id, address, phone, township, state) VALUES(1, 1, '12 Main Street', '0911111111', 'Ahlone', 'Yangon');
INSERT INTO contact_tbl (id, customer_id, address, phone, township, state) VALUES(2, 2, '55 Lake Road', '0922222222', 'Kamaryut', 'Yangon');
INSERT INTO contact_tbl (id, customer_id, address, phone, township, state) VALUES(3, 3, '90 Garden Street', '0933333333', 'Chan Aye Tharzan', 'Mandalay');

INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(4,4,'No.21 Cherry St','0944444444','Sanchaung','Yangon');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(5,5,'No.56 Rose St','0955555555','Hlaing','Yangon');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(6,6,'No.88 Palm Rd','0966666666','Tamwe','Yangon');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(7,7,'No.13 River Rd','0977777777','Mayangone','Yangon');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(8,8,'No.91 Market St','0988888888','Pyin Oo Lwin','Mandalay');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(9,9,'No.65 Lake View','0999999999','Chanmyathazi','Mandalay');
INSERT INTO contact_tbl(id, customer_id, address, phone, township, state)VALUES(10,10,'No.45 University Rd','0910101010','Bahan','Yangon');

INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0001', 1, '2026-07-01', 10.50, 0.50, 10.00, 0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0002', 2, '2026-07-01', 13.50, 1.50, 12.00, 0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0003', 3, '2026-07-02', 7.50, 0.00, 7.50, 0);



INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0004',4,'2026-07-02',9.00,0.00,9.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0005',5,'2026-07-02',15.00,2.00,13.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0006',6,'2026-07-03',12.50,1.50,11.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0007',7,'2026-07-03',18.00,3.00,15.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0008',8,'2026-07-03',7.50,0.00,7.50,0);

INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0009',9,'2026-07-04',11.00,1.00,10.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0010',10,'2026-07-04',20.00,2.00,18.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0011',1,'2026-07-05',8.00,0.50,7.50,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0012',2,'2026-07-05',16.00,1.00,15.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0013',3,'2026-07-06',13.50,1.50,12.00,0);

INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0014',4,'2026-07-06',21.50,1.50,20.00,0);
INSERT INTO sale_tbl(vou_num, customer_id, sale_date, subTotal, discount, total, isDelete)VALUES('INV-0015',5,'2026-07-07',6.50,0.00,6.50,0);

INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0001', 1, '2026-07-01', '09:15:00', 1, 2, 5.00);
INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0001', 1, '2026-07-01', '09:15:00', 6, 1, 5.50);

INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0002', 2, '2026-07-01', '10:30:00', 3, 2, 8.00);
INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0002', 2, '2026-07-01', '10:30:00', 5, 1, 4.50);
INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0002', 2, '2026-07-01', '10:30:00', 6, 1, 1.00);

INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0003', 3, '2026-07-02', '02:20:00', 2, 1, 3.50);
INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0003', 3, '2026-07-02', '02:20:00', 4, 1, 2.75);
INSERT INTO sale_details_tbl(vou_num, customer_id, sale_date, saleTime, product_id, qty, total)VALUES('INV-0003', 3, '2026-07-02', '02:20:00', 6, 1, 1.25);



INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0004',4,'2026-07-02','09:00:00',1,2,5.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0004',4,'2026-07-02','09:00:00',4,1,2.75);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0004',4,'2026-07-02','09:00:00',6,1,1.25);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0005',5,'2026-07-02','10:20:00',3,2,8.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0005',5,'2026-07-02','10:20:00',5,1,4.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0005',5,'2026-07-02','10:20:00',6,1,2.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0006',6,'2026-07-03','08:45:00',2,2,7.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0006',6,'2026-07-03','08:45:00',4,2,5.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0007',7,'2026-07-03','11:15:00',3,3,12.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0007',7,'2026-07-03','11:15:00',6,2,6.00);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0008',8,'2026-07-03','15:10:00',5,1,4.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0008',8,'2026-07-03','15:10:00',1,1,2.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0008',8,'2026-07-03','15:10:00',4,1,0.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0009',9,'2026-07-04','09:30:00',2,1,3.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0009',9,'2026-07-04','09:30:00',3,1,4.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0009',9,'2026-07-04','09:30:00',6,1,3.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0010',10,'2026-07-04','13:40:00',3,2,8.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0010',10,'2026-07-04','13:40:00',5,2,9.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0010',10,'2026-07-04','13:40:00',6,1,3.00);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0011',1,'2026-07-05','10:00:00',1,1,2.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0011',1,'2026-07-05','10:00:00',4,2,5.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0012',2,'2026-07-05','12:25:00',2,2,7.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0012',2,'2026-07-05','12:25:00',3,1,4.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0012',2,'2026-07-05','12:25:00',5,1,5.00);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0013',3,'2026-07-06','09:50:00',1,2,5.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0013',3,'2026-07-06','09:50:00',6,2,8.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0014',4,'2026-07-06','18:10:00',3,3,12.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0014',4,'2026-07-06','18:10:00',5,2,9.00);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0014',4,'2026-07-06','18:10:00',6,1,0.50);

INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0015',5,'2026-07-07','08:20:00',1,1,2.50);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0015',5,'2026-07-07','08:20:00',4,1,2.75);
INSERT INTO sale_details_tbl(vou_num,customer_id,sale_date,saleTime,product_id,qty,total)VALUES('INV-0015',5,'2026-07-07','08:20:00',6,1,1.25);
