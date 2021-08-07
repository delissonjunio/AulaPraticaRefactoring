class HtmlStatement extends Statement {
    public String getResultHeader(Customer aCustomer) {
        return String.format("<H1>Rentals for <EM>%s</EM></H1><P>\n", aCustomer.getName());
    }

    public String getEachRentalContents(Rental aRental) {
        return String.format("%s: %d<BR>\n", aRental.getMovie().getTitle(), aRental.getCharge());
    }

    public String getResultFooter(Customer aCustomer) {
        return String.format("<P>You owe <EM>%d</EM><P>\nOn this rental you earned <EM>%d</EM> frequent renter points", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
    }
}