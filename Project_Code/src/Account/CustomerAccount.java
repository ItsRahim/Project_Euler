package Account;

import java.util.*;
import Payment.*;

public class CustomerAccount {

	Collection<Payment> makes;
	private String customerName;
	private String contactName;
	private String email;
	private String address;
	private int phoneNumber;
	private int accountNumber;
	private boolean valuedCustomer = false;

	public String getCustomerName() {
		return this.customerName;
	}

	/**
	 * 
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactName() {
		return this.contactName;
	}

	/**
	 * 
	 * @param contactName
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * 
	 * @param accountNumber
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAgreedDiscount() {
		// TODO - implement CustomerAccount.getAgreedDiscount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param agreedDiscount
	 */
	public void setAgreedDiscount(String agreedDiscount) {
		// TODO - implement CustomerAccount.setAgreedDiscount
		throw new UnsupportedOperationException();
	}

	public boolean getValuedCustomer() {
		return this.valuedCustomer;
	}

	/**
	 * 
	 * @param valuedCustomer
	 */
	public void setValuedCustomer(boolean valuedCustomer) {
		this.valuedCustomer = valuedCustomer;
	}

	public void createJob() {
		// TODO - implement CustomerAccount.createJob
		throw new UnsupportedOperationException();
	}

	public void makePayment() {
		// TODO - implement CustomerAccount.makePayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerName
	 * @param contactName
	 * @param address
	 * @param phoneNumber
	 */
	public CustomerAccount(String customerName, String contactName, String address, int phoneNumber) {
		// TODO - implement CustomerAccount.CustomerAccount
		throw new UnsupportedOperationException();
	}

}