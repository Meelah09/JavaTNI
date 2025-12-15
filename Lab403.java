public class Lab403 {
    public static void main(String[] args) {
        private static final String VALID_USERNAME = "admin";
        private static final String VALID_PASSWORD = "Admin1234";

        public static void main(String[] args) {

            String inputUsername;
            String inputPassword;
            boolean loginSuccess = false;

            do {
                inputUsername = JOptionPane.showInputDialog(null, "Enter username:", "Input", JOptionPane.QUESTION_MESSAGE);

                if (inputUsername == null) {
                    return;
                }

                inputPassword = JOptionPane.showInputDialog(null, "Enter password:", "Input", JOptionPane.QUESTION_MESSAGE);

                if (inputPassword == null) {
                    return;
                }

                boolean isUsernameCorrect = inputUsername.equalsIgnoreCase(VALID_USERNAME);
                boolean isPasswordCorrect = inputPassword.equals(VALID_PASSWORD);

                if (isUsernameCorrect && isPasswordCorrect) {
                    JOptionPane.showMessageDialog(null, "Login Success!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    loginSuccess = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password\n\nLogin Fail...", "Login Fail...", JOptionPane.ERROR_MESSAGE);
                }

            } while (!loginSuccess);

    }

}

