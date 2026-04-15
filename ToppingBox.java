// Author: Grayson Molnar
package bagelHouse;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class ToppingBox extends VBox {
    // Initialize topping prices
    public final double CREAM_CHEESE = 0.50;
    public final double BUTTER = 0.25;
    public final double PEACH_JELLY = 0.75;
    public final double BLUEBERRY_JAM = 0.75;

    // Create CheckBox references
    private CheckBox cboxCreamCheese;
    private CheckBox cboxButter;
    private CheckBox cboxPeachJelly;
    private CheckBox cboxBlueberryJam;

    public ToppingBox() {
        //Create checkboxes
        cboxCreamCheese = new CheckBox("Cream cheese");
        cboxButter = new CheckBox("Butter");
        cboxPeachJelly = new CheckBox("Peach Jelly");
        cboxBlueberryJam = new CheckBox("Blueberry Jam");

        // Make another VBox to hold the checkboxes buttons.
        VBox vbox = new VBox(10);  // with 10 pixel spacing
        vbox.setStyle("-fx-background-color: Beige;");
        this.setStyle("-fx-background-color: Beige;");  // so outer VBox same color

        // Add checkboxes to new VBox element
        vbox.getChildren().add(cboxCreamCheese);
        vbox.getChildren().add(cboxButter);
        vbox.getChildren().add(cboxPeachJelly);
        vbox.getChildren().add(cboxBlueberryJam);

        // Add the titled pane to this VBox
        TitledPane tp = new TitledPane("Toppings", vbox);
        tp.setCollapsible(false);
        this.getChildren().add(tp);
    }

    // Returns the sum cost of all selected toppings
    public double getToppingCost()
    {
        double toppingCost = 0.0;
        if (cboxCreamCheese.isSelected()) {
            toppingCost += CREAM_CHEESE;
        }
        if (cboxButter.isSelected()) {
            toppingCost += BUTTER;
        }
        if (cboxPeachJelly.isSelected()) {
            toppingCost += PEACH_JELLY;
        }
        if (cboxBlueberryJam.isSelected()) {
            toppingCost += BLUEBERRY_JAM;
        }
        return toppingCost;
    }
}
