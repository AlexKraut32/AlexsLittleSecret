package Eugene_codingTasks.week03;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(returnMethod(-67));
    }
    public static int returnMethod(int num) { //Made for numbers 0-999
        num = num * -1;
        int hundreds, tens;
        if (num >= 100) {
            hundreds = num / 100; //Finding hundreds to move it back ex.357-->3
            tens = num - (hundreds * 100); //Finding tens ex.357-300=57
            int num1 = tens / 10 * 10; //Finding middle digit 57/10=50
            int num2 = tens % 10 * 100; //Finding last digit to move it front 57%10=7*100=700
            num = num2 + num1 + hundreds; //
        } else if (num >= 10){
            int num1 = num / 10;
            int num2 = num % 10 * 10;
            num = num1 + num2;
        }
        return num;
    }
}

//Numbers -- Reverse negative number
//Write a return method that can reverse negative number and return it as int