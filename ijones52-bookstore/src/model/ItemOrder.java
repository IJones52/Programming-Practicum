package model;

/**
 *  The item order class contains methods to handle ordering multiple objects
 *  
 *   @author Ismael Jones
 *   @version 1/15/20
 * 
 * */

public final class ItemOrder {
    /**
     * 
     * private fields to store the item of the ordrr and its quantity
     * */
    private Item item;
    private int quantity;
    
    /**
     *  Creates a basic item order
     *  
     *  @param theItem, an Item the order should consist of
     *  @param theQuantity, the number of items of that kind  
     * */
    public ItemOrder(final Item theItem, final int theQuantity) {
        item = theItem;
        if(quantity >= 0) {
        quantity = theQuantity;
        }
        else {
            quantity = 0;
        }
        
    }

    /**
     *  A method that accesses the type of item for the order
     *  
     *  @return an item object
     * */
    public Item getItem() {
        return item;
    }
    
    /**
     *  A method that accesses the number of items in the order
     *  
     *  @return an int representing the number of items in the order
     * */

    public int getQuantity() {
        return quantity;
    }
    
    /**
     * A method that returns the information about an order of an item
     * 
     * @return a String containing order information
     * */
    @Override
    public String toString() {

        return item.toString() + " Quantity: " + quantity;
    }

}
