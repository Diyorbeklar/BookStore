DROP TABLE  IF EXISTS Userpermission ;
CREATE TABLE  Userpermission(id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                             user_id INT REFERENCES USERS(id),
                             permission_id INT REFERENCES permission(id));