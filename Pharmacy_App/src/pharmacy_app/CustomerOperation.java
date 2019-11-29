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
public interface CustomerOperation {
    
    public void purchaseMedicine(Pharmacy a, User e);
    public void viewPurchasedMedicines(Pharmacy a, User e);
}
