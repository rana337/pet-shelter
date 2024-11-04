package model;

import java.time.LocalDateTime;
public class MoneyDonation extends Donation {
    private int Value;
    private long CardNumber;
    private String CardName;
    private int CVV;
    private String exp;

    private String Type;

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public long getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(long cardNumber) {
        CardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    @Override
    public void setType() {
        this.Type="Money";
    }


    public String getType() {
        return Type;
    }
}
