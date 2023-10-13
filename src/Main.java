import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static char text;
    static int global ; // phải thêm static thì mới có thể gọi trong main
    public static void main(String[] args) {
        // hàm (phương thức) main dùng để bắt đầu ứng dụng
        System.out.printf("Hello and welcome!"); // inn theo đinh dạng

        // khai báo biến
        // không xác định được giá trị nếu không gán
        // biến a là biến địa phương - biến local
        final int a ;
        a = 100;
        final double d = 5.6;
        float f = 3.2f; // ép kiểu về float
        boolean check = true;
        short sh = 100;
        long l = 1000;
        char c = '.';

        System.out.println("giá trị biến a "+a );
        System.out.println("giá trị biến d "+d );
        System.out.println("giá trị biến f "+f );
        System.out.println("giá trị biến check "+check );
        System.out.println("giá trị biến sh "+sh );
        System.out.println("giá trị biến l "+l );
        System.out.println("giá trị biến c "+c );
        System.out.println(text +" kí tu khoảng trắng");


        // chuỗi  giữ phím Ctrl
        String fullName = "Hồ Xuân Hùng"; // khởi tạo tường minh
        System.out.println(fullName);
        System.out.println(text); // giá trị null là giá trị rỗng ,
        // giá trị mặc định của các đối tượng tạo ra từ class
        String name = new String("Hồ Xuân Hùng");
        // từ khóa new dùng để gọi đến hàm khởi tạo đối tượng
        // cú pháp khởi tạo đối tượng
//        System.out.println(name);
//        Date date = new Date(); // đã lỗi thời
//        System.out.println("Ngày giờ hiện tại  : "+date);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("ngày giờ hiện tại "+localDateTime);
//
//        // nhập xuất dữ liệu
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Hãy nhập vào tên của bạn");
//        String hoTen = sc.nextLine();
//        // nextLine() là phương thức cho phép người dùng nhập 1 chuỗi
//        System.out.println("Bạn vừa nhập "+hoTen);
        // nhập số
        System.out.println("Hãy nhập 1 số");
//        int number = Integer.parseInt(sc.nextLine());
//        int number =sc.nextInt();
        // ép kiểu từ string về kiểu dữ liệu tương ứng
//        float real = sc.nextFloat();
//        double db = sc.nextDouble();// nhập double
//        char ch = sc.nextLine().charAt(0); // lấy kí tự đầu tiên
//        boolean bool =  sc.nextBoolean();
//        System.out.println("Hãy nhập thêm 1 chuỗi");
////        sc.nextLine();
//        String str = sc1.nextLine();

        // khi nhập kiểu dữ liệu là số
        // sau đó nhập tiếp 1 chuỗi thì bị nuốt dòng
        Integer num = 10;
        System.out.print("a"); // hiển thị chuỗi nhưng khônng xuống dòng
        System.out.printf("Họ tên : %s 😊😊, Tuổi : %d , Điểm : %.2f ",fullName,a,d);// hiển thị theo định dạng
        // kí hiệu %s - đại diện cho chuỗi
        // kí hiệu %d đại diện cho số nguyên
        // kí hiêu %f đại diện cho số thực


    }
}