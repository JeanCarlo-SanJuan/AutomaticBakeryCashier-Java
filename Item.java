import javax.swing.JOptionPane;

public class Item {
    private String name;
    private float price;
    private int quantity;
    
    Item(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean setQuantity(int q) {
        if (q < 0)
            return false;

        this.quantity = q;
        return true;
    }

    public String getName() {
        return name;
    }

    public float getQuantity() {
        return quantity;
    }

    public float getTotal() {
        return price * quantity;
    }

    public void promptQuantity() {
        while(true) {
            try {
                String input = JOptionPane.showInputDialog("Enter prompt");

                //Abort transaction when x or close is clicked.
                if (input == null) {
                    return;
                }

                int q = Integer.parseInt(input);

                if (setQuantity(q)) {
                    //transaction is successful
                    break;
                }
            } catch (Exception e) {

            }
            
            continue;
        }
    }
}
