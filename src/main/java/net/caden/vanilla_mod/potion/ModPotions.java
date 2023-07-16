package net.caden.vanilla_mod.potion;

import com.mojang.blaze3d.shaders.Effect;
import net.caden.vanilla_mod.VanillaMod;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, VanillaMod.MOD_ID);

    public static final RegistryObject<Potion> VANILLA_EXTRACT = POTIONS.register("vanilla_extract", () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
