package company;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // создание объектов

        Complex num = new Complex(5,2);

        Complex num2 = new Complex();
        num2.setReal(3);
        num2.setImaginery(-7);

        // вывод чисел

        num.print();

        // сложение

        num = num.Summa(num, num2);

        // вычитание

        num = num.Subtraction(num, num2);

        // умножение

        num = num.Multiply(num, num2);

    }
}
