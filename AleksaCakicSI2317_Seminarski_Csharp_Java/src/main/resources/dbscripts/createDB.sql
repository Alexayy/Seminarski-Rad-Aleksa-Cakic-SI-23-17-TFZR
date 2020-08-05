-- Database: seminarski

-- DROP DATABASE seminarski;

CREATE DATABASE seminarski
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

COMMENT ON DATABASE seminarski
    IS 'Baza za seminarski iz softverskih prevodioca';