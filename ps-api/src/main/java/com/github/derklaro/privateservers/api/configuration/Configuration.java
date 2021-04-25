/*
 * MIT License
 *
 * Copyright (c) 2020 Pasqual K. and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.github.derklaro.privateservers.api.configuration;

import java.util.ArrayList;

public class Configuration {

  private String databaseProvider;
  private NpcConfiguration npcConfiguration;

  private InventoryConfiguration.MainMenuConfiguration mainMenuConfiguration;
  private InventoryConfiguration.PublicServerListConfiguration publicServerListConfiguration;

  public Configuration() {
    this.databaseProvider = "json";
    this.npcConfiguration = new NpcConfiguration();

    this.mainMenuConfiguration = new InventoryConfiguration.MainMenuConfiguration(
      27,
      new InventoryConfiguration.ItemLayout(10, "ps.start.service", "CACTUS", -1, "§a§lStart Service", new ArrayList<>()),
      new InventoryConfiguration.ItemLayout(12, "ps.stop.service", "REDSTONE_BLOCK", -1, "§c§lStop Service", new ArrayList<>()),
      new InventoryConfiguration.ItemLayout(14, null, "DIAMOND", -1, "§6§lJoin Service", new ArrayList<>()),
      new InventoryConfiguration.ItemLayout(16, null, "GOLD_INGOT", -1, "§f§lPublic Services", new ArrayList<>())
    );
    this.publicServerListConfiguration = new InventoryConfiguration.PublicServerListConfiguration(
      54,
      new InventoryConfiguration.ItemLayout(-1, null, "WATCH", -1, "§a§lServer of %owner_name%", new ArrayList<>()),
      new InventoryConfiguration.ItemLayout(-1, null, "COMPASS", -1, "§c§lServer of %owner_name%", new ArrayList<>())
    );
  }

  public String getDatabaseProvider() {
    return this.databaseProvider;
  }

  public void setDatabaseProvider(String databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  public NpcConfiguration getNpcConfiguration() {
    return this.npcConfiguration;
  }

  public void setNpcConfiguration(NpcConfiguration npcConfiguration) {
    this.npcConfiguration = npcConfiguration;
  }

  public InventoryConfiguration.MainMenuConfiguration getMainMenuConfiguration() {
    return this.mainMenuConfiguration;
  }

  public void setMainMenuConfiguration(InventoryConfiguration.MainMenuConfiguration mainMenuConfiguration) {
    this.mainMenuConfiguration = mainMenuConfiguration;
  }

  public InventoryConfiguration.PublicServerListConfiguration getPublicServerListConfiguration() {
    return this.publicServerListConfiguration;
  }

  public void setPublicServerListConfiguration(InventoryConfiguration.PublicServerListConfiguration publicServerListConfiguration) {
    this.publicServerListConfiguration = publicServerListConfiguration;
  }
}
