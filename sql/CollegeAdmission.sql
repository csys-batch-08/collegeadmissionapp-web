
create table user_details(User_Id int generated always as identity start with 1 Primary key,
Name varchar2(40) not null,
User_Name varchar2(50) not null, 
Email varchar2(50) not null Unique, 
Mobile_Number int not null, 
User_Password varchar2(50) not null);

select * from user_details;
commit;
truncate table user_details;
ALTER TABLE user_details 
 Name varchar2(30) default 'sasi';

desc user_details;

insert into user_details (user_name,email,mobile_number,user_password) values('Sasi', 'sasi@gmail.com', 9150587671, 'sasi1992');
insert into user_details (user_name,email,mobile_number,user_password) values('Karthi', 'karthi@gmail.com', 9597825963, 'karthi1998');
insert into user_details (user_name,email,mobile_number,user_password) values('Darshan', 'darshan@gmail.com', 9876543210, 'darshan2003');

create table admin_details(Admin_Id int Primary key, 
Admin_Name varchar2(50) not null, 
Email varchar2(50) not null Unique,
Admin_Password varchar2(50) not null);

drop table admin_details;
insert into admin_details values(6385, 'Sekar', 'sekar@admin.com', 'sekar1961');
select* from admin_details;

create table application_details
(application_id int generated always as identity start with 1000 primary key,
user_id int,
foreign key(User_Id) references user_details(User_Id),
Student_Name varchar2(50) not null, 
Father_Name varchar2(50) not null, 
Date_of_Birth date not null,
Aadhar_Number long not null,
SSLC_Mark int not null, 
HSC_Mark int not null, 
Address varchar2(100) not null, 
City varchar2(50) not null,
Pincode int not null,
User_State varchar2(40) not null, 
Nationality varchar2(40) not null);

select * from application_details;
commit;
truncate table application_details;
drop table application_details;
update application_details set sslc='bala' where user_id = 24; 

create table courses_details(Course_Id int primary key,
Course_Type varchar2(10) constraint course_type_cons check (Course_Type IN ('UG','PG')),
Course_Name varchar2(50),
Admission_Fees int,
Tuition_Fees int);

select * from courses_details;
insert into courses_details values(121, 'UG', 'BA English', 3000, 12000);
insert into courses_details values(132, 'UG', 'BA Tamil', 2000, 10000);
insert into courses_details values(221, 'PG', 'MA English', 10000, 18000);
insert into courses_details values(241, 'PG', 'MA Tamil', 7000, 15000);
insert into courses_details values(232, 'PG', 'Msc Maths', 15000, 25000);

create table application_status(Status_Id int generated always as identity start with 1 primary key,
User_Id int,
foreign key(User_Id) references user_details(User_Id),
application_id int,
foreign key(application_id) references application_details(application_id),
Course_Id int,
foreign key(Course_Id) references courses_details(Course_Id),
payment_status varchar2(20),
application_status varchar2(20));

select * from application_status;
drop table application_status;

desc application_details;
select* from application_status;
insert into application_details(user_id,Student_Name,Father_Name,Date_of_Birth,Aadhar_Number,Sslc_Mark,Hsc_Mark,Address,City,Pincode,User_State,Nationality) values (24,'Darshan','Prabakar','27-04-2003',5432109,444,888,'Anna Nagar','Madurai',625002,'Tamilnadu','Indian');
insert into application_details(user_id,Student_Name,Father_Name,Date_of_Birth,Aadhar_Number,Sslc_Mark,Hsc_Mark,Address,City,Pincode,User_State,Nationality) values (45,'Kabil','Maheshwaran','26-04-2000',5555109,434,868,'Anna Salai','Chenna',600002,'Tamilnadu','Indian');


select * from application_details;
drop table courses_details;
select * from application_details;
select * from user_details;
commit;

select * from admin_details;

create table card_details(
User_Id int,
card_id NUMBER GENERATED ALWAYS AS IDENTITY START WITH 1 primary key,
card_number number(16),
cvv_number number(3),
cardholder_name varchar2(30),
FOREIGN KEY(User_Id) REFERENCES user_details(User_Id));

Drop table card_details;
select * from card_details;
