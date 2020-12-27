package model;

public class Account {
    private String fName;
    private String lName;
    private String address;
    private double balance;
    private int accNum;
    private int omangNum;
    private Gender Gender;

    public Account() {
    }

    public Account(String fName, String lName, String address, double balance, int accNum, int omangNum, Gender gender) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.balance = balance;
        this.accNum = accNum;
        this.omangNum = omangNum;
        Gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getOmangNum() {
        return omangNum;
    }

    public void setOmangNum(int omangNum) {
        this.omangNum = omangNum;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        Gender = gender;
    }
   public void deposit(double amount){
        balance += amount;
    }
}
