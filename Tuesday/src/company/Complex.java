package company;

public class Complex {
    private double real;
    private double imaginery;

    public Complex(){
    }

    public Complex(double real, double imaginery){
        this.real = real;
        this.imaginery = imaginery;
    }

    public double getReal(){
        return real;
    }

    public double getImaginery(){
        return imaginery;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImaginery(double imaginery){
        this.imaginery = imaginery;
    }

    public void print(){
        System.out.println(real + " + " + imaginery + "i");
    }
    //сложение
    public Complex Summa(Complex num,Complex nums2){
        real = num.real + nums2.real;
        imaginery = num.imaginery + nums2.imaginery;
        return new Complex(real, imaginery);
    }
    // вычитание
    public Complex Subtraction(Complex num,Complex nums2){
        real = num.real - nums2.real;
        imaginery = num.imaginery - nums2.imaginery;
        return new Complex(real, imaginery);
    }
    //умножение
    public Complex Multiply(Complex num,Complex nums2){
        real = num.real * nums2.real + num.real * nums2.imaginery;
        imaginery = num.imaginery * nums2.imaginery + num.imaginery * nums2.real;
        return new Complex(real, imaginery);
    }
}
