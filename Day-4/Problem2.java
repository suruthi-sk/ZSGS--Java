/*
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. 
Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. 
Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
*/

class TwoD {
    private int x;
    private int y;

    TwoD() {
        System.out.println("TwoD default constructor");
    }

    TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    public void setX(int x){ 
		this.x = x; 
	}
    public void setY(int y){
		this.y = y; 
	}
    public int getX(){
		return x; 
	}
    public int getY(){
		return y; 
	}

    void write(){
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
    }
}

class ThreeD extends TwoD {
    private int z;

    ThreeD(){
        super();  
    }

    ThreeD(int x, int y, int z){
        super(x, y);  
        this.z = z;
    }

    public void setValues(int x, int y, int z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public int getZ(){
		return z; 
	}

    void write() {
        super.write();
        System.out.println("Z : " + z);
    }

    public static double calculateDistance(ThreeD p1, ThreeD p2) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        int dz = p2.getZ() - p1.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class Problem2 {
    public static void main(String[] args) {
        ThreeD point1 = new ThreeD();   
        point1.setValues(2, 3, 4);
        point1.write();

        ThreeD point2 = new ThreeD(1, 2, 3);  
        point2.write();

        double distance = ThreeD.calculateDistance(point1, point2);
        System.out.println("Distance between points: " + distance);
    }
}
