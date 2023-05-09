import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable  {
    private String name;
    private String surname;
    private Integer age;
    private Integer experience;
    private Double salary;

     public Employee(String name, String surname, int age, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
        salary = 50.0;
    }

    public Employee(String name, String surname, int age, int experience, double salary) {
        this (name, surname, age, experience);
        salary = 50;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return name.equals(employee.name) && surname.equals(employee.surname);
        }
        return false;
    }

    @Override
    public int hashCode() {return Objects.hash(name, surname);}

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет, " + salary + " руб, " + experience + " месяц;";
    }

    public String getFullName(){return name + " " + surname;}

    public boolean olderThan(Employee e){
        return false;
    }

    public void upgrade(double salary){ this.salary += salary;}

   
    



}
