public class BonusTerar {
    public static void main(String[] args) {
        int score = 100;
        int topup = 100;
        int TotalScore =  score + topup;
        boolean condition = topup >= 1000;

        int bonus = (condition ? topup / 100 + TotalScore : TotalScore);
        System.out.println(bonus);
    }
}
