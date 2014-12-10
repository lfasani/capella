/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.dashboard.hyperlinkadapter.sa;

import java.util.List;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.core.dashboard.hyperlinkadapter.AbstractHyperlinkAdapter;
import org.polarsys.capella.core.dashboard.hyperlinkadapter.ModelSelectionHelper;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.model.helpers.ModelQueryHelper;
import org.polarsys.capella.core.transition.common.ui.actions.TransitionAction;
import org.polarsys.capella.core.transition.system.topdown.ui.actions.OE2ActorTransitionAction;

/**
 * Perform an automated transition of Operational Entities and Actors.
 */
public class PerformOpEntitiesAndActorsTransitionAdapter extends AbstractHyperlinkAdapter {
  /**
   * Constructor.
   * @param capellaProject_p
   * @param session_p
   */
  public PerformOpEntitiesAndActorsTransitionAdapter(Session session_p) {
    super(session_p);
  }

  /**
   * @see org.polarsys.capella.core.dashboard.hyperlinkadapter.AbstractHyperlinkAdapter#linkPressed(org.eclipse.ui.forms.events.HyperlinkEvent,
   *      org.polarsys.capella.core.data.capellamodeller.Project, org.eclipse.sirius.business.api.session.Session)
   */
  @Override
  protected void linkPressed(HyperlinkEvent event_p, Project capellaProject_p, Session session_p) {
    List<Entity> entities = ModelSelectionHelper.selectEntities(capellaProject_p);
    if ((entities != null) && !entities.isEmpty()) {
      OE2ActorTransitionAction action = new OE2ActorTransitionAction();
      action.selectionChanged(TransitionAction.DEFAULT_ACTION, new StructuredSelection(entities));
      action.run(TransitionAction.DEFAULT_ACTION);
    }
  }

  /**
   * @see org.polarsys.capella.core.dashboard.hyperlinkadapter.AbstractHyperlinkAdapter#getModelElement(org.polarsys.capella.core.data.capellamodeller.Project)
   */
  @Override
  protected ModelElement getModelElement(Project project_p) {
    return ModelQueryHelper.getOperationalAnalysis(project_p);
  }
}
