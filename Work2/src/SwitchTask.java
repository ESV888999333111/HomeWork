public class SwitchTask {
    //psvm - shurtcut "public static void main(String[] args)"
    //sout - shurtcus "System.out.println()"

    public static void main(String[] args) {
        int a = 1, b = 5, c = 9; // tree number from user
        switch (c) {
            case 3:
                System.out.println(a + b);
                break;
            case 5:
                System.out.println(a - b);
                break;
            case 7:
                System.out.println(a * b);
                break;
            case 9:
                System.out.println((double)a / b);
                break;
            default:
                System.out.println("NOUP");
        }
    }
}
