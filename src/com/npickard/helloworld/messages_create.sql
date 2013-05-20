DROP TABLE IF EXISTS messages;
create table MESSAGES(
  id INT NOT NULL AUTO_INCREMENT, 
  message_text VARCHAR(20) NOT NULL, 
  message_priority VARCHAR(20),
  next_message_id INT, 
  PRIMARY KEY (id)
)