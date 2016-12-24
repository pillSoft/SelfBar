/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfbar.cocktaildecorations;

import selfbar.CocktailDecorator;
import selfbar.Cocktail;
import selfbar.Coffee;

/**
 *
 * @author lores
 */
public class Appetizer extends CocktailDecorator{

    public Appetizer(Cocktail cocktail) {
        super(cocktail,"appetizer");
    }
    
    @Override
    public String getDescription() {
        return cocktail.getDescription() + " + "+ decoration;
    }
    
}