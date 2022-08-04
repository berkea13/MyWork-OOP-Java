/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author BerkeAFŞİN
 */
public class Gamer {
   public int id;
   public String firstName;
   public String lastName;
   public String kullaniciAdi;
   public String password;

    public Gamer(int id, String firstName, String lastName, String kullaniciAdi, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.kullaniciAdi = kullaniciAdi;
        this.password = password;
    }
    public Gamer(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
