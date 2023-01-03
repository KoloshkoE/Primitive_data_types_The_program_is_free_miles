public class Main {
    public static void main(String[] args)
    {

        int ticket_price = 7460;
        int rub_for_a_miles = 20;
        int bonus_miles = (ticket_price / rub_for_a_miles);

        System.out.println("Начислено бонусных миль " + bonus_miles);

    }
}