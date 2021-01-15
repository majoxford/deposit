use cuentas;

CREATE TABLE `cuentas`.`cuentas` (
`id` INT NOT NULL auto_increment,
`name` varchar(50) NOT NULL,
`accountNumber` varchar(13) NOT NULL,
`balance` double NOT NULL,

PRIMARY KEY (id)
);


insert into cuentas (name,accountNumber,balance) values ("Mariajose Oxford", "0443998686899", "200.00");
insert into cuentas (name,accountNumber,balance) values ("Douglis Oxford", "0443889090987", "1000.00");
insert into cuentas (name,accountNumber,balance) values ("Merly Caruso", "0465897676754", "500.00");
insert into cuentas (name,accountNumber,balance) values ("Klaudia Rodriguez", "0325889090453", "30.00");
insert into cuentas (name,accountNumber,balance) values ("Yumeris Farfan", "0367554346121", "450.00");
insert into cuentas (name,accountNumber,balance) values ("Juan Perez", "0333978783990", "20000.00");

DELIMITER //
CREATE PROCEDURE GetAllSavingsAccount()
BEGIN
select name, accountNumber, balance from cuentas where accountNumber like '04%';
END//

DELIMITER ;

Call GetAllSavingsAccount;

DELIMITER //
CREATE PROCEDURE GetAllCurrentAccounts()
BEGIN
select name,accountNumber,balance from cuentas where accountNumber like '03%';
END//

DELIMITER ;

Call GetAllCurrentAccounts;
