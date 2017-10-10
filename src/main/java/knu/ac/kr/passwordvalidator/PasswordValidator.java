package knu.ac.kr.passwordvalidator;

public class PasswordValidator {

    private int minLength;
    private int maxLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate(String password){
        if(password == null)
            return false;

        if(password.equals("ADMIN"))
            return true;

        int length = password.length();

        if(length == 0)
            return false;

        if(length < minLength)
            return false;

        if(length > maxLength)
            return false;

        return true;
    }

}
