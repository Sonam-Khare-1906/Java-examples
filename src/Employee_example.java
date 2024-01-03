//Method overriding in inheritance

public class Employee_example {
    public static void main(String[] args){
       HRManger hr =new HRManger(20000);
        hr.work();
       hr.addEmployee();
        System.out.println("Name of the employee:"+hr.salary);

    }
}
class employee {
    int salary;

    public employee(int sal) {
        this.salary = sal;
    }
    public void work(){
    }
    public int getSalary(){
        return salary;
}
}
class HRManger extends employee{
        String name;

    public HRManger(int sal) {
        super(sal);
        this.name="Akansha";
    }
    public void work(){
        System.out.println("Employee of the salary:"+getSalary());
    }
    public void addEmployee(){
        System.out.println("Name of the new Employee:"+name);
    }
}
