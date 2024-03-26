CREATE DATABASE IF NOT EXISTS db;
USE db;

create table joueur (
    score_partie integer,
    id bigint not null,
    partie_id bigint,
    primary key (id)
);

create table partie (
    nbr_couleur integer not null,
    nbr_nombre integer not null,
    nbr_tour integer not null,
    timer integer not null,
    total_clics_rapides integer not null,
    total_clics_reussis integer not null,
    code_partie bigint generated by default as identity,
    createur bigint unique,
    difficulte varchar(255) check (difficulte in ('SIMPLE','DIFFICILE')),
    statut varchar(255) check (statut in ('EN_ATTENTE','EN_COURS','TERMINEE')),
    primary key (code_partie)
);

create table utilisateur (
    id bigint generated by default as identity,
    genre varchar(255) not null check (genre in ('MASCULIN','FEMININ','AUTRE')),
    mdp varchar(255) not null,
    pseudo varchar(255) not null, primary key (id)
    age integer not null,
    connecte boolean not null,
    en_partie boolean,
    nbr_clics_rapides integer,
    nbr_clics_reussis integer,
    nbr_clics_total integer,
    nbr_partie_jouee integer,
    nbr_victoire integer,
    score_moyen float(53),
    somme_score integer,
);

alter table if exists joueur add constraint FKqcj230uferuuaqy7kna7ovho6 foreign key (partie_id) references partie;
alter table if exists joueur add constraint FK5b6tjeiepqqbsol5lnbpbi4y3 foreign key (id) references utilisateur;
alter table if exists partie add constraint FKge7mpxxll17yxn2qdqhbonx64 foreign key (createur) references utilisateur;