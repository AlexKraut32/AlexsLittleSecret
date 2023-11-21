package Eugene_codingTasks.week06;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordValidationMethod("WErwwww !"));
    }
    public static Boolean passwordValidationMethod(String password) {
        Boolean lowerCase = false, upperCase = false, specChar = false, digit = false;
        if (password.length() >= 6 && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCase = true;
                } else if (Character.isDigit(ch)) {
                    digit = true;
                } else {
                    specChar = true;
                }
            }
        }else System.out.println("bad password");

        if (lowerCase.equals(true) && upperCase.equals(true) && specChar.equals(true) && digit.equals(true)) {
            return true;
        } else return false;
    }
}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */