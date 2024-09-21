CREATE TABLE students (
                           id int SERIAL NOT NULL,
                           name varchar(15),
                           surname varchar(25),
                           department varchar(20),
                           salary int,
                           PRIMARY KEY (id)
) ;

INSERT INTO intensive_db.students (name, surname, department, salary)
VALUES
    ('Sergey', 'Petrov', 'IT', 500),
    ('Oleg', 'Ivanov', 'Sales', 700),
    ('Nina', 'Sidorova', 'HR', 850);