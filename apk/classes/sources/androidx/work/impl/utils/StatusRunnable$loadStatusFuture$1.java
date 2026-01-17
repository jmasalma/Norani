package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StatusRunnable.kt */
final class StatusRunnable$loadStatusFuture$1 extends Lambda implements Function0<T> {
    final /* synthetic */ Function1<WorkDatabase, T> $block;
    final /* synthetic */ WorkDatabase $this_loadStatusFuture;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatusRunnable$loadStatusFuture$1(Function1<? super WorkDatabase, ? extends T> function1, WorkDatabase workDatabase) {
        super(0);
        this.$block = function1;
        this.$this_loadStatusFuture = workDatabase;
    }

    public final T invoke() {
        return this.$block.invoke(this.$this_loadStatusFuture);
    }
}
