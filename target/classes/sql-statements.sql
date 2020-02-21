DROP TABLE IF EXISTS Teacher;
create table Teacher(
id int PRIMARY KEY auto_increment,
firstName varchar (100) not null,
lastName varchar (100) not null,
age int not null
);
SELECT * from Teacher;
INSERT INTO Teacher(firstName, lastName, age) 
VALUES ('John', 'Doe', 36);
 
INSERT INTO Teacher(firstName, lastName, age) 
VALUES ('Jane', 'Doe', 32);

INSERT INTO Teacher(id, firstName, lastName, age) 
VALUES (900, 'Mary', 'Boo', 67);

INSERT INTO Teacher(id, firstName, lastName, age) 
VALUES (901, 'Steve', 'Wallace', 54);

UPDATE Teacher
set lastName = 'Parker'
WHERE id = 900;

UPDATE Teacher
set firstName = 'Steven'
where id = 901;

SET SQL_SAFE_UPDATES = 0;
alter table Teacher 
DROP COLUMN age;

SELECT * from Teacher;