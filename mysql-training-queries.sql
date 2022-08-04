SELECT * FROM employee;

select * from department;

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
