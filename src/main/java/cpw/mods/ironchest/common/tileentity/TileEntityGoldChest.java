/*******************************************************************************
 * Copyright (c) 2012 cpw.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * <p>
 * Contributors:
 * cpw - initial API and implementation
 ******************************************************************************/
package cpw.mods.ironchest.common.tileentity;

import cpw.mods.ironchest.common.blocks.IronChestType;
import cpw.mods.ironchest.common.core.IronChestBlocks;

public class TileEntityGoldChest extends TileEntityIronChest
{
    public TileEntityGoldChest()
    {
        super(IronChestEntityType.GOLD_CHEST, IronChestType.GOLD, IronChestBlocks.goldChestBlock);
    }
}