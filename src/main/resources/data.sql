DROP TABLE IF EXISTS students;

CREATE TABLE students (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  mobile VARCHAR(10) NOT NULL
);

