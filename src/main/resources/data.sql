DROP TABLE IF EXISTS 'piezas';
DROP TABLE IF EXISTS 'proveedores';
DROP TABLE IF EXISTS 'suministra';
SET character_set_client = utf8mb4 ;

create table piezas(
codigo int not null auto_increment primary key,
nombre nvarchar(100)
);

insert into piezas(nombre) values ('Rodamiento');

create table proveedores(
id char(4) primary key,
nombre nvarchar(100)
);

insert into proveedores(id, nombre) values ('a1', "Michelin");

create table suministra(
id int not null auto_increment primary key,
codigopieza int,
idproveedor char(4),
precio int,
foreign key (codigopieza) references piezas(codigo),
foreign key (idproveedor) references proveedores(id)
);

insert into suministra(codigopieza, idproveedor, precio) values (1, 'a1', 30);
