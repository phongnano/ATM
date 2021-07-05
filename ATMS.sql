create table BANKS  (
    idbank      char(3)     primary key ,
    namebank    varchar(50)             ,
    logobank    blob                    
);

create table CARDS  (
    idcard      char(9)                 ,
    idaccount   char(9)                 ,
    startday    date                    ,
    endday      date                    ,
    idbank      char(3)                 ,
    typecard    varchar(10)             ,
    pin         char(6)                 ,
    primary key (idaccount)             ,
    foreign key (idbank) references BANKS (idbank)
);

create table USERS (
    ids         char(7)     primary key ,
    id          char(9)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     , --0: Nam, 1: Nữ
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             ,
    account     char(9)                 ,
    balance     bigint                  ,
    role        int                     ,
    idbank      char(3)                 ,
    manage      char(7)                 ,
    foreign key (account) references CARDS (idaccount) ,
    foreign key (idbank) references BANKS (idbank)
);

select IDS, PASSWORD, IDBANK from USERS where IDS = 'AD00003' and PASSWORD = '123' and IDBANK = 'SCB'

insert into USERS (IDS, PASSWORD, IDBANK)
values ('AD00000', '123', 'ARB');
insert into USERS (IDS, PASSWORD, IDBANK)
values ('AD00001', '123', 'BID');
insert into USERS (IDS, PASSWORD, IDBANK)
values ('AD00002', '123', 'SCB');
insert into USERS (IDS, PASSWORD, IDBANK)
values ('AD00003', '123', 'TCB');

SELECT * FROM USERS