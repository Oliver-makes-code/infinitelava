package olivermakesco.de.lava;

import net.minecraft.fluid.LavaFluid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LavaFluid.class)
public class LavaMixin {
    @Inject(method = "isInfinite()Z", at = @At("RETURN"), cancellable = true)
    public void makeInfinite(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
