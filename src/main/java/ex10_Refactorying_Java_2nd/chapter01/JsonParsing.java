package ex10_Refactorying_Java_2nd.chapter01;//package ex10_Refactorying_Java_2nd.chapter01;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class JsonParsingExample {
//    public static void main(String[] args) {
//        String jsonString = "[\n" +
//                "  {\n" +
//                "    \"customer\": \"BigCo\",\n" +
//                "    \"performances\": [\n" +
//                "      {\n" +
//                "        \"playID\": \"hamlet\",\n" +
//                "        \"audience\": 55\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"playID\": \"as-like\",\n" +
//                "        \"audience\": 35\n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"playID\": \"othello\",\n" +
//                "        \"audience\": 40\n" +
//                "      }\n" +
//                "    ]\n" +
//                "  }\n" +
//                "]";
//
//        List<PerformanceData> performanceDataList = parseJson(jsonString);
//
//        for (PerformanceData performanceData : performanceDataList) {
//            System.out.println("Customer: " + performanceData.getCustomer());
//
//            for (Performance performance : performanceData.getPerformances()) {
//                System.out.println("PlayID: " + performance.getPlayID());
//                System.out.println("Audience: " + performance.getAudience());
//            }
//        }
//    }
//
//    private static List<PerformanceData> parseJson(String jsonString) {
//        List<PerformanceData> performanceDataList = new ArrayList<>();
//
//        JSONArray jsonArray = new JSONArray(jsonString);
//
//        for (int i = 0; i < jsonArray.length(); i++) {
//            JSONObject jsonPerformanceData = jsonArray.getJSONObject(i);
//            String customer = jsonPerformanceData.getString("customer");
//            JSONArray jsonPerformances = jsonPerformanceData.getJSONArray("performances");
//
//            List<Performance> performances = new ArrayList<>();
//
//            for (int j = 0; j < jsonPerformances.length(); j++) {
//                JSONObject jsonPerformance = jsonPerformances.getJSONObject(j);
//                String playID = jsonPerformance.getString("playID");
//                int audience = jsonPerformance.getInt("audience");
//                performances.add(new Performance(playID, audience));
//            }
//
//            performanceDataList.add(new PerformanceData(customer, performances));
//        }
//
//        return performanceDataList;
//    }
//}
//
//class PerformanceData {
//    private String customer;
//    private List<Performance> performances;
//
//    public PerformanceData(String customer, List<Performance> performances) {
//        this.customer = customer;
//        this.performances = performances;
//    }
//
//    public String getCustomer() {
//        return customer;
//    }
//
//    public List<Performance> getPerformances() {
//        return performances;
//    }
//}
//
//class Performance {
//    private String playID;
//    private int audience;
//
//    public Performance(String playID, int audience) {
//        this.playID = playID;
//        this.audience = audience;
//    }
//
//    public String getPlayID() {
//        return playID;
//    }
//
//    public int getAudience() {
//        return audience;
//    }
//}
