<<<<<<< HEAD
# Courier_JDBC_Project
=======

# CourierJDBC

### How to Compile and Run

1. Make sure MySQL is running and `courier_db` exists.
2. Place the MySQL Connector JAR in `lib/` as `mysql-connector-j-9.4.0.jar`
3. Compile:
```
javac -cp "lib/mysql-connector-j-9.4.0.jar" -d out src/db/DBConnection.java src/dao/SenderDAO.java src/model/Sender.java src/Main.java
```
4. Create jar:
```
jar cmf manifest.txt CourierJDBC.jar -C out .
```
5. Run:
```
java -jar CourierJDBC.jar
```
>>>>>>> f8afddb (Initial commit - Courier JDBC project)
