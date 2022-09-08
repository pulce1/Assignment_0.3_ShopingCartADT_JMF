package shoppingcart;

public interface ShoppingCart {

	/** adds an entry to the ShoppingCart
	 @return  The item put into the ShoppingCart. */
public T addItem();

/** Takes an item out of the ShoppingCart
	 @return  If the item has been removed. */
public T removeItem();

/** shows contents of the ShoppingCart.
   @return The total items in the ShoppingCart. */
public T showContents();

/** tallies up the total price of each Item in the cart
  @return  the total double, adding up all the prices for the cart.*/
public double totalPrice();


} // end ShoppingCart

