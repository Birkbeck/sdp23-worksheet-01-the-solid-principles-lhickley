public final class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }

    public void upgrade() {
        this.squareFootage += 40;
    }
}
