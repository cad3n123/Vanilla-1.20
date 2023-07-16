package net.caden.vanilla_mod.item;

import net.caden.vanilla_mod.VanillaMod;
import net.caden.vanilla_mod.potion.ModPotions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VANILLA_TAB = CREATIVE_MODE_TABS.register("vanilla_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VANILLA_BEAN.get()))
                    .title(Component.translatable("creativetab.vanilla_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.VANILLA_BEAN.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
