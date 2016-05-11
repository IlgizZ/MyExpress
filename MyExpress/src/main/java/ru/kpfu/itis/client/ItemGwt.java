package ru.kpfu.itis.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;

public class ItemGwt implements EntryPoint {

    public void onModuleLoad() {
        TabPanel tabPanel = new TabPanel();

        Label label2 = new Label("Создать категорию");
        label2.setHeight("200");
        Label label3 = new Label("Перейти на сайт");
        label3.setHeight("200");

        String tab1Title = "Add item";
        String tab2Title = "Add category";
        String tab3Title = "Exit";

        final AddItemForm addItemForm = new AddItemForm();
        final CreateCategoryForm createCategoryForm = new CreateCategoryForm();
        tabPanel.add(addItemForm.getAddProductForm(), tab1Title);
        tabPanel.add(createCategoryForm.getCreateCategoryForm(), tab2Title);
//        tabPanel.add(new RemoveItemForm().getExitForm(), tab3Title);

        tabPanel.selectTab(0);

        tabPanel.setWidth("800");

        tabPanel.setAnimationEnabled(true);
        tabPanel.addBeforeSelectionHandler(new BeforeSelectionHandler<Integer>() {
            @Override
            public void onBeforeSelection(BeforeSelectionEvent<Integer> beforeSelectionEvent) {
//                if (beforeSelectionEvent.getItem() == 1) {
//                    addItemForm.refresCategories();
//                }
//                if (beforeSelectionEvent.getItem() == 3) {
//                    Window.Location.replace("localhost:8989");
//                }
            }
        });

        RootPanel.get().add(tabPanel);
    }
}