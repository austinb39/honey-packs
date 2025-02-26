package minecraftbyexample.mbe32_inventory_item;

import minecraftbyexample.mbe30_inventory_basic.ContainerBasic;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SCollectItemPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.items.*;
import net.minecraftforge.items.wrapper.InvWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


public class ItemSimple extends Item
{
  static private final int MAXIMUM_NUMBER_OF_HONEY_PACKS = 6; // maximum stack size
  public ItemSimple()
  {
    super(new Item.Properties().maxStackSize(MAXIMUM_NUMBER_OF_HONEYPACKS).group(ItemGroup.MISC) // the item will appear on the Miscellaneous tab in creative
    );
  }
}

public class honeyPack extends itemBlock (boolean isFull, int amount, ) {
boolean isFull == true;
amount == 3;


public void honeyPackGolden {
if (golden == true);
amount == 5
} 

public void honeyPackFull {
if (amount == 0);
isFull = false
else if (isFull == false); {
honeyPack = void;
        }   
    }
  
}
