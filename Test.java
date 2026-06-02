public class Test {
    public static void main(String[] args) {
        String name = args[0];
        int score = Integer.parseInt(args[1]);

        System.out.println("[DEBUG] name = " + name);
        System.out.println("[DEBUG] score = " + score);

        if (score >= 60) {
            System.out.println("[RESULT] PASS");
        } else {
            System.out.println("[RESULT] FAIL");
        }
    }
}