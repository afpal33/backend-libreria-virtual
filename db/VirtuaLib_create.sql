-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-12-01 05:02:14.394

-- tables
-- Table: H_libreria
CREATE TABLE H_libreria (
    H_libreria_id serial  NOT NULL,
    H_date date  NOT NULL,
    H_usuario_user_id serial  NOT NULL,
    H_libro_precio_libro_id serial  NOT NULL,
    CONSTRAINT H_libreria_pk PRIMARY KEY (H_libreria_id)
);

-- Table: H_libro_precio
CREATE TABLE H_libro_precio (
    H_rating_rating_id serial  NOT NULL,
    H_google_books_google_libro_id serial  NOT NULL,
    H_amazon_amazon_item_id serial  NOT NULL,
    H_libro_precio_id serial  NOT NULL,
    H_date date  NOT NULL,
    CONSTRAINT H_libro_precio_pk PRIMARY KEY (H_libro_precio_id)
);

-- Table: H_rating
CREATE TABLE H_rating (
    H_rating_id serial  NOT NULL,
    H_calificacion int  NOT NULL,
    H_comentario varchar(500)  NOT NULL,
    H_usuario_user_id serial  NOT NULL,
    CONSTRAINT H_rating_pk PRIMARY KEY (H_rating_id)
);

-- Table: H_usuario
CREATE TABLE H_usuario (
    H_usuario_id serial  NOT NULL,
    H_given_name varchar(150)  NOT NULL,
    H_family_name varchar(150)  NOT NULL,
    H_picture varchar(150)  NOT NULL,
    H_locale varchar(4)  NOT NULL,
    H_updated_at datetime  NOT NULL,
    H_email varchar(40)  NOT NULL,
    H_email_verified int  NOT NULL,
    H_sub varchar(80)  NOT NULL,
    H_date date  NOT NULL,
    CONSTRAINT H_usuario_pk PRIMARY KEY (H_usuario_id)
);

-- Table: amazon
CREATE TABLE amazon (
    amazon_item_id serial  NOT NULL,
    precio bigint  NOT NULL,
    libro varchar(50)  NOT NULL,
    autor varchar(50)  NOT NULL,
    CONSTRAINT amazon_pk PRIMARY KEY (amazon_item_id)
);

-- Table: google_books
CREATE TABLE google_books (
    google_libro_id serial  NOT NULL,
    libro varchar(50)  NOT NULL,
    autor varchar(50)  NOT NULL,
    genero varchar(50)  NOT NULL,
    preview varchar(100)  NOT NULL,
    precio bigint  NOT NULL,
    fecha_lanzamiento date  NOT NULL,
    imagen varchar(200)  NOT NULL,
    CONSTRAINT google_books_pk PRIMARY KEY (google_libro_id)
);

-- Table: libreria
CREATE TABLE libreria (
    libreria_id serial  NOT NULL,
    usuario_user_id serial  NOT NULL,
    libro_precio_libro_id serial  NOT NULL,
    CONSTRAINT libreria_pk PRIMARY KEY (libreria_id)
);

-- Table: libro_precio
CREATE TABLE libro_precio (
    libro_id serial  NOT NULL,
    rating_rating_id serial  NOT NULL,
    google_books_google_libro_id serial  NOT NULL,
    amazon_amazon_item_id serial  NULL,
    CONSTRAINT libro_precio_pk PRIMARY KEY (libro_id)
);

-- Table: rating
CREATE TABLE rating (
    rating_id serial  NOT NULL,
    calificacion int  NOT NULL,
    comentario varchar(500)  NOT NULL,
    usuario_user_id serial  NOT NULL,
    CONSTRAINT rating_pk PRIMARY KEY (rating_id)
);

-- Table: usuario
CREATE TABLE usuario (
    user_id serial  NOT NULL,
    given_name varchar(150)  NOT NULL,
    family_name varchar(150)  NOT NULL,
    picture varchar(150)  NOT NULL,
    locale varchar(4)  NOT NULL,
    updated_at datetime  NOT NULL,
    email varchar(40)  NOT NULL,
    email_verified int  NOT NULL,
    sub varchar(80)  NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (user_id)
);

-- Table: vista_completa
CREATE TABLE vista_completa (
    vista_completa_id serial  NOT NULL,
    google_books_google_libro_id serial  NOT NULL,
    amazon_amazon_item_id serial  NOT NULL,
    CONSTRAINT vista_completa_pk PRIMARY KEY (vista_completa_id)
);

-- foreign keys
-- Reference: libreria_libro_precio (table: libreria)
ALTER TABLE libreria ADD CONSTRAINT libreria_libro_precio FOREIGN KEY libreria_libro_precio (libro_precio_libro_id)
    REFERENCES libro_precio (libro_id);

-- Reference: libreria_usuario (table: libreria)
ALTER TABLE libreria ADD CONSTRAINT libreria_usuario FOREIGN KEY libreria_usuario (usuario_user_id)
    REFERENCES usuario (user_id);

-- Reference: libro_precio_amazon (table: libro_precio)
ALTER TABLE libro_precio ADD CONSTRAINT libro_precio_amazon FOREIGN KEY libro_precio_amazon (amazon_amazon_item_id)
    REFERENCES amazon (amazon_item_id);

-- Reference: libro_precio_google_books (table: libro_precio)
ALTER TABLE libro_precio ADD CONSTRAINT libro_precio_google_books FOREIGN KEY libro_precio_google_books (google_books_google_libro_id)
    REFERENCES google_books (google_libro_id);

-- Reference: libro_rating (table: libro_precio)
ALTER TABLE libro_precio ADD CONSTRAINT libro_rating FOREIGN KEY libro_rating (rating_rating_id)
    REFERENCES rating (rating_id);

-- Reference: rating_usuario (table: rating)
ALTER TABLE rating ADD CONSTRAINT rating_usuario FOREIGN KEY rating_usuario (usuario_user_id)
    REFERENCES usuario (user_id);

-- Reference: vista_completa_amazon (table: vista_completa)
ALTER TABLE vista_completa ADD CONSTRAINT vista_completa_amazon FOREIGN KEY vista_completa_amazon (amazon_amazon_item_id)
    REFERENCES amazon (amazon_item_id);

-- Reference: vista_completa_google_books (table: vista_completa)
ALTER TABLE vista_completa ADD CONSTRAINT vista_completa_google_books FOREIGN KEY vista_completa_google_books (google_books_google_libro_id)
    REFERENCES google_books (google_libro_id);

-- End of file.

