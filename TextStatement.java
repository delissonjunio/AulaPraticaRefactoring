class TextStatement extends Statement {
    public String getResultHeader(Customer aCustomer) {
        return String.format("Rental Record for %s\n", aCustomer.getName());
    }

    public String getEachRentalContents(Rental aRental) {
        return String.format("\t%s\t%d\n", aRental.getMovie().getTitle(), aRental.getCharge());
    }

    public String getResultFooter(Customer aCustomer) {
        return String.format("Amount owed is %d\nYou earned %d frequent renter points", aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
    }
}
