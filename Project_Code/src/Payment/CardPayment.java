package Payment;

public class CardPayment extends Payment {

	private int cardNumber;
	private int expiryDate;
	private String name;
	private int cvv;

	public void makePayment() {
		// TODO - implement CardPayment.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cardNumber
	 * @param expiryDate
	 * @param name
	 * @param cvv
	 */
	public CardPayment(int cardNumber, int expiryDate, String name, int cvv) {
		// TODO - implement CardPayment.CardPayment
		throw new UnsupportedOperationException();
	}

	public int getCardNumber() {
		return this.cardNumber;
	}

	/**
	 * 
	 * @param cardNumber
	 */
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getExpiryDate() {
		return this.expiryDate;
	}

	/**
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getCvv() {
		return this.cvv;
	}

	/**
	 * 
	 * @param cvv
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * 
	 * @param cvv
	 * @param expireDate
	 * @param cardNumber
	 * @param name
	 */
	public CardPayment(int cvv, int expireDate, int cardNumber, String name) {
		// TODO - implement CardPayment.CardPayment
		throw new UnsupportedOperationException();
	}

}