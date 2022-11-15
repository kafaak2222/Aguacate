/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aguacate.modelo;

/**
 *
 * @author JoseP
 */
public class Usuario {
    public String id;
    public String password;
    public int balance;
    public int deudas;
    private Wallet cartera;

    public Usuario() {
       cartera = new Wallet();
    }
    
    

    public Wallet getCartera() {
        return cartera;
    }

    public void setCartera(Wallet cartera) {
        this.cartera = cartera;
    }
    
    
    
    
}
