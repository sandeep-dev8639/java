ypublic class Employee
{
    int id;
    String name;
    double salary;
    String department;
    Employee(int id ,String name)
    {
        this.id = id;
        this.name = name;
    } 
    Employee(int id ,String name ,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(int id ,String name ,double salary ,String department)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    void display()
    {
        System.out.println("employee ID :"+id);
        System.out.println("employee name :"+name);
        System.out.println("employee salary :"+salary);        
        System.out.println("employee department :"+department);
        System.out.println("************************");
    }
    public static void main(String[] args)
    {
        Employee e1 = new Employee(4,"sandeep");
        Employee e2 = new Employee(3,"anjineyulu",60000);
        Employee e3 = new Employee(2,"parvathi",1000000,"software");
        e1.display();
        e2.display();
        e3.display();
    }

}