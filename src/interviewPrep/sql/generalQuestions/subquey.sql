## Select all columns from emp where the location of employee is INDIA , but here the table does not have the location , it only have deptno ,
## so get the deptno from dept table wrt location

select * from emp where deptno=(select deptno from dept where loc='INDIA')

