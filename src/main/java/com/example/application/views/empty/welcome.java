package com.example.application.views.empty;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@Route(value = "")
public class welcome extends VerticalLayout {

    public welcome() {
        setSpacing(false);

        // Add the image
        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        // Add the header text
        H2 header = new H2("This place intentionally left empty");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);
        add(header);
        add(new Paragraph("It’s a place where you can grow your own UI 🤗"));

        // Add custom text "WANNA SEE SOME CATS?"
        H2 catHeader = new H2("WANNA SEE SOME CATS?");
        catHeader.getStyle().set("color", "#FF69B4"); // Pink text
        catHeader.getStyle().set("font-size", "36px"); // Big font size
        catHeader.getStyle().set("font-weight", "bold"); // Bold letters
        add(catHeader);

        // Create the "PRESS ME" button
        Button pressMeButton = new Button("PRESS ME");
        pressMeButton.addClickListener(e -> {
            // Redirect to the next app's URL
            getUI().ifPresent(ui -> ui.getPage().setLocation("image-gallery")); // Change this to the URL of your next app
        });

        // Style the button
        pressMeButton.getStyle().set("font-size", "24px"); // Large letters
        pressMeButton.getStyle().set("padding", "20px 40px"); // Big padding for a fat button
        pressMeButton.getStyle().set("background-color", "#FF69B4"); // Pink background
        pressMeButton.getStyle().set("color", "white"); // White text
        pressMeButton.getStyle().set("font-weight", "bold"); // Bold text

        // Add the button to the layout
        add(pressMeButton);

        // Align everything in the center
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }
}

