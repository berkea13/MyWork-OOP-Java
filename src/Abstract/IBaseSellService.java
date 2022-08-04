/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Abstract;

import Entities.Campaign;
import Entities.Gamer;

/**
 *
 * @author BerkeAFŞİN
 */
public interface IBaseSellService {
    void sell(Gamer gamer);
    void sellCampain(Gamer gamer,Campaign campaign);
}
