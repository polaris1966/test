public class Main {
    public static void main(String[] args) {
            if (args[0].equals("echo")) {
                System.out.println(args[1]);
            } else if (args[0].equals("add")) {
                Integer i1 = Integer.valueOf(args[1]);
                Integer i2 = Integer.valueOf(args[2]);
                System.out.println(i1 + i2);
            }
    }
}


