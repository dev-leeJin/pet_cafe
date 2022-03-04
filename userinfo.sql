create table userinfo(
user_num int auto_increment primary key,
user_id varchar(20) unique,
pw varchar(20) not null,
name varchar(20) not null,
email varchar(20),
admin varchar(2) not null);

select*from userinfo;