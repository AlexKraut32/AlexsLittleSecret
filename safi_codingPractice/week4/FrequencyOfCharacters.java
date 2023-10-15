package safi_codingPractice.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfChar("AAABBCDD"));
    }


    public static String frequencyOfChar(String str){

       String result = "";
;
for(int i=0; i< str.length();i++){ //iterate through str length
    char ch = str.charAt(i);   // assigning each Character of str length to ch
    int count = 0;
    for (int j = 0; j < str.length(); j++) { //iterate one more time to compare each character
        char each = str.charAt(j); // assigning again each Character to str length

        if(ch ==each){
            count++;
        }
    }
    if(result.contains(""+ch)){
        continue;
    }
    result +=ch;
    result+=count;
}
return result;
    }
}
