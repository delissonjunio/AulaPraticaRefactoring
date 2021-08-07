import java.util.Enumeration;

class HtmlStatement extends Statement {
    private String resultPrefixTemplate = "<H1>Rentals for <EM>%s</EM></H1><P>\n";
    private String eachRentalTemplate = "%s: %d<BR>\n";
    private String resultSuffixTemplate = "<P>You owe <EM>%d</EM><P>\nOn this rental you earned <EM>%d</EM> frequent renter points";

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