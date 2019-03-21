create table s_identity(
    id int identity(1,1) primary key ,
    name varchar(50) not null unique
);

create table userinfo(
    id varchar(11) primary key not null,
    password varchar(50) not null,
    name varchar(50) not null,
    iden varchar(50) not null,
    Content nvarchar(50)  null,
    Duty nvarchar(10)  null,
    foreign key (iden) references s_identity(name)
);

insert into s_identity values('教师');

insert into s_identity values('管理员');

insert into userinfo(id,password,name,iden) values('admin','admin','admin','管理员');
insert into userinfo(id,password,name,iden) values('10004','123456','教师1','教师');
select * from userinfo

/**
  目前将所有工作量提交放在一个按钮上，控制所有
  创建提交工作量开关表
*/
if exists(Select 1 From Sysobjects Where Name='OnOff')
 drop table  OnOff;
create table OnOff
(
id int identity (1,1) primary key not null,
AdminID varchar(11)  not null unique ,
OnOffState nvarchar(5) not null check (OnOffState in ('开放','关闭')),
foreign key(AdminID) references userinfo(id),
);

insert into OnOff values ('admin','关闭')


/*创建参数表*/
if exists(Select 1 From Sysobjects Where Name='Parameter')
 drop table  Parameter;
create table Parameter
(
ParameterID int identity(1,1) primary key not null,
ParameterName nvarchar(20) not null,
ParameterSymbol nvarchar(10) not null,
ParameterValue nvarchar(10) not null,
FormulaID int ,
foreign key(FormulaID) references Formula(FormulaID)
);

/*创建公式表*/
if exists(Select 1 From Sysobjects Where Name='Formula')
 drop table  Formula;
create table Formula
(
FormulaID int identity(1,1) primary key not null,
FormulaName varchar(50) not null,
FormulaValue varchar(50) not null
);


/**  课程学期信息表    */

cerate table course_teams(
  id int identity(1,1) primary key not null,
  context varchar(10) unique not null
)
insert into course_teams values ('2018年秋');
insert into course_teams values ('2018年春');
insert into course_teams values ('2017年秋');
insert into course_teams values ('2017年春');
insert into course_teams values ('2016年秋');
insert into course_teams values ('2016年春');


/**  工作量年度信息表    */
create table workload_teams(
  id int identity(1,1) primary key not null,
  context varchar(20) unique not null
)
insert into workload_teams values ('2018');
insert into  workload_teams values ('2017');
insert into  workload_teams values ('2016');
)



create table course_type(
  id int identity (1,1) primary key not null ,
  name varchar (11) unique not null
)
insert into course_type values ('理论课');
insert into course_type values ('实验课');
insert into course_type values ('上级课');

if exists(Select 1 From Sysobjects Where Name='Course')
 drop table  Course;
create table Course
(
CourseID int identity(1,1) primary key not null,
userid varchar(11)  not null,
CourseName varchar(20) not null,
CourseType varchar(11) not null,
teams varchar(20) not null,
foreign key(userid) references userInfo(id),
foreign key(CourseType) references course_type(name),
foreign key (teams) references  course_teams(context)
);

insert into Course values ('10004','网络安全','理论课','2018年秋')
insert into Course values ('10004','综合实践','理论课','2018年春')

   select * from course join (
   select formula.formulaname,parameter.* from formula join parameter on formula.formulaid like parameter.formulaid)tmp
   on  tmp.FormulaName like '%'+CourseType+'%' where teams like '%2018%' and userid='10004'

/*创建工作量信息表*/
if exists(Select 1 From Sysobjects Where Name='WorkLoad')
 drop table  WorkLoad;
create table WorkLoad
(
WorkLoadID int identity(1,1) primary key not null,
userid varchar(11) not null,
WorkLoadValue float,
teams varchar(20) unique not null,
foreign key(userid) references userinfo(id) ,
foreign key(teams) references workload_teams(context)
);

insert into WorkLoad values ('10004',100,'2018')
alter table userinfo drop column content,duty

---------------------------------------------- 2.0版本 权限角色用户关系表        ---------------------------------------
create table userinfo
(
	id varchar(20) not null primary key,
	name varchar(20) ,
	password varchar(100) not null
)

insert into userinfo values('admin','admin','admin');
insert into userinfo values('10004','张三','123456');


create table role
(
	id int identity(1,1)  not null primary key,
	name varchar(100) not null
)
insert into role values ('管理员')
insert into role values ('教师')


create table authority
(
	id int identity(1,1) not null primary key,
	name varchar(100) not null,
	parent_id int,
	url varchar(100) ,

)
insert into authority(name,parent_id )values ('提交开关',0);
insert into authority(name,parent_id )values ('工作量操作',0);
insert into authority(name,parent_id )values ('工作量提交',1);
insert into authority(name,parent_id )values ('工作量查询',1);
insert into authority(name,parent_id )values ('计算公式和参数操作',0);
insert into authority(name,parent_id )values ('公式操作',5);
insert into authority(name,parent_id )values ('参数操作',5);


create table user_role
(
	id int identity(1,1) not null primary key,
	userid varchar(20) not null,
	roleid int not null,
	foreign key (userid) references userinfo(id),
	foreign key (roleid) references role(id)
)

insert user_role values ('10004',2)
insert into user_role values ('admin',1)


create table role_authority
(
	id int identity(1,1)not null primary key,
	roleid int not null,
	authorityid int null,
)

insert into role_authority values (1,1)
insert into role_authority values (1,2)
insert into role_authority values (1,3)
insert into role_authority values (1,4)
insert into role_authority values (1,5)
insert into role_authority values (1,6)
insert into role_authority values (1,7)
insert into role_authority values (2,2)
insert into role_authority values (2,3)
insert into role_authority values (2,4)

select a.* from authority a,role_authority ra,role r

where r.id=ra.roleid and ra.authorityid=a.id and r.id in (
select r.id from  userinfo u,role r,user_role ur where u.id='10004' and u.id=ur.userid and ur.roleid=r.id) order by a.parent_id