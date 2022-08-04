/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
public class CampaignManager implements ICampaignService{

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi "+campaign.getId());
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
       System.out.println("Kampanya Silindi "+campaign.getId());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya Güncellendi "+campaign.getId());
       
    }
    
    
}
