public class Bonus {
    public static void main(String[] args) {
        int score = 100;
        int topup = 100;
        int totalScore = score + topup;

        int bonus;
        if (topup >= 1000) {
            bonus = topup / 100 + totalScore;
        } else {
            bonus = totalScore;
        }
        System.out.println(bonus);
    }
}

