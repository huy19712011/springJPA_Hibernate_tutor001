create table person(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES
    (100001, 'ASD', 'MY DINH', CURDATE()),
    (100002, 'FGH', 'MY DINH', CURDATE()),
    (100003, 'JKL', 'MY DINH', CURDATE()),
    (100004, 'JKL', 'MY DINH', CURRENT_TIMESTAMP()),
--    (100009, 'JKL', 'MY DINH', SYSDATE()), -- OK on MySQL, but not H2
    (100005, 'JKL', 'MY DINH', CURRENT_DATE())
