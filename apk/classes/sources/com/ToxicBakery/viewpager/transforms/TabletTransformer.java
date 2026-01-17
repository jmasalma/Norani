package com.ToxicBakery.viewpager.transforms;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/TabletTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "onTransform", "", "page", "Landroid/view/View;", "position", "", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: TabletTransformer.kt */
public class TabletTransformer extends ABaseTransformer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Camera OFFSET_CAMERA = new Camera();
    /* access modifiers changed from: private */
    public static final Matrix OFFSET_MATRIX = new Matrix();
    /* access modifiers changed from: private */
    public static final float[] OFFSET_TEMP_FLOAT = new float[2];
    private static final float ROT_MOD = 30.0f;

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float abs = (f < ((float) 0) ? ROT_MOD : -30.0f) * Math.abs(f);
        view.setTranslationX(Companion.getOffsetXForRotation(abs, view.getWidth(), view.getHeight()));
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(0.0f);
        view.setRotationY(abs);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/TabletTransformer$Companion;", "", "()V", "OFFSET_CAMERA", "Landroid/graphics/Camera;", "OFFSET_MATRIX", "Landroid/graphics/Matrix;", "OFFSET_TEMP_FLOAT", "", "ROT_MOD", "", "getOffsetXForRotation", "degrees", "width", "", "height", "library_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: TabletTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        public final float getOffsetXForRotation(float f, int i, int i2) {
            TabletTransformer.OFFSET_MATRIX.reset();
            TabletTransformer.OFFSET_CAMERA.save();
            TabletTransformer.OFFSET_CAMERA.rotateY(Math.abs(f));
            TabletTransformer.OFFSET_CAMERA.getMatrix(TabletTransformer.OFFSET_MATRIX);
            TabletTransformer.OFFSET_CAMERA.restore();
            TabletTransformer.OFFSET_MATRIX.preTranslate(((float) (-i)) * 0.5f, ((float) (-i2)) * 0.5f);
            float f2 = (float) i;
            float f3 = (float) i2;
            TabletTransformer.OFFSET_MATRIX.postTranslate(f2 * 0.5f, 0.5f * f3);
            TabletTransformer.OFFSET_TEMP_FLOAT[0] = f2;
            TabletTransformer.OFFSET_TEMP_FLOAT[1] = f3;
            TabletTransformer.OFFSET_MATRIX.mapPoints(TabletTransformer.OFFSET_TEMP_FLOAT);
            return (f2 - TabletTransformer.OFFSET_TEMP_FLOAT[0]) * (f > 0.0f ? 1.0f : -1.0f);
        }
    }
}
