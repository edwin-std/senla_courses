package senla.tasks.second;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vector {
    double x;
    double y;
    double z;

    public vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double vectorLength(vector a) {
        return Math.sqrt(Math.pow(a.x,2) + Math.pow(a.y,2) + Math.pow(a.z, 2));
    }
    public static double scalMultiply(double x1, double y1, double x2, double y2){
        return ((x1 * x2) +(y1 * y2));
    }
    public vector vectorMult(vector c) {
        double tmpX = y * c.z - z * c.y;
        double tmpY = -(x * c.z - z * c.x);
        double tmpZ = z * c.y - y * c.x;
        return new vector(tmpX, tmpY, tmpZ);
    }
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }



    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double x1, y1, x2, y2, z1, z2;
        System.out.println("Input first vector cood: ");
        x1 = Double.parseDouble(r.readLine());
        y1 = Double.parseDouble(r.readLine());
        z1 = Double.parseDouble(r.readLine());
        System.out.println("Input second vector cood: ");
        x2 = Double.parseDouble(r.readLine());
        y2 = Double.parseDouble(r.readLine());
        z2 = Double.parseDouble(r.readLine());
        vector v = new vector(x1,y1,z1);
        vector v1 = new vector(x2,y2,z2);

        System.out.println("First vector is : [" + x1 + " ; " + y1 + " ; " +  z1 +"]");
        System.out.println("Second vector is : [" + x2 + " ; " + y2 + " ; " + z2 +"]");
        Thread.sleep(2000);
        System.out.println("Length of the first vector is :" + vectorLength(v));
        System.out.println("Length of the second vector is :" + vectorLength(v1));
        Thread.sleep(2000);
        System.out.println("Scal Multiply is : " + scalMultiply(x1,y1,x2,y2));
        Thread.sleep(2000);
        System.out.println("Vector Multiply is: " + v.vectorMult(v1));
        System.out.println("Vector Multiply is: " + v1.vectorMult(v));

    }
}