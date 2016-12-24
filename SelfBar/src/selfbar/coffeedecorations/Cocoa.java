/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.coffeedecorations;

import selfbar.CoffeeDecorator;
import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Cocoa extends CoffeeDecorator{

    public Cocoa(Coffee coffee) {
        super(coffee,"Cacao");
    }
    
    @Override
    public String getDescription() {
        return coffee.getDescription() + " + "+ decoration;
    }
    
}
