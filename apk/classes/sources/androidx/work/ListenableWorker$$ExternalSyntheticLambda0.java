package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ListenableWorker$$ExternalSyntheticLambda0 implements CallbackToFutureAdapter.Resolver {
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return completer.setException(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
    }
}
