-- select 연습
select * 
	from departments 
    order by dept_no 
    limit 0, 3; -- 0부터 3개

select dept_no, dept_name 
	from departments;

-- alias (as  생략가능)
-- 예제1: employees 테이블에서 직원의 이름, 성별 입사일을 출력
select first_name as 'firstName', -- 카멜 표기법  
		gender as '성별', 
		hire_date '입사일'
	from employees;
   
-- 예제1: employees 테이블에서 직원의 이름(성 + 이름), 성별 입사일을 출력
select concat(first_name, last_name) as '이름', -- 웬만하면 디비에서 다 만들어서 자바에서 사용하자!
		gender as '성별', 
		hire_date '입사일'
	from employees;   

    