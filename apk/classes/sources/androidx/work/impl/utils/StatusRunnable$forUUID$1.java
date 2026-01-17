package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/work/WorkInfo;", "db", "Landroidx/work/impl/WorkDatabase;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: StatusRunnable.kt */
final class StatusRunnable$forUUID$1 extends Lambda implements Function1<WorkDatabase, WorkInfo> {
    final /* synthetic */ UUID $id;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StatusRunnable$forUUID$1(UUID uuid) {
        super(1);
        this.$id = uuid;
    }

    public final WorkInfo invoke(WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "db");
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        String uuid = this.$id.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(uuid);
        if (workStatusPojoForId != null) {
            return workStatusPojoForId.toWorkInfo();
        }
        return null;
    }
}
