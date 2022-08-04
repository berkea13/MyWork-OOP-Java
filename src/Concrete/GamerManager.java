/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete;

import Abstract.IGamerService;
import Abstract.IPersonCheckService;
import Entities.Gamer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GamerManager implements IGamerService{

    private IPersonCheckService checkRealGamer;
    public GamerManager(IPersonCheckService checkRealGamer) throws Exception {
        
       this.checkRealGamer = checkRealGamer;
       
       
        
    }

   
    @Override
    public void add(Gamer gamer) {
        
         if(checkRealGamer.CheckRealPerson(gamer)){
        
            System.out.println("Bilgileriniz Doğru : "+ gamer.firstName);
        
        }else{
        
             try {
                 throw new Exception("Geçersiz kullanıcı");
             } catch (Exception ex) {
                 Logger.getLogger(GamerManager.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        System.out.println("Veritabanına Eklendi "+gamer.firstName );
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi "+gamer.firstName );
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi "+gamer.firstName );
    }
    
}
