package hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.var;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  String firstName;
  String lastName;
  String telephone;

  public static void main(String[] args) {

    var person = new Person("Вася", "Пупкин", "222-33-22")
                     .setLastName("Сидоров");

    log.info("person = {}", person);
    log.info("person.equals(new Person(\"Вася\", \"Сидоров\", \"222-33-22\")) = {}", person.equals(new Person("Вася", "Сидоров", "222-33-22")));
    log.info("person.getFirstName() = {}", person.getFirstName());
  }
}
