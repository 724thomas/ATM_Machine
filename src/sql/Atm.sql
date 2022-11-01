DROP TABLE DATA;

CREATE TABLE DATA (
                         IDANDTIME VARCHAR(255),
                         USERID VARCHAR(255),
                         PASSWORD VARCHAR(255),
                         ACCOUNT VARCHAR(255),
                         MONEY INT,
                         LOG Varchar(100) ARRAY,
                         TIME VARCHAR(255),
                         PRIMARY KEY (IDANDTIME)
);


INSERT INTO DATA VALUES ('Kia','haha','1234','college',0,'Created college account','16:46');