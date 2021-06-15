DROP TABLE coffeeorder   ;

CREATE TABLE coffeeorder    (
   orderID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
   quantity INT,
   productname varchar (30),
   customername varchar (30)  NOT NULL,
   PRIMARY KEY (orderID)
);

INSERT INTO coffeeorder  (quantity, productname, customername)
VALUES 
   (2, 'Late', 'Bob'), 
   (3, 'Espresso', 'Linda');