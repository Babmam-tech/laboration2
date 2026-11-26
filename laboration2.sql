CREATE database personalregister;
CREATE USER 'lab2user'@'localhost' IDENTIFIED BY '123';
GRANT ALL PRIVILEGES ON personalregister.* TO 'lab2user'@'localhost';
SELECT CURRENT_USER();

CREATE TABLE department
(
    department_id INT AUTO_INCREMENT,
    name          VARCHAR(50) NOT NULL,
    city          VARCHAR(50) NOT NULL,
    PRIMARY KEY (department_id)
);

CREATE TABLE employee
(
    employee_id   INT AUTO_INCREMENT,
    first_name    VARCHAR(50)  NOT NULL,
    last_name     VARCHAR(50)  NOT NULL,
    email         VARCHAR(100) NOT NULL UNIQUE,
    hire_date     DATE         NOT NULL,
    department_id INT          NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (department_id) REFERENCES department (department_id)
);

CREATE TABLE access_card
(
    card_id     INT AUTO_INCREMENT,
    card_number VARCHAR(30) NOT NULL UNIQUE,
    issue_date  DATE        NOT NULL,
    expiry_date DATE        NOT NULL,
    employee_id INT         NOT NULL UNIQUE,
    PRIMARY KEY (card_id),
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);

INSERT INTO department (name, city)
VALUES ('IT', 'Stockholm'),
       ('Ekonomi', 'Göteborg'),
       ('HR', 'Malmö');

INSERT INTO employee (first_name, last_name, email, hire_date, department_id)
VALUES ('Anna', 'Svensson', 'anna.svensson@foretag.se', '2021-03-15', 1),
       ('Erik', 'Johansson', 'erik.johansson@foretag.se', '2022-08-01', 1),
       ('Sara', 'Lind', 'sara.lind@foretag.se', '2023-01-10', 1),
       ('Ali', 'Hassan', 'ali.hassan@foretag.se', '2020-05-20', 2),
       ('Lina', 'Berg', 'lina.berg@foretag.se', '2024-02-05', 2);

INSERT INTO access_card (card_number, issue_date, expiry_date, employee_id)
VALUES ('KORT-1001', '2021-03-15', '2026-03-15', 1),
       ('KORT-1002', '2022-08-01', '2027-08-01', 2),
       ('KORT-1003', '2020-05-20', '2025-05-20', 4);

SELECT e.first_name, e.last_name, d.name
FROM employee AS e
         INNER JOIN department AS d
                    ON e.department_id = d.department_id;

SELECT d.name, e.first_name, e.last_name
FROM department AS d
         LEFT JOIN employee AS e
                   ON d.department_id = e.department_id;
