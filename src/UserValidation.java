        public class UserValidation {

        public static void validateUser(String login, String password, String confirmPassword)
                throws WrongLoginException, WrongPasswordException {
            // Проверка логина
            if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException("Логин должен иметь длину до 20 символов и содержать только буквы, цифры или символы подчеркивания.");
            }

            // Проверка пароля
            if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Пароль должен иметь длину до 20 символов и содержать только буквы, цифры или символы подчеркивания.");
            }

            // Проверка совпадения пароля
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают.");
            }
        }

        public static void main(String[] args) {
            try {
                validateUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
                System.out.println("Успешная авторизация!");
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

