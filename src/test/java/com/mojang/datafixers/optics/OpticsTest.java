// Copyright (c) Diffblue Limited. All rights reserved.
// Licensed under the MIT license.

package com.mojang.datafixers.optics;

import com.mojang.datafixers.optics.Adapter;
import com.mojang.datafixers.optics.Optics;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class OpticsTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void idOutputNotNull() {

    // Act
    final Adapter retval = Optics.id();

    // Assert result
    Assert.assertNotNull(retval);
  }

  @Test
  public void inj1OutputNotNull() {
    // Act
    final Inj1 retval = Optics.inj1();
    // Assert result
    Assert.assertNotNull(retval);
  }

  @Test
  public void inj2OutputNotNull() {
    // Act
    final Inj2 retval = Optics.inj2();
    // Assert result
    Assert.assertNotNull(retval);
  }

  @Test
  public void proj1OutputNotNull() {
    // Act
    final Proj1 retval = Optics.proj1();
    // Assert result
    Assert.assertNotNull(retval);
  }

  @Test
  public void proj2OutputNotNull() {
    // Act
    final Proj2 retval = Optics.proj2();
    // Assert result
    Assert.assertNotNull(retval);
  }
}
