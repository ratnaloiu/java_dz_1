package by.epam.dz1;
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//         𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2
public class Zadacha1 {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = 6;

        double result = ((b + Math.sqrt(Math.pow(b,2) + 4 * a * c)) / (2 * a)) -
                        ((Math.pow(a,3))* c + (Math.pow(b, -2)));
        System.out.println(result);
    }
}
