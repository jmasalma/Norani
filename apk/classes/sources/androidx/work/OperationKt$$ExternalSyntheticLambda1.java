package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class OperationKt$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Tracer f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ MutableLiveData f$3;
    public final /* synthetic */ CallbackToFutureAdapter.Completer f$4;

    public /* synthetic */ OperationKt$$ExternalSyntheticLambda1(Tracer tracer, String str, Function0 function0, MutableLiveData mutableLiveData, CallbackToFutureAdapter.Completer completer) {
        this.f$0 = tracer;
        this.f$1 = str;
        this.f$2 = function0;
        this.f$3 = mutableLiveData;
        this.f$4 = completer;
    }

    public final void run() {
        OperationKt.launchOperation$lambda$2$lambda$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
    }
}
