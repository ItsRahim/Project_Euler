package Payment;

public class Payment {

	private int transactionID;
	private double amount;
	private String paymentType;
	private String datePaid;

	public void processPayment() {
		// TODO - implement Payment.processPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param jobID
	 */
	public void recordPayment(int jobID) {
		// TODO - implement Payment.recordPayment
		throw new UnsupportedOperationException();
	}

	public int getTransactionID() {
		return this.transactionID;
	}

	public void assignTransactionID() {
		// TODO - implement Payment.assignTransactionID
		throw new UnsupportedOperationException();
	}

	public double getAmount() {
		return this.amount;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	/**
	 * 
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getDatePaid() {
		return this.datePaid;
	}

	/**
	 * 
	 * @param datePaid
	 */
	public void setDatePaid(String datePaid) {
		this.datePaid = datePaid;
	}

	public Payment() {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param amount
	 */
	public Payment(double amount) {
		// TODO - implement Payment.Payment
		throw new UnsupportedOperationException();
	}

}