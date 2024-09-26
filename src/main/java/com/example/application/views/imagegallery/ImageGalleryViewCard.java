package com.example.application.views.imagegallery;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

public class ImageGalleryViewCard extends VerticalLayout {

    public ImageGalleryViewCard(String title, String imageUrl, String redirectUrl) {
        // Create an image component
        Image image = new Image(imageUrl, title);
        image.setWidth("100%"); // Make the image responsive

        // Create a button that redirects to the URL when clicked
        Button imageButton = new Button(image);
        imageButton.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.getPage().setLocation(redirectUrl)); // Navigate to the URL
        });

        // Add the button to the layout
        add(imageButton);
    }
}

