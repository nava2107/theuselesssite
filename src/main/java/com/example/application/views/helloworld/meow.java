package com.example.application.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.H2; // For "MEOW WITH ME" text
import com.vaadin.flow.component.orderedlayout.VerticalLayout; // Changed layout to VerticalLayout

@PageTitle("Hello World")
@Menu(icon = "line-awesome/svg/globe-solid.svg", order = 1)
@Route(value = "hello-world")
public class meow extends VerticalLayout {

    private TextField name;
    private Button sayHello;
    private Button meowButton;

    public meow() {

        // Add "MEOW WITH ME" text
        H2 meowHeader = new H2("MEOW WITH ME");
        meowHeader.getStyle().set("color", "#FF69B4"); // Pink color for "MEOW WITH ME"
        meowHeader.getStyle().set("font-size", "36px"); // Large font size
        meowHeader.getStyle().set("font-weight", "bold"); // Bold letters

        // Create the "Meow" button that sends to another URL
        meowButton = new Button("Meow");
        meowButton.addClickListener(e -> {
            // Redirect to the desired URL (replace with your target URL)
            getUI().ifPresent(ui -> ui.getPage().setLocation("Empty")); // Example: next app on port 8081
        });

        // Style the Meow button
        meowButton.getStyle().set("font-size", "24px"); // Big font
        meowButton.getStyle().set("padding", "15px 30px"); // Big button style
        meowButton.getStyle().set("background-color", "#FF69B4"); // Pink background
        meowButton.getStyle().set("color", "white"); // White text
        meowButton.getStyle().set("font-weight", "bold"); // Bold text

        // Layout for the Meow section
        VerticalLayout meowLayout = new VerticalLayout();
        meowLayout.add(meowHeader, meowButton);
        meowLayout.setSpacing(true);
        meowLayout.setAlignItems(Alignment.CENTER); // Align in the center

        // Add everything to the main layout
        add(meowLayout);
        setAlignItems(Alignment.CENTER); // Center everything
    }
}
