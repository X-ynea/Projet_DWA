CREATE DATABASE IF NOT EXISTS db;
USE db;

-- Table: sport
CREATE TABLE IF NOT EXISTS sport
(
    code_sport INT          NOT NULL AUTO_INCREMENT,
    intitule   VARCHAR(255) NOT NULL,
    PRIMARY KEY (code_sport)
);

-- Table: discipline
CREATE TABLE IF NOT EXISTS discipline
(
    code_discipline INT          NOT NULL AUTO_INCREMENT,
    intitule        VARCHAR(255) NOT NULL,
    code_sport      INT          NOT NULL,
    PRIMARY KEY (code_discipline),
    FOREIGN KEY (code_sport) REFERENCES sport (code_sport)
);

