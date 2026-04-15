// Author: Grayson Molnar
package bagelHouse;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class CoffeeBox extends VBox {
    // Initialize coffee prices
    public final double NONE = 0.00;
    public final double REGULAR = 1.25;
    public final double DECAF = 1.25;
    public final double CAPPUCCINO = 2.00;

    // Variable references to RadioButton elements
    private RadioButton rdoNone;
    private RadioButton rdoRegular;
    private RadioButton rdoDecaf;
    private RadioButton rdoCappuccino;

    // Variable reference to a ToggleGroup element
    // to group the RadioButton elements
    private ToggleGroup tg;

    public CoffeeBox() {
        // Creates group for radio buttons
        tg = new ToggleGroup();

        // Creates radio buttons
        rdoNone = new RadioButton("None");
        rdoRegular = new RadioButton("Regular");
        rdoDecaf = new RadioButton("Decaf");
        rdoCappuccino = new RadioButton("Cappuccino");

        rdoNone.setToggleGroup(tg);
        rdoRegular.setToggleGroup(tg);
        rdoDecaf.setToggleGroup(tg);
        rdoCappuccino.setToggleGroup(tg);

        // Creates a new VBox to hold the radio button elements
        VBox vbox = new VBox(10);  // with 10 pixel spacing
        vbox.setStyle("-fx-background-color: BlanchedAlmond;");
        this.setStyle("-fx-background-color: BlanchedAlmond;");
        vbox.getChildren().add(rdoNone);
        vbox.getChildren().add(rdoRegular);
        vbox.getChildren().add(rdoDecaf);
        vbox.getChildren().add(rdoCappuccino);

        // Make a TitledPane to hold the VBox of radio buttons
        TitledPane tp = new TitledPane("Coffee", vbox);
        tp.setCollapsible(false);
        this.getChildren().add(tp); // add the titled pane to this VBox
    }
    public double getCoffeeCost()
    {
        double coffeeCost = 0.0;

        // Determine which bagel is selected.
        if (rdoNone.isSelected()) {
            coffeeCost = NONE;
        }
        if (rdoRegular.isSelected()) {
            coffeeCost = REGULAR;
        }
        if (rdoDecaf.isSelected()) {
            coffeeCost = DECAF;
        }
        if (rdoCappuccino.isSelected()) {
            coffeeCost = CAPPUCCINO;
        }
        // Return the cost of the selected bagel.
        return coffeeCost;
    }
}
