CREATE TABLE costumer (
    id int not null auto_increment,
    name varchar(255) not null,
    email varchar(255) not null unique,
    PRIMARY KEY (id)
);

CREATE TABLE book (
    id int not null auto_increment,
    name varchar(255) not null,
    price double,
    costumer_id int not null,
    status varchar(100),
    PRIMARY KEY (id),
    FOREIGN KEY (costumer_id) REFERENCES costumer(id)
);