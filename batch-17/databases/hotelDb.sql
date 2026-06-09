database => hotelDb
table => 
	1.customer_tbl(id,name,dob,nrc,isActive)
	2.address_tbl(id,city,township,street)
	3.contact_tbl(id,pri_phone,sec_phone,email)
	4.customer_info_tbl(id,cu_id(fk),address_id(fk),contact_id(id))

	5.facility_tbl(id,name,aircon,freezer,shower_room,remark)
	6.room_type_tbl(id,name,facility_id(fk))
	7.rooms_tbl(id,name,room_type_id(fk))

	