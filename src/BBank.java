public class BBank implements IBank {
    private String bankName;
    private String terminalID;
    private String password;

    public BBank(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }






    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanici ip : " + ipAddress);
        System.out.println("Machine ip : " + this.hostIpAddress);
        System.out.println(this.bankName + " connected ! ");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Waiting response from the bank ! ");
        System.out.println("Succesfull Connection ! ");
        return true;
    }
}
