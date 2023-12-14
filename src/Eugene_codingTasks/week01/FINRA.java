package Eugene_codingTasks.week01;

public class FINRA {
    public static void main(String[] args) {
        finraMethod(30);
    }

    public static void finraMethod(int i) {
        String str = "";
        for (i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str += " FINRA";
            } else if (i % 3 == 0) {
                str += " FIN";
            } else if (i % 5 == 0) {
                str += " RA";
            } else {
                str = str + " " + i;
            }

        }
        System.out.println(str);
    }
}

