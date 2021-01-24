package parsing;

import java.util.List;

public class Root {
    private String bankName;
    private String bankLocation;
    private String date;
    private int baseCurrencyId;
    private List<Currency> currency;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBaseCurrencyId() {
        return baseCurrencyId;
    }

    public void setBaseCurrencyId(int baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public List<Currency> getCurrencies() {
        return currency;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currency = currencies;
    }

    @Override
    public String toString() {
        return "Root{" +
                "bankName='" + bankName + '\'' +
                ", bankLocation='" + bankLocation + '\'' +
                ", date=" + date +
                ", baseCurrencyId=" + baseCurrencyId +
                ", currency=" + currency +
                '}';
    }
}