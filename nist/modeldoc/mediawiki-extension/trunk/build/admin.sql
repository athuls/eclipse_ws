CREATE DATABASE  `modeldoc` ;


DROP TABLE IF EXISTS md_account;
DROP TABLE IF EXISTS md_modeldoc_instance;


CREATE TABLE md_modeldoc_instance (
  instanceID        serial          primary key,
  name              varchar(40)     not null,
  description       varchar(200)    not null,
  ownerUsername             varchar(20)     not null,
  
  UNIQUE(ownerUsername, name),
  FOREIGN KEY(ownerUsername) REFERENCES md_account(username)
);

CREATE TABLE md_account (
  username          varchar(20)     not null,
  password          varchar(20)     not null,
  firstname         varchar(40)     not null,
  lastname          varchar(40)     not null,
  admin             boolean         not null
);

INSERT INTO md_account (username, password, firstname, lastname, admin)
VALUES ('aprakash', 'bip', 'Atul', 'Prakash', true);