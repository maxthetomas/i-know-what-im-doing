package ru.maxthetomas.ikwid.iknowwhatimdoing.mixin;

import net.minecraft.server.integrated.IntegratedServerLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(IntegratedServerLoader.class)
public abstract class IntegratedServerLoaderMixin {
    @ModifyVariable(method = "start(Lnet/minecraft/client/gui/screen/Screen;Ljava/lang/String;ZZ)V", at = @At("HEAD"), index = 3, argsOnly = true, ordinal = 1, name = "canShowBackupPrompt")
    boolean modifyCanShowBackupPrompt(boolean value) {
        return false;
    }
}