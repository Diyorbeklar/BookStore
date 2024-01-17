DROP TABLE  IF EXISTS USERS ;
CREATE TABLE  USERS(id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                    username varchar,
                    password varchar,
                    role_name varchar);