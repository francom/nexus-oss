/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2013 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */

package org.sonatype.nexus.scheduling;

/**
 * A generic activity descriptor.
 *
 * @author cstamas
 * @deprecated To be removed in future release (no replacement provided).
 */
@Deprecated
public interface TaskActivityDescriptor
{
  /**
   * Returns true if this is a scheduled task.
   */
  boolean isScheduled();

  /**
   * Returns true if this is task that is initiated by user.
   */
  boolean isUserInitiated();

  /**
   * Returns true if task having this activity desciptor is allowed to run.
   */
  boolean allowedExecution(TaskFilter filter);
}
