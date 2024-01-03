//Write a java program to create a base class Sports with a method called play()
//Create a three subclasses.football,Basketball and Rugby.Override the play() method in each subclass
//to play a specific statement for each sport.

package mypack.example;

public class Sports {
    int No_of_players;
    public Sports(){

    }
    public void play(){
        System.out.println("Sports keep us physically fit, reducing health-related problems."+No_of_players);
    }
    public static void main(String[] args){
        Football f=new Football();
        f.play();
        Basketball b=new Basketball();
        b.play();
        Rugby r=new Rugby();
        r.play();
    }
}
class Football extends Sports{
    public Football(){
        No_of_players=11;
    }
    public void play(){
        System.out.println("A match is played by two teams, each with a maximum of"+" "+No_of_players+" "+"players");

    }
}
class Basketball extends Sports{
    public Basketball(){
        No_of_players=12;
    }
    public void play(){
        System.out.println("A match is played by two teams, each with a maximum of"+" "+No_of_players+" "+"players");
    }
}
class Rugby extends Sports{
    public Rugby(){
        No_of_players=15;
    }
    public void play(){
        System.out.println("A match is played by two teams, each with a maximum of"+" "+No_of_players+" "+"players");
    }
}