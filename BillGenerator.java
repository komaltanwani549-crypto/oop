class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
      System.out.println("\nTanwani Komal, 250393107015");
    }

    void generateBill(int itemTotal, int discount) {
        System.out.println("Final Bill Amount: " + (itemTotal - discount));
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        BillGenerator bill = new BillGenerator();

        bill.generateBill(2000);
        bill.generateBill(2000, 300);
        bill.generateBill(2000, 10.0);
    }
}





