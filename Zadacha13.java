package by.epam.dz1;


public class Zadacha13 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число:  ");
        int i = 1;
        int x = 10;
        int v = 0;
        for (i = 1; i <= x; i++){
            v = i + v;
            System.out.println( v );
        }

    }
}
