public class Employee {

    Person person = new Person();
    int salary;

    

     boolean isSameName(Employee employee) {
         return person.name.equals(employee.person.name);
    }

}
