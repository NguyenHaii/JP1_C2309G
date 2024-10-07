package service;

import entity.Customer;
import entity.Invoice;
import entity.Gender;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DiscountOperations {

    public void applyDiscountForFemaleCustomers(List<Invoice> invoices) {
        for (Invoice invoice : invoices) {
            Customer customer = invoice.getCustomer();
            if (customer.getGender() == Gender.F && isAugust(invoice.getDatetime())) {
                double discountAmount = invoice.getAmount() * 0.10;
                System.out.println("10% discount applied: " + discountAmount);
            }
        }
    }

    private boolean isAugust(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH) == Calendar.AUGUST;
    }
}
