import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine());
        int failTimes = 0;
        int totalJumpTimes = 0;
        boolean stop = false;

        for (int actualHeight = desiredHeight - 30; actualHeight <= desiredHeight;actualHeight+=5 ) {

            for (int i = 1; i <= 3; i++) {

                int jumpHeight = Integer.parseInt(scanner.nextLine());
                if (jumpHeight > actualHeight) {

                    totalJumpTimes++;
                    failTimes = 0;
                    break;
                } else {
                    failTimes++;
                    totalJumpTimes++;
                }
            }

            if (failTimes == 3) {
                System.out.printf("Tihomir failed at %scm after %s jumps.", actualHeight, totalJumpTimes);
                return;

            }
        }

        if (stop == false) {
            System.out.printf("Tihomir succeeded, he jumped over %scm after %s jumps.", desiredHeight, totalJumpTimes);
        }
    }

}