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

create table LOGINS (
    username    varchar(50) unique ,
    password    varchar(50)             ,
    role        int                     ,
    foreign key (username) references STAFFS (idstaff) ,
    foreign key (username) references STAFFS (idcust)  
);

-- insert into BANKS
-- values ('00000', 'Sacombank');
-- insert into BANKS
-- values ('00001', 'Vietcombank');
-- insert into BANKS
-- values ('00002', 'Techcombank');
-- insert into BANKS
-- values ('00003', 'TPBank');
-- insert into BANKS
-- values ('00004', 'VPBank');
-- 
-- insert into LOGINS
-- values ('admin', 'admin', 0);
-- insert into LOGINS
-- values ('phong', 'phong', 1);
-- insert into LOGINS
-- values ('user', 'user', 2);
-- 
-- insert into STAFFS
-- values ('025786236', '0123456', 'Nguyễn Hoàng Long', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 1);
-- 
-- insert into CUSTOMERS
-- values ('025786236', '0123456', 'Nguyễn Hoàng Phong', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 2);
-- 
-- select * from BANKS