-- Passenger
INSERT INTO passenger_tbl ( name, phone) VALUES( 'John Doe', '0911111111');
INSERT INTO passenger_tbl ( name, phone) VALUES( 'Alice Smith', '0922222222');
INSERT INTO passenger_tbl ( name, phone) VALUES( 'Bob Johnson', '0933333333');

-- Driver
INSERT INTO driver_tbl (name, dob, nrc, address) VALUES( 'David Brown', '1985-05-10', '12/ABC(N)123456', 'Yangon');
INSERT INTO driver_tbl (name, dob, nrc, address) VALUES( 'Michael Lee', '1990-08-20', '13/DEF(N)654321', 'Mandalay');
INSERT INTO driver_tbl (name, dob, nrc, address) VALUES( 'Joe', '1992-03-21', '13/DEF(N)653322', null);


-- Driver Licence
INSERT INTO driver_licence_tbl(driver_id, number, issueDate, validDate, bloodType, licenceType)VALUES(1, 'DL-10001', '2022-01-01', '2027-01-01', 'A', 'B');
INSERT INTO driver_licence_tbl(driver_id, number, issueDate, validDate, bloodType, licenceType)VALUES(2, 'DL-10002', '2023-02-15', '2028-02-15', 'B', 'C');

-- Car
INSERT INTO car_tbl (brand, model) VALUES('Toyota', 'Corolla');
INSERT INTO car_tbl (brand, model) VALUES('Honda', 'Civic');

-- Car Licence
INSERT INTO car_licence_tbl(car_id, number, issueDate, validDate)VALUES(1, 'YGN-5A-1234', '2024-01-01', '2025-12-31');
INSERT INTO car_licence_tbl(car_id, number, issueDate, validDate)VALUES(2, 'MDY-7B-5678', '2024-03-01', '2026-02-28');

-- Trip
INSERT INTO trip_tbl(pickupPoint, dropOffPoint, cost)VALUES('Yangon Airport', 'Sule Pagoda', 15000);
INSERT INTO trip_tbl(pickupPoint, dropOffPoint, cost)VALUES( 'Mandalay Hill', 'Mandalay Palace', 10000);

-- Trip Detail
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(1, 1, 'YGN-5A-1234', 'DL-10001', 1, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(2, 1, 'YGN-5A-1234', 'DL-10001', 2, 'COMPLETED');
INSERT INTO trip_detail_tbl(passenger_id, trip_id, car_licence_id, driver_licence_id, qty, status)VALUES(3, 2, 'MDY-7B-5678', 'DL-10002', 1, 'PENDING');