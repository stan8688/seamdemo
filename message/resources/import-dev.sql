-- SQL statements which are executed at application startup if hibernate.hbm2ddl.auto is 'create' or 'create-drop'
insert into message(id, read, title, text, datetime) values (nextval('hibernate_sequence'), false, 'title1','text', '2010-10-10 4:30');
insert into message(id, read, title, text, datetime) values (nextval('hibernate_sequence'), false, 'title 2xxxx','textxxxxx', '2010-10-10 5:30');