/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactlist;

/**
 *
 * @author arets
 */
public class BusinessContact  extends Contact {
     String companyName;

     public BusinessContact(String firstName, String sureName, String phone, String email, String address, String companyName) {
        super(firstName, sureName, phone, email, address);
        this.companyName = companyName;
     
     }
}
