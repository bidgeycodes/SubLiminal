BEGIN TRANSACTION;

DROP TABLE IF EXISTS image;
DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS "user";

CREATE TABLE post (
	post_id SERIAL,
	post_name VARCHAR(50),
	post_location VARCHAR(50) NOT NULL,
	post_date DATE NOT NULL,
	post_exist BOOLEAN NOT NULL,
	post_description VARCHAR(3000) NOT NULL,
	CONSTRAINT PK_post_id PRIMARY KEY (post_id)
);

CREATE TABLE image (
	image_id SERIAL,
	image_url VARCHAR(200) UNIQUE,
	post_id INT,
	CONSTRAINT FK_image_post FOREIGN KEY (post_id) REFERENCES post (post_id)
);

CREATE TABLE "user" (
	user_id SERIAL,
	username VARCHAR(20),
	user_password VARCHAR(50),
	CONSTRAINT PK_user_id PRIMARY KEY (user_id)
);

COMMIT;