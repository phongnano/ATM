create table LOGINS (
    username    varchar(50) primary key ,
    password    varchar(50)             ,
    role        int                     
);

create table BANKS  (
    idbank      char(5)     primary key ,
    namebank    varchar(50)             
);

create table CARDS  (
    idcard      char(10)                ,
    idaccount   char(10)                ,
    startday    date                    ,
    endday      date                    ,
    idbank      char(5)                 ,
    foreign key (idbank) references BANKS (idbank)
);

create table STAFFS (
    id          char(9)                 ,
    idstaff     char(7)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     ,
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             , 
    role        int                     ,
    primary key (idstaff, id)           
);

create table CUSTOMERS  (
    id          char(9)                 ,
    idcust      char(7)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     ,
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             , 
    role        int                     ,
    primary key (idcust, id)            
);

insert into BANKS
values ('00000', 'Sacombank');
insert into BANKS
values ('00001', 'Vietcombank');
insert into BANKS
values ('00002', 'Techcombank');

insert into LOGINS
values ('admin', 'admin', 0);
insert into LOGINS
values ('phong', 'phong', 1);
insert into LOGINS
values ('user', 'user', 2);



select * from BANKS