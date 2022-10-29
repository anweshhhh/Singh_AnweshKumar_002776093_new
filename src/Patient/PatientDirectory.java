/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.ArrayList;
import SystemAdmin.SystemAdmin;
import Person.Person;

/**
 *
 * @author anweshsingh
 */
public class PatientDirectory {
    SystemAdmin SystemAdmin;
    ArrayList<Patient> patientlist;

    public PatientDirectory(SystemAdmin s) {

        SystemAdmin = s;
        patientlist = new ArrayList();

    }

    public Patient newPatient(Person p) {

        Patient pt = new Patient(pt);
        patientlist.add(pt);
        return pt;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
}
