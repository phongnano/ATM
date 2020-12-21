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
insert into BANKS
values ('00003', 'TPBank');
insert into BANKS
values ('00004', 'VPBank');

insert into STAFFS
values ('025786236', 'AD01234', 'Nguyễn Hoàng Long', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 0);
insert into STAFFS
values ('025786236', 'NV01234', 'Nguyễn Hoàng Long', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 1);

insert into CUSTOMERS
values ('025786236', 'KH01234', 'Nguyễn Hoàng Phong', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 2);

select IDSTAFF, PASSWORD, "ROLE" from STAFFS
union
select IDCUST, PASSWORD, "ROLE" from CUSTOMERS