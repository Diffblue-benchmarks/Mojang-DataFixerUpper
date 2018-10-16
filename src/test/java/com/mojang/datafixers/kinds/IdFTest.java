// Copyright (c) Diffblue Limited. All rights reserved.
// Licensed under the MIT license.

package com.mojang.datafixers.kinds;

import com.mojang.datafixers.kinds.IdF;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IdFTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void createInputZeroOutputNotNull() {

    // Arrange
    final Object a = 0;

    // Act
    final IdF retval = IdF.create(a);

    // Assert result
    Assert.assertNotNull(retval);
    Assert.assertEquals(new Integer(0), retval.value);
  }
}
