package tasks;

import common.Person;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/*
Задача 3
Отсортировать коллекцию сначала по фамилии, по имени (при равной фамилии), и по дате создания (при равных фамилии и имени)
 */
public class Task3 {

  public static List<Person> sort(Collection<Person> persons) {
    return persons.stream()
        .filter(Objects::nonNull)
        .sorted(
            Comparator
                .comparing(Person::getSecondName)
                .thenComparing(Person::getFirstName)
                .thenComparing(Person::getCreatedAt)
        )
        .collect(Collectors.toList());
  }
}
