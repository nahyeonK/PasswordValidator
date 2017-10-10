package knu.ac.kr.passwordvalidator;


import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void 미니멈랭쓰가_지정값보다크면_테스트성공(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 맥시멈랭쓰가_지정값보다작으면_테스트성공(){
        String testPassword = "abcdefghi";
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }

    @Test
    public void 맥시멈랭쓰가_지정값보다크면_테스트실패(){
        String testPassword = "abcdef";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 지정값이_널값이면_테스트실패(){
        String testPassword = null;
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 지정값이_앰티스트링이면_테스트실패(){
        String testPassword = "";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertFalse(result);
    }

    @Test
    public void 지정값이_어드민이면_테스트성공(){
        String testPassword = "ADMIN";
        PasswordValidator passwordValidator = new PasswordValidator(2, 4);
        boolean result = passwordValidator.validate(testPassword);
        assertTrue(result);
    }
}