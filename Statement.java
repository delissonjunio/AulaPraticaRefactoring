import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getResultHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += getEachRentalContents(each);
        }
        //add footer lines
        result += getResultFooter(aCustomer);
        return result;
    }

    public abstract String getResultHeader(Customer aCustomer);
    public abstract String getEachRentalContents(Rental aRental);
    public abstract String getResultFooter(Customer aCustomer);
}
