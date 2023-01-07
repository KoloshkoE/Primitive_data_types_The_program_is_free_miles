public class Main {
    public static void main(String[] args) {

        int ticketPrice = 7460;
        int rubForAMiles = 20;
        int bonusMiles = (ticketPrice / rubForAMiles);

        System.out.println("Начислено бонусных миль " + bonusMiles);

    }
}