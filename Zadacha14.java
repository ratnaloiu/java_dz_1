package by.epam.dz1;

public class Zadacha14 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число:  ");
        int i = 1;
        int x = 10;
        int v = 1;
        for (i = 1; i <= x; i++){
            v = i * v;
            System.out.println( v );
        }

    }
}
