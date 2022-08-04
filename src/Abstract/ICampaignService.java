/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Abstract;

import Entities.Campaign;

/**
 *
 * @author BerkeAFŞİN
 */
public interface ICampaignService {
    void addCampaign(Campaign campaign);
     void deleteCampaign(Campaign campaign);
    void update(Campaign campaign);
}
