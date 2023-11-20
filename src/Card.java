public class Card {
    private String name;
    private String surname;
    private String cardNamber;
    private double balance;
    private int pin;
    public Card(){}

    public Card(String name, String surname, String cardNamber, double balance, int pin) {
        this.name = name;
        this.surname = surname;
        this.cardNamber = cardNamber;
        this.balance = balance;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardNamber() {
        return cardNamber;
    }

    public void setCardNamber(String cardNamber) {
        this.cardNamber = cardNamber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cardNamber=" + cardNamber +
                ", balance=" + balance +
                ", pin=" + pin +
                '}';
    }
}
