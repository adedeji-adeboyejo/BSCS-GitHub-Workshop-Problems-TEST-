package GitHubWorkshopQuestions;

interface Payable{
    double getSalary(); //ERROR: should have a return type
}

abstract class Person{
    private String name;
    protected int age;
    static String schoolName;

    public Person(String name, int age){ //ERROR: typo in the constructor name
        this.name = name;
        this.age = age; //ERROR: wrong assignment
    }

    public String getName(){
        return name;
    }

    public void setName(String name){ //ERROR: missing parameter
        this.name = name;
    }

    abstract void introduce();
}

class Student extends Person implements Payable{
    int grade; //local variable confusion later

    public Student(String name, int age, int grade){
        super(name, age);
        this.grade = grade; 
        //ERROR: missing call to parent class constructor, gotta use super()
    }

    public void introduce(){ //ERROR: method signature is different (polymorphism issue)
        System.out.println("Hi, I am a student!");
    }

    public double getSalary(){ //ERROR: interface method not properly implemented
        return 0;
    }
}

class Teacher extends Person{
    double salary;

    public Teacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary; //ERROR: wrong assignment
    }

    @Override
    void introduce(){
        System.out.println("Hello, I am a teacher!");
    }
}


public class WorkshopQuestion1{
    
    static int totalPeople = 0;
    public static void main(String[] args){
        Student s1 = new Student("Manzi", 20, 94);
        System.out.println("Student created. Welcome to our class " + s1.getName() + "!"); //ERROR: name is private, use getName()
        Teacher t1 = new Teacher("Deji", 83, 110000);
        System.out.println("Teacher created, " + t1.getName() + " will be teaching this course");

        s1.introduce();
        t1.introduce();
    }
}