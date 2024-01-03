package Design_Patterns;


interface laptop {
    void laptopspec();  //default methods
}

class Applelaptop implements laptop{
    public void laptopspec(){
        System.out.println("It is a Apple loptop");
    }
}

class HPlaptop implements laptop{
    public void laptopspec(){
        System.out.println("It is a HP loptop");
    }
}

class Delllaptop implements laptop{
    public void laptopspec(){
        System.out.println("It is a Dell loptop");
    }
}

class Lenovolaptop implements laptop{
    public void laptopspec(){
        System.out.println("It is a Lenovo loptop");
    }
}

class Asuslaptop implements laptop{
    public void laptopspec(){
        System.out.println("It is a Asus loptop");
    }
}
class Factory{    //It is factory design
 public laptop getNewLaptop(String str){
     if(str.equals("apple"))
         return new Applelaptop();
     else if (str.equals("Lenovo"))
         return new Lenovolaptop();
     else if (str.equals("dell"))
         return new Delllaptop();
     else if (str.equals("Asus"))
         return new Asuslaptop();
     else
         return new HPlaptop();
 }
}

public class Factory_Ex{
    public static void main(String[] args) {
        Factory lp = new Factory();
            laptop alp = lp.getNewLaptop("hp");
          alp.laptopspec();
        }
    }

