/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorioapp;

/**
 *
 * @author Mario Reyes - 0221710055
 */
public class Contact {
    
    private String name;
    private String phone;
    private String postalCode;
    private String email;
    
    //---------------------------------
    
    public Contact()
    {
        
    }
    
    public Contact(String name)
    {
        this.name = name;
    }
    
    public Contact(String name, String phone, String postalCode, String email) 
    {
        this.name = name;
        this.phone = phone;
        this.postalCode = postalCode;
        this.email = email;
    }
    
    //---------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //---------------------------------
    
    public int toNumber()
    {
        LetterTransformer lt = new LetterTransformer();
        
        return lt.wordToNumber(this.name);
    }
    
}
