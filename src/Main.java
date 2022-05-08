public class Main {

    public static void main(String[] args){

     Person firstPerson = new Person();
     firstPerson.gender = 'w';
     firstPerson.name = "Nadya";
        System.out.println(firstPerson.getName());

        Employee employee1 = new Employee();
        employee1.person.name = "Victor";
        employee1.salary = 55;

        Employee employee2 = new Employee();
        employee2.person.name = "Mark";
        employee2.salary = 44;

        System.out.println(employee2.isSameName(employee2));

        Salary salaryArray = new Salary();
        Employee[] empArray = {employee1, employee2};
        System.out.println(salaryArray.getSum(empArray));





    }
}
