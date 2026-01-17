package androidx.work;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Worker.kt */
final class Worker$startWork$1 extends Lambda implements Function0<ListenableWorker.Result> {
    final /* synthetic */ Worker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Worker$startWork$1(Worker worker) {
        super(0);
        this.this$0 = worker;
    }

    public final ListenableWorker.Result invoke() {
        return this.this$0.doWork();
    }
}
