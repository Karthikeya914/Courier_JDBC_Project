
package model;

public class Sender {
    private int senderId;
    private String name;
    private String contactNumber;
    private String address;

    public Sender(String name, String contactNumber, String address) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }
}
