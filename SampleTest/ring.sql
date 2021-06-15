DROP TABLE ring ;

CREATE TABLE ring  (
   ringID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
   ringsize INT,
   material  varchar (30),
   width INT NOT NULL,
   PRIMARY KEY (ringID)
);

INSERT INTO ring  (ringsize, material, width)
VALUES 
   (50, 'Gold',7), 
   (45, 'Silver', 5);