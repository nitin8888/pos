/**
 * 
 */
package com.rbc.pos.item;

/**
 * The class to store Item details i.e. Fruit.
 * 
 * @author Nitin Shreyakar
 */
public class Item {
	
	/**
	 * The Item name.
	 */
	private final String name;

	/**
	 * Create an instance of this class and initialize parameters.
	 * @param name the Item name.
	 */
	public Item(String name) {
		this.name = name;
	}

	/* -- Getters -- */
	/**
	 * Gets the name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* -- Overridden Object class methods -- */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
