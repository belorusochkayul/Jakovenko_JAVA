package parsers;

import java.util.Date;
import java.util.List;

public class Root {
    private String bankName;
    private String bankLocation;
    private Date date;
    private int baseCurrencyId;
    private List<Currency> currencies;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setBaseCurrencyId(int baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "Root{" +
                "bankName='" + bankName + '\'' +
                ", bankLocation='" + bankLocation + '\'' +
                ", date=" + date +
                ", baseCurrencyId=" + baseCurrencyId +
                ", currency=" + currencies +
                '}';
    }
}