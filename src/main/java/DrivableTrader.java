/* DONE: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * DomesticatableTrader.java was replicated for this subclass
 */

import java.util.List;

class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a *DrivableTrader*, giving them the
     * given inventory, wishlist, and money.
     *
     * @param inventory Objects in this Trader's inventory
     * @param wishlist  Objects in this Trader's wishlist
     * @param money     The Trader's money
     */
    public DrivableTrader(List<Drivable> inventory,
                          List<Drivable> wishlist,
                          int money) {
        super(inventory, wishlist, money);
    }

    /**
     * Construct a *DrivableTrader*, giving them the
     * given money and an empty wishlist and inventory.
     *
     * @param money     The Trader's money
     */
    public DrivableTrader(int money) {
        super(money); // copied from Trader
    }

    @Override
    public int getSellingPrice(Drivable item) {
        int selling_price = super.getSellingPrice(item); // copied from Trader

        if (selling_price == Tradable.MISSING_PRICE) {
            return selling_price;
        }

        return selling_price + item.getMaxSpeed(); // updated selling price w/s
    }
}
