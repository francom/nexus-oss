/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2014 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.rapture;

import javax.inject.Named;
import javax.inject.Singleton;

import org.sonatype.sisu.goodies.common.ComponentSupport;

import com.google.common.base.Preconditions;

/**
 * Rapture.
 *
 * @since 3.0
 */
@Named
@Singleton
public class Rapture
    extends ComponentSupport
{

  private RaptureSettings settings = new RaptureSettings();


  public RaptureSettings getSettings() {
    return settings;
  }

  public void setSettings(final RaptureSettings settings) {
    this.settings = Preconditions.checkNotNull(settings);
  }

  public void resetSettings() {
    this.settings = new RaptureSettings();
  }

}
