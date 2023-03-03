import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 25000;
        System.out.println("chọn 1 để chuyển từ USD -> VND hoặc 2 từ VND->USD");
        System.out.print("mời nhập 1 hoặc 2: ");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("chuyển đổi từ USD sang VND");
                System.out.print("nhập số tiền cần chuyển: ");
                int usd = scanner.nextInt();
                int kq = usd * rate;
                System.out.println("số tiền: " + kq + " VND");
                break;
            case 2:
                System.out.println("chuyển đổi từ VND sang USD");
                System.out.print("nhập số tiền cần chuyển: ");
                float vnd = scanner.nextFloat();
                float kq1 = vnd / rate;
                System.out.println("số tiền: " + kq1 + " USD");
                break;
            default:
                System.out.println("bạn chỉ được nhập 1 hoặc 2!");
        }
    }
}