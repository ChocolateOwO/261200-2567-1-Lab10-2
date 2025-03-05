public class Main {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);
        
        PayD payD = new XpayToPayDAdapter(xpay);

        //print somwthing to show the payment
        System.out.println("Card Number: " + payD.getCreditCardNo());
        System.out.println("Card Owner: " + payD.getCardOwnerName());
        System.out.println("Exp Date: " + payD.getCardExpMonthYear());
        System.out.println("CVV: " + payD.getCVVNo());
        System.out.println("Amount: " + payD.getTotalAmount());
    }
}