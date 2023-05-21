BEGIN TRANSACTION;

DROP TABLE IF EXISTS post;
DROP TABLE IF EXISTS image;
DROP TABLE IF EXISTS "text";

CREATE TABLE image (
	image_id SERIAL,
	image_url VARCHAR(200) UNIQUE,
	CONSTRAINT PK_image_id PRIMARY KEY (image_id)
);

CREATE TABLE "text" (
	text_id SERIAL,
	text_location VARCHAR(50) NOT NULL,
	text_description VARCHAR(3000),
	CONSTRAINT PK_text_id PRIMARY KEY (text_id)
);

CREATE TABLE post (
	post_id SERIAL,
	image_id INTEGER,
    text_id INTEGER,
	post_name VARCHAR(100) UNIQUE,
	CONSTRAINT PK_post_id PRIMARY KEY (post_id),
	CONSTRAINT FK_post_image FOREIGN KEY (image_id) REFERENCES image(image_id),
	CONSTRAINT FK_post_text FOREIGN KEY (text_id) REFERENCES "text"(text_id)
);

COMMIT;