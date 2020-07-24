package by.epam.dz1;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и
//        если да, то будет ли он прямоугольным.
public class Zadacha6 {
    public static void main(String[] args) {
        int a = 30;
        int b = 200;
        int c = a + b;
        int d = 180 - c;


        if ( c < 180){
            System.out.println("Треуголник существует");
            if ( a == 90 || b == 90 || c == 90){
                System.out.println("Треуголник прямоугольный");
            }

            //System.out.println("Углы верны");
        }
        else{
            System.out.println("Треугольик не существует");
        }

    }
}
