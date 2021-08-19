INSERT INTO post(uuid, title)
VALUES ('4e3668a3-ac58-406d-96f6-ed9a52c37e70', 'title1'),
       ('dbb7308c-fb1b-402b-9096-e0274448e0c8', 'title2'),
       ('d49ee33f-6962-4b4c-9bad-62ec2e195ad2', 'title3');

INSERT INTO comment(uuid, comment, post_uuid)
VALUES ('28612604-fcb9-42f2-b257-0fe34d0bd2f9', 'comment1', '4e3668a3-ac58-406d-96f6-ed9a52c37e70'),
       ('e44a23be-92da-4175-a8c9-c31723adb303', 'comment2', 'dbb7308c-fb1b-402b-9096-e0274448e0c8');