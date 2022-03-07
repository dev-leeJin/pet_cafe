CREATE SCHEMA easydog;

create table userinfo(
	user_num int auto_increment primary key,
	user_id varchar(20) unique,
	pw varchar(20) not null,
	name varchar(20) not null,
	email varchar(20),
	admin varchar(2) not null
);

select*from userinfo;

CREATE TABLE pet_lost(
	lost_num INT AUTO_INCREMENT PRIMARY KEY,
	lost_name VARCHAR(15) NOT NULL,
	user_id VARCHAR(20),
	lost_zone VARCHAR(100) NOT NULL,
	lost_size INT(100),
	lost_phone INT,
	FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);
CREATE TABLE petTbl(
	pet_num INT AUTO_INCREMENT PRIMARY KEY,
	user_id VARCHAR(20),
	pet_kind VARCHAR(50) NOT NULL,
	pet_name VARCHAR(20) NOT NULL,
	pet_age INT NOT NULL,
	pet_gender BOOLEAN NOT NULL,
	FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);
CREATE TABLE boardTbl(
	board_num int AUTO_INCREMENT PRIMARY KEY ,
    title varchar(100) not null,
    content varchar(2000) not null,
    writer varchar(30) not null,
    bdate datetime default now(),
    mdate datetime default now(),
    hit int default 0
);
CREATE TABLE pet_contest(
	cont_num INT(100) AUTO_INCREMENT PRIMARY KEY,
	user_id VARCHAR(20),
	pet_num INT,
	cont_hit INT DEFAULT 0,
	cont_votes INT NOT NULL,
	FOREIGN KEY (`pet_num`) REFERENCES `petTbl` (`pet_num`),
    FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);


