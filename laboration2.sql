CREATE database personalregister;
CREATE USER 'lab2user'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON personalregister.* TO 'lab2user'@'localhost';
SELECT CURRENT_USER();