package java_features.annotations.own_annotation;

import java.util.List;

public class Simple {
    public void execute() {
        System.out.println("Executing...");
    }

    @MyTest
    void testExecute() {
        execute();
    }

    @UseCase(id = 47)
    public boolean validatePassword(String password) {
        return (password.matches("\\w\\d\\w*"));
    }

    @UseCase(id = 48, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
