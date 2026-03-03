public class Donut extends Bakery {

    private int boxSize;
    private String icingFlavor;

    public Donut(String flavor, double unitPrice,
                      int boxSize, String icingFlavor) {
        super(flavor, unitPrice);
        this.boxSize = boxSize;
        this.icingFlavor = icingFlavor;
    }

    public String getBoxSizeName() {
        if (boxSize == 6) {
            return "Large Box";
        }
        return "Small Box";
    }

    @Override
    public int getPackingCost() {
        if (boxSize == 6) {
            return 10;
        }
        return 5;
    }

    @Override
    public double calculateTotalPrice() {
        return (boxSize * getUnitPrice()) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nIcing Donut (" + icingFlavor + ")"
                + "\nBox size : " + getBoxSizeName()
                + "\nTotal price of Icing Donut = "
                + calculateTotalPrice();
    }
}


