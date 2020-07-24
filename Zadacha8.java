package by.epam.dz1;

public class Zadacha8 {
    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        int x = 10;
        int y = 5;
        int z = 80;

        if (x <= A & y <= B || x <= B & y <= A || y <= A & z <= B || y <= B & z <= A || z <= A & x <= B || z <= B & x <= A) {
            System.out.println("Вошеееел!");
        } else {
            System.out.println("Не вошел(");

        }
    }
}
