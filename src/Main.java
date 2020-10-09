public class Main {
    public static void main(String[] args) {
        Plan[] plansArray = new Plan[2];
        plansArray[0] = new Plan("Везде онлайн", 500, true);
        plansArray[1] = new Plan("Мой онлайн", 400, false);


        System.out.println("03HW_OOP: 'Plans'");
        for (int i = 0; i < plansArray.length; i++) {
            String hit = plansArray[i].hit ? "ХИТ!" : "";
            System.out.println(i + ") " + plansArray[i].name + "; Цена (мес): " + plansArray[i].monthPrice + "руб.; " + hit);
        }
    }
}
