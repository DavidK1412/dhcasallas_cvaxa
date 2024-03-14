import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class IllnessesDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = Integer.parseInt(scanner.nextLine());
        ArrayList<String> data = new ArrayList<>();
        HashMap<String, Integer> counters = new HashMap<>(){{
                put("a1F", 0);
                put("a1M", 0);
                put("a2F", 0);
                put("a2M", 0);
                put("saF", 0);
                put("saM", 0);
        }};


        for (int i = 0; i < inputs; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            while(Integer.parseInt(parts[1]) < 1 || Integer.parseInt(parts[1]) > 2){
                parts[1] = scanner.nextLine();
            }
            data.add(parts[0] + " " + parts[1]);
        }

        for (String item : data) {
            String[] parts = item.split(" ");
            float value = Float.parseFloat(parts[0]);
            if (parts[1].equals("1")){
                if (value < 13.2) {
                    counters.put("a1F", counters.get("a1F") + 1);
                    continue;
                }
                if (value > 13.2 && value < 16.6) {
                    counters.put("saF", counters.get("saF") + 1);
                    continue;
                }
                counters.put("a2F", counters.get("a2F") + 1);
            }

            if (parts[1].equals("2")){
                if (value < 13.2) {
                    counters.put("a1M", counters.get("a1M") + 1);
                    continue;
                }
                if (value > 13.2 && value < 16.6) {
                    counters.put("saM", counters.get("saM") + 1);
                    continue;
                }
                counters.put("a2M", counters.get("a2M") + 1);
            }
        }

        System.out.println(
            counters.get("a1F") + " " +
            counters.get("a2F") + " " +
            counters.get("saF") + " " +
            counters.get("a1M") + " " +
            counters.get("a2M") + " " +
            counters.get("saM")
        );
    }
}