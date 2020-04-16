public class Exercise_1 {
    public static void main(String[] args) {
        byte b = 12;
        short s = 2500;
        int i = 333;
        long l = 2000L;
        float f = 500.0f;
        double d = 34.12345;
        boolean bool = true;
        System.out.println(expression(5.5,4.2,3.5,6.7));
        System.out.println(comparison(5, 14));
        negativity_positivity(-1);
        System.out.println(negativity(-1));
        name("Андрей");
        leap_year(2020);
    }
    static double expression(double a, double b, double c, double d){
        return a * (b + (c / d));
    }
    static boolean comparison(int x, int y){
        if (x + y > 10 && x + y <= 20){
            return true;
        }
        else
            return false;
    }
    static void negativity_positivity(int a){
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }
    static boolean negativity(int n){
        return (n < 0 ? true :false);
    }
    static void name(String name){
        System.out.println("Привет, " + name + "!");
    }

    static void leap_year(int y){
        if (((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0)){
            System.out.println("Год високосный");
        }
        else
            System.out.println("Год не високосный");
    }
}
