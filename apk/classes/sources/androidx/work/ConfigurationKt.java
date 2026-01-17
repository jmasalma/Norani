package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT", "", "createDefaultExecutor", "Ljava/util/concurrent/Executor;", "isTaskExecutor", "", "createDefaultTracer", "Landroidx/work/Tracer;", "asExecutor", "Lkotlin/coroutines/CoroutineContext;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Configuration.kt */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* access modifiers changed from: private */
    public static final Executor createDefaultExecutor(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ConfigurationKt$createDefaultExecutor$factory$1(z));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    /* access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new ConfigurationKt$createDefaultTracer$tracer$1();
    }

    /* access modifiers changed from: private */
    public static final Executor asExecutor(CoroutineContext coroutineContext) {
        ContinuationInterceptor continuationInterceptor = coroutineContext != null ? (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key) : null;
        CoroutineDispatcher coroutineDispatcher = continuationInterceptor instanceof CoroutineDispatcher ? (CoroutineDispatcher) continuationInterceptor : null;
        if (coroutineDispatcher != null) {
            return ExecutorsKt.asExecutor(coroutineDispatcher);
        }
        return null;
    }
}
