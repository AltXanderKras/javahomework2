public class Main {
    public static void main(String[] args) {
        int ticketPrice = 50_000;
        int bonus = 20;
        int bonusMiles = (ticketPrice / bonus);

        System.out.println("Начисленных бонусных миль:" + bonusMiles);
    }
}