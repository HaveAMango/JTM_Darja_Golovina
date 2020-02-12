package jtm.activity09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

/*- TODO #2
 * Implement Iterator interface with Orders class
 * Hint! Use generic type argument of iterateable items in form: Iterator<Order>
 * 
 * TODO #3 Override/implement public methods for Orders class:
 * - Orders()                — create new empty Orders
 * - add(Order item)            — add passed order to the Orders
 * - List<Order> getItemsList() — List of all customer orders
 * - Set<Order> getItemsSet()   — calculated Set of Orders from list (look at description below)
 * - sort()                     — sort list of orders according to the sorting rules
 * - boolean hasNext()          — check is there next Order in Orders
 * - Order next()               — get next Order from Orders, throw NoSuchElementException if can't
 * - remove()                   — remove current Order (order got by previous next()) from list, throw IllegalStateException if can't
 * - String toString()          — show list of Orders as a String
 * 
 * Hints:
 * 1. To convert Orders to String, reuse .toString() method of List.toString()
 * 2. Use built in List.sort() method to sort list of orders
 * 
 * TODO #4
 * When implementing getItemsSet() method, join all requests for the same item from different customers
 * in following way: if there are two requests:
 *  - ItemN: Customer1: 3
 *  - ItemN: Customer2: 1
 *  Set of orders should be:
 *  - ItemN: Customer1,Customer2: 4
 */

public class Orders implements Iterator<Order> {
	List<Order> orderList;
	private int position = -1;
	private Iterator<Order> iterator;

	public Orders() {
		orderList = new ArrayList<Order>();
		iterator = orderList.iterator();
	}

	public List<Order> getItemsList() {
		return orderList;
	}

	public Set<Order> getItemsSet() {
//		Set<Order> set = new HashSet<Order>();
//		Set<Order> set = ImmutableSet.copyOf(orderList);
		// return (Set<Order>) orderList.set(0, null);
		return null;	}

	public void add(Order item) {
		orderList.add(item);
		iterator = orderList.iterator();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
//		if (orderList.size() <= position + 1) {
//			return false;
//		} else {
//			return true;
//		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		iterator.remove();
//		if (position < 0) {
//			throw new NoSuchElementException();
//		}
//		if (position < orderList.size()) {
//			orderList.remove(position);
//		} else {
//			throw new NoSuchElementException();
//		}
	}

	@Override
	public Order next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		
		return iterator.next();
		//return orderList.get(position);
	}

	public String toString() {
		return orderList.toString();
	}

	public void sort() {
		Collections.sort(orderList);
	}

	/*-
	 * TODO #1
	 * Create data structure to hold:
	 *   1. some kind of collection of Orders (e.g. some List)
	 *   2. index to the current order for iterations through the Orders in Orders
	 *   Hints:
	 *   1. you can use your own implementation or rely on .iterator() of the List
	 *   2. when constructing list of orders, set number of current order to -1
	 *      (which is usual approach when working with iterateable collections).
	 */

	public static void main(String[] args) {
		Orders orders = new Orders();
		System.out.println(orders.hasNext());

		orders.add(new Order("orderer", "item", 1));

		System.out.println(orders.hasNext());

		orders.next();
		System.out.println(orders.toString());
		orders.remove();

		System.out.println(orders.toString());
	}
}
