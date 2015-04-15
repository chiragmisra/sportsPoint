create database changeme;
create user 'changeme'@'localhost' identified by 'changeme';
grant all on changeme.* to 'changeme'@'localhost';

