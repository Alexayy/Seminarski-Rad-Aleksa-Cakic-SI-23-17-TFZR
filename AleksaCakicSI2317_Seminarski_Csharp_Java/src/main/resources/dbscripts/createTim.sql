create table tim
(
    tim_id      integer not null
        constraint tim_pkey
            primary key,
    tim_ime     varchar(50),
    tim_osnovan integer,
    tim_trener  varchar(50)
);

alter table tim
    owner to postgres;

