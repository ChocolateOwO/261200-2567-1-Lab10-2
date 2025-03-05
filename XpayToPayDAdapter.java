public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public String getCardExpMonthYear() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public Integer getCVVNo() {
        return Integer.valueOf(xpay.getCardCVVNo());
    }

    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        xpay.setCreditCardNo(creditCardNo);
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        String[] parts = cardExpMonthYear.split("/");
        xpay.setCardExpMonth(parts[0]);
        xpay.setCardExpYear(parts[1]);
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}