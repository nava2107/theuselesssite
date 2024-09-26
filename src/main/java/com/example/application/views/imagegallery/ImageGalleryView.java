package com.example.application.views.imagegallery;

import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.html.OrderedList;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Display;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.ListStyleType;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.flow.theme.lumo.LumoUtility.MaxWidth;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@PageTitle("Image Gallery")
@Menu(icon = "line-awesome/svg/th-list-solid.svg", order = 2)
@Route(value = "image-gallery")
public class ImageGalleryView extends Main implements HasComponents, HasStyle {

    private OrderedList imageContainer;

    public ImageGalleryView() {
        constructUI();

        // Add image cards with clickable images
        imageContainer.add(new ImageGalleryViewCard("Snow mountains under stars",
                "https://images.unsplash.com/photo-1472491235688-bdc81a63246e?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"));
        imageContainer.add(new ImageGalleryViewCard("Snow covered mountain",
                "https://images.unsplash.com/photo-1716013989492-fdf9ec971fda?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"));
        imageContainer.add(new ImageGalleryViewCard("River between mountains",
                "https://images.unsplash.com/photo-1602519260506-20b5a42bdab6?q=80&w=2670&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"));
        imageContainer.add(new ImageGalleryViewCard("Milky way on mountains",
                "https://images.unsplash.com/photo-1635928056919-dbef967e28a5?q=80&w=2574&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", "hello-world"));
        imageContainer.add(new ImageGalleryViewCard("Mountain with fog",
                "https://i.pinimg.com/564x/d1/00/94/d10094edeafb4dde811fe13af3a86279.jpg", "hello-world"));
        imageContainer.add(new ImageGalleryViewCard("Mountain at night",
                "https://i.pinimg.com/564x/09/41/73/094173d0345e402f97d4e6806c5c07b9.jpg", "hello-world"));

    }

    private void constructUI() {
        addClassNames("cat-gallery-view");
        addClassNames(MaxWidth.SCREEN_LARGE, Margin.Horizontal.AUTO, Padding.Bottom.LARGE, Padding.Horizontal.LARGE);

        imageContainer = new OrderedList();
        imageContainer.addClassNames(Gap.MEDIUM, Display.GRID, ListStyleType.NONE, Margin.NONE, Padding.NONE);

        add(imageContainer);
    }
}
