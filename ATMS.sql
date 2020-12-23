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
    typecard    varchar(10)             ,
    foreign key (idbank) references BANKS (idbank)
);

create table USERS (
    id          char(9)                 ,
    ids         char(7)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     ,
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             , 
    role        int                     ,
    primary key (id, ids)           
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

insert into USERS
values ('123456789', 'AD01234', 'Lê Hoàng Song', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 0);
insert into USERS
values ('234567890', 'NV01234', 'Nguyễn Thanh Long', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 1);
insert into USERS
values ('345678901', 'KH01234', 'Nguyễn Hoàng Phong', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', 2);

select * from USERS where "ROLE" = 2
