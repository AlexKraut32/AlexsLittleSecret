package Eugene_codingTasks.week02;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        String str3="", str5="", str15="";
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0&&i%5==0&&i%15==0){
                str15 +=" "+i;
            } else if (i%5==0) {
                str5 +=" "+i;
            }else if (i%3==0){
                str3 +=" "+i;
            }
        }
        System.out.println("Divisible by 15 = "+str15+"\nDivisible by 5 = "+str5+"\nDivisible by 3 = "+str3);
    }
}
