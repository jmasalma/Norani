package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0000¢\u0006\u0002\u0010\r\u001a.\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0001\"\u0004\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0000¨\u0006\u0014"}, d2 = {"launchFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "start", "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/ListenableFuture;", "executeAsync", "V", "Ljava/util/concurrent/Executor;", "debugTag", "", "Lkotlin/Function0;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ListenableFuture.kt */
public final class ListenableFutureKt {
    public static /* synthetic */ ListenableFuture launchFuture$default(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = (CoroutineContext) EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return launchFuture(coroutineContext, coroutineStart, function2);
    }

    public static final <T> ListenableFuture<T> launchFuture(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Intrinsics.checkNotNullParameter(coroutineStart, "start");
        Intrinsics.checkNotNullParameter(function2, "block");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new ListenableFutureKt$$ExternalSyntheticLambda1(coroutineContext, coroutineStart, function2));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return future;
    }

    /* access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        completer.addCancellationListener(new ListenableFutureKt$$ExternalSyntheticLambda4(coroutineContext.get(Job.Key)), DirectExecutor.INSTANCE);
        return BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), (CoroutineContext) null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(function2, completer, (Continuation<? super ListenableFutureKt$launchFuture$1$2>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(Job job) {
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public static final <V> ListenableFuture<V> executeAsync(Executor executor, String str, Function0<? extends V> function0) {
        Intrinsics.checkNotNullParameter(executor, "<this>");
        Intrinsics.checkNotNullParameter(str, "debugTag");
        Intrinsics.checkNotNullParameter(function0, "block");
        ListenableFuture<V> future = CallbackToFutureAdapter.getFuture(new ListenableFutureKt$$ExternalSyntheticLambda0(executor, str, function0));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->… }\n        debugTag\n    }");
        return future;
    }

    /* access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, Function0 function0, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new ListenableFutureKt$$ExternalSyntheticLambda2(atomicBoolean), DirectExecutor.INSTANCE);
        executor.execute(new ListenableFutureKt$$ExternalSyntheticLambda3(atomicBoolean, completer, function0));
        return str;
    }

    /* access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$2(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0) {
        if (!atomicBoolean.get()) {
            try {
                completer.set(function0.invoke());
            } catch (Throwable th) {
                completer.setException(th);
            }
        }
    }
}
