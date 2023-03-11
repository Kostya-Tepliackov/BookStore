package Models;

public class Order {
    private int id;
    private int customerID;
    private int employeeID;

    private long[] bookSellList;
    public long[] getBookSellList() {
        return bookSellList;
    }

    public void setBookSellList(long[] bookSellList) {
        this.bookSellList = bookSellList;
    }


    public Order(int id, int customerID, int employeeID, long[] bookSellList) {
        this.id = id;
        this.customerID = customerID;
        this.employeeID = employeeID;
        this.bookSellList = bookSellList;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


}
