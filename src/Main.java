public class Main {
    public static void main(String[] args) {
        int TicketPrice = 50_000;
        int Bonus = 20;
        int BonusMiles = (TicketPrice / Bonus);

        System.out.println("Начисленных бонусных миль:" + BonusMiles);
    }
}