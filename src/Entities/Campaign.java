/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author BerkeAFŞİN
 */
public class Campaign {
   
    private int id;
    private int discount;

    public Campaign(int id, int discount) {
        this.id = id;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
