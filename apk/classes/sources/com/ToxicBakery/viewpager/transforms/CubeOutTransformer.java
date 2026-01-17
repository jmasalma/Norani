package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/CubeOutTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "distanceMultiplier", "", "(I)V", "isPagingEnabled", "", "()Z", "onTransform", "", "page", "Landroid/view/View;", "position", "", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: CubeOutTransformer.kt */
public class CubeOutTransformer extends ABaseTransformer {
    private final int distanceMultiplier;

    public CubeOutTransformer() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public boolean isPagingEnabled() {
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CubeOutTransformer(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 20 : i);
    }

    public CubeOutTransformer(int i) {
        this.distanceMultiplier = i;
    }

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        view.setCameraDistance((float) (view.getWidth() * this.distanceMultiplier));
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
