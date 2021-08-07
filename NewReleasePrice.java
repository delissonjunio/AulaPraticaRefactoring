public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        if (daysRented > 1) {
            return 2;
        }

        return 1;
    }
}