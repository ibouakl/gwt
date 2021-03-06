package com.gwt.ui.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class SpanPanel extends ComplexPanel {


    public SpanPanel() {
        setElement(DOM.createElement("span"));
    }

    public void add(Widget w) {
        super.add(w, getElement());
    }

    public void insert(Widget w, int beforeIndex) {
            super.insert(w, getElement(), beforeIndex, true);
    }
    
    public String getText() {
            return DOM.getInnerText(getElement());
    }
    
    public void setText(String text) {
            DOM.setInnerText(getElement(), (text == null) ? "" : text);
    }
} 
