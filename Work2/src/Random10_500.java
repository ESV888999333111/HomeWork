public class Random10_500 {
    public static void main(String[] args) {
        int min = 10, max = 500;
        double x = (Math.random() * ((max - min) + 1)) + min;
        if (x > 25 && x < 200) {
            System.out.println("Число: " + (int) x + " входит в диапазон (25; 200)");
        } else {
            System.out.println("Число: " + (int) x + " не входит в диапазон (25; 200)");
        }
    }
}
