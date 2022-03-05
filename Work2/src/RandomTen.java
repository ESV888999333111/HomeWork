public class RandomTen {
    public static void main(String[] args) {
        // Растоположи 3 рандомных цисел порядке убывания
        double a1, a2, a3;
        double b1, b2, b3;
        a1 = Math.random() * 100;
        a2 = Math.random() * 100;
        a3 = Math.random() * 100;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        if (a1 > a2) { //a1 max?
            if (a1 > a3) {
                b1 = a1; //a1 max
                if (a2 > a3) {
                    b2 = a2; // a2 middle
                    b3 = a3; //a3 min
                } else {
                    b2 = a3; //a3 middle
                    b3 = a2; //a2 min
                }
            } else {
                b1 = a3; //a3 max
                b2 = a1; // a2 middle
                b3 = a2; // a1 min
            }
        } else if (a2 > a3) { //a2 max?
            b1 = a2; // a2 max
            if (a1 > a3) {
                b2 = a1; // a1 middle
                b3 = a3; // a3 min
            } else {
                b2 = a3; // a3 middle
                b3 = a1; //a1 min
            }
        } else { //a3 max
            b1 = a3; //a3 max
            b2 = a2; //a2 middle
            b3 = a1; //a1 min

        }

        System.out.println(" ");
        System.out.println((int) b1);
        System.out.println((int) b2);
        System.out.println((int) b3);
    }
}
