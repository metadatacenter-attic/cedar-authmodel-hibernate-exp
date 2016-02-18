# cedar-authmodel-hibernate-exp
Experiment for Authentication Model, stored using Hibernate.

The application currently will drop and recreate the tables in the database. The database and privileges need to be set up, based on the below guide.

###Start MySQL

    #on OS X
    sudo /usr/local/mysql/support-files/mysql.server start

###Creating the database in MySQL

    CREATE DATABASE `cedar_orgmodel_exp` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

###Creating the user for the application

    CREATE USER 'user_name'@'localhost' IDENTIFIED BY 'password';
    GRANT ALL PRIVILEGES ON `cedar_orgmodel_exp`.* TO 'user_name'@'localhost' WITH GRANT OPTION;
    FLUSH PRIVILEGES;

###Verify user and grants
    SELECT User FROM mysql.user;
    SHOW GRANTS FOR user_name@localhost;

###Run with Maven
    mvn clean install