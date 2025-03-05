--Question3
CREATE TABLE employee (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL
);
INSERT INTO employee (name, designation) VALUES ('Rohit', 'Software Engineer');
INSERT INTO employee (name, designation) VALUES ('Pawan', 'Project Manager');
INSERT INTO employee (name, designation) VALUES ('Manoj', 'CTO');
