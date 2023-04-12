public class Main {
    public static void main(String[] args) {
        if (args[0].equals("echo")) {
            echo(args[1]);
        } else if (args[0].equals("add")) {
            add(args[1], args[2]);
        }
    }

    public static void echo(String stg) {
        System.out.println(stg);
    }

    public static void add(String stg1, String stg2) {
        System.out.println(Integer.parseInt(stg1) + Integer.parseInt(stg2));
    }
}


