public class function_employee {
    int final_salary;
    int hours;
    public function_employee(){
        final_salary=500;
    }
    public void getinfo(){
        hours=8;
    }
    public void AddSal(int s) {
        final_salary = s;
        if (s<500) {
            s = s + 10;
            System.out.println("employee of the salary"+s);
        }
        else {
            System.out.println("employee of the salary"+s);
        }
    }
      public void AddWork(int h){
        hours=h;
        if(hours<6){
          final_salary=final_salary+5;
          System.out.println("Employee of the hours"+final_salary);
        }
      }
      public static void main(String[] args){
        function_employee f= new function_employee();
        f.AddSal(600);
        f.getinfo();
        f.AddWork(5);
      }

}
