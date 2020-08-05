create table igrac
(
    igrac_id      integer not null
        constraint igrac_pkey
            primary key,
    igrac_broj    integer,
    igrac_godiste integer,
    igrac_ime     varchar(255),
    igrac_prezime varchar(255),
    igrac_tim     varchar(255)
);

alter table igrac
    owner to postgres;


