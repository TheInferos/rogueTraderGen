/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Skills;

/**
 *
 * @author Hex
 */
public class Skills {
        
    public String name;
    public String description;
    public boolean simple;
    public String stat;
    public String use;
    
    public Skills()
    {
    
    }
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public boolean isItSimple()
    {
        return simple;
    }
    public String getStat()
    {
        return stat;
    }
    
    public String use()
    {
        return use;
    }
}
