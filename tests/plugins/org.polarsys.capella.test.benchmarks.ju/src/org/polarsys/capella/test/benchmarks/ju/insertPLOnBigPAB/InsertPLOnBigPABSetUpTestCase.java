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
package org.polarsys.capella.test.benchmarks.ju.insertPLOnBigPAB;

import java.util.List;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.test.benchmarks.ju.testcases.AbstractSetUpTestCase;
import org.polarsys.capella.test.diagram.common.ju.context.DiagramContext;
import org.polarsys.capella.test.diagram.common.ju.context.XABDiagram;
import org.polarsys.capella.test.diagram.common.ju.wrapper.utils.DiagramHelper;
import org.polarsys.capella.test.framework.api.BasicTestArtefact;
import org.polarsys.capella.test.framework.context.SessionContext;

public class InsertPLOnBigPABSetUpTestCase extends AbstractSetUpTestCase {
  List<DiagramContext> contexts;

  public InsertPLOnBigPABSetUpTestCase(List<DiagramContext> contexts, BasicTestArtefact benchmarkTestCase) {
    super(benchmarkTestCase);
    this.contexts = contexts;
  }

  public String getBigPABName() {
    return "[PAB] Implementation and Behaviour Components";
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void test() {
    Session session = getSession(getRequiredTestModels().get(0));
    SessionContext context = new SessionContext(session);

    String bigPABName = getBigPABName();
    DRepresentation dRepresentation = DiagramHelper.getDRepresentation(session, bigPABName);
    XABDiagram pab = XABDiagram.openDiagram(context, ((DDiagram) dRepresentation).getName(), Type.PA);
    contexts.add(pab);

  }

}
