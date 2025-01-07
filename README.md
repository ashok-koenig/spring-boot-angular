# Course: Java Full Stack Spring Boot and Angular
## Assignment ID: 207751

# Spring Security 

## Create Users Table
CREATE TABLE `fullstackdb`.`users` (
  `username` VARCHAR(100) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `enabled` TINYINT(1) NOT NULL,
  PRIMARY KEY (`username`));

## Insert Users
INSERT INTO `fullstackdb`.`users` (`username`, `password`, `enabled`) VALUES ('admin', '{noop}admin123', '1');

INSERT INTO `fullstackdb`.`users` (`username`, `password`, `enabled`) VALUES ('user', '{noop}user123', '1');

# Create Authorities Table
CREATE TABLE `fullstackdb`.`authorities` (
  `username` VARCHAR(100) NOT NULL,
  `authority` VARCHAR(100) NOT NULL,
  INDEX `users_username_idx` (`username` ASC) VISIBLE,
  CONSTRAINT `users_username`
    FOREIGN KEY (`username`)
    REFERENCES `fullstackdb`.`users` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

## Inser Authorities
INSERT INTO `fullstackdb`.`authorities`(`username`,`authority`) VALUES('admin', 'ROLE_ADMIN');

INSERT INTO `fullstackdb`.`authorities`(`username`,`authority`) VALUES('admin', 'ROLE_USER');

INSERT INTO `fullstackdb`.`authorities`(`username`,`authority`) VALUES('user', 'ROLE_USER');


CREATE TABLE `fullstackdb`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `category` VARCHAR(100) NOT NULL,
  `price` DOUBLE NOT NULL,
  PRIMARY KEY (`id`));

## MySQL Driver URL
- https://downloads.mysql.com/archives/c-j/

## Java Fx Learning resource
- https://docs.oracle.com/javafx/2/ui_controls/jfxpub-ui_controls.htm
- https://openjfx.io/

## GCC for Windows
- https://www.msys2.org/

## Android Studio
- https://developer.android.com/studio