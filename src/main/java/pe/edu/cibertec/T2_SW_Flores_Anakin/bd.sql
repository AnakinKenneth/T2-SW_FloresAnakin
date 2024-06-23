create database BDCibertec
use BDCibertec
CREATE TABLE Medico
(
 IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)
);

CREATE TABLE Especialidad
(
 IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)
 );

 INSERT INTO Medico (NomMedico, ApeMedico, FechNacMedico)
VALUES
    ('Juan', 'Perez', '1980-05-15'),
    ('Maria', 'Gomez', '1975-09-22'),
    ('Luis', 'Martinez', '1990-03-10'),
    ('Ana', 'Rodriguez', '1988-07-28'),
    ('Carlos', 'Lopez', '1985-12-03');

INSERT INTO Especialidad (Titulo, Funcion, FechGraduacion, IdMedico)
VALUES
    ('Cardiología', 'Especialista en enfermedades del corazón', '2010-06-20', 1),
    ('Dermatología', 'Especialista en enfermedades de la piel', '2008-04-18', 2),
    ('Pediatría', 'Especialista en atención infantil', '2012-08-25', 3),
    ('Ginecología', 'Especialista en salud de la mujer', '2007-11-30', 4),
    ('Neurología', 'Especialista en enfermedades del sistema nervioso', '2015-03-12', 5);