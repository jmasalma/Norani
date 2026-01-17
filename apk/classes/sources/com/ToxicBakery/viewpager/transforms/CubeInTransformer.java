package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/CubeInTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "isPagingEnabled", "", "()Z", "onTransform", "", "page", "Landroid/view/View;", "position", "", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: CubeInTransformer.kt */
public class CubeInTransformer extends ABaseTransformer {
    public boolean isPagingEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        view.setPivotX(f > ((float) 0) ? 0.0f : (float) view.getWidth());
        view.setPivotY(0.0f);
        view.setRotationY(f * -90.0f);
    }
}
