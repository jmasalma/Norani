package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "trackers", "Landroidx/work/impl/constraints/trackers/Trackers;", "(Landroidx/work/impl/constraints/trackers/Trackers;)V", "controllers", "", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "(Ljava/util/List;)V", "areAllConstraintsMet", "", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "track", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "spec", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkConstraintsTracker.kt */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    public WorkConstraintsTracker(List<? extends ConstraintController> list) {
        Intrinsics.checkNotNullParameter(list, "controllers");
        this.controllers = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WorkConstraintsTracker(androidx.work.impl.constraints.trackers.Trackers r4) {
        /*
            r3 = this;
            java.lang.String r0 = "trackers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 8
            androidx.work.impl.constraints.controllers.ConstraintController[] r0 = new androidx.work.impl.constraints.controllers.ConstraintController[r0]
            androidx.work.impl.constraints.controllers.BatteryChargingController r1 = new androidx.work.impl.constraints.controllers.BatteryChargingController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getBatteryChargingTracker()
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.BatteryNotLowController r1 = new androidx.work.impl.constraints.controllers.BatteryNotLowController
            androidx.work.impl.constraints.trackers.BatteryNotLowTracker r2 = r4.getBatteryNotLowTracker()
            r1.<init>(r2)
            r2 = 1
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.StorageNotLowController r1 = new androidx.work.impl.constraints.controllers.StorageNotLowController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getStorageNotLowTracker()
            r1.<init>(r2)
            r2 = 2
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.NetworkConnectedController r1 = new androidx.work.impl.constraints.controllers.NetworkConnectedController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getNetworkStateTracker()
            r1.<init>(r2)
            r2 = 3
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.NetworkUnmeteredController r1 = new androidx.work.impl.constraints.controllers.NetworkUnmeteredController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getNetworkStateTracker()
            r1.<init>(r2)
            r2 = 4
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.NetworkNotRoamingController r1 = new androidx.work.impl.constraints.controllers.NetworkNotRoamingController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getNetworkStateTracker()
            r1.<init>(r2)
            r2 = 5
            r0[r2] = r1
            androidx.work.impl.constraints.controllers.NetworkMeteredController r1 = new androidx.work.impl.constraints.controllers.NetworkMeteredController
            androidx.work.impl.constraints.trackers.ConstraintTracker r2 = r4.getNetworkStateTracker()
            r1.<init>(r2)
            r2 = 6
            r0[r2] = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x006c
            android.content.Context r4 = r4.getContext()
            androidx.work.impl.constraints.NetworkRequestConstraintController r4 = androidx.work.impl.constraints.WorkConstraintsTrackerKt.NetworkRequestConstraintController(r4)
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            r1 = 7
            r0[r1] = r4
            java.util.List r4 = kotlin.collections.CollectionsKt.listOfNotNull(r0)
            r3.<init>((java.util.List<? extends androidx.work.impl.constraints.controllers.ConstraintController>) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.WorkConstraintsTracker.<init>(androidx.work.impl.constraints.trackers.Trackers):void");
    }

    public final Flow<ConstraintsState> track(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "spec");
        Collection arrayList = new ArrayList();
        for (Object next : this.controllers) {
            if (((ConstraintController) next).hasConstraint(workSpec)) {
                arrayList.add(next);
            }
        }
        Iterable<ConstraintController> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ConstraintController track : iterable) {
            arrayList2.add(track.track(workSpec.constraints));
        }
        return FlowKt.distinctUntilChanged(new WorkConstraintsTracker$track$$inlined$combine$1((Flow[]) CollectionsKt.toList((List) arrayList2).toArray(new Flow[0])));
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Collection arrayList = new ArrayList();
        for (Object next : this.controllers) {
            if (((ConstraintController) next).isCurrentlyConstrained(workSpec)) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        if (!list.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + CollectionsKt.joinToString$default(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, WorkConstraintsTracker$areAllConstraintsMet$1.INSTANCE, 31, (Object) null));
        }
        return list.isEmpty();
    }
}
