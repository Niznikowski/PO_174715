public record Car(String brand, String model, int fuelConsumptionPer100km) {
    public double fuelCost(double fulePrice, double distance){
        return distance/100 * fuelConsumptionPer100km * fulePrice;
    }
}
