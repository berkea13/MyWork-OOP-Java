/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concrete;

import Abstract.IPersonCheckService;
import Entities.Gamer;

/**
 *
 * @author BerkeAFŞİN
 */
public class CheckRealGamer implements IPersonCheckService {

    @Override
    public boolean CheckRealPerson(Gamer gamer) {
       return true;
    }
    
}
