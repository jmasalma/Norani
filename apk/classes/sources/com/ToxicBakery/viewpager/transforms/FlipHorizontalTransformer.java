package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/FlipHorizontalTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "onPostTransform", "", "page", "Landroid/view/View;", "position", "", "onTransform", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: FlipHorizontalTransformer.kt */
public class FlipHorizontalTransformer extends ABaseTransformer {
    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float f2 = f * 180.0f;
        view.setAlpha((f2 > 90.0f || f2 < -90.0f) ? 0.0f : 1.0f);
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f2);
    }

    /* access modifiers changed from: protected */
    public void onPostTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        super.onPostTransform(view, f);
        view.setVisibility((f <= -0.5f || f >= 0.5f) ? 4 : 0);
    }
}
