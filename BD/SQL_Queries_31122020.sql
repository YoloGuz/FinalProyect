use lyt_proyect;

select * from  centro;

create table empleado(
codigoEmpleado int not null primary key auto_increment,
nombreEmpleado varchar(250) not null,
usuarioEmpleado varchar(100) not null,
passwordEmpleado varchar(50) not null,
telefonoEmpleado varchar(8) not null,
correoElectronicoEmpleado varchar(100) not null,
codigo_estado int(1) not null,
foreign key (codigo_estado) references estado(codigo_estado)
);

insert into employee(codigoEmpleado, nombreEmpleado, usuarioEmpleado, passwordEmpleado, telefonoEmpleado, correoElectronicoEmpleado)
values (0, "Raul Yol", "raul.yol", "password", "47284506", "reyg.61189@gmail.com");

create table estado(
codigo_estado int(1) not  null primary key,
descripcion_estado varchar(50)
);

create table tipo_pago(
tipo_pago varchar(50) primary key not null
);

create table mes(
mes_pago varchar(50) not null primary key
);

create table centro(
id_centro int(8) not null primary key, 
codigo_estado int(1) not null,
nombre_centro varchar(25) not null
);

create table profesor(
dpi int(13) not null primary key,
nombre_profesor varchar(50) not null,
apellido_profesor varchar(50) not null,
telefono_profesor varchar(8) not null,
email_profesor varchar(50) not null,
codigo_estado int(1) not  null,
foreign key (codigo_estado) references estado(codigo_estado)
);


create table estudiante(
no_carne int(8) not null primary key,
nombre_estudiante varchar(50) not null,
apellido_estudiante varchar(50) not null,
telefono_estudiante varchar(8) not null,
email_estudiante varchar(50) not null,
fecha_ingreso date not null,
codigo_estado int(1) not  null,
foreign key (codigo_estado) references estado(codigo_estado)
);

create table horario(
hora_entrada time not null,
hora_salida time not null,
dia varchar(50) not null,
constraint primary_key primary key (hora_entrada, hora_salida, dia)
);

create table curso(
id_curso varchar(50) not null primary key,
dpi int(13),
hora_entrada time not null,
hora_salida time not null,
dia varchar(50) not null,
id_centro int(8) not null,
fecha_inicio date not null,
descripcion varchar(50) not null,
foreign key(dpi) references profesor(dpi),
foreign key(hora_entrada) references horario(hora_entrada),
foreign key(hora_salida) references horario(hora_salida),
foreign key(dia) references horario(dia),
foreign key(id_centro) references centro(id_centro)
);
------ pendiente -------
create table pago(
no_pago int auto_increment primary key,
mes_pago varchar(50) not null,
tipo_pago varchar(50) not null,
fecha_pago date not null,
cantidad double(5,2) not null,
foreign key (mes_pago) references mes(mes_pago),
foreign key (tipo_pago) references tipo_pago(tipo_pago)
);


create table pago_profesor(
dpi int(13) not null,
no_pago int not null,
constraint primary_key primary key (dpi, no_pago),
foreign key (dpi) references profesor(dpi),
foreign key (no_pago) references pago(no_pago)
);

create table pago_estudiante(
no_carne int(13) not null,
no_pago int(8) not null,
constraint primary_key primary key (no_carne, no_pago),
foreign key (no_carne) references estudiante(no_carne),
foreign key (no_pago) references pago(no_pago)
);

create table curso_estudiante(
no_carne int(13) not null,
id_curso varchar(50) not null,
constraint primary_key primary key (no_carne, id_curso),
foreign key (no_carne) references estudiante(no_carne),
foreign key (id_curso) references curso(id_curso)
);

