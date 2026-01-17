package com.ToxicBakery.viewpager.transforms;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0014\u0010\u0003\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/RotateDownTransformer;", "Lcom/ToxicBakery/viewpager/transforms/ABaseTransformer;", "()V", "isPagingEnabled", "", "()Z", "onTransform", "", "page", "Landroid/view/View;", "position", "", "Companion", "library_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: RotateDownTransformer.kt */
public class RotateDownTransformer extends ABaseTransformer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final float ROT_MOD = 18.75f;

    /* access modifiers changed from: protected */
    public boolean isPagingEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onTransform(View view, float f) {
        Intrinsics.checkParameterIsNotNull(view, "page");
        float f2 = f * ROT_MOD;
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY((float) view.getHeight());
        view.setRotation(f2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ToxicBakery/viewpager/transforms/RotateDownTransformer$Companion;", "", "()V", "ROT_MOD", "", "library_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: RotateDownTransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
