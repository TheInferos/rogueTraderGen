/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roguetradergen.Features;

/**
 *
 * @author Hex
 */
public abstract class Features {
    public String name;
    public String description;
    
    public Features()
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
}
