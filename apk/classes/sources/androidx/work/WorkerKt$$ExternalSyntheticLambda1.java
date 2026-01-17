package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkerKt$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        this.f$0 = atomicBoolean;
        this.f$1 = completer;
        this.f$2 = function0;
    }

    public final void run() {
        WorkerKt.future$lambda$2$lambda$1(this.f$0, this.f$1, this.f$2);
    }
}
