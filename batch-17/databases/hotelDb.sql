database => hotelDb
table => 
	1.guest_tbl(id,name,dob,nrc,isActive)
	2.address_tbl(id,city,township,street)
	3.contact_tbl(id,pri_phone,sec_phone,email)
	4.customer_info_tbl(id,cu_id(fk),address_id(fk),contact_id(id))

	5.facility_tbl(id,name,aircon,freezer,shower_room,remark)
	6.room_type_tbl(id,name,facility_id(fk),price,max_occupancy(3))
	7.rooms_tbl(id,name,room_type_id(fk),status(Available,Booked,Maintenace))

	8.hotel_tbl(id,name,phone,address)

	9.booking_tbl(id,guest_id(fk),check_in_date,check_out_date,totalAmount,status(Confirmed,Cancelled,Checked_in,check_out))

	10.booking_detail_tbl(id,booking_id(fk),room_id(fk),price)

	11.payment_tbl(id,booking_id(fk),payment_date,payment_method(Kpay,AyaPay,Wave,Cash),amount)

	