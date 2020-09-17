package training.supportbank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

public class Transaction {
    public LocalDate Date;
    public String From;
    public String To;
    public String Narrative;
    public BigDecimal Amount;

    public LocalDate getDate() {
        return Date;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getNarrative() {
        return Narrative;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public Transaction(LocalDate date, String from, String to, String narrative, BigDecimal amount) {
        Date = date;
        From = from;
        To = to;
        Narrative = narrative;
        Amount = amount;
    }
}




