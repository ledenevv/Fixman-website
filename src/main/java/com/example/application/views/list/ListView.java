package com.example.application.views.list;

import com.example.application.data.entity.ServicesList;
import com.example.application.data.service.CrmService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Services | HotFix")
@Route(value = "")
public class ListView extends VerticalLayout {

    Grid<ServicesList> grid = new Grid<>(ServicesList.class);
    TextField filterText = new TextField();
    ServicesListForm form;
    private CrmService service;


    public ListView(CrmService service) {
        this.service = service;
        addClassName("list-view");
        setSizeFull();

        configureGrid();
        configureForm();

        add(
          getToolbar(),
          getContent()
        );
        updateList();

    }

    private void updateList() {
        grid.setItems(service.findAllServices(filterText.getValue()));
    }

    private void configureForm() {
        form = new ServicesListForm(service.findAllServices(), service.findAllStatuses());
        form.setWidth("25em");
    }

    private Component getContent() {
        HorizontalLayout servicesList = new HorizontalLayout(grid, form);
        servicesList.setFlexGrow(2, grid);
        servicesList.setFlexGrow(1, form);
        servicesList.addClassNames("servicesList");
        servicesList.setSizeFull();
        return servicesList;
    }

    private Component getToolbar() {
        filterText.setPlaceholder("Filter by name...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        Button addServiceButton = new Button("Add new service");

        HorizontalLayout toolbar = new HorizontalLayout(filterText, addServiceButton);
        toolbar.addClassName("toolbar");
        return toolbar;
    }

    private void configureGrid() {
        grid.addClassName("services-list-grid");
        grid.setSizeFull();
        grid.setColumns("serviceName", "serviceDescr", "price");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));

    }


}




