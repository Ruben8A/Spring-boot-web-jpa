/* Populate tables */
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(2, 'John', 'Doe', 'john.doe@gmail.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(3, 'Pedro', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(4, 'Jaime', 'Doe', 'john.doe@gmail.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(5, 'Andrea', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(6, 'Juana', 'Doe', 'john.doe@gmail.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(7, 'Adelina', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28');
INSERT INTO clientes (id, nombre, apellido, email, created_at) VALUES(8, 'Esmeralda', 'Doe', 'john.doe@gmail.com', '2017-08-28');


/* Productos */

INSERT INTO productos (nombre, precio, created_at) VALUES('Panasonic Pantalla LCD 31" ', 9580, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Sonic Pantalla LCD 31" ', 8064, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('LG Pantalla LCD 31" ', 2800, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Xbox 360', 5580, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('PlayStation 3', 6580, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Xbox one 1TB', 10580, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Radio FM Panasonic', 580, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Télefono Inalambrico Motorola', 880, NOW());


/* facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, created_at) VALUES('Producto electronico', 'Articulo nuevo', 1,NOW());
INSERT INTO facturas (descripcion, observacion, cliente_id, created_at) VALUES('Producto electronico', 'Articulo nuevo', 1,NOW());

/* facturas items */
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES (2,1,1);
INSERT INTO facturas_items (cantidad, producto_id, factura_id) VALUES (1,1,2);