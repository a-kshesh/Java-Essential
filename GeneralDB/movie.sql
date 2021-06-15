DROP TABLE Movie;

CREATE TABLE Movie(
	ticketID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
	location STRING,
	movieName STRING,
	ticketNumber STRING,
	seatNumber INT,
	startTime STRING,
	PRIMARY KEY (ticketID));
	
INSERT INTO Movie(location,movieName,ticketNumber,seatNumber,startTime) VALUES ('Scarborough','Frozen','123','A12','5pm'),
																			   ('toronto','jumanji','122','A14','2pm'),
																			   ('london','Godzila','111','B12','4pm'),
																			   ('kitchner','conjuring','133','C12','9pm'),
																			   ('brahmton','avengers','100','D12','8pm'),
																			   ('montreal','aquaman','134','A22','7pm'),
																			   ('vancouver','superman','145','A11','6pm');