INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT MEMBER (AGE, USERNAME, DOB, FIRSTNAME, LASTNAME, mark, MEMBERNUMBER, TITLE) values (50, 'admin', '2012-2-2', 'admin', 'admin', 0, 0, '')

INSERT INTO users(username,password,enabled) VALUES ('user','$2a$10$rJCfqJtDfqI3Cu9DXJUZJeugzlVCEZQ94gcLe.OfQBoKY4SzFPi0G', TRUE);
INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT MEMBER (AGE, USERNAME, DOB, FIRSTNAME, LASTNAME, mark, MEMBERNUMBER, TITLE) values (50, 'user', '2012-2-2', 'user', 'user', 0, 0, '')

INSERT INTO category (categoryId, categoryDescription, name, updatedDate) VALUES (1, 'dfgdfg', 'sdf', '2016-12-12');
INSERT INTO event (eventId, ageCriteria, description, endDate, location, noOfSeats, shortDescription, startDate, status, title, updateDate, uploadDate, category_id) VALUES (1, 20, 'tree plantation', '2016-12-12', 'fairfield', 20, 'aslkdnnldsa', '2016-12-11', 1, 'plantation', '2016-8-29', '2016-8-29', 1);
