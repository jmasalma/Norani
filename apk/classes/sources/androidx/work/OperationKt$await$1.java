package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", i = {}, l = {36}, m = "await", n = {}, s = {})
/* compiled from: Operation.kt */
final class OperationKt$await$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    OperationKt$await$1(Continuation<? super OperationKt$await$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OperationKt.await((Operation) null, (Continuation) this);
    }
}
