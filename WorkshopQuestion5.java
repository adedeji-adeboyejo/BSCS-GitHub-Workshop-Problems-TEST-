package GitHubWorkshopQuestions;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary){
        name = name; //ERROR: wrong initialization
        salary = salary; //ERROR: wrong initialization
    }

    public void work(){
        System.out.println(name + " is doing their job");
    }
}

class Manager extends Employee{
    int teamSize;

    public Manager(String name, double salary, int teamSize){
        //ERROR: missing super()
        this.teamSize = teamSize;
    }

    @Override
    public void work(String task){ //ERROR: incorrect override, method signature CANNOT change
        System.out.println("Manager" + getName() + " is doing " + task);
    }
}


public class WorkshopQuestion5 {
    public static void main(String[] args){
        Employee e1 = new Employee("Alice", 40000);
        Employee e2 = new Manager("Bob", 70000, 5);

        System.out.println("Employees created!");

        e1.work();
        e2.work(); 

        /* ERROR
        * With e2, polymorphism should call Manager's version of work()
        * However, Manager did not properly override work()
        * Instead, e2 will call the Employee version of work(), which is unexpected
         */
    }
}
