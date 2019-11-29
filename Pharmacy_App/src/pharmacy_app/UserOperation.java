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
public interface UserOperation {
    public User Login(Pharmacy e, User a);
    public User Logout(User a);
    public void Register(Pharmacy a, User e);
    
//    public void viewAvailableMedicines();
    
    
    
    
}