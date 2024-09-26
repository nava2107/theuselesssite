package com.example.application.views.imagegallery;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@Route(value = "image-gallery")
public class ImageGalleryView extends Div {

    private OrderedList imageContainer;

    public ImageGalleryView() {
        constructUI();

        // Array of image URLs and their corresponding link
        String[][] images = {
                {"https://images.unsplash.com/photo-1472491235688-bdc81a63246e?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"},
                {"https://images.unsplash.com/photo-1716013989492-fdf9ec971fda?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"},
                {"https://images.unsplash.com/photo-1602519260506-20b5a42bdab6?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"},
                {"https://images.unsplash.com/photo-1635928056919-dbef967e28a5?q=80&w=2574&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"},
                {"https://i.pinimg.com/564x/d1/00/94/d10094edeafb4dde811fe13af3a86279.jpg", "hello-world"},
                {"https://i.pinimg.com/564x/09/41/73/094173d0345e402f97d4e6806c5c07b9.jpg", "hello-world"}
        };

        // Loop through the array to create the image gallery
        for (String[] image : images) {
            String imageUrl = image[0];
            String link = image[1];

            // Create an image element
            Image img = new Image(imageUrl, "Gallery Image");
            img.setWidth("100%"); // Ensuring the image takes full width of the list item
            img.setHeight("150px"); // Set a fixed height for the images

            // Create a button for each image
            Button imageButton = new Button(img);
            imageButton.getElement().getStyle().set("padding", "0"); // Remove padding for the button
            imageButton.addClickListener(event -> {
                getUI().ifPresent(ui -> ui.getPage().setLocation(link)); // Redirect to the link
            });

            // Create a list item and add the button to it
            ListItem li = new ListItem();
            li.add(imageButton);
            imageContainer.add(li);
        }
    }

    private void constructUI() {
        addClassNames("cat-gallery-view");
        addClassNames(LumoUtility.MaxWidth.SCREEN_LARGE,
                LumoUtility.Margin.Horizontal.AUTO,
                LumoUtility.Padding.Bottom.LARGE,
                LumoUtility.Padding.Horizontal.LARGE);

        imageContainer = new OrderedList();
        imageContainer.addClassNames(LumoUtility.Gap.MEDIUM,
                LumoUtility.Display.GRID,
                LumoUtility.ListStyleType.NONE,
                LumoUtility.Margin.NONE,
                LumoUtility.Padding.NONE);

        add(imageContainer);
    }
}
