-- 서브쿼리(SUBQUERY) SQL 문제입니다.

-- 문제1.
-- 현재 평균 연봉보다 많은 월급을 받는 직원은 몇 명이나 있습니까?
select count(b.emp_no) as '평균보다 높은 월급 받는 직원'
  from salaries a, employees b
 where a.emp_no = b.emp_no
   and a.to_date = '9999-01-01'
   and a.salary > (select avg(salary) from salaries where to_date='9999-01-01')
order by a.salary desc; 

-- 문제2. 
-- , 각 부서별로 최고의 급여를 받는 사원의 사번, 이름, 부서 연봉을 조회하세요. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다. 
select concat(b.first_name, b.last_name) 이름, b.emp_no 사번, d.dept_name 부서, c.salary 연봉
  from dept_emp a,
       employees b,
       salaries c,
       departments d,
       (select a.dept_no, max(b.salary) as max_salary
		    from dept_emp a, salaries b
            where a.emp_no=b.emp_no
            group by a.dept_no) e
   where a.emp_no = b.emp_no
   and b.emp_no = c.emp_no
   and d.dept_no = a.dept_no
   and a.dept_no = e.dept_no   
   and c.salary = e.max_salary
   order by c.salary desc;
   
-- 문제3.
-- 현재, 자신의 부서 평균 급여보다 연봉(salary)이 많은 사원의 사번, 이름과 연봉을 조회하세요 
select b.emp_no as '사번', concat(b.first_name,b.last_name) 이름 , a.salary 연봉
  from salaries a, employees b
 where a.emp_no = b.emp_no
   and a.to_date = '9999-01-01'
   and a.salary > (select avg(salary) 
						from salaries 
						where to_date='9999-01-01')
order by a.salary desc; 

-- 문제4.
-- 현재, 사원들의 사번, 이름, 매니저 이름, 부서 이름으로 출력해 보세요.
select 	e.emp_no 사번, 
		concat(e.first_name,e.last_name) 이름,  
        concat(me.first_name,me.last_name) 매니저이름, 
        de.dept_name 부서이름
   from employees e, 
		employees me, 
		dept_manager dm, 
		departments de, 
		dept_emp d
    where me.emp_no = dm.emp_no
    and e.emp_no = d.emp_no
    and de.dept_no = d.dept_no
    and dm.to_date='9999-01-01'
    and d.to_date='9999-01-01';
    
-- 문제5.
-- 현재, 평균연봉이 가장 높은 부서의 사원들의 사번, 이름, 직책, 연봉을 조회하고 연봉 순으로 출력하세요.
	select de.dept_name
	from salaries s, dept_emp d, departments de
    where s.emp_no = d.emp_no
    and d.dept_no = de.dept_no
    and s.to_date='9999-01-01'
    and d.to_date='9999-01-01'
    group by de.dept_name
	order by avg(s.salary)desc;

-- 문제6.
-- 평균 연봉이 가장 높은 부서는? 
select dept_name 부서, max(c.avg_salary) 
  from departments, 
  (  select de.dept_name 부서, avg(salary) as avg_salary
            from departments de, dept_emp d, salaries b
           where d.emp_no = b.emp_no
             and de.dept_no = d.dept_no
             and d.to_date = '9999-01-01'
             and b.to_date = '9999-01-01'
        group by de.dept_name) c;
-- 문제7.
--  연봉이 가장 높은 직책?
select max(c.title) as '연봉이 가장 높은 직책', b.salary 연봉
  from employees a,
       salaries b,
       titles c,
       ( select a.dept_no, max(b.salary) as max_salary
			from dept_emp a, salaries b
            where a.emp_no=b.emp_no
            group by a.dept_no) e 
   where a.emp_no = b.emp_no
   and a.emp_no = c.emp_no
   and b.salary = e.max_salary
   order by b.salary desc;
   
-- 문제8.
-- 현재 자신의 매니저보다 높은 연봉을 받고 있는 직원은?
-- 사원이름, 연봉, 매니저 이름, 메니저 연봉 순으로 출력합니다.

