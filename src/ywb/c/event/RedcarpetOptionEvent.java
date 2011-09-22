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

public class RedcarpetOptionEvent extends GwtEvent<RedcarpetOptionHandler> {

  public static final GwtEvent.Type<RedcarpetOptionHandler> TYPE = new GwtEvent.Type<RedcarpetOptionHandler>();

  public static enum Type {
    OSCARS, GOLDENGLOBE, GRAMMY, CANNES
  }

  private Type type;

  public RedcarpetOptionEvent(Type type) {
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  protected void dispatch(RedcarpetOptionHandler handler) {
    handler.onExecute(this);
  }

  @Override
  public GwtEvent.Type<RedcarpetOptionHandler> getAssociatedType() {
    return TYPE;
  }

}
