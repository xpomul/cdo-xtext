/**
 * Copyright (c) 2013-2014 Stefan Winkler (Kiel, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial contribution
 */
package net.winklerweb.cdoxtext.runtime;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.xtext.resource.XtextResource;

@SuppressWarnings("all")
public class OriginalInputState {
  public XtextResource resource;
  
  public CDOID objectId;
  
  public long timestamp;
  
  public OriginalInputState(final XtextResource resource, final CDOID cdoid, final long timestamp) {
    this.resource = resource;
    this.objectId = cdoid;
    this.timestamp = timestamp;
  }
}
