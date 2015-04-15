USE sportsPoint;
CREATE TABLE Activities
(
Activity_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
Activity_Name varchar(255) NOT NULL,
Complexity varchar(255),
Units varchar(255),
Equipment boolean
);