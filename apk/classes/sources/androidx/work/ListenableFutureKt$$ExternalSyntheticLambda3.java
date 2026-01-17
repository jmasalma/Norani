package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        this.f$0 = atomicBoolean;
        this.f$1 = completer;
        this.f$2 = function0;
    }

    public final void run() {
        ListenableFutureKt.executeAsync$lambda$4$lambda$3(this.f$0, this.f$1, this.f$2);
    }
}
