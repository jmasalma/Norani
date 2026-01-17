package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableFutureKt$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ListenableFutureKt$$ExternalSyntheticLambda0(Executor executor, String str, Function0 function0) {
        this.f$0 = executor;
        this.f$1 = str;
        this.f$2 = function0;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ListenableFutureKt.executeAsync$lambda$4(this.f$0, this.f$1, this.f$2, completer);
    }
}
