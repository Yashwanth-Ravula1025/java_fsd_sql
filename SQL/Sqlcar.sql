use meenakshi;
/*CREATE TABLE owner(
owner_id VARCHAR(10),
owner_name VARCHAR(20),
address VARCHAR(20),
phone_no BIGINT,
email_id VARCHAR(20),
PRIMARY KEY(owner_id)
);*/
/*INSERT INTO owner
(owner_id,owner_name,address,phone_no,email_id)
VALUES
("123","Meenakshi","ABC",9995076039,"meenakshi1@gmail.com"),
("345","Devika","CDE","9656088050","devila1@gmail.com"),
("567","Amitha","EFG","9876543278","amitha2@gmail.com"),
("789","Sona","HIJ","9995674534","sona3@gmail.com"),
("876","Sam","KLM","9098765643","sam34@gmail.com"),
("521","Meenu","NOP","9846467578","meenu@gmail.com");*/

/* CREATE TABLE cars
 (
car_id VARCHAR(10),
car_name VARCHAR(20),
car_type VARCHAR(20),
owner_id VARCHAR(10),
primary key(car_id),
foreign key(owner_id) REFERENCES owner(owner_id)
);*/


/*INSERT INTO cars
(car_id,car_name,car_type,owner_id)
VALUES
("1","i20","A","123"),
("2","Swift","B","345"),
("3","Creta","C","521"),
("4","Breeza","D","567"),
("5","Seltos","E","789"),
("6","Carnival","D","876");)*/

/*CREATE TABLE customers(
customer_id VARCHAR(10),
customer_name VARCHAR(20),
address VARCHAR(20),
phone_no BIGINT,
email_id VARCHAR(20),
primary key(customer_id)
);*/

/*INSERT INTO customers
(customer_id,customer_name,address,phone_no,email_id)
VALUES
("1","Tito","D",9867599543,"tito34@gmail.com"),
("2","Lino","F",9756488210,"lino56@gmail.com"),
("3","Anu","H",985612754,"anu1234@gmail.com"),
("4","Devi","G",9056844352,"devi1234@gmail.com"),
("5","Fin","K",9867455321,"fin456@gmail.com"),
("6","Ami","T",9867500434,"ami567@gmail.com"); */

CREATE TABLE rentals(
rental_id VARCHAR(10),
customer_id VARCHAR(20),
car_id VARCHAR(10),
pickup_date DATE,
return_date DATE,
km_driven INT,
fare_amount DOUBLE(10,2),
primary key(rental_id),
foreign key(customer_id) REFERENCES customers(customer_id),
foreign key(car_id) REFERENCES cars(car_id)
);


INSERT INTO rentals
(rental_id,customer_id,car_id,pickup_date,return_date,km_driven,fare_amount)
VALUES
("R001","1","1","2018-03-10","2018-03-10",800,9000),
("R002","2","2","2018-03-11","2018-03-12",200,3000),
("R003","3","3","2018-04-15","2018-04-15",100,1500),
("R004","4","4","2018-05-16","2018-05-18",1000,10000),
("R005","5","5","2018-05-10","2018-05-12",900,11000),
("R006","6","6","2018-05-20","2018-05-21",200,2500);
use meenakshi;
SELECT cars.car_id,cars.car_name,cars.car_type FROM cars INNER JOIN rentals WHERE pickup_date=NULL ;
SELECT cars.car_id,cars.car_name ,cars.owner_id FROM cars WHERE car_type IN ("D") order by car_id;
ALTER TABLE cars ADD car_regno VARCHAR(10);
SELECT cars.car_id,cars.car_name,cars.car_type FROM cars WHERE car_type IN ("D") order by car_id;
SELECT owner.owner_id,owner.owner_name,owner.address,owner.phone_no FROM owner INNER JOIN cars c ON c.owner_id=owner.owner_id WHERE car_name IN ("Swift") order by owner_id;
SELECT rentals.rental_id,rentals.car_id,rentals.customer_id,rentals.km_driven FROM rentals WHERE return_date="2018-03-10";
SELECT DISTINCT car_id,count(car_id)AS count FROM rentals group by car_id;




