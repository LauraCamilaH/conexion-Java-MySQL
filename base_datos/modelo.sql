-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cun
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `cun` ;

-- -----------------------------------------------------
-- Schema cun
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cun` DEFAULT CHARACTER SET latin1 ;
USE `cun` ;

-- -----------------------------------------------------
-- Table `cun`.`estudiante`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`estudiante` ;

CREATE TABLE IF NOT EXISTS `cun`.`estudiante` (
  `id` MEDIUMINT(9) NOT NULL AUTO_INCREMENT,
  `codigo` CHAR(30) NOT NULL,
  `nombre` CHAR(45) NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `genero` VARCHAR(50) NULL DEFAULT NULL,
  `actividad` VARCHAR(100) NOT NULL,
  `Id_nota` INT(11) NOT NULL,
  `Id_asignatura` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `Id_nota` (`Id_nota` ASC),
  INDEX `Id_asignatura` (`Id_asignatura` ASC),
  INDEX `id` (`id` ASC),
  CONSTRAINT `estudiante_ibfk_1`
    FOREIGN KEY (`Id_nota`)
    REFERENCES `cun`.`estudiante` (`Id_asignatura`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `estudiante_ibfk_2`
    FOREIGN KEY (`Id_asignatura`)
    REFERENCES `cun`.`estudiante` (`Id_nota`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `cun`.`asignatura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`asignatura` ;

CREATE TABLE IF NOT EXISTS `cun`.`asignatura` (
  `Id_Asignatura` INT(8) NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`Id_Asignatura`),
  CONSTRAINT `asignatura_ibfk_1`
    FOREIGN KEY (`Id_Asignatura`)
    REFERENCES `cun`.`estudiante` (`Id_asignatura`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `cun`.`nota`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`nota` ;

CREATE TABLE IF NOT EXISTS `cun`.`nota` (
  `id_nota` INT(11) NOT NULL AUTO_INCREMENT,
  `nota_1` DECIMAL(10,0) NOT NULL,
  `nota_2` DECIMAL(10,0) NOT NULL,
  `nota_3` INT(11) NOT NULL,
  `nota_definitiva` INT(11) NOT NULL,
  PRIMARY KEY (`id_nota`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `cun`.`ASIGNATURA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`ASIGNATURA` ;

CREATE TABLE IF NOT EXISTS `cun`.`ASIGNATURA` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la asignatura',
  `NOMBRE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `NOMBRE_UNIQUE` (`NOMBRE` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cun`.`ESTUDIANTE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`ESTUDIANTE` ;

CREATE TABLE IF NOT EXISTS `cun`.`ESTUDIANTE` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `CODIGO` INT(10) NOT NULL,
  `NOMBRE` VARCHAR(45) NOT NULL,
  `FECHA_INSCRIPCION` DATE NOT NULL,
  `GENERO` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cun`.`ACTIVIDAD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`ACTIVIDAD` ;

CREATE TABLE IF NOT EXISTS `cun`.`ACTIVIDAD` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NOMBRE` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE INDEX `NOMBRE_UNIQUE` (`NOMBRE` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cun`.`INSCRIPCION_ASIGNATURA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`INSCRIPCION_ASIGNATURA` ;

CREATE TABLE IF NOT EXISTS `cun`.`INSCRIPCION_ASIGNATURA` (
  `ASIGNATURA_ID` INT NOT NULL,
  `ESTUDIANTE_ID` INT NOT NULL,
  PRIMARY KEY (`ASIGNATURA_ID`, `ESTUDIANTE_ID`),
  INDEX `fk_ASIGNATURA_has_ESTUDIANTE_ESTUDIANTE1_idx` (`ESTUDIANTE_ID` ASC),
  INDEX `fk_ASIGNATURA_has_ESTUDIANTE_ASIGNATURA1_idx` (`ASIGNATURA_ID` ASC),
  CONSTRAINT `fk_ASIGNATURA_has_ESTUDIANTE_ASIGNATURA1`
    FOREIGN KEY (`ASIGNATURA_ID`)
    REFERENCES `cun`.`ASIGNATURA` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ASIGNATURA_has_ESTUDIANTE_ESTUDIANTE1`
    FOREIGN KEY (`ESTUDIANTE_ID`)
    REFERENCES `cun`.`ESTUDIANTE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cun`.`INSCRIPCION_ACTIVIDAD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`INSCRIPCION_ACTIVIDAD` ;

CREATE TABLE IF NOT EXISTS `cun`.`INSCRIPCION_ACTIVIDAD` (
  `ESTUDIANTE_ID` INT NOT NULL,
  `ACTIVIDAD_ID` INT NOT NULL,
  PRIMARY KEY (`ESTUDIANTE_ID`, `ACTIVIDAD_ID`),
  INDEX `fk_ESTUDIANTE_has_ACTIVIDAD_ACTIVIDAD1_idx` (`ACTIVIDAD_ID` ASC),
  INDEX `fk_ESTUDIANTE_has_ACTIVIDAD_ESTUDIANTE1_idx` (`ESTUDIANTE_ID` ASC),
  CONSTRAINT `fk_ESTUDIANTE_has_ACTIVIDAD_ESTUDIANTE1`
    FOREIGN KEY (`ESTUDIANTE_ID`)
    REFERENCES `cun`.`ESTUDIANTE` (`ID`)
    ON DELETE CASCADE -- Cuando se elimina un estudiante tambien las inscripciones
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ESTUDIANTE_has_ACTIVIDAD_ACTIVIDAD1`
    FOREIGN KEY (`ACTIVIDAD_ID`)
    REFERENCES `cun`.`ACTIVIDAD` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cun`.`NOTA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cun`.`NOTA` ;

CREATE TABLE IF NOT EXISTS `cun`.`NOTA` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `VALOR` DECIMAL(2,1) NULL,
  `CORTE` INT(1) NULL,
  `ASIGNATURA_ID` INT NOT NULL,
  `ESTUDIANTE_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_NOTA_INSCRIPCION_ASIGNATURA1_idx` (`ASIGNATURA_ID` ASC, `ESTUDIANTE_ID` ASC),
  CONSTRAINT `fk_INSCRIPCION`
    FOREIGN KEY (`ASIGNATURA_ID` , `ESTUDIANTE_ID`)
    REFERENCES `cun`.`INSCRIPCION_ASIGNATURA` (`ASIGNATURA_ID` , `ESTUDIANTE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO cun.actividad (`NOMBRE`) VALUES ('Futbol');
INSERT INTO cun.actividad (`NOMBRE`) VALUES ('Natación');
INSERT INTO cun.actividad (`NOMBRE`) VALUES ('Baloncesto');

INSERT INTO cun.asignatura (`NOMBRE`) VALUES ('Programacion');
INSERT INTO cun.asignatura (`NOMBRE`) VALUES ('Fisica');
INSERT INTO cun.asignatura (`NOMBRE`) VALUES ('BasesDeDatos');
INSERT INTO cun.asignatura (`NOMBRE`) VALUES ('Redes');


