/*
 * Copyright (c) 1998, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     bdoughan - Oct 29/2009 - 2.0 - Initial implementation
package org.eclipse.persistence.testing.oxm.mappings.keybased.compositekeyclass;

public class SelfAttributeTestCases extends CompositeKeyClassTestCases {

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/oxm/mappings/keybased/compositekeyclass/self-attribute.xml";

    public SelfAttributeTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setProject(new SelfAttributeProject());
    }

}