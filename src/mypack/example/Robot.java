//Program Development about the directions using private access modifiers and methods

package mypack.example;

public class Robot {
    private String name;
    private char direction;
    private int xLoc, yLoc;

    public Robot(String name, char dir, int x, int y) {
        this.name=name;
        this.direction=dir;
        this.xLoc=x;
        this.yLoc=y;
    }
    public String toString() {
        return name + " is standing at (" + xLoc + "," + yLoc + ") and facing" +" "+ direction;
    }

    public void turnClockWise() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnCounterClockwise(){
            switch (direction) {
                case 'N':
                    direction = 'W';
                    break;
                case 'W':
                    direction = 'S';
                    break;
                case 'S':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'N';
                    break;
            }
        }
    public void takeSteps(int numSteps) {
        switch (direction) {
            case 'N':
                yLoc += numSteps;
                break;
            case 'E':
                xLoc += numSteps;
                break;
            case 'S':
                yLoc -= numSteps;
                break;
            case 'W':
                xLoc -= numSteps;
                break;
        }
    }
    public static void main(String[] args) {
        Robot robby = new Robot("Robby", 'N', 10, 12);
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                robby.turnClockWise();
            }
            else {
                robby.turnCounterClockwise();
            }
            robby.takeSteps(3);
            System.out.println(robby);
        }
    }

}
