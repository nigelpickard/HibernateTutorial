DROP TABLE IF EXISTS messages;
CREATE TABLE messages(
  id INT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(20) NOT NULL,
  last_name VARCHAR(30) NOT NULL,
  PRIMARY KEY (id)
)