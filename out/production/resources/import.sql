create table IF NOT EXISTS persona (id_persona int NOT NULL,tipo_identificacion varchar(5) NOT NULL,numero_identificacion varchar(10) NOT NULL, nombres varchar(50),apellidos varchar(50),direccion varchar(50),telefono varchar(50),email varchar(50),primary key (id_persona));
create table IF NOT EXISTS empleado (id_empleado int NOT NULL, dependencia varchar(50)  NOT NULL,fecha_ingreso date NOT NULL, primary key (id_empleado));
create table IF NOT EXISTS tramite (numero int NOT NULL, anio int NOT NULL, nombre_tramite varchar(50),descripcion varchar(50), id_persona int NOT NULL, id_empleado int NOT NULL, primary key (numero), FOREIGN KEY (id_persona) REFERENCES persona(id_persona), FOREIGN KEY (id_empleado) REFERENCES empleado(id_empleado));
insert into persona values(1,'CC','154515485', 'edinson','chacon', 'car 1 -1 ','1234567','a@correo.com');
insert into empleado values(1,'Contabilidad','2021-11-24');
insert into tramite values(12345,2021,'peticion','relaizando un tramite en la sic', 1,1);

