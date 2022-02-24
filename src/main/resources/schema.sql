CREATE TABLE kunde_tbl
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    film      VARCHAR(20) NOT NULL,
    antall    INTEGER(100) NOT NULL,
    fornavn   VARCHAR(20) NOT NULL,
    etternavn VARCHAR(20) NOT NULL,
    telefonNr VARCHAR(20) NOT NULL,
    email     VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);