package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/ZoomOutTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "onTransform", "", "page", "Landroid/view/View;", "position", "", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ZoomOutTransformer.kt */
public class ZoomOutTransformer extends ABaseTransformer {
    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float abs = Math.abs(f) + 1.0f;
        view.setScaleX(abs);
        view.setScaleY(abs);
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        int i = (f > -1.0f ? 1 : (f == -1.0f ? 0 : -1));
        view.setAlpha((i < 0 || f > 1.0f) ? 0.0f : 1.0f - (abs - 1.0f));
        if (i == 0) {
            view.setTranslationX((float) (view.getWidth() * -1));
        }
    }
}
