package Eugene_codingTasks.week02;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {

        int num = 24;
        for (int j = 1; j <= num; j++) {
            String str = "";
            if (j % 2 == 0 || j % 3 == 0 || j % 5 == 0) {
                if (j % 2 == 0) {
                    str += "Codility";
                }
                if (j % 3 == 0) {
                    str += "Test";
                }
                if (j % 5 == 0) {
                    str += "Coders";
                }

            }else str+=""+j;
            System.out.println(str + "\n");
        }
    }
}
