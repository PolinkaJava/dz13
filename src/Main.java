public class Main {
    public static void main(String[] args) {
        try {
            boolean isPriemnik = Test.priemnik("testLogin", "testPassword1", "testPassword1");
            System.out.println("Проверка прошла успешно: " + isPriemnik);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
