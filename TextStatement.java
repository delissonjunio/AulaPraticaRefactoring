import java.util.Enumeration;

class TextStatement extends Statement {
    private String resultPrefixTemplate = "Rental Record for %s\n";
    private String eachRentalTemplate = "\t%s\t%d\n";
    private String resultSuffixTemplate = "Amount owed is %d\nYou earned %d frequent renter points";

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = String.format(resultPrefixTemplate, aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += String.format(eachRentalTemplate, each.getMovie().getTitle(), each.getCharge());
        }
        //add footer lines
        result += String.format(resultSuffixTemplate, aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
        return result;
    }
}
