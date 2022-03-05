public class AgeExp {
    // psvm - shortcut "public static void main(String[] args)"
    // sout - shortcut "System.out.println();"
    public static void main(String[] args) {
        double age, exp;
        age = (Math.random() * ((200 - 16) + 1)) + 16;
        exp = Math.random() * 15;
        System.out.println("Возраст: " + (int) age + ", опыт: " + (int)exp);
        if (age > 100) {
            System.out.println("Мы Вам перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность стажера");
        } else {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
