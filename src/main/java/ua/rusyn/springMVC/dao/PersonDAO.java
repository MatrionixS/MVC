package ua.rusyn.springMVC.dao;

import org.springframework.stereotype.Component;
import ua.rusyn.springMVC.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEPOLE_COUNT;
    private List<Person> people;
    {
        people= new ArrayList<>();
        people.add(new Person(++PEPOLE_COUNT, "Tom"));
        people.add(new Person(++PEPOLE_COUNT, "PETR"));
        people.add(new Person(++PEPOLE_COUNT, "Katya"));
        people.add(new Person(++PEPOLE_COUNT, "Dima"));
    }
    public List<Person> index (){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
}
