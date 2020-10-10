public class Main {
    public static void main(String[] args) {
        Plan[] plansArray = new Plan[2];
        plansArray[0] = new Plan("Везде онлайн", 500, true);
        plansArray[0].nolimitTrafficInfoImageLinks = new String[] {"vk", "facebook", "whatsapp", "telegram"};

        plansArray[1] = new Plan("Мой онлайн", 400, false);
        plansArray[1].nolimitTrafficInfoImageLinks = new String[] {"whatsapp", "telegram", "viber"};


        System.out.println("OOP: 'Plans'");
        for (int i = 0; i < plansArray.length; i++) {
            String hit = plansArray[i].hit ? "ХИТ!" : "";
            System.out.println(i + ") " + plansArray[i].name + "; Цена (мес): " + plansArray[i].monthPrice + "руб.; " + hit);
            String noLimit = "";
            for (int j = 0; j <  plansArray[i].nolimitTrafficInfoImageLinks.length; j++) {
                noLimit = noLimit + " " + plansArray[i].nolimitTrafficInfoImageLinks[j] + ",";
            }
            if (noLimit.length()>0){
                System.out.println("No-limits traffic:" + noLimit.substring(0, noLimit.length()-1));
            }
        }
    }
}
