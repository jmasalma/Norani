package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WorkerKt$$ExternalSyntheticLambda2 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(Executor executor, Function0 function0) {
        this.f$0 = executor;
        this.f$1 = function0;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return WorkerKt.future$lambda$2(this.f$0, this.f$1, completer);
    }
}
