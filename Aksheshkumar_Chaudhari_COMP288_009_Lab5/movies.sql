DROP TABLE movies;

CREATE TABLE movies (
ticketID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
theatreName varchar (20) NOT NULL,
location varchar (20) NOT NULL,
movieName varchar (20) NOT NULL,
ticketNumber varchar (20) NOT NULL,
lastName varchar (30) NOT NULL,
seatNumber INT NOT NULL,
startTime varchar (30) NOT NULL,
PRIMARY KEY (ticketID)
);

