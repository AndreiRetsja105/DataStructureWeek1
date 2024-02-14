/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactlist;

/**
 *
 * @author arets
 */
public class Contact {
    protected String firstName , sureName, email , phone, address ;

    public Contact() {
    }

    public Contact(String firstName, String sureName, String phone, String email, String address) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact  {" + "FirstName: " + firstName + ", SureName: " + sureName + ", Email: " + email + ", Phone: " + phone + ",Address: " + address + '}';
    }

    
   
    
    
    }
