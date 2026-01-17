package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ CoroutineContext f$0;
    public final /* synthetic */ CoroutineStart f$1;
    public final /* synthetic */ Function2 f$2;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda1(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2) {
        this.f$0 = coroutineContext;
        this.f$1 = coroutineStart;
        this.f$2 = function2;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ListenableFutureKt.launchFuture$lambda$1(this.f$0, this.f$1, this.f$2, completer);
    }
}
