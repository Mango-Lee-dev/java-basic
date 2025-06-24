package ref.ex;

import ref.ex.ProductOrder;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요.");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 : ");
            String productName = sc.nextLine();

            System.out.println("가격 : ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, quantity, price );
        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println(totalAmount);
    }

    static ProductOrder createOrder(String productName, int quantity, int price) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.quantity = quantity;
        order.price = price;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.quantity + " " + order.price);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
