package ss19_string_regex.thuc_hanh.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {


    public AccountExample() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validAccount = new String[] { "luat   ", "_abc123", "______", "mfsd","abcdefgh" };
        for (String checkAccount:validAccount
             ) {
            System.out.println(validate(checkAccount));
        }

    }
}
