--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table pedido;
drop table articulo;
drop table contenedor;
drop table articuloPedido;


CREATE TABLE "contenedor" (
	"idContenedor"	INTEGER NOT NULL,
	"capacidad"	INTEGER NOT NULL,
	"categoria"	TEXT NOT NULL,
	PRIMARY KEY("idContenedor")
);

CREATE TABLE "articuloPedido" (
	"articulo"	INTEGER NOT NULL,
	"pedido"	INTEGER NOT NULL,
	PRIMARY KEY("articulo","pedido"),
	FOREIGN KEY("articulo") REFERENCES "producto"("idProducto")
);

CREATE TABLE "pedido" (
	"idPedido"	INTEGER NOT NULL,
	"numArticulos"	INTEGER NOT NULL,
	PRIMARY KEY("idPedido" AUTOINCREMENT)
);

CREATE TABLE "articulo" (
	"idArticulo"	INTEGER NOT NULL,
	"volumen"	REAL NOT NULL,
	"nombre"	TEXT NOT NULL,
	"categoria"	TEXT NOT NULL,
	PRIMARY KEY("idArticulo")
);



