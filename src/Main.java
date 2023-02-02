public class Main {
    public static void main(String[] args) {
        int amount = 1000;// стоимость билета
        int costpermile = 20;// стоимость за одну милю
        int bonusmiles = amount / costpermile;

        System.out.println("Купили билет за :");
        System.out.println(amount + "руб");
        System.out.println("Получили :");
        System.out.println(bonusmiles + "миль");
    }
}
