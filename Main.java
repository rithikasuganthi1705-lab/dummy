/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

public class Main 
{
    public static void main(String[] args)
    {

        Light light = new Light();

        Command on = new LightOnCommand(light);
        

        Remote remote = new Remote();

        remote.setCommand(on);
        remote.pressButton();

        
    }
}
