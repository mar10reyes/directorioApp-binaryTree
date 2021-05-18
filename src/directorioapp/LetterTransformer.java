/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorioapp;

/**
 *
 * @author Win 10
 */
public class LetterTransformer 
{
    private final int offset = 96;
    
    public LetterTransformer()
    {
        
    }
    
    public int numberRepresentation(String c)
    {
        return c.charAt(0) - offset;
    }
    
    public int wordToNumber(String str)
    {
        String number = "";
        
        for(int i=0; i<str.length(); i++)
        {
            number = number + String.valueOf(numberRepresentation(String.valueOf(str.charAt(i))));
        }
        
        return Integer.parseInt(number);
    }
}
