-- 함수: 날짜 함수
-- insert into board values('','','','', now());
-- curdate(), current_date;
select curdate(), current_date();

-- curtime(), current_time;
select curtime(), current_time();

-- now() vs sysdate()
select now(), sysdate();
select now(), sleep(2), now();
select sysdate(), sleep(2), sysdate(); -- 함수가 실행되는시간

-- date_format
-- 2022년 05월 13일 11:39분 40초
select date_format(now(),'%Y년 %m월 %d일 %h시 %i분 %s초')'date_format'; -- Y 2022
select date_format(now(),'%y년 %m월 %d일 %h시 %i분 %s초')'date_format'; -- y 22

-- period_diff
-- YYMM, YYYYMM
-- 예) 근무개월 수
 select period_diff(date_format(curdate(), '%Y%m'), date_format(hire_date, '%Y%m')) as month
    from employees
order by month desc;    

-- date_add(=adddate), date_sub(=subdate)
-- 날짜를 date에 type(day, month, year)형식의 표현식을 더하거나 뺸다
-- 예제) 각 사원들의 근무 년 수가 5년이 되는 날은 언제인가요?
select first_name, hire_date, date_add(hire_date, interval 5 year) 
	from employees;

-- cast 형들끼리의 변화
select '12345' + '10', cast('12345' as int) + 10, concat('12345', '10');
select date_format('2022-10-10', '%Y년 %m월 %d일'), date_format(cast('2022-10-10' as date), '%Y년 %m월 %d일');
select cast(cast(1-2 as unsigned)as signed);

-- mysql type
-- varchar(4000) , char(10), text, clob(character Large Object)
-- signed(unsigned), int(integer), medium int, big int, int(11)
-- float, double
-- time, date, datetime
-- LOB: CLOB, BLOB(Binary Large Object)




    
    
    