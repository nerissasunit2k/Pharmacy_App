/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_app;

/**
 *
 * @author sunitne_sd2082
 */
import java.util.ArrayList;
import java.util.List;

public class Pharmacy {

    private String name;
    List<MedicinesForCough> medForCough = new ArrayList<MedicinesForCough>();
    List<MedicinesForHeadache> medForHeadache = new ArrayList<MedicinesForHeadache>();
    List<MedicinesForBodyPain> medForBodyPain = new ArrayList<MedicinesForBodyPain>();
    List<MedicinesForAllergies> medForAllergies = new ArrayList<MedicinesForAllergies>();
    Pharmacist pharma = new Pharmacist("Lealyn","Eulin");
    ArrayList<Orders> orderList = new ArrayList<Orders>();
    ArrayList<User> userList = new ArrayList<User>();

    public Pharmacy() {
    }

    public Pharmacy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pharmacist getPharma() {
        return pharma;
    }

    public List<MedicinesForCough> getMedForCough() {
        return medForCough;
    }

    public List<MedicinesForHeadache> getMedForHeadache() {
        return medForHeadache;
    }

    public List<MedicinesForBodyPain> getMedForBodyPain() {
        return medForBodyPain;
    }

    public List<MedicinesForAllergies> getMedForAllergies() {
        return medForAllergies;
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    
    
}
