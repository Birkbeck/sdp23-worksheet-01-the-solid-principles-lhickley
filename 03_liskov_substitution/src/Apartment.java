abstract sealed class Apartment  permits PenthouseSuite, Studio {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);

    abstract void upgrade();
}
