package hw.jdbc;

import static hw.jdbc.Student.Fields.groupId;
import static hw.jdbc.Student.Fields.id;
import static hw.jdbc.Student.Fields.name;

import java.sql.DriverManager;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;

@Slf4j
public class JdbcDemo {

  @SneakyThrows
  public static void main(String[] args) {
//    val aClass = Class.forName("org.h2.Driver");

//    @Cleanup val connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
    @Cleanup val connection = DriverManager.getConnection("jdbc:derby:memory:demo;create=true");
    @Cleanup val statement = connection.createStatement();
    //noinspection SqlNoDataSourceInspection
    statement.executeUpdate("create table if not exists student(id identity, name varchar, groupId int)");
    statement.executeUpdate("insert into student (name, groupId) values ('Вася Пупкин', 123)");
    @Cleanup val resultSet = statement.executeQuery("select * from student");
    while (resultSet.next())
      log.info("Student = {}", Student.builder()
                                   .id(resultSet.getLong(id))
                                   .name(resultSet.getString(name))
                                   .groupId(resultSet.getLong(groupId))
                                   .build());
  }
}
