/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kodlamaio4;

import Abstract.IBaseSellService;
import Concrete.CheckRealGamer;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Gamer;

/**
 *
 * @author BerkeAFŞİN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
       
        Gamer gamer = new Gamer(1, "Berke", "Afşin", "berke12", "123456");
        CheckRealGamer checkRealGamer = new CheckRealGamer();
        GamerManager gamerManager = new GamerManager(checkRealGamer);
        
        gamerManager.add(gamer);
       
        
        IBaseSellService baseSellService = new SellManager();
        Campaign campaign = new Campaign(1, 10);
        baseSellService.sellCampain(gamer, campaign);
        
    }
    
}
