/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import selfbar.Coffee;
import selfbar.PricingStrategy;

/**
 *
 * @author lores
 */
public class Dec implements Coffee{
    
    private String name;
    private PricingStrategy pricingStrategy;

    public Dec(PricingStrategy pricingStrategy){
        this.name = "decaffeinato";
        this.pricingStrategy = pricingStrategy;
    }

    private String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return pricingStrategy.getBasePrice();
    }

    @Override
    public String getDescription() {
        return "Caffe "+name;
    }

    @Override
    public double getAddictionPrice() {
        return pricingStrategy.getAddictionPrice();
    }

    @Override
    public boolean equals(Object object) {
        boolean res = false;
        if (object instanceof Coffee) {
            Coffee coffee= (Coffee) object;
            if ((coffee.getDescription().equals(this.getName().toLowerCase())) && (coffee.getPrice() == this.getPrice())) {
                res = true;
            }
        }
        return res;
    }
}
