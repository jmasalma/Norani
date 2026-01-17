package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/DepthPageTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "isPagingEnabled", "", "()Z", "onTransform", "", "page", "Landroid/view/View;", "position", "", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: DepthPageTransformer.kt */
public class DepthPageTransformer extends ABaseTransformer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final float MIN_SCALE = 0.75f;

    /* access modifiers changed from: protected */
    public boolean isPagingEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        if (f <= 0.0f) {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f <= 1.0f) {
            float f2 = (float) 1;
            float abs = ((f2 - Math.abs(f)) * 0.25f) + MIN_SCALE;
            view.setAlpha(f2 - f);
            view.setPivotY(((float) view.getHeight()) * 0.5f);
            view.setTranslationX(((float) view.getWidth()) * (-f));
            view.setScaleX(abs);
            view.setScaleY(abs);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/DepthPageTransformer$Companion;", "", "()V", "MIN_SCALE", "", "library_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: DepthPageTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
