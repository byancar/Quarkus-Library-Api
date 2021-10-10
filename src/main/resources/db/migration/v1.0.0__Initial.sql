
CREATE TABLE book_genre (
	id int NOT NULL,
	description varchar(255) NULL,
	"name" varchar(255) NULL,
	CONSTRAINT book_genre_pkey PRIMARY KEY (id)
);

CREATE TABLE customer_address (
	id int NOT NULL,
	address varchar(255) NULL,
	city varchar(255) NULL,
	country varchar(255) NULL,
	"number" varchar(255) NULL,
	postal_code varchar(255) NULL,
	state int NULL,
	CONSTRAINT customer_address_pkey PRIMARY KEY (id)
);

CREATE TABLE revinfo (
	rev int NOT NULL,
	revtstmp int NULL,
	CONSTRAINT revinfo_pkey PRIMARY KEY (rev)
);


CREATE TABLE book (
	id int NOT NULL,
	author varchar(255) NULL,
	availible_quantity int4 NULL,
	edition int NULL,
	is_availible bool DEFAULT TRUE,
	"name" varchar(255) NULL,
	publisher varchar(255) NULL,
	genre_id int NULL,
	CONSTRAINT book_pkey PRIMARY KEY (id),
	CONSTRAINT book_genre_fk FOREIGN KEY (genre_id) REFERENCES book_genre(id)
);

CREATE TABLE book_aud (
	id int NOT NULL,
	rev int NOT NULL,
	revtype int NULL,
	author varchar(255) NULL,
	availible_quantity int NULL,
	edition int NULL,
	loan_return_date bool NULL,
	"name" varchar(255) NULL,
	publisher varchar(255) NULL,
	genre_id int NULL,
	CONSTRAINT book_aud_pkey PRIMARY KEY (id, rev),
	CONSTRAINT revinfo_book_fk FOREIGN KEY (rev) REFERENCES revinfo(rev)
);

CREATE TABLE book_genre_aud (
	id int NOT NULL,
	rev int NOT NULL,
	revtype int NULL,
	description varchar(255) NULL,
	"name" varchar(255) NULL,
	CONSTRAINT book_genre_aud_pkey PRIMARY KEY (id, rev),
	CONSTRAINT revinfo_book_genre_fk FOREIGN KEY (rev) REFERENCES revinfo(rev)
);

CREATE TABLE customer (
	id int NOT NULL,
	email varchar(255) NULL,
	mobile varchar(255) NULL,
	"name" varchar(255) NULL,
	address_id int NULL,
	CONSTRAINT customer_pkey PRIMARY KEY (id),
	CONSTRAINT customer_address_fk FOREIGN KEY (address_id) REFERENCES customer_address(id)
);

CREATE TABLE customer_address_aud (
	id int NOT NULL,
	rev int NOT NULL,
	revtype int NULL,
	address varchar(255) NULL,
	city varchar(255) NULL,
	country varchar(255) NULL,
	"number" varchar(255) NULL,
	postal_code varchar(255) NULL,
	state int NULL,
	CONSTRAINT customer_address_aud_pkey PRIMARY KEY (id, rev),
	CONSTRAINT revinfo_customer_address_fk FOREIGN KEY (rev) REFERENCES revinfo(rev)
);

CREATE TABLE customer_aud (
	id int NOT NULL,
	rev int NOT NULL,
	revtype int NULL,
	email varchar(255) NULL,
	mobile varchar(255) NULL,
	"name" varchar(255) NULL,
	address_id int8 NULL,
	CONSTRAINT customer_aud_pkey PRIMARY KEY (id, rev),
	CONSTRAINT revinfo_customer_fk FOREIGN KEY (rev) REFERENCES revinfo(rev)
);

CREATE TABLE loan (
	id int NOT NULL,
	loan_date timestamp NULL,
	loan_return_date timestamp NULL,
	book_id int NULL,
	customer_id int NULL,
	CONSTRAINT loan_pkey PRIMARY KEY (id),
	CONSTRAINT loan_book_fk FOREIGN KEY (book_id) REFERENCES book(id),
	CONSTRAINT loan_customer_fk FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE loan_aud (
	id int NOT NULL,
	rev int NOT NULL,
	revtype int NULL,
	loan_date timestamp NULL,
	loan_return_date timestamp NULL,
	book_id int NULL,
	customer_id int NULL,
	CONSTRAINT loan_aud_pkey PRIMARY KEY (id, rev),
	CONSTRAINT revinfo_loan_aud_fk FOREIGN KEY (rev) REFERENCES revinfo(rev)
);