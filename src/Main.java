public class Main {

        public static void main(String[] args) {

            int ticketPrice = 100; //цена биллета
            int oneBonusMile = 20;  //сколько нужно потратить, чтоб получить 1 бонусную милю

            int bonus = ticketPrice / oneBonusMile;
            System.out.println("Бонусные мили за поездку: " + bonus);
        }
    }
