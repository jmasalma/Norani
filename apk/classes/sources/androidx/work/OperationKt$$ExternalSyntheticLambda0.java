package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class OperationKt$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Executor f$0;
    public final /* synthetic */ Tracer f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ MutableLiveData f$4;

    public /* synthetic */ OperationKt$$ExternalSyntheticLambda0(Executor executor, Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData) {
        this.f$0 = executor;
        this.f$1 = tracer;
        this.f$2 = str;
        this.f$3 = function0;
        this.f$4 = mutableLiveData;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return OperationKt.launchOperation$lambda$2(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, completer);
    }
}
