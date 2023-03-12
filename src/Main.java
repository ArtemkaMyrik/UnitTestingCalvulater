public class Main {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int add = cal.add(10,5);
        System.out.println(add);

        int sub = cal.subtract(10,5);
        System.out.println(sub);

        int mul = cal.multiply(10,5);
        System.out.println(mul);

        int div = cal.divide(10,5);
        System.out.println(div);


    }
}