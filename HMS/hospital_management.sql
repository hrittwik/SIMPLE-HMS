CREATE TABLE `admitpatient` (
  `AdmitID` int(11) NOT NULL AUTO_INCREMENT,
  `PatientID` int(11) NOT NULL,
  `Disease` varchar(45) NOT NULL,
  `AdmitDate` DATE NOT NULL,
  `RoomID` int(11) DEFAULT NULL,
  `DoctorID` int(11) NOT NULL,
  `ServiceID` int(11) NOT NULL,
  PRIMARY KEY (`AdmitID`),
  FOREIGN KEY (`PatientID`)
    REFERENCES patientregistration(`PatientID`),
  FOREIGN KEY (`RoomID`)
    REFERENCES rooms(`RoomID`),
  FOREIGN KEY (`DoctorID`)
    REFERENCES doctor_table(`DoctorID`),
  FOREIGN KEY (`ServiceID`)
    REFERENCES services(`ServiceID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `admitpatient` VALUES (1,1,'Heart Problem',CURDATE(),1,1,1);
INSERT INTO `admitpatient` (PatientID, Disease, AdmitDate, RoomID, DoctorID, ServiceID) VALUES (2,'Cataracts',CURDATE(),2,2,2);

CREATE TABLE `bill` (
  `BillID` int(11) NOT NULL AUTO_INCREMENT,
  `DischargeID` int(11) NOT NULL,
  `BillingDate` DATE NOT NULL,
  `RoomID` int(11) DEFAULT NULL,
  `ServiceID` int(11) DEFAULT NULL,
  `NoOfDays` int(11) DEFAULT NULL,
  `TotalRoomCharges` int(11) DEFAULT NULL,
  `TotalCharges` int(11) NOT NULL,
  `ChargesPaid` int(11) DEFAULT NULL,
  `DueCharges` int(11) DEFAULT NULL,
  `PaymentMode` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`BillID`),
  FOREIGN KEY (`RoomID`)
    REFERENCES rooms(`RoomID`),
  FOREIGN KEY (`ServiceID`)
    REFERENCES services(`ServiceID`),
  FOREIGN KEY (`DischargeID`)
    REFERENCES dischargepatient(`DischargeID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `bill` VALUES (1,1,CURDATE(),1,1,4,1000,1500,1500,0,'cash');

CREATE TABLE `dischargepatient` (
  `DischargeID` int(11) NOT NULL AUTO_INCREMENT,
  `AdmitID` int(11) NOT NULL,
  `DischargeDate` DATE NOT NULL,
  PRIMARY KEY (`DischargeID`),
  FOREIGN KEY (`AdmitID`)
    REFERENCES admitpatient(`AdmitID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `dischargepatient` VALUES (1,1,CURDATE());

CREATE TABLE `doctor_table` (
  `DoctorID` int(11) NOT NULL AUTO_INCREMENT,
  `Doctorname` varchar(25) NOT NULL,
  `FatherName` varchar(25) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `ContactNo` varchar(15) NOT NULL,
  `Qualifications` varchar(45) NOT NULL,
  `Specialization` varchar(45) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `BloodGroup` varchar(4) NOT NULL,
  `DateOfJoining` varchar(12) NOT NULL,
  `Address` varchar(200) NOT NULL,
  PRIMARY KEY (`DoctorID`),
  UNIQUE KEY `Email_UNIQUE` (`Email`),
  UNIQUE KEY `ContactNo_UNIQUE` (`ContactNo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `doctor_table` VALUES (1,'Shamimur Rahman','Saifur Rahman','shamim@email.com','01224','M.B.B.S','Heart','M','B+',CURDATE(),'Dhaka');
INSERT INTO `doctor_table` VALUES (2,'Golam Mostafa','Saifur Alam','mostafa@email.com','01234','M.B.B.S','Eye','M','B+',CURDATE(),'Dhaka');

CREATE TABLE `Admin` (
  `AdminID` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(25) NOT NULL,
  `user_Password` varchar(15) NOT NULL,
  `nameofuser` varchar(45) NOT NULL,
  `Email` varchar(25) DEFAULT NULL,
  `ContactNo` varchar(15) NOT NULL,
  PRIMARY KEY (`AdminID`),
  UNIQUE KEY `UserName_UNIQUE` (`UserName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `Admin` VALUES (1,'rik','rik','hrittwik','hrittwik@gmail.com','01800000000');

CREATE TABLE `patientregistration` (
  `PatientID` int(11) NOT NULL AUTO_INCREMENt,
  `Patientname` varchar(25) NOT NULL,
  `FatherName` varchar(25) NOT NULL,
  `Email` varchar(25) DEFAULT NULL,
  `ContactNo` varchar(15) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(8) NOT NULL,
  `BloodGroup` varchar(5) DEFAULT NULL,
  `Address` varchar(105) DEFAULT NULL,
  PRIMARY KEY (`PatientID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `patientregistration` VALUES (1,'Abir','Ganesh','abir.email.com','054542',40,'M','A+','Dhaka');
INSERT INTO `patientregistration` (Patientname, FatherName, Email, ContactNo, Age, Gender, BloodGroup, Address) VALUES ('Arup','Alok','arup.email.com','044542',50,'M','B+','Chittagong');

CREATE TABLE `rooms` (
  `RoomID` int(11) NOT NULL AUTO_INCREMENT,
  `RoomType` varchar(15) NOT NULL,
  `RoomCharges` int(11) NOT NULL,
  `RoomStatus` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`RoomID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `rooms` VALUES (1,'Deluxe',250,'Vacant'),(2,'General',300,'Vacant');

CREATE TABLE `services` (
  `ServiceID` int(11) NOT NULL AUTO_INCREMENT,
  `ServiceName` varchar(100) NOT NULL,
  `ServiceDate` DATE NOT NULL,
  `PatientID` int(11) DEFAULT NULL,
  `ServiceCharges` int(11) NOT NULL,
  PRIMARY KEY (`ServiceID`),
  FOREIGN KEY (PatientID)
    REFERENCES patientregistration(PatientID)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `services` VALUES (1,'Heart Checkup',CURDATE(),1,500);
INSERT INTO `services` (ServiceName, ServiceDate, PatientID, ServiceCharges) VALUES ('High Blood Pressure',CURDATE(),1,500);
