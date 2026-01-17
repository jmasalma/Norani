package androidx.work.impl;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"DELAY_MS", "", "MAX_DELAY_MS", "", "TAG", "", "maybeLaunchUnfinishedWorkListener", "", "Lkotlinx/coroutines/CoroutineScope;", "appContext", "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "db", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: UnfinishedWorkListener.kt */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    /* access modifiers changed from: private */
    public static final long MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1);
    /* access modifiers changed from: private */
    public static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = tagWithPrefix;
    }

    public static final void maybeLaunchUnfinishedWorkListener(CoroutineScope coroutineScope, Context context, Configuration configuration, WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workDatabase, "db");
        if (ProcessUtils.isDefaultProcess(context, configuration)) {
            FlowKt.launchIn(FlowKt.onEach(FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.retryWhen(workDatabase.workSpecDao().hasUnfinishedWorkFlow(), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1((Continuation<? super UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1>) null)))), new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(context, (Continuation<? super UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2>) null)), coroutineScope);
        }
    }
}
