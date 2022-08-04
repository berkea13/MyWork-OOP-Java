/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete;

import Abstract.IBaseSellService;
import Entities.Campaign;
import Entities.Gamer;

/**
 *
 * @author BerkeAFŞİN
 */
public class SellManager implements IBaseSellService{

    @Override
    public void sell(Gamer gamer) {
        System.out.println("bu isimli kullanıcın : "+gamer.firstName+" Ürünü Satıldı" );
    }

    @Override
    public void sellCampain(Gamer gamer, Campaign campaign) {
        System.out.println("bu isimli kullanıcın : "+gamer.firstName+" Ürününe"+campaign.getDiscount()+" Değerinde kampanya uygulandı" );
    }
    
}
