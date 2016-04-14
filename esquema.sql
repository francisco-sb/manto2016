
    create table Estados (
        idEstado bigint not null,
        nombre varchar(255) not null unique,
        descripcion varchar(255),
        primary key (idEstado)
    );

    create table Roles (
        idRol bigint not null,
        nombre varchar(255) not null unique,
        descripcion varchar(255),
        primary key (idRol)
    );

    create table UsuarioRol (
        idUsuario bigint not null,
        idRol bigint not null
    );

    create table Usuarios (
        idUsuario bigint not null,
        nombrePrefijo varchar(255),
        nombreNombre varchar(255),
        nombreApellidoPaterno varchar(255),
        nombreApellidoMaterno varchar(255),
        nombrePosfijo varchar(255),
        nombreIniciales varchar(255),
        nombreUsuario varchar(255) not null unique,
        claveAcceso varchar(255) not null,
        primary key (idUsuario)
    );

    create table ciudades (
        idciudad bigint not null,
        nombre varchar(255) not null unique,
        descripcion varchar(255),
        primary key (idciudad)
    );

    create table Lugares (
        idLugar bigint not null,
        nombre varchar(255) not null unique,
        descripcion varchar(255),
        poblacion bigint,
        latitud varchar(255),
        longitud varchar(255),        
        estado varchar(255),
        primary key (idLugar)
    );

    create table Recomendaciones (
        idRecomendacion bigint not null,
        nombre varchar(255) not null unique,
        estado varchar(255),       
        usuario varchar(255),
        fecha varchar(255),
        comentario varchar(255),
        calificacion bigint,        
        primary key (idRecomendacion)
    );


    alter table UsuarioRol 
        add foreign key (idRol) 
        references Roles (idRol);

    alter table UsuarioRol 
        add foreign key (idUsuario) 
        references Usuarios (idUsuario);
