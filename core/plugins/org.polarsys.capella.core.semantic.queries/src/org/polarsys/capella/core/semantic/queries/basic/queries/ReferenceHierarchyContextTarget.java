/*******************************************************************************
 * Copyright (c) 2018, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales Global Services - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.polarsys.capella.common.helpers.query.IQuery;
import org.polarsys.capella.core.data.fa.ReferenceHierarchyContext;

public class ReferenceHierarchyContextTarget implements IQuery {

  public List<Object> compute(Object object) {
    if (object instanceof ReferenceHierarchyContext) {
      ReferenceHierarchyContext context = (ReferenceHierarchyContext) object;
      return context.getTargetReferenceHierarchy().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }
    return Collections.emptyList();
  }

}
