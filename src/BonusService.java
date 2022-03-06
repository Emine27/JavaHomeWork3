public class BonusService {
    public int calculate(int price) {
        int oneBonusMile = 20;  //сколько нужно потратить, чтоб получить 1 бонусную милю
        int bonus = price / oneBonusMile;
        return bonus;
    }
}
