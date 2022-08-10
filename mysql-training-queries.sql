SELECT * FROM employee;

create table department (
	dept_id int(4),
	dept_name text(30),
	dept_fund float(8,2),
	head_of_dept int(4)
);

select * from department;

select dept_id as DEPARTMENT_ID, dept_name NAME, dept_fund 'FUND' 
from department
where dept_fund between 100000 and 200000;

update department set dept_name = 'ME' where dept_id = 103;

delete from department where dept_id = 102;

INSERT INTO `department` VALUES (101,'CSE',400000, 1);
INSERT INTO `department` VALUES (102,'ECE',300000, 2);
INSERT INTO `department` VALUES (103,'ME',100000, 3);
INSERT INTO `department` VALUES (112,'PHYSICS',200000, 4);

delete from department where dept_id = 113;

alter table department add constraint dept_pk primary key(dept_id);

alter table department add constraint dept_name_uniq unique (dept_name);

alter table employee add constraint dept_foriegn_key foreign key(department) references department(dept_id);

alter table employee drop constraint dept_foriegn_key;

update employee set department=113 where id=101;

select adddate(sysdate(), interval 2 YEAR) from dual;

select CONVERT("2017-08-29", DATE) from dual;

SELECT DATE_FORMAT("2022-03-30", "%m %d %Y");

select concat(CONVERT(sysdate(), CHAR), ' this is converted string') from dual;

select CONVERT("201722", DECIMAL)/10 from dual;

SELECT NULLIF(25, 35) from dual;

SELECT IFNULL(salary, "any value other than null") from employee;

SELECT IF(500<1000, "YES", "NO") from dual;

SELECT name, salary,
CASE
    WHEN salary <= 10000 THEN "The salary is less than or equal to 10000"
    WHEN salary <= 15000 THEN "The salary is less than or equal to 15000"
    WHEN salary > 15000 THEN "The salary is greater than 15000"
    ELSE "this is elese"
END as context_val
FROM employee;

select max(salary) maxSalary, min(salary) minSalary, avg(salary) avgSalary, sum(salary) sumSalary from employee; 

select 12.656568, round(12.656568), round(12.656568, 5), truncate(12.656568, 5); 

select 12.656568, floor(12.656568), ceil(12.656568), mod(12.656568, 5), abs(-12.656568); 

select count(*) Total_Employees from employee;

select rpad("1234567", 10, '*') modified_name from dual;

select count(*) from employee;

SELECT CONCAT("SQL ", "learning ", "is ", "fun!") AS ConcatenatedString;

SELECT CONCAT_WS("-", "SQL", "learning", "is", "fun!") AS ConcatenatedString;

INSERT INTO `java-dev`.`department`
(`dept_id`,
`dept_name`,
`dept_location`,
`dept_fund`)
VALUES
(101,
'CSE',
'Bombay',
400000);

DROP TRIGGER ins_sum;

DROP TABLE account;

CREATE TABLE account (acct_num INT, amount DECIMAL(10,2));

CREATE TRIGGER ins_sum BEFORE INSERT ON account
FOR EACH ROW SET @sum = @sum + NEW.amount;

SET @sum = 0;
INSERT INTO account VALUES(135,200),(142,300),(98,500);
SELECT @sum AS 'Total amount inserted';

select * from account;

delimiter //
CREATE TRIGGER upd_check BEFORE UPDATE ON account
       FOR EACH ROW
       BEGIN
           IF NEW.amount < 0 THEN
               SET NEW.amount = 0;
           ELSEIF NEW.amount > 100 THEN
               SET NEW.amount = 100;
           END IF;
		END;
        
UPDATE `java-dev`.`account`
SET
`amount` = 121.45
WHERE acct_num = 137;

delimiter //
CREATE PROCEDURE empcount (IN empcity CHAR(10), OUT employeecount INT)
       BEGIN
         SELECT COUNT(*) INTO employeecount FROM employee
         WHERE city = empcity;
       END;
       
CALL empcount('Pune', @employeecount);
       
select @employeecount;

CREATE FUNCTION greetWith (greeting CHAR(20), name CHAR(20))
RETURNS CHAR(50) DETERMINISTIC
RETURN CONCAT(greeting, " ", name,' for completing database training!');

SELECT greetWith('Wishes for', 'John'), greetWith('Congrats', 'Arun');

CREATE FUNCTION areaOfCircle (radius DOUBLE)
RETURNS DOUBLE DETERMINISTIC
RETURN 3.142*radius*radius;

select areaOfCircle(17) as area;
