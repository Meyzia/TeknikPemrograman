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
public class Hardware {
    private String Processor;
    private String RAM;
    private String GPU;
    private String Storage;
    IODevice devices;
    private int io;
    
    void setProcessor(String _Processor){
        this.Processor = _Processor;
    }
    String getProcessor(){
        return this.Processor;
    }
    void setRAM(String _RAM){
        this.RAM = _RAM;
    }
    String getRam(){
        return this.RAM;
    }
    void setGPU(String _GPU){
        this.GPU = _GPU;
    }
    String getGPU(){
        return this.GPU;
    }
    void setStorage(String _Strorage){
        this.Storage = _Strorage;
    }
    String getStorage(){
        return this.Storage;
    }
    
    void setIODevice(String monitor, String TouchInput){
        this.devices = new IODevice(monitor, TouchInput);
        this.io = 1;
    }
    void setIODevice(String monitor, String Keyboard, String Mouse){
        this.devices = new IODevice(monitor, Keyboard, Mouse);
        this.io = 2;
    }
    IODevice getDevices(){
        return this.devices;
    }
    
    void printHardware(){
        System.out.println("Processor : "+this.Processor);
        System.out.println("RAM : "+this.RAM);
        System.out.println("GPU : "+this.GPU);
        System.out.println("Storage : "+this.Storage);
        System.out.println("I/O Devices :");
        if(this.io == 1){
            System.out.println("Monitor : "+this.devices.monitor);
            System.out.println("TouchInput : "+this.devices.TouchInput);
        }else{
            System.out.println("Monitor : "+this.devices.monitor);
            System.out.println("Keyboard : "+this.devices.Keyboard);
            System.out.println("Mouse : "+this.devices.Mouse);
        }
    }
}
