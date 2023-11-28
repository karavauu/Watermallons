import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vsego = scanner.nextInt();
        int[] arbuzi = new int[vsego];
        for (int i = 0; i < vsego; i++) {
            arbuzi[i] = scanner.nextInt();
        }
        int arbuzMax = arbuzi[0];
        for (int i = 0; i < arbuzi.length; i++) {
            if (arbuzi[i] > arbuzMax) {
                arbuzMax = arbuzi[i];
            }
        }
        int arbuzMin = arbuzi[0];
        for (int i = 0; i < arbuzi.length; i++) {
            if (arbuzi[i] < arbuzMin) {
                arbuzMin = arbuzi[i];
            }
        }
        System.out.println(arbuzMin + " " + arbuzMax);

    }
}