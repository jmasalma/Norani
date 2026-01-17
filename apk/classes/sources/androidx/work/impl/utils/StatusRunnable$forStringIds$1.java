package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StatusRunnable.kt */
final class StatusRunnable$forStringIds$1 extends Lambda implements Function1<WorkDatabase, List<? extends WorkInfo>> {
    final /* synthetic */ List<String> $ids;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatusRunnable$forStringIds$1(List<String> list) {
        super(1);
        this.$ids = list;
    }

    public final List<WorkInfo> invoke(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "db");
        List<WorkInfo> apply = WorkSpec.WORK_INFO_MAPPER.apply(workDatabase.workSpecDao().getWorkStatusPojoForIds(this.$ids));
        Intrinsics.checkNotNullExpressionValue(apply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
        return apply;
    }
}
