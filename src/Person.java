public class Person {

    String name;
    int age;
    char gender;

    public String getName(){
        this.gender = gender;
        if (gender == 'm'){
           return "Mr." + name;
        } else {
           return "Ms." + name;
        }
    }

}
