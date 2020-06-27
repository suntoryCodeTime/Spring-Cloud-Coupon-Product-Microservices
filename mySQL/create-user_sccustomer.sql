CREATE USER 'sccustomer'@'localhost' IDENTIFIED BY 'sccustomer';

GRANT ALL PRIVILEGES ON * . * TO 'sccustomer'@'localhost';

ALTER USER 'sccustomer'@'localhost' IDENTIFIED WITH mysql_native_password BY 'sccustomer';