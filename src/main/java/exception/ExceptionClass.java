/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author hamednajafi
 */
public class ExceptionClass extends RuntimeException{
    public ExceptionClass(String message) { 
        super(message); 
    } 
 
    public ExceptionClass(String message, Throwable cause) { 
        super(message, cause); 
    } 
 
    public ExceptionClass(Throwable cause) { 
        super(cause); 
    } 
    
}
