/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author lenovo
 */
public class IODevice {
    public String monitor;
    public String Keyboard;
    public String Mouse;
    public String TouchInput;

    IODevice(String monitor, String TouchInput) {
        this.monitor = monitor;
        this.TouchInput = TouchInput;
    }
    
    IODevice(String monitor, String Keyboard, String Mouse){
        this.monitor = monitor;
        this.Keyboard = Keyboard;
        this.Mouse = Mouse;
    }
}
