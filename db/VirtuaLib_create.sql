-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-11-10 00:27:59.984

-- tables
-- Table: autor
CREATE TABLE autor (
    autor_id serial  NOT NULL,
    nombre varchar(50)  NOT NULL,
    fecha_nacimiento date  NOT NULL,
    CONSTRAINT autor_pk PRIMARY KEY (autor_id)
);

-- Table: libreria
CREATE TABLE libreria (
    libreria_id serial  NOT NULL,
    estado varchar(50)  NOT NULL,
    usuario_usuario_id serial  NOT NULL,
    vista_previa_libro_vp_id serial  NOT NULL,
    CONSTRAINT libreria_pk PRIMARY KEY (libreria_id)
);

-- Table: libro
CREATE TABLE libro (
    libro_id serial  NOT NULL,
    titulo varchar(50)  NOT NULL,
    descripcion varchar(250)  NOT NULL,
    genero varchar(50)  NOT NULL,
    fechaPublicacion date  NOT NULL,
    imgUrl varchar(250)  NOT NULL,
    contenidoUrl varchar(250)  NULL,
    precioDig double(6,2)  NULL,
    precioFis double(6,2)  NULL,
    rating_rating_id serial  NOT NULL,
    CONSTRAINT libro_pk PRIMARY KEY (libro_id)
);

-- Table: libro_autor
CREATE TABLE libro_autor (
    la_id serial  NOT NULL,
    libro_libro_id serial  NOT NULL,
    autor_autor_id serial  NOT NULL,
    CONSTRAINT libro_autor_pk PRIMARY KEY (la_id)
);

-- Table: libro_subgenero
CREATE TABLE libro_subgenero (
    lib_sub_id serial  NOT NULL,
    libro_libro_id serial  NOT NULL,
    subgenero_subgenero_id serial  NOT NULL,
    CONSTRAINT libro_subgenero_pk PRIMARY KEY (lib_sub_id)
);

-- Table: rating
CREATE TABLE rating (
    rating_id serial  NOT NULL,
    calificacion int  NOT NULL,
    comentario varchar(500)  NOT NULL,
    usuario_usuario_id serial  NOT NULL,
    CONSTRAINT rating_pk PRIMARY KEY (rating_id)
);

-- Table: subgenero
CREATE TABLE subgenero (
    subgenero_id serial  NOT NULL,
    subgenero varchar(100)  NOT NULL,
    CONSTRAINT subgenero_pk PRIMARY KEY (subgenero_id)
);

-- Table: usuario
CREATE TABLE usuario (
    usuario_id serial  NOT NULL,
    nombre varchar(150)  NOT NULL,
    email varchar(40)  NOT NULL,
    fecha_nacimiento date  NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (usuario_id)
);

-- Table: vista_previa_libro
CREATE TABLE vista_previa_libro (
    vp_id serial  NOT NULL,
    libro_subgenero_lib_sub_id serial  NOT NULL,
    libro_autor_la_id serial  NOT NULL,
    libro_libro_id serial  NOT NULL,
    CONSTRAINT vista_previa_libro_pk PRIMARY KEY (vp_id)
);

-- foreign keys
-- Reference: libreria_usuario (table: libreria)
ALTER TABLE libreria ADD CONSTRAINT libreria_usuario FOREIGN KEY libreria_usuario (usuario_usuario_id)
    REFERENCES usuario (usuario_id);

-- Reference: libreria_vista_previa_libro (table: libreria)
ALTER TABLE libreria ADD CONSTRAINT libreria_vista_previa_libro FOREIGN KEY libreria_vista_previa_libro (vista_previa_libro_vp_id)
    REFERENCES vista_previa_libro (vp_id);

-- Reference: libro_autor_autor (table: libro_autor)
ALTER TABLE libro_autor ADD CONSTRAINT libro_autor_autor FOREIGN KEY libro_autor_autor (autor_autor_id)
    REFERENCES autor (autor_id);

-- Reference: libro_autor_libro (table: libro_autor)
ALTER TABLE libro_autor ADD CONSTRAINT libro_autor_libro FOREIGN KEY libro_autor_libro (libro_libro_id)
    REFERENCES libro (libro_id);

-- Reference: libro_rating (table: libro)
ALTER TABLE libro ADD CONSTRAINT libro_rating FOREIGN KEY libro_rating (rating_rating_id)
    REFERENCES rating (rating_id);

-- Reference: libro_subgenero_libro (table: libro_subgenero)
ALTER TABLE libro_subgenero ADD CONSTRAINT libro_subgenero_libro FOREIGN KEY libro_subgenero_libro (libro_libro_id)
    REFERENCES libro (libro_id);

-- Reference: libro_subgenero_subgenero (table: libro_subgenero)
ALTER TABLE libro_subgenero ADD CONSTRAINT libro_subgenero_subgenero FOREIGN KEY libro_subgenero_subgenero (subgenero_subgenero_id)
    REFERENCES subgenero (subgenero_id);

-- Reference: rating_usuario (table: rating)
ALTER TABLE rating ADD CONSTRAINT rating_usuario FOREIGN KEY rating_usuario (usuario_usuario_id)
    REFERENCES usuario (usuario_id);

-- Reference: vista_previa_libro_libro (table: vista_previa_libro)
ALTER TABLE vista_previa_libro ADD CONSTRAINT vista_previa_libro_libro FOREIGN KEY vista_previa_libro_libro (libro_libro_id)
    REFERENCES libro (libro_id);

-- Reference: vista_previa_libro_libro_autor (table: vista_previa_libro)
ALTER TABLE vista_previa_libro ADD CONSTRAINT vista_previa_libro_libro_autor FOREIGN KEY vista_previa_libro_libro_autor (libro_autor_la_id)
    REFERENCES libro_autor (la_id);

-- Reference: vista_previa_libro_libro_subgenero (table: vista_previa_libro)
ALTER TABLE vista_previa_libro ADD CONSTRAINT vista_previa_libro_libro_subgenero FOREIGN KEY vista_previa_libro_libro_subgenero (libro_subgenero_lib_sub_id)
    REFERENCES libro_subgenero (lib_sub_id);

-- End of file.

