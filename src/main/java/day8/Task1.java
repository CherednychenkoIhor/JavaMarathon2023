package day8;

public class Task1 {
    public static void main(String[] args) {
//        String numbers = "";
//
//        for (int i = 0; i <= 20000; i++) {
//            numbers += i + " ";
//        }
//
//        System.out.println(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
