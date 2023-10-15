package safi_codingPractice.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaAbBBcccCCC"));
    }


    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
           String ch = "" + str.charAt(i); //Assigning str to new String ch
           if(result.contains(ch.toLowerCase())){ // in condition if result has same character it will skip the next one
               continue;

           }
           result +=ch;
        }
        return result;
    }
}
