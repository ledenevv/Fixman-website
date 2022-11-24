package com.example.application.views.list;

import com.example.application.data.entity.ServicesList;
import com.example.application.data.entity.Statuses;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

import java.util.List;

public class ServicesListForm extends FormLayout {
    TextField serviceName = new TextField("Service Name");
    TextField serviceDescr = new TextField("Service Description");
    TextField price = new TextField("Price");

    Button save = new Button("Save");
    Button delete = new Button("Delete");
    Button cancel = new Button("Cancel");

    public ServicesListForm(List<ServicesList> allServices, List<Statuses> allStatuses) {
        addClassName("services-list-form");

        add(
                serviceName,
                serviceDescr,
                price,
                createButtonLayout()
        );
    }
    private Component createButtonLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);

        save.addClickShortcut(Key.ENTER);
        cancel.addClickShortcut(Key.ESCAPE);

        return new HorizontalLayout(save, delete, cancel);
    }
}

