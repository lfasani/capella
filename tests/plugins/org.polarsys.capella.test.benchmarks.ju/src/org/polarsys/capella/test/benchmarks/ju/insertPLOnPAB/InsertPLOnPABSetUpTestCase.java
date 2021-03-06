/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.benchmarks.ju.insertPLOnPAB;

import java.util.List;

import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.capella.core.model.handler.helpers.RepresentationHelper;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.core.sirius.analysis.helpers.DDiagramHelper;
import org.polarsys.capella.test.benchmarks.ju.testcases.AbstractSetUpTestCase;
import org.polarsys.capella.test.diagram.common.ju.context.DiagramContext;
import org.polarsys.capella.test.diagram.common.ju.context.XABDiagram;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.context.SessionContext;
import org.polarsys.capella.test.framework.model.GenericModel;

public class InsertPLOnPABSetUpTestCase extends AbstractSetUpTestCase {
  List<DiagramContext> contexts;

  public InsertPLOnPABSetUpTestCase(List<DiagramContext> contexts, BasicTestArtefact benchmarkTestCase) {
    super(benchmarkTestCase);
    this.contexts = contexts;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void test() {
    Session session = getSession(getRequiredTestModels().get(0));
    SessionContext context = new SessionContext(session);
    for (DRepresentation rep : DialectManager.INSTANCE.getAllRepresentations(session)) {
      if (rep instanceof DDiagram && DDiagramHelper.isPAB((DDiagram) rep)) {
        XABDiagram pab = XABDiagram.openDiagram(context, RepresentationHelper.getRepresentationDescriptor(rep).getName(), Type.PA);
        pab.createActor(GenericModel.ACTOR_1);
        pab.createActor(GenericModel.ACTOR_2);
        contexts.add(pab);
      }
    }
  }

}
