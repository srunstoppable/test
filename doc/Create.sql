/*�����������ͱ�*/
if exists(Select 1 From Sysobjects Where Name='s_identity') 
 drop table  s_identity;
create table s_identity(
    id int identity(1,1) primary key ,
    name varchar(50) not null unique
);


/*������¼��Ϣ��*/
if exists(Select 1 From Sysobjects Where Name='UserInfo') 
 drop table  UserInfo;
create table UserInfo 
(
 id varchar(11) primary key not null,
    password varchar(50) not null,
    name varchar(50) not null,
    iden varchar(50) not null,
    foreign key (iden) references s_identity(name)
);




/*������ͨ��ְ����Ϣ��*/
if exists(Select 1 From Sysobjects Where Name='TeacherInfo') 
 drop table  TeacherInfo;
create table TeacherInfo 
(
TeacherID int identity(1,1) primary key not null,
UserID varchar(11) not null,
UserName nvarchar(20) not null,
Duty nvarchar(10)  null,
Content nvarchar(50)  null,
foreign key(UserID) references UserInfo(id)
);


/*�����γ���Ϣ��*/



/*�����ύ���������ر�*/
if exists(Select 1 From Sysobjects Where Name='OnOff') 
 drop table  OnOff;
create table OnOff
(
id int identity (1,1) primary key not null,
AdminID varchar(11)  not null unique ,
OnOffState nvarchar(5) not null check (OnOffState in ('','')),
foreign key(AdminID) references userinfo(id),
);


/*������ʽ��*/
if exists(Select 1 From Sysobjects Where Name='Formula') 
 drop table  Formula;
create table Formula
(
FormulaID int identity(1,1) primary key not null, 
FormulaName nvarchar(50) not null,
FormulaValue nvarchar(50) not null
);


/*����������*/
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





