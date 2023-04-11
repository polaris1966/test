public class Main {
    public static void main(String [] args) {
        int i1 = 0;
        int i2 = 0;
//        Проверяем аргумент является командой echo?
        for (String str : args) {
                if(args[0].equals("echo")) {
//   если да, считываем следующий аргумент и вываливаемся из цикла!
                    System.out.println(args[1]);
                    break;
//   Если команда add, то считываем два следующих аргумента
                } else if (args[0].equals("add")) {

                    String str2=args[1];
                    String str3=args[2];
//     преобразуем строки в числа int
                    try {
            i1 = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            }
                    try {
                        i2 = Integer.parseInt(str3);
                } catch (NumberFormatException e) {
                System.err.println("Неправильный формат строки!");
                }
            System.out.println(i1+i2);
                    break;
                }


        }
        }
    }


