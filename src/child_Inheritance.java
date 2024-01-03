public class child_Inheritance extends parent {// Multilevel Inheritance
    // super keyword is used for calling the parent class constructor  super()
    // just immediate refer to upper class
    // Super invoke the property and method of the parent class
    //main method should have only child class
    int age=10;
    String skin_color="wheatish";
    public static void main(String[] args) {
        child_Inheritance ch = new child_Inheritance();
        ch.show();
       System.out.println(ch.age);
        System.out.println(ch.skin_color);

    }
}
    class parent extends grand_parents{
        String eye_color="blue";
        String hair="long";
        public parent(){
            super.dress="Orange and Skyblue";
            System.out.println("Dress color"+super.dress);
        }
        public void show(){
            System.out.println(eye_color+" "+hair);
        }
    }
    class grand_parents{
       String dress;
    }

