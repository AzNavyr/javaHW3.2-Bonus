public class BonusTenar {
    public static void main(String[] args) {
        int score = 100;
        int topup = 100;
        int totalScore = score + topup;
        int totalScore = score + topup;
        boolean condition = topup >= 1000;

        int bonus = (condition ? topup / 100 + totalScore : totalScore);
        System.out.println(bonus);
    }
}
