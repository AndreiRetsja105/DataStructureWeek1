/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactlist;

import java.util.ArrayList;

/**
 *
 * @author arets
 */
public class AddressBook {
    
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.firstName + " " + contact.sureName + " - " + contact.phone);
        }
    }

    public Contact searchContactByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.phone.equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContactByPhone(String phone) {
        Contact contactToRemove = null;
        for (Contact contact : contacts) {
            if (contact.phone.equals(phone)) {
                contactToRemove = contact;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
        }
    }
    
    
}
