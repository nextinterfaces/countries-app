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
package ywb.c.event;

import com.google.gwt.event.shared.GwtEvent;

public class SubMenuEvent extends GwtEvent<SubMenuHandler> {

	public static final GwtEvent.Type<SubMenuHandler> TYPE = new GwtEvent.Type<SubMenuHandler>();

	public static enum Type {
		FEEL_LUCKY, AZ, SWIMWEAR, REDCARPET_OSCARS, REDCARPET_GOLDEN, REDCARPET_GRAMMY, REDCARPET_CANNES, WALLPAPER
	}

	private Type type;
	private String selection;

	public SubMenuEvent(Type type, String selection) {
		this.type = type;
		this.selection = selection;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getSubSearch() {
		return selection;
	}

	@Override
	protected void dispatch(SubMenuHandler handler) {
		handler.onExecute(this);
	}

	@Override
	public GwtEvent.Type<SubMenuHandler> getAssociatedType() {
		return TYPE;
	}

}
