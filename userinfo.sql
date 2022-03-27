CREATE SCHEMA easydog;
USE easydog;
create table userinfo(
	user_num int auto_increment primary key,
	user_id varchar(20) unique,
	pw varchar(20) not null,
	name varchar(20) not null,
	email varchar(20),
	admin varchar(2) not null
);

CREATE TABLE pet_lost(
	lost_num INT AUTO_INCREMENT PRIMARY KEY,
	lost_name VARCHAR(15) NOT NULL,
	user_id VARCHAR(20),
	lost_zone VARCHAR(100) NOT NULL,
	lost_size VARCHAR(10),
	lost_phone INT,
    lost_date DATETIME default now(),
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
CREATE TABLE boardinfo(
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
    cont_title VARCHAR(100) NOT NULL,
    cont_content VARCHAR(2000) NOT NULL,
	pet_num INT,
	cont_hit INT DEFAULT 0,
	cont_votes INT NOT NULL,
	FOREIGN KEY (`pet_num`) REFERENCES `petTbl` (`pet_num`),
    FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);

CREATE TABLE vote(
	like_num INT AUTO_INCREMENT PRIMARY KEY,
	cont_num INT,
    user_id VARCHAR(20),
    FOREIGN KEY (`cont_num`) REFERENCES `pet_contest` (`cont_num`),
    FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);

CREATE TABLE adoptTbl(
	adopt_num INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(20),
    adopt_kind VARCHAR(50) NOT NULL,
    adopt_name VARCHAR(20) NOT NULL,
    adopt_age INT NOT NULL,
    adopt_gender BOOLEAN NOT NULL,
    adopt_price VARCHAR(8),
    adopt_phone VARCHAR(11),
    FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`user_id`)
);

INSERT INTO userinfo VALUES(null, 'easydog', 'easy', '개편한', 'easy@dog.com', 1);
INSERT INTO userinfo VALUES(null, 'easycat', 'easy', '캣편한', 'easy@cat.com', 1);
INSERT INTO petTbl VALUES(null, 'easydog', '치와와', '분조장', '2', false);
INSERT INTO petTbl VALUES(null, 'easydog', '사모예드', '털치', '4', true);
INSERT INTO petTbl VALUES(null, 'easycat', '푸들', '푸s', '6', false);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO petTbl (user_id, pet_kind, pet_name, pet_age, pet_gender) 
	(SELECT user_id, pet_kind, pet_name, pet_age, pet_gender FROM petTbl);
INSERT INTO adoptTbl VALUE(null, 'easydog', '보더콜리', '콜라', 2, 0, null, null);
INSERT INTO adoptTbl VALUE(null, 'easydog', '닥스훈트', 'daks', 1, 1, null, null);
INSERT INTO adoptTbl VALUE(null, 'easycat', '말티즈', '황금', 1, 1, null, null);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO adoptTbl (user_id, adopt_kind, adopt_name, adopt_age, adopt_gender) 
	(SELECT user_id, adopt_kind, adopt_name, adopt_age, adopt_gender FROM adoptTbl);
INSERT INTO pet_contest VALUES(null, 'easydog', '존잘개', '멋있으면 투표', 2, 0, 0);
INSERT INTO pet_contest VALUES(null, 'easycat', '안보면 후회합니다', '내 새끼가 최고', 1, 0, 0);
INSERT INTO pet_contest VALUES(null, 'easycat', '이정도면 애교왕', '정말 귀여워요', 3, 0, 0);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_contest (user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes) 
	(SELECT user_id, cont_title, cont_content, pet_num, cont_hit, cont_votes FROM pet_contest);
INSERT INTO pet_lost VALUES(null, '백수', 'easydog', '서울특별시', '중형', null, '2022-03-21');
INSERT INTO pet_lost VALUES(null, '멧돼지', 'easycat', '강원도', '대형', null, '2022-03-22');
INSERT INTO pet_lost VALUES(null, '컹컹이', 'easydog', '대구광역시', '소형', null, '2022-03-23');
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO pet_lost (lost_name, user_id, lost_zone, lost_size) 
	(SELECT lost_name, user_id, lost_zone, lost_size FROM pet_lost);
INSERT INTO boardinfo VALUES(null, '개한테 물리는 법', '개보고 짖으면 자기 욕하는 줄 알고 문다', 'easydog',now(),now(),null);
INSERT INTO boardinfo VALUES(null, '고양이 참 귀엽죠?', '개보다 고양이가 최고', 'easydcat',now(),now(),null);
INSERT INTO boardinfo VALUES(null, '도배왕', '안녕하세요 도배왕 도배르만 입니다. 벽지도배왕 아닙니다.', 'easydog',now(),now(),null);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
INSERT INTO boardinfo (title, content, writer) 
	(SELECT title, content, writer FROM boardinfo);
