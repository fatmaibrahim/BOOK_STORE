-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema book_store
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema book_store
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `book_store` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `book_store` ;

-- -----------------------------------------------------
-- Table `book_store`.`publisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`publisher` (
  `Name` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  `Telephone` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`Name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`book` (
  `ISBN` VARCHAR(45) NOT NULL,
  `Title` VARCHAR(45) NOT NULL,
  `Publisher_name` VARCHAR(45) NOT NULL,
  `Publisher_year` YEAR(4) NOT NULL,
  `Category` VARCHAR(20) NOT NULL,
  `Threshold` INT(11) NOT NULL,
  `Available_quantity` INT(11) NULL DEFAULT NULL,
  `Selling_price` DECIMAL(6,2) NULL DEFAULT NULL,
  PRIMARY KEY (`ISBN`),
  INDEX `C_publisher_name` (`Publisher_name` ASC) VISIBLE,
  INDEX `C_Tiltle_idx` (`Title` ASC) VISIBLE,
  INDEX `C_Category_idx` (`Category` ASC) VISIBLE,
  CONSTRAINT `C_publisher_name`
    FOREIGN KEY (`Publisher_name`)
    REFERENCES `book_store`.`publisher` (`Name`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`authors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`authors` (
  `Name` VARCHAR(45) NOT NULL,
  `Book_ISBN` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Name`, `Book_ISBN`),
  INDEX `C_Book_ISBN_authors_idx` (`Book_ISBN` ASC) VISIBLE,
  CONSTRAINT `C_Book_ISBN_authors`
    FOREIGN KEY (`Book_ISBN`)
    REFERENCES `book_store`.`book` (`ISBN`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`users` (
  `User_id` INT(11) NOT NULL AUTO_INCREMENT,
  `First_name` VARCHAR(20) NOT NULL,
  `Last_name` VARCHAR(20) NOT NULL,
  `Email` VARCHAR(50) NULL DEFAULT NULL,
  `Shipping_address` VARCHAR(45) NOT NULL,
  `Phone_num` VARCHAR(20) NOT NULL,
  `Pass` VARCHAR(45) NULL DEFAULT NULL,
  `User_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`User_id`),
  UNIQUE INDEX `User_name` (`User_name` ASC) VISIBLE,
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE)
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`book_sales_history`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`book_sales_history` (
  `Cart_id` INT(11) NOT NULL AUTO_INCREMENT,
  `User_id` INT(11) NOT NULL,
  `Book_ISBN` VARCHAR(45) NOT NULL,
  `Quantity` VARCHAR(45) NOT NULL,
  `Order_time` DATETIME NOT NULL,
  `Price` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`Cart_id`),
  INDEX `C_user_id_idx` (`User_id` ASC) VISIBLE,
  INDEX `C_Book_ISBN_sales_idx` (`Book_ISBN` ASC) VISIBLE,
  CONSTRAINT `C_Book_ISBN_sales`
    FOREIGN KEY (`Book_ISBN`)
    REFERENCES `book_store`.`book` (`ISBN`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `C_User_id_sales`
    FOREIGN KEY (`User_id`)
    REFERENCES `book_store`.`users` (`User_id`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 45
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`manager`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`manager` (
  `Manager_id` INT(11) NOT NULL,
  PRIMARY KEY (`Manager_id`),
  CONSTRAINT `C_Manager_id`
    FOREIGN KEY (`Manager_id`)
    REFERENCES `book_store`.`users` (`User_id`)
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`manager_order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`manager_order` (
  `Order_num` INT(11) NOT NULL AUTO_INCREMENT,
  `Book_ISBN` VARCHAR(45) NOT NULL,
  `Order_date` DATETIME NOT NULL,
  `Quantity` INT(11) NOT NULL,
  PRIMARY KEY (`Order_num`),
  INDEX `C_Book_ISBN_order_idx` (`Book_ISBN` ASC) VISIBLE,
  CONSTRAINT `C_Book_ISBN_order`
    FOREIGN KEY (`Book_ISBN`)
    REFERENCES `book_store`.`book` (`ISBN`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `book_store`.`shopping_cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `book_store`.`shopping_cart` (
  `Cart_num` INT(11) NOT NULL,
  PRIMARY KEY (`Cart_num`),
  CONSTRAINT `C_Cart_num`
    FOREIGN KEY (`Cart_num`)
    REFERENCES `book_store`.`book_sales_history` (`Cart_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

USE `book_store` ;

-- -----------------------------------------------------
-- procedure save_less_than_three_month
-- -----------------------------------------------------

DELIMITER $$
USE `book_store`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `save_less_than_three_month`()
BEGIN
   delete from book_sales_history where DATEDIFF(now(),Order_time)>90;
   END$$

DELIMITER ;

-- -----------------------------------------------------
-- function sum_of_order_quantity
-- -----------------------------------------------------

DELIMITER $$
USE `book_store`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `sum_of_order_quantity`(B_ISBN varchar(45)) RETURNS int(11)
    DETERMINISTIC
BEGIN
 DECLARE sum_orders int;
  SELECT sum(Quantity)into sum_orders from MANAGER_ORDER where Book_ISBN=B_ISBN;
  RETURN sum_orders;
END$$

DELIMITER ;
USE `book_store`;

DELIMITER $$
USE `book_store`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `book_store`.`BOOK_AFTER_UPDATE`
AFTER UPDATE ON `book_store`.`book`
FOR EACH ROW
BEGIN
if(new.Available_quantity<new.Threshold)then
if(not exists(SELECT * from MANAGER_ORDER where Book_ISBN=new.ISBN))then
insert into MANAGER_ORDER (Book_ISBN,Order_date,Quantity) values(new.ISBN,now(),(new.Threshold-new.Available_Quantity));
else
if(sum_of_order_quantity(new.ISBN)+new.Available_quantity<new.Threshold)then
insert into MANAGER_ORDER (Book_ISBN,Order_date,Quantity) values(new.ISBN,now(),(new.Threshold-new.Available_Quantity-sum_of_order_quantity(new.ISBN)));
end if;
end if;
end if;
END$$

USE `book_store`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `book_store`.`BOOK_BEFORE_UPDATE`
BEFORE UPDATE ON `book_store`.`book`
FOR EACH ROW
BEGIN
if(new.Available_quantity<0) THEN
	signal sqlstate '45000' set message_text = 'ERROR THE QUANTITY NUMBER CANNOT BE NEGATIVE';
end if;
END$$

USE `book_store`$$
CREATE
DEFINER=`root`@`localhost`
TRIGGER `book_store`.`MANAGER_ORDER_BEFORE_DELETE_1`
BEFORE DELETE ON `book_store`.`manager_order`
FOR EACH ROW
BEGIN
update BOOK set 
Available_quantity=BOOK.Available_quantity+OLD.Quantity where BOOK.ISBN=OLD.Book_ISBN;
END$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
