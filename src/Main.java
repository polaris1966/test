public class Main {
    public static void main(String[] args) {
        if (args[0].equals("echo")) {
            echo(args);
        } else if (args[0].equals("add")) {
            add(args);
        }
    }

    public static void echo(String[] stg) {
        System.out.println(stg[1]);
    }

    public static void add(String[] stg) {
        System.out.println(Integer.parseInt(stg[1]) + Integer.parseInt(stg[2]));
    }
}


