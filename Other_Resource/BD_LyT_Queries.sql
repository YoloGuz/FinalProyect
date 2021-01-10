use lyt_proyect;

create table estudiante(
no_carne int(8) not null AUTO_INCREMENT primary key,
codigo_estado smallint(8) not null,
nombre_estudiante varchar(50) not null,
apellido_estudiante varchar(50) not null,
telefono_estudiante int(9) not null,
email_estudiante varchar(50) not null,
fecha_ingreso date
);

create table estado(
codigo_estado smallint(1) not null primary key,
descripcion_estado varchar(10) not null
);

insert into estado (codigo_estado, descripcion_estado)
values (1, "Activo");
insert into estado (codigo_estado, descripcion_estado)
values (2, "Inactivo");

use lyt_proyect;

create table profesor(
dpi bigint(13) not null primary key,
nombre_profesor varchar(50),
apellido_profesor varchar(50),
telefono_profesor int(8),
email_profesor varchar(50)
);
