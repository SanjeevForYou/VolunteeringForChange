 
INSERT INTO users(username,password,enabled) VALUES ('guest','$2a$10$0.ESlGysrPaiW5HaapKwoehzWt5AibgbPPOvMhDv8D6H26QQ/CwhS', TRUE);
INSERT INTO users(username,password,enabled) VALUES ('admin','$2a$10$S/wlXEo/APzf.Sn1cO2p4.V12EJmaw.uzrHelMvkpuahjmHWnSafe', TRUE);
 
INSERT INTO authorities (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');

INSERT INTO  `MEMBER` VALUES (NULL,12,'Curious','George', 8754,'Boy Monkey','guest');
INSERT INTO `MEMBER` VALUES (NULL,123,'Allen','Rench', 8733,'Torque Master','admin');

insert into Category (categoryDescription, name, updatedDate) values ('Environmental Event', 'Environment', 'null')
insert into Category (categoryDescription, name, updatedDate) values ('Environmental Event', 'Forest', 'null')
insert into Category (categoryDescription, name, updatedDate) values ('Environmental Event', 'Industry', 'null')

insert into Event (ageCriteria, category_id, description, endDate, image, location, mark, noOfSeats, shortDescription, startDate, status, title, updateDate, uploadDate) values (12, 1, 'this is event', '2012-2-2', null, 'MUM, USA', 0, 12, 'This is short description', '2012-2-2', '', '', '2012-2-2', '2012-2-2')
insert into Event (ageCriteria, category_id, description, endDate, image, location, mark, noOfSeats, shortDescription, startDate, status, title, updateDate, uploadDate) values (12, 1, 'this is event', '2012-2-2', null, 'MUM, USA', 0, 12, 'This is short description', '2012-2-2', '', '', '2012-2-2', '2012-2-2')
insert into Event (ageCriteria, category_id, description, endDate, image, location, mark, noOfSeats, shortDescription, startDate, status, title, updateDate, uploadDate) values (12, 1, 'this is event', '2012-2-2', null, 'MUM, USA', 0, 12, 'This is short description', '2012-2-2', '', '', '2012-2-2', '2012-2-2')
insert into Event (ageCriteria, category_id, description, endDate, image, location, mark, noOfSeats, shortDescription, startDate, status, title, updateDate, uploadDate) values (12, 1, 'this is event', '2012-2-2', null, 'MUM, USA', 0, 12, 'This is short description', '2012-2-2', '', '', '2012-2-2', '2012-2-2')

					