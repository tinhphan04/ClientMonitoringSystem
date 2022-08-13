/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientmonitoringsystem;

import java.io.Serializable;

/**
 *
 * @author tinh.pv
 */
public class Message implements Serializable  {
    private String Time;
    private String Action;
    private String Description;
    
    public Message()
    {
        
    }
    public Message(String timeString, String ActString, String DescriptString)
    {
        this.Time = timeString;
        this.Action = ActString;
        this.Description = DescriptString;
    }
    
    public String getTime()
    {   
        return Time;
    }
    
    public void setTime(String timeString)
    {
        this.Time = timeString;
    }
    
    public String getAction()
    {   
        return Action;
    }
    
    public void setAction(String ActString)
    {
        this.Action = ActString;
    }
    
    public String getDescription()
    {   
        return Description;
    }
    
    public void setDescription(String DescriptString)
    {
        this.Description = DescriptString;
    }
}
