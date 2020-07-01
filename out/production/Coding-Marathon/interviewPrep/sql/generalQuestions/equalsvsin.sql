## Suppose we have a situation where we have to return multiple rows according to multipple condition
##Then we use IN otherwise =
#When subquery returns multiple results , use IN instead of =


# = compares only single value
##Here below, select deptno from dept where deptno in (10,20,30) will return multiple rows with deptno 10 20 30,
## select * from emp where deptno in will process multiple rows



select * from emp where deptno in (select deptno from dept where deptno in (10,20,30))

