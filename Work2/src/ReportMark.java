public class ReportMark {
    // psvm - shortcut "public static void main(String[] args)"
    // sout - shortcut "System.out.println();"
    public static void main(String[] args) {
        double count = (int) ((Math.random() - Math.random()) * 100); //correct answers
        System.out.println("Correct answers: " + count);
        if (count < 0) {
            System.out.println("Are you stupid?");
        } else if (count < 40) {
            System.out.println("Try again");
        } else if (count < 60) {
            System.out.println("You can better");
        } else if (count < 90) {
            System.out.println("Not bad");
        } else if (count < 101) {
            System.out.println("Brilliant");
        } else {
            System.out.println("Genius");
        }
    }
}
