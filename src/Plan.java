public class Plan {
    String id;

    String name;
    int monthPrice;
    boolean hit;

    int limitTime;
    String nolimitTimeInfoText;
    int limitTraffic;
    String nolimitTrafficInfoImageUrl;

    String buySIMUrl;
    String configPlanUrl;
    public Plan(String nameInit, int monthPriceInit, boolean hitInit){
        name = nameInit;
        monthPrice = monthPriceInit;
        hit = hitInit;
    }
}
