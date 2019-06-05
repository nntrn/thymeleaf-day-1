CREATE TABLE IF NOT EXISTS "emp" (
	"empno"	number(4 , 0),
	"ename"	varchar2(10),
	"job"	varchar2(9),
	"mgr"	number(4 , 0),
	"hiredate"	date,
	"sal"	number(7 , 2),
	"comm"	number(7 , 2),
	"deptno"	number(2 , 0),
	CONSTRAINT "fk_deptno" FOREIGN KEY("deptno") REFERENCES "dept"("deptno"),
	CONSTRAINT "pk_emp" PRIMARY KEY("empno")
);
CREATE TABLE IF NOT EXISTS "dept" (
	"deptno"	number(2 , 0),
	"dname"	varchar2(14),
	"loc"	varchar2(13),
	CONSTRAINT "pk_dept" PRIMARY KEY("deptno")
);