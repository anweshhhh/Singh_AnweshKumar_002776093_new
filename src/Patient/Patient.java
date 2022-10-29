/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;
import Person.Person;

/**
 *
 * @author anweshsingh
 */
public class Patient {
    Person Person;
    
    public Patient(Person p) {
        Person = p;
    }
    
    public boolean isMatch(String id) {
        return Person.getPersonId().equals(id);
    }
    
    
}
