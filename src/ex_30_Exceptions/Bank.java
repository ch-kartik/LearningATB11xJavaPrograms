package ex_30_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount){
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankName) {
        if(bankName.currency.equals("INR")){
            return bankName.amount + this.amount;
        }else{
            try{
                throw new CurrencyMismatchCustomException("Currency Mismatch!");
            }catch(CurrencyMismatchCustomException e){
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}

class CurrencyMismatchCustomException extends Exception{
    CurrencyMismatchCustomException(String e){
        super(e);
    }
}

class NotValidAgeException extends Exception{
    NotValidAgeException(String e){
        super(e);
    }
}