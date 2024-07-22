public class CorporateCustomer extends Customer {
    private String taxNumber;

    public CorporateCustomer(String name, String phoneNumber, String taxNumber) {
        super(name, phoneNumber);
        this.taxNumber = taxNumber;
    }

    @Override
    public boolean canRent(Car car) {
        return true;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
