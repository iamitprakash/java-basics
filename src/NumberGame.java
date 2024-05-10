public class NumberGame {


    public String Playing(int number) {//change name

        if (number % 2 == 0) {
            return "No luck, try again!";
        } else if (number % 3 == 0) {
            return "You got a jackpot!";
        } else if (number % 5 == 0) {
            return "Invalid input error.";
        } else {
            return "You won a prize!";
        }
    }
}
