create table BANKS  (
    idbank      char(5)     primary key ,
    namebank    varchar(50)             
);

create table CARDS  (
    idcard      char(12)                ,
    idaccount   char(12)                ,
    startday    date                    ,
    endday      date                    ,
    idbank      char(5)                 ,
    typecard    varchar(10)             ,
    primary key (idaccount)             ,
    foreign key (idbank) references BANKS (idbank)
);

create table USERS (
    id          char(9)     primary key ,
    ids         char(7)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     ,
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             ,
    account     char(12)                ,
    balance     bigint                  ,
    role        int                     ,
    foreign key (account) references CARDS (idaccount)
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

insert into CARDS
values ('123456789012', '234567890123', '2020-12-23', '2024-12-23', null, 'Visa');
insert into CARDS
values ('123456789013', '234567890124', '2020-12-23', '2024-12-23', null, 'Nội địa');

insert into USERS
values ('123456789', 'AD01234', 'Lê Hoàng Song', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', null, null, 0);
insert into USERS
values ('234567890', 'NV01234', 'Nguyễn Thanh Long', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', null, null, 1);
insert into USERS
values ('345678901', 'KH01234', 'Nguyễn Hoàng Phong', '1998-03-24', 0, 'TP.HCM', '0589884191', '24031998', null, 5000000000, 2);

select * from USERS where "ROLE" = 2