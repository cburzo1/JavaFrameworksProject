package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part{
    int partId;

    public InhousePart() {
    }

    //CHANGE: Added a reference to parent class to instantiate the sample parts
    //This was nessesary because the Part class is a default class and cannot be instantiated
    //from the outside
    public InhousePart(String name, double price, int inv, int maxInv, int minInv){
        super.name = name;
        super.price = price;
        super.inv = inv;
        super.maxInv = maxInv;
        super.minInv = minInv;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }
}
