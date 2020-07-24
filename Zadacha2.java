package by.epam.dz1;
// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//         𝑎 ∗ 𝑏 − 𝑎𝑏 − 𝑐 𝑐𝑑 𝑐𝑑
public class Zadacha2 {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = 6;
        double d = 8;
        double result;

        result = (a / c) * (b / d) - (((a * b) - c) / (c * d));
        System.out.println(result);
    }
}
