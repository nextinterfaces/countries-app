/*
 * Copyright 2011 Vancouver Ywebb Consulting Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ywb.c.ui;

import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * This is a button class with two states MouseUp and MouseDown. Bear in mind tablets don't necessarily have two sates,
 * but one - MouseDown only.
 */
public abstract class YButton extends SimplePanel implements HasMouseDownHandlers, HasMouseUpHandlers {

	private boolean isEnabled = true;
	private boolean isSelected = false;

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public void onBrowserEvent(Event event) {
		if (!isEnabled()) {
			return;
		} else {
			super.onBrowserEvent(event);
		}
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return addDomHandler(handler, MouseDownEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return addDomHandler(handler, MouseUpEvent.getType());
	}

	// public HandlerRegistration addClickHandler(ClickHandler handler) {
	// return addHandler(handler, ClickEvent.getType());
	// }
	//
	// @Override
	// public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
	// return addHandler(handler, MouseOutEvent.getType());
	// }

	//
	// @Override
	// public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
	// return addHandler(handler, MouseOverEvent.getType());
	// }

	// @Override
	// public void onBrowserEvent(Event event) {
	//
	// if (!enabled) {
	// return;
	// }
	//
	// // Suppress the propagation of the onClick event so that 2 events aren't
	// // fired.
	// if (DOM.eventGetType(event) != Event.ONCLICK) {
	// super.onBrowserEvent(event);
	// }
	//
	// switch (DOM.eventGetType(event)) {
	//
	// case Event.ONMOUSEOUT:
	// MouseOutEvent.fireNativeEvent(event, this);
	// break;
	//
	// case Event.ONMOUSEOVER:
	// MouseOverEvent.fireNativeEvent(event, this);
	// break;
	//
	// // The click listeners are fired as the result of an ONMOUSEUP event as
	// // IE has issues capturing the ONCLICK event.
	//
	// case Event.ONCLICK:
	// // TODO: Ensure that these are only fired if the
	// // onMouseDown was called on this button.
	// NativeEvent nativeClickEvent = Document.get().createClickEvent(1, 0, 0, 0,
	// 0, false, false,
	// false, false);
	//
	// ClickEvent.fireNativeEvent(nativeClickEvent, this);
	// break;
	//
	// default:
	// break;
	// }
	//
	// event.stopPropagation();
	// }
	//
	// public void reset() {
	// setWidget(defaultImage);
	// }

	// private class ImageSwapper implements MouseOutHandler, MouseOverHandler,
	// ClickHandler {
	//
	// @Override
	// public void onMouseOut(MouseOutEvent event) {
	// setWidget(defaultImage);
	// }
	//
	// @Override
	// public void onMouseOver(MouseOverEvent event) {
	// setWidget(overImage);
	// }
	//
	// @Override
	// public void onClick(ClickEvent event) {
	// setWidget(overImage);
	// }
	// };

}