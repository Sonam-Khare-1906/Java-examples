//Structural Design Pattern
package InputOutput_Streams;
abstract class IceCream{
    String description;
    String getDescription(){
        return description;
    }
    abstract int cost();
}
 class ChocolateIceCream extends IceCream{
    String getDescription(){
        return "Chocolate";
    }
    int cost(){
        return 70;
    }
}
 class ButterScotchIceCream extends IceCream{
    String getDescription(){
        return "Butter Scotch";
    }
    int cost(){
        return 60;
    }
}
 abstract class IceCreamDecortor extends IceCream{
    abstract int cost();
}
 class ChocolateSyrupDecorator extends IceCreamDecortor{
    IceCream iceCream;
    ChocolateSyrupDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }
    String getDescription(){
        return iceCream.getDescription()+" "+"with chocolate Syrup";
    }

    @Override
    int cost() {
        return iceCream.cost()+30;
    }
}
class RainbowSprinkleDecorator extends IceCreamDecortor{
    IceCream iceCream;
    RainbowSprinkleDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }
    String getDescription(){
        return iceCream.getDescription()+" "+"with Rainbow Sprinkle";
    }

    @Override
    int cost() {
        return iceCream.cost()+20;
    }
}
class ChocochipsDecorator extends IceCreamDecortor{
    IceCream iceCream;
    ChocochipsDecorator(IceCream iceCream){
        this.iceCream=iceCream;
    }
    String getDescription(){
        return iceCream.getDescription()+" "+"with Chocochips";
    }

    @Override
    int cost() {
        return iceCream.cost()+25;

    }
}
public class Decorator_Ex{
    public static void main(String[] args){
        IceCream iceCream=new ButterScotchIceCream();
        iceCream=new ChocolateSyrupDecorator(new ChocochipsDecorator(new RainbowSprinkleDecorator(iceCream)));
        print(iceCream);
    }
    static void print(IceCream iceCream){
        System.out.println("Desc: "+iceCream.getDescription());
        System.out.println("Cost: "+iceCream.cost());
    }
}