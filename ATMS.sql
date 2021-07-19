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
    constraint fk_CARDS_idbank foreign key (idbank) references BANKS (idbank)
);
create table USERS (
    ids         char(7)     primary key ,
    id          char(9)                 ,
    fullname    varchar(50)             ,
    birthday    date                    ,
    gender      int                     ,
    nativeplace varchar(100)            ,
    telephone   char(10)                ,
    password    varchar(50)             ,
    account     char(9)                 ,
    balance     bigint                  ,
    role        int                     ,
    idbank      char(3)                 ,
    manage      char(7)                 ,
    constraint fk_USERS_account foreign key (account) references CARDS (idaccount) ,
    constraint fk_USERS_idbank foreign key (idbank) references BANKS (idbank)
);
insert into USERS (IDS, PASSWORD, ROLE)
values ('AD00000', '123', 0);
insert into USERS (IDS, PASSWORD, ROLE, IDBANK)
values ('AD00001', '123', 0, 'ARB');
insert into USERS (IDS, PASSWORD, ROLE, IDBANK)
values ('AD00002', '123', 0, 'BID');
insert into USERS (IDS, PASSWORD, ROLE, IDBANK)
values ('AD00003', '123', 0, 'SCB';
insert into USERS (IDS, PASSWORD, ROLE, IDBANK)
values ('AD00004', '123', 0, 'TCB');

select * from BANKS