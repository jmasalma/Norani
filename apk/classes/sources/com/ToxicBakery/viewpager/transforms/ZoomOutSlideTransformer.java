package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/ZoomOutSlideTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "onTransform", "", "page", "Landroid/view/View;", "position", "", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ZoomOutSlideTransformer.kt */
public class ZoomOutSlideTransformer extends ABaseTransformer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final float MIN_ALPHA = 0.5f;
    private static final float MIN_SCALE = 0.85f;

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        if (f >= ((float) -1) || f <= ((float) 1)) {
            float height = (float) view.getHeight();
            float width = (float) view.getWidth();
            float f2 = (float) 1;
            float max = Math.max(MIN_SCALE, f2 - Math.abs(f));
            float f3 = f2 - max;
            float f4 = (float) 2;
            float f5 = (height * f3) / f4;
            float f6 = (f3 * width) / f4;
            view.setPivotY(height * MIN_ALPHA);
            view.setPivotX(width * MIN_ALPHA);
            view.setTranslationX(f < ((float) 0) ? f6 - (f5 / f4) : (-f6) + (f5 / f4));
            view.setScaleX(max);
            view.setScaleY(max);
            view.setAlpha((((max - MIN_SCALE) / 0.14999998f) * MIN_ALPHA) + MIN_ALPHA);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/ZoomOutSlideTransformer$Companion;", "", "()V", "MIN_ALPHA", "", "MIN_SCALE", "library_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ZoomOutSlideTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
