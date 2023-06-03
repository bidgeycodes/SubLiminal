
INSERT INTO image (image_url)
VALUES ('https://media.istockphoto.com/id/1168451046/photo/cat-and-dog-sleeping-puppy-and-kitten-sleep.webp?s=2048x2048&w=is&k=20&c=HzWcH1YPhKGS6TXJqaIuANZKGEShILdSxfhQoB2ktf8=');

INSERT INTO post (post_name, post_location, post_date, post_description)
VALUES ('Tech Elevator', 'Ohio', '2023-05-31', 'I am here');

SELECT *
FROM post
JOIN image ON post.post_id = image.post_id;

UPDATE image
SET post_id = 1;