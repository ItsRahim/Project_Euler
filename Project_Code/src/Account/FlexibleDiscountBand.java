package Account;

public class FlexibleDiscountBand extends Discount {

	private int id;
	private double priceFloor;
	private double discount;
	private double priceCeiling;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public double getDiscount() {
		return this.discount;
	}

	/**
	 * 
	 * @param discount
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public FlexibleDiscountBand() {
		// TODO - implement FlexibleDiscountBand.FlexibleDiscountBand
		throw new UnsupportedOperationException();
	}

	public double getPriceFloor() {
		return this.priceFloor;
	}

	/**
	 * 
	 * @param priceFloor
	 */
	public void setPriceFloor(double priceFloor) {
		this.priceFloor = priceFloor;
	}

	public double getPriceCeiling() {
		return this.priceCeiling;
	}

	/**
	 * 
	 * @param priceCeiling
	 */
	public void setPriceCeiling(double priceCeiling) {
		this.priceCeiling = priceCeiling;
	}

}