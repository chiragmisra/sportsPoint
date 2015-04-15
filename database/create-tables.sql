use sportsPoint;

DROP TABLE Point;
DROP TABLE User_Activity;
DROP TABLE Activity;
DROP TABLE User;

CREATE TABLE User
(
User_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
User_Name varchar(255) NOT NULL
);

CREATE TABLE Activity
(
Activity_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
User_Id int NOT NULL,
Activity_Name varchar(255) NOT NULL,
Complexity INT(2),
Units DOUBLE(10,2),
Equipment boolean,
CONSTRAINT fk_Users_A FOREIGN KEY (User_Id)
REFERENCES User(User_Id)
);

CREATE TABLE User_Activity
(
User_Activity_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
User_Id int NOT NULL,
Activity_Id  int NOT NULL,
User_Activity_Unit DOUBLE(10,2) NOT NULL,
Activity_Timestamp TIMESTAMP NOT NULL,
Points INT NOT NULL,
CONSTRAINT fk_Users_UA FOREIGN KEY (User_Id)
REFERENCES User(User_Id),
CONSTRAINT fk_Activity_UA FOREIGN KEY (Activity_Id)
REFERENCES Activity(Activity_Id)
);

CREATE TABLE Point
(
Point_Id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
User_id int NOT NULL,
Activity_Id int NOT NULL,
Total_Points INT NOT NULL,
CONSTRAINT fk_Users_P FOREIGN KEY (User_Id)
REFERENCES User(User_Id),
CONSTRAINT fk_Activity_P FOREIGN KEY (Activity_Id)
REFERENCES Activity(Activity_Id)
);