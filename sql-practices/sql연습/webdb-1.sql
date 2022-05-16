drop table member;

create table member(
	no int(11) not null auto_increment,
    email varchar(200) not null,
    password varchar(64) not null,
    name varchar(100) not null,
    department varchar(100),
    primary key(no)
);
desc member;

alter table member add juminbunho char(13) not null;
desc member;
alter table member drop juminbunho;
desc member;
alter table member add juminbunho char(13) not null after email;
desc member;
alter table member change department department char(13) not null; -- 재정의
desc member;
alter table member add self_intro text;
desc member;
alter table member drop juminbunho;
desc member;

-- insert
insert 
	into member
values (null, 'jyj6010@naver.com', password('1234'), '정유진', '개발팀', null); -- password 함수 지원 (암호화_

insert 
	into member(no, email, name, password, department)
    value(null, 'jyj60101@naver.com', '정유성', '1234', '개발팀');
    
select * from member;

-- update
update member
	set email ='jyj60102', password=password('1234'), no=2
    where no = 5;
    
-- delete
delete 
	from member 
    where no =3; 

select * from member;

-- transaction 
select @@autocommit;
set autocommit = 0; -- autocommit 제거

insert 
	into member(no, email, name, password, department)
    value(null, 'jyj60101@naver.com', 'yujin', '1234', '개발팀');

select *from member;










