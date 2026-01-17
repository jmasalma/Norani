package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0014J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H$J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "Landroidx/viewpager/widget/ViewPager$PageTransformer;", "()V", "isPagingEnabled", "", "()Z", "clampPosition", "", "position", "hideOffscreenPages", "onPostTransform", "", "page", "Landroid/view/View;", "onPreTransform", "onTransform", "transformPage", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ABaseTransformer.kt */
public abstract class ABaseTransformer implements ViewPager.PageTransformer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    private final float clampPosition(float f) {
        float f2 = -1.0f;
        if (f >= -1.0f) {
            f2 = 1.0f;
            if (f <= 1.0f) {
                return f;
            }
        }
        return f2;
    }

    @JvmStatic
    protected static final float min(float f, float f2) {
        return Companion.min(f, f2);
    }

    /* access modifiers changed from: protected */
    public boolean hideOffscreenPages() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean isPagingEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPostTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
    }

    /* access modifiers changed from: protected */
    public abstract void onTransform(View view, float f);

    public void transformPage(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float clampPosition = clampPosition(f);
        onPreTransform(view, clampPosition);
        onTransform(view, clampPosition);
        onPostTransform(view, clampPosition);
    }

    /* access modifiers changed from: protected */
    public void onPreTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float width = (float) view.getWidth();
        float f2 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(isPagingEnabled() ? 0.0f : (-width) * f);
        if (hideOffscreenPages()) {
            if (f > -1.0f && f < 1.0f) {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            view.setEnabled(false);
            return;
        }
        view.setEnabled(true);
        view.setAlpha(1.0f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0005¨\u0006\u0006"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer$Companion;", "", "()V", "min", "", "value", "library_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ABaseTransformer.kt */
    public static final class Companion {
        /* access modifiers changed from: protected */
        @JvmStatic
        public final float min(float f, float f2) {
            return f < f2 ? f2 : f;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
