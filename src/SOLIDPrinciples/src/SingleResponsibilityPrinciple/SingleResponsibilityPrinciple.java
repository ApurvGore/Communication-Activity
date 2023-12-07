package SingleResponsibilityPrinciple;

// Bad Example
class BillManagement { // Multiple responsibilities given to a single class
    private void calculateTotal() { // Generally used for internally calculating the total bill amount
        // Generate the total bill
    }

    public void printInvoice() { // Generally used by the cashier
        // Print the invoice to be given to the customer
        // public void calculateTotal();
    }

    public void storeToDatabase() { // Generally used by the Database Engineer
        // Store the invoice details into the database
        // public void calculateTotal();
    }
}

/*
Let us assume that the database engineer wants to add some functionality
e.g. add the payment method column to indicate whether a particular payment was
made using UPI, cash, card or Internet Banking, this info may not be relevant for
the other stakeholders (e.g. the cashier)
OR
add a functionality to verify if the bill is paid by the customer before leaving the premises,
this is not relevant for the database engineer as only paid bills will
be forwarded to the database and stored for future reference
 */

// Good Example
class BillCalculator { // Individual responsibilities given to separate classes
    public void calculateTotal() { // Generally used for internally calculating the total bill amount
        // Generate the total bill
    }
}

class BillPrinter { // Individual responsibilities given to separate classes
    public void printInvoice() { // Generally used by the cashier
        // Print the invoice to be given to the customer
    }
    public boolean isBillPaid() {
        boolean paymentStatus = false;
        // Verify the payment has been completed
        // Return true if that is the case
        // Return false otherwise
        return paymentStatus;
    }
}

class InvoiceToDatabase { // Individual responsibilities given to separate classes
    public void storeToDatabase() { // Generally used by the Database Engineer
        // Store the invoice details into the database
    }
    public String paymentMethod() {
        String paymentMethod = "";
        // Check whether payment was made using UPI, cash, card or Internet Banking
        return paymentMethod;
    }
}

/*
So basically, only one stakeholder or one group of stakeholders should change the method
to avoid making changes that break the existing implementation of the software
 */

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {

    }
}
