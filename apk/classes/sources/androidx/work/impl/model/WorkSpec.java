package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0002\n\u0002\b\u0006\b\b\u0018\u0000 ]2\u00020\u0001:\u0003]^_B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0002\u0010\bBó\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010$\u001a\u00020\u0011\u0012\b\b\u0002\u0010%\u001a\u00020\u0017\u0012\b\b\u0002\u0010&\u001a\u00020\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010(J\u0006\u0010<\u001a\u00020\u0011J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0015HÆ\u0003J\t\u0010?\u001a\u00020\u0017HÆ\u0003J\t\u0010@\u001a\u00020\u0019HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\t\u0010E\u001a\u00020\u001fHÆ\u0003J\t\u0010F\u001a\u00020!HÆ\u0003J\t\u0010G\u001a\u00020\u0017HÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J\t\u0010J\u001a\u00020\u0011HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u0017HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u000eHÆ\u0003J\t\u0010Q\u001a\u00020\u000eHÆ\u0003J\t\u0010R\u001a\u00020\u0011HÆ\u0003J\t\u0010S\u001a\u00020\u0011HÆ\u0003J\t\u0010T\u001a\u00020\u0011HÆ\u0003Jû\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00172\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010V\u001a\u00020\u001f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010W\u001a\u00020\u001fJ\t\u0010X\u001a\u00020\u0017HÖ\u0001J\u000e\u0010Y\u001a\u00020Z2\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010[\u001a\u00020Z2\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010[\u001a\u00020Z2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\\\u001a\u00020\u0003H\u0016R\u0012\u0010\u001a\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0012\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010$\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010%\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010*\"\u0004\b3\u00104R\u0012\u0010 \u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u00104R\u0012\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R \u0010'\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0012\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "", "id", "", "workerClassName_", "(Ljava/lang/String;Ljava/lang/String;)V", "newId", "other", "(Ljava/lang/String;Landroidx/work/impl/model/WorkSpec;)V", "state", "Landroidx/work/WorkInfo$State;", "workerClassName", "inputMergerClassName", "input", "Landroidx/work/Data;", "output", "initialDelay", "", "intervalDuration", "flexDuration", "constraints", "Landroidx/work/Constraints;", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "minimumRetentionDuration", "scheduleRequestedAt", "expedited", "", "outOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "periodCount", "generation", "nextScheduleTimeOverride", "nextScheduleTimeOverrideGeneration", "stopReason", "traceTag", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Ljava/lang/String;Ljava/lang/String;Landroidx/work/Data;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJJJZLandroidx/work/OutOfQuotaPolicy;IIJIILjava/lang/String;)V", "getGeneration", "()I", "isBackedOff", "()Z", "isPeriodic", "getNextScheduleTimeOverride", "()J", "setNextScheduleTimeOverride", "(J)V", "getNextScheduleTimeOverrideGeneration", "setNextScheduleTimeOverrideGeneration", "(I)V", "getPeriodCount", "setPeriodCount", "getStopReason", "getTraceTag", "()Ljava/lang/String;", "setTraceTag", "(Ljava/lang/String;)V", "calculateNextRunTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hasConstraints", "hashCode", "setBackoffDelayDuration", "", "setPeriodic", "toString", "Companion", "IdAndState", "WorkInfoPojo", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkSpec.kt */
public final class WorkSpec {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new WorkSpec$$ExternalSyntheticLambda0();
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    private long nextScheduleTimeOverride;
    private int nextScheduleTimeOverrideGeneration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    private final int stopReason;
    private String traceTag;
    public String workerClassName;

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state2, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy2, int i2, int i3, long j8, int i4, int i5, String str4, int i6, Object obj) {
        WorkSpec workSpec2 = workSpec;
        int i7 = i6;
        String str5 = (i7 & 1) != 0 ? workSpec2.id : str;
        WorkInfo.State state3 = (i7 & 2) != 0 ? workSpec2.state : state2;
        String str6 = (i7 & 4) != 0 ? workSpec2.workerClassName : str2;
        String str7 = (i7 & 8) != 0 ? workSpec2.inputMergerClassName : str3;
        Data data3 = (i7 & 16) != 0 ? workSpec2.input : data;
        Data data4 = (i7 & 32) != 0 ? workSpec2.output : data2;
        long j9 = (i7 & 64) != 0 ? workSpec2.initialDelay : j;
        long j10 = (i7 & 128) != 0 ? workSpec2.intervalDuration : j2;
        long j11 = (i7 & 256) != 0 ? workSpec2.flexDuration : j3;
        Constraints constraints3 = (i7 & 512) != 0 ? workSpec2.constraints : constraints2;
        return workSpec.copy(str5, state3, str6, str7, data3, data4, j9, j10, j11, constraints3, (i7 & 1024) != 0 ? workSpec2.runAttemptCount : i, (i7 & 2048) != 0 ? workSpec2.backoffPolicy : backoffPolicy2, (i7 & 4096) != 0 ? workSpec2.backoffDelayDuration : j4, (i7 & 8192) != 0 ? workSpec2.lastEnqueueTime : j5, (i7 & 16384) != 0 ? workSpec2.minimumRetentionDuration : j6, (i7 & 32768) != 0 ? workSpec2.scheduleRequestedAt : j7, (i7 & 65536) != 0 ? workSpec2.expedited : z, (131072 & i7) != 0 ? workSpec2.outOfQuotaPolicy : outOfQuotaPolicy2, (i7 & 262144) != 0 ? workSpec2.periodCount : i2, (i7 & 524288) != 0 ? workSpec2.generation : i3, (i7 & 1048576) != 0 ? workSpec2.nextScheduleTimeOverride : j8, (i7 & 2097152) != 0 ? workSpec2.nextScheduleTimeOverrideGeneration : i4, (4194304 & i7) != 0 ? workSpec2.stopReason : i5, (i7 & 8388608) != 0 ? workSpec2.traceTag : str4);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component24() {
        return this.traceTag;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String str, WorkInfo.State state2, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy2, int i2, int i3, long j8, int i4, int i5, String str4) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str5, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(str2, "workerClassName");
        Intrinsics.checkNotNullParameter(str3, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(data, "input");
        Intrinsics.checkNotNullParameter(data2, "output");
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy2, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy2, "outOfQuotaPolicy");
        return new WorkSpec(str5, state2, str2, str3, data, data2, j, j2, j3, constraints2, i, backoffPolicy2, j4, j5, j6, j7, z, outOfQuotaPolicy2, i2, i3, j8, i4, i5, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return Intrinsics.areEqual(this.id, workSpec.id) && this.state == workSpec.state && Intrinsics.areEqual(this.workerClassName, workSpec.workerClassName) && Intrinsics.areEqual(this.inputMergerClassName, workSpec.inputMergerClassName) && Intrinsics.areEqual(this.input, workSpec.input) && Intrinsics.areEqual(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && Intrinsics.areEqual(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && Intrinsics.areEqual(this.traceTag, workSpec.traceTag);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.workerClassName.hashCode()) * 31) + this.inputMergerClassName.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Long.hashCode(this.minimumRetentionDuration)) * 31) + Long.hashCode(this.scheduleRequestedAt)) * 31) + Boolean.hashCode(this.expedited)) * 31) + this.outOfQuotaPolicy.hashCode()) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.nextScheduleTimeOverrideGeneration)) * 31) + Integer.hashCode(this.stopReason)) * 31;
        String str = this.traceTag;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public WorkSpec(String str, WorkInfo.State state2, String str2, String str3, Data data, Data data2, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, long j6, long j7, boolean z, OutOfQuotaPolicy outOfQuotaPolicy2, int i2, int i3, long j8, int i4, int i5, String str4) {
        Data data3 = data;
        Data data4 = data2;
        Constraints constraints3 = constraints2;
        BackoffPolicy backoffPolicy3 = backoffPolicy2;
        OutOfQuotaPolicy outOfQuotaPolicy3 = outOfQuotaPolicy2;
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(str2, "workerClassName");
        Intrinsics.checkNotNullParameter(str3, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(data3, "input");
        Intrinsics.checkNotNullParameter(data4, "output");
        Intrinsics.checkNotNullParameter(constraints3, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy3, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy3, "outOfQuotaPolicy");
        this.id = str;
        this.state = state2;
        this.workerClassName = str2;
        this.inputMergerClassName = str3;
        this.input = data3;
        this.output = data4;
        this.initialDelay = j;
        this.intervalDuration = j2;
        this.flexDuration = j3;
        this.constraints = constraints3;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy3;
        this.backoffDelayDuration = j4;
        this.lastEnqueueTime = j5;
        this.minimumRetentionDuration = j6;
        this.scheduleRequestedAt = j7;
        this.expedited = z;
        this.outOfQuotaPolicy = outOfQuotaPolicy3;
        this.periodCount = i2;
        this.generation = i3;
        this.nextScheduleTimeOverride = j8;
        this.nextScheduleTimeOverrideGeneration = i4;
        this.stopReason = i5;
        this.traceTag = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WorkSpec(java.lang.String r36, androidx.work.WorkInfo.State r37, java.lang.String r38, java.lang.String r39, androidx.work.Data r40, androidx.work.Data r41, long r42, long r44, long r46, androidx.work.Constraints r48, int r49, androidx.work.BackoffPolicy r50, long r51, long r53, long r55, long r57, boolean r59, androidx.work.OutOfQuotaPolicy r60, int r61, int r62, long r63, int r65, int r66, java.lang.String r67, int r68, kotlin.jvm.internal.DefaultConstructorMarker r69) {
        /*
            r35 = this;
            r0 = r68
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r37
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001d
            java.lang.Class<androidx.work.OverwritingInputMerger> r1 = androidx.work.OverwritingInputMerger.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "OverwritingInputMerger::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r6 = r1
            goto L_0x001f
        L_0x001d:
            r6 = r39
        L_0x001f:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0027
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r7 = r1
            goto L_0x0029
        L_0x0027:
            r7 = r40
        L_0x0029:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0031
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r8 = r1
            goto L_0x0033
        L_0x0031:
            r8 = r41
        L_0x0033:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x003b
            r9 = r2
            goto L_0x003d
        L_0x003b:
            r9 = r42
        L_0x003d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0043
            r11 = r2
            goto L_0x0045
        L_0x0043:
            r11 = r44
        L_0x0045:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004b
            r13 = r2
            goto L_0x004d
        L_0x004b:
            r13 = r46
        L_0x004d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0055
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r15 = r1
            goto L_0x0057
        L_0x0055:
            r15 = r48
        L_0x0057:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005f
            r16 = r5
            goto L_0x0061
        L_0x005f:
            r16 = r49
        L_0x0061:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x006a
            androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.EXPONENTIAL
            r17 = r1
            goto L_0x006c
        L_0x006a:
            r17 = r50
        L_0x006c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0073
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0075
        L_0x0073:
            r18 = r51
        L_0x0075:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            r20 = -1
            if (r1 == 0) goto L_0x007e
            r22 = r20
            goto L_0x0080
        L_0x007e:
            r22 = r53
        L_0x0080:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0087
            r24 = r2
            goto L_0x0089
        L_0x0087:
            r24 = r55
        L_0x0089:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r26 = r20
            goto L_0x0094
        L_0x0092:
            r26 = r57
        L_0x0094:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009b
            r1 = r5
            goto L_0x009d
        L_0x009b:
            r1 = r59
        L_0x009d:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00a7
            androidx.work.OutOfQuotaPolicy r2 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r28 = r2
            goto L_0x00a9
        L_0x00a7:
            r28 = r60
        L_0x00a9:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b1
            r29 = r5
            goto L_0x00b3
        L_0x00b1:
            r29 = r61
        L_0x00b3:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00bb
            r30 = r5
            goto L_0x00bd
        L_0x00bb:
            r30 = r62
        L_0x00bd:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00ca
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = r2
            goto L_0x00cc
        L_0x00ca:
            r31 = r63
        L_0x00cc:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d4
            r33 = r5
            goto L_0x00d6
        L_0x00d4:
            r33 = r65
        L_0x00d6:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00e0
            r2 = -256(0xffffffffffffff00, float:NaN)
            r34 = r2
            goto L_0x00e2
        L_0x00e0:
            r34 = r66
        L_0x00e2:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x00e9
            r0 = 0
            goto L_0x00eb
        L_0x00e9:
            r0 = r67
        L_0x00eb:
            r2 = r35
            r3 = r36
            r5 = r38
            r20 = r22
            r22 = r24
            r24 = r26
            r26 = r1
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r32 = r33
            r33 = r34
            r34 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29, r30, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int getPeriodCount() {
        return this.periodCount;
    }

    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    public final void setNextScheduleTimeOverride(long j) {
        this.nextScheduleTimeOverride = j;
    }

    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public final String getTraceTag() {
        return this.traceTag;
    }

    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkSpec(String str, String str2) {
        this(str, (WorkInfo.State) null, str2, (String) null, (Data) null, (Data) null, 0, 0, 0, (Constraints) null, 0, (BackoffPolicy) null, 0, 0, 0, 0, false, (OutOfQuotaPolicy) null, 0, 0, 0, 0, 0, (String) null, 16777210, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WorkSpec(java.lang.String r39, androidx.work.impl.model.WorkSpec r40) {
        /*
            r38 = this;
            r0 = r40
            r1 = r38
            r2 = r39
            java.lang.String r3 = "newId"
            r4 = r39
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r4 = r0.workerClassName
            androidx.work.WorkInfo$State r3 = r0.state
            java.lang.String r5 = r0.inputMergerClassName
            androidx.work.Data r7 = new androidx.work.Data
            r6 = r7
            androidx.work.Data r8 = r0.input
            r7.<init>((androidx.work.Data) r8)
            androidx.work.Data r8 = new androidx.work.Data
            r7 = r8
            androidx.work.Data r9 = r0.output
            r8.<init>((androidx.work.Data) r9)
            long r8 = r0.initialDelay
            long r10 = r0.intervalDuration
            long r12 = r0.flexDuration
            androidx.work.Constraints r15 = new androidx.work.Constraints
            r14 = r15
            r36 = r1
            androidx.work.Constraints r1 = r0.constraints
            r15.<init>(r1)
            int r15 = r0.runAttemptCount
            androidx.work.BackoffPolicy r1 = r0.backoffPolicy
            r16 = r1
            r37 = r2
            long r1 = r0.backoffDelayDuration
            r17 = r1
            long r1 = r0.lastEnqueueTime
            r19 = r1
            long r1 = r0.minimumRetentionDuration
            r21 = r1
            long r1 = r0.scheduleRequestedAt
            r23 = r1
            boolean r1 = r0.expedited
            r25 = r1
            androidx.work.OutOfQuotaPolicy r1 = r0.outOfQuotaPolicy
            r26 = r1
            int r1 = r0.periodCount
            r27 = r1
            long r1 = r0.nextScheduleTimeOverride
            r29 = r1
            int r1 = r0.nextScheduleTimeOverrideGeneration
            r31 = r1
            int r1 = r0.stopReason
            r32 = r1
            java.lang.String r0 = r0.traceTag
            r33 = r0
            r34 = 524288(0x80000, float:7.34684E-40)
            r35 = 0
            r28 = 0
            r1 = r36
            r2 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.impl.model.WorkSpec):void");
    }

    public final void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j < WorkRequest.MIN_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = RangesKt.coerceIn(j, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    public final void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        setPeriodic(RangesKt.coerceAtLeast(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS), RangesKt.coerceAtLeast(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS));
    }

    public final void setPeriodic(long j, long j2) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.intervalDuration = RangesKt.coerceAtLeast(j, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
        if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.flexDuration = RangesKt.coerceIn(j2, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public final long calculateNextRunTime() {
        Companion companion = Companion;
        return companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final boolean hasConstraints() {
        return !Intrinsics.areEqual(Constraints.NONE, this.constraints);
    }

    public String toString() {
        return "{WorkSpec: " + this.id + '}';
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/model/WorkSpec$IdAndState;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkSpec.kt */
    public static final class IdAndState {
        public String id;
        public WorkInfo.State state;

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state2 = idAndState.state;
            }
            return idAndState.copy(str, state2);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String str, WorkInfo.State state2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state2, "state");
            return new IdAndState(str, state2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return Intrinsics.areEqual(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }

        public IdAndState(String str, WorkInfo.State state2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state2, "state");
            this.id = str;
            this.state = state2;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\u0010\u001bJ\b\u0010@\u001a\u00020\tH\u0002J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\u000fHÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J¿\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019HÆ\u0001J\u0013\u0010S\u001a\u00020.2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010U\u001a\u0004\u0018\u00010VH\u0002J\t\u0010W\u001a\u00020\u000fHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001J\u0006\u0010Y\u001a\u00020ZR\u001e\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0015\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b-\u0010/R\u0011\u00100\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u001e\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010(\"\u0004\b7\u00108R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u0017\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010:¨\u0006["}, d2 = {"Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "", "id", "", "state", "Landroidx/work/WorkInfo$State;", "output", "Landroidx/work/Data;", "initialDelay", "", "intervalDuration", "flexDuration", "constraints", "Landroidx/work/Constraints;", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "generation", "nextScheduleTimeOverride", "stopReason", "tags", "", "progress", "(Ljava/lang/String;Landroidx/work/WorkInfo$State;Landroidx/work/Data;JJJLandroidx/work/Constraints;ILandroidx/work/BackoffPolicy;JJIIJILjava/util/List;Ljava/util/List;)V", "getBackoffDelayDuration", "()J", "setBackoffDelayDuration", "(J)V", "getBackoffPolicy", "()Landroidx/work/BackoffPolicy;", "setBackoffPolicy", "(Landroidx/work/BackoffPolicy;)V", "getConstraints", "()Landroidx/work/Constraints;", "getFlexDuration", "getGeneration", "()I", "getId", "()Ljava/lang/String;", "getInitialDelay", "getIntervalDuration", "isBackedOff", "", "()Z", "isPeriodic", "getLastEnqueueTime", "setLastEnqueueTime", "getNextScheduleTimeOverride", "getOutput", "()Landroidx/work/Data;", "getPeriodCount", "setPeriodCount", "(I)V", "getProgress", "()Ljava/util/List;", "getRunAttemptCount", "getState", "()Landroidx/work/WorkInfo$State;", "getStopReason", "getTags", "calculateNextRunTimeMillis", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getPeriodicityOrNull", "Landroidx/work/WorkInfo$PeriodicityInfo;", "hashCode", "toString", "toWorkInfo", "Landroidx/work/WorkInfo;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkSpec.kt */
    public static final class WorkInfoPojo {
        private long backoffDelayDuration;
        private BackoffPolicy backoffPolicy;
        private final Constraints constraints;
        private final long flexDuration;
        private final int generation;
        private final String id;
        private final long initialDelay;
        private final long intervalDuration;
        private long lastEnqueueTime;
        private final long nextScheduleTimeOverride;
        private final Data output;
        private int periodCount;
        private final List<Data> progress;
        private final int runAttemptCount;
        private final WorkInfo.State state;
        private final int stopReason;
        private final List<String> tags;

        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state2, Data data, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2, int i5, Object obj) {
            WorkInfoPojo workInfoPojo2 = workInfoPojo;
            int i6 = i5;
            return workInfoPojo.copy((i6 & 1) != 0 ? workInfoPojo2.id : str, (i6 & 2) != 0 ? workInfoPojo2.state : state2, (i6 & 4) != 0 ? workInfoPojo2.output : data, (i6 & 8) != 0 ? workInfoPojo2.initialDelay : j, (i6 & 16) != 0 ? workInfoPojo2.intervalDuration : j2, (i6 & 32) != 0 ? workInfoPojo2.flexDuration : j3, (i6 & 64) != 0 ? workInfoPojo2.constraints : constraints2, (i6 & 128) != 0 ? workInfoPojo2.runAttemptCount : i, (i6 & 256) != 0 ? workInfoPojo2.backoffPolicy : backoffPolicy2, (i6 & 512) != 0 ? workInfoPojo2.backoffDelayDuration : j4, (i6 & 1024) != 0 ? workInfoPojo2.lastEnqueueTime : j5, (i6 & 2048) != 0 ? workInfoPojo2.periodCount : i2, (i6 & 4096) != 0 ? workInfoPojo2.generation : i3, (i6 & 8192) != 0 ? workInfoPojo2.nextScheduleTimeOverride : j6, (i6 & 16384) != 0 ? workInfoPojo2.stopReason : i4, (32768 & i6) != 0 ? workInfoPojo2.tags : list, (i6 & 65536) != 0 ? workInfoPojo2.progress : list2);
        }

        public final String component1() {
            return this.id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String str, WorkInfo.State state2, Data data, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, int i2, int i3, long j6, int i4, List<String> list, List<Data> list2) {
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "id");
            Intrinsics.checkNotNullParameter(state2, "state");
            Intrinsics.checkNotNullParameter(data, "output");
            Intrinsics.checkNotNullParameter(constraints2, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy2, "backoffPolicy");
            Intrinsics.checkNotNullParameter(list, "tags");
            Intrinsics.checkNotNullParameter(list2, NotificationCompat.CATEGORY_PROGRESS);
            return new WorkInfoPojo(str2, state2, data, j, j2, j3, constraints2, i, backoffPolicy2, j4, j5, i2, i3, j6, i4, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return Intrinsics.areEqual(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && Intrinsics.areEqual(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && Intrinsics.areEqual(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && Intrinsics.areEqual(this.tags, workInfoPojo.tags) && Intrinsics.areEqual(this.progress, workInfoPojo.progress);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.output.hashCode()) * 31) + Long.hashCode(this.initialDelay)) * 31) + Long.hashCode(this.intervalDuration)) * 31) + Long.hashCode(this.flexDuration)) * 31) + this.constraints.hashCode()) * 31) + Integer.hashCode(this.runAttemptCount)) * 31) + this.backoffPolicy.hashCode()) * 31) + Long.hashCode(this.backoffDelayDuration)) * 31) + Long.hashCode(this.lastEnqueueTime)) * 31) + Integer.hashCode(this.periodCount)) * 31) + Integer.hashCode(this.generation)) * 31) + Long.hashCode(this.nextScheduleTimeOverride)) * 31) + Integer.hashCode(this.stopReason)) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WorkInfoPojo(id=");
            sb.append(this.id).append(", state=").append(this.state).append(", output=").append(this.output).append(", initialDelay=").append(this.initialDelay).append(", intervalDuration=").append(this.intervalDuration).append(", flexDuration=").append(this.flexDuration).append(", constraints=").append(this.constraints).append(", runAttemptCount=").append(this.runAttemptCount).append(", backoffPolicy=").append(this.backoffPolicy).append(", backoffDelayDuration=").append(this.backoffDelayDuration).append(", lastEnqueueTime=").append(this.lastEnqueueTime).append(", periodCount=");
            sb.append(this.periodCount).append(", generation=").append(this.generation).append(", nextScheduleTimeOverride=").append(this.nextScheduleTimeOverride).append(", stopReason=").append(this.stopReason).append(", tags=").append(this.tags).append(", progress=").append(this.progress).append(')');
            return sb.toString();
        }

        public WorkInfoPojo(String str, WorkInfo.State state2, Data data, long j, long j2, long j3, Constraints constraints2, int i, BackoffPolicy backoffPolicy2, long j4, long j5, int i2, int i3, long j6, int i4, List<String> list, List<Data> list2) {
            Constraints constraints3 = constraints2;
            BackoffPolicy backoffPolicy3 = backoffPolicy2;
            List<String> list3 = list;
            List<Data> list4 = list2;
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(state2, "state");
            Intrinsics.checkNotNullParameter(data, "output");
            Intrinsics.checkNotNullParameter(constraints3, "constraints");
            Intrinsics.checkNotNullParameter(backoffPolicy3, "backoffPolicy");
            Intrinsics.checkNotNullParameter(list3, "tags");
            Intrinsics.checkNotNullParameter(list4, NotificationCompat.CATEGORY_PROGRESS);
            this.id = str;
            this.state = state2;
            this.output = data;
            this.initialDelay = j;
            this.intervalDuration = j2;
            this.flexDuration = j3;
            this.constraints = constraints3;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy3;
            this.backoffDelayDuration = j4;
            this.lastEnqueueTime = j5;
            this.periodCount = i2;
            this.generation = i3;
            this.nextScheduleTimeOverride = j6;
            this.stopReason = i4;
            this.tags = list3;
            this.progress = list4;
        }

        public final String getId() {
            return this.id;
        }

        public final WorkInfo.State getState() {
            return this.state;
        }

        public final Data getOutput() {
            return this.output;
        }

        public final long getInitialDelay() {
            return this.initialDelay;
        }

        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        public final long getFlexDuration() {
            return this.flexDuration;
        }

        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ WorkInfoPojo(java.lang.String r29, androidx.work.WorkInfo.State r30, androidx.work.Data r31, long r32, long r34, long r36, androidx.work.Constraints r38, int r39, androidx.work.BackoffPolicy r40, long r41, long r43, int r45, int r46, long r47, int r49, java.util.List r50, java.util.List r51, int r52, kotlin.jvm.internal.DefaultConstructorMarker r53) {
            /*
                r28 = this;
                r0 = r52
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x000a
                r8 = r2
                goto L_0x000c
            L_0x000a:
                r8 = r32
            L_0x000c:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0012
                r10 = r2
                goto L_0x0014
            L_0x0012:
                r10 = r34
            L_0x0014:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x001a
                r12 = r2
                goto L_0x001c
            L_0x001a:
                r12 = r36
            L_0x001c:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0025
                androidx.work.BackoffPolicy r1 = androidx.work.BackoffPolicy.EXPONENTIAL
                r16 = r1
                goto L_0x0027
            L_0x0025:
                r16 = r40
            L_0x0027:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0030
                r4 = 30000(0x7530, double:1.4822E-319)
                r17 = r4
                goto L_0x0032
            L_0x0030:
                r17 = r41
            L_0x0032:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0039
                r19 = r2
                goto L_0x003b
            L_0x0039:
                r19 = r43
            L_0x003b:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0043
                r0 = 0
                r21 = r0
                goto L_0x0045
            L_0x0043:
                r21 = r45
            L_0x0045:
                r4 = r28
                r5 = r29
                r6 = r30
                r7 = r31
                r14 = r38
                r15 = r39
                r22 = r46
                r23 = r47
                r25 = r49
                r26 = r50
                r27 = r51
                r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r22, r23, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpec.WorkInfoPojo.<init>(java.lang.String, androidx.work.WorkInfo$State, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, int, int, long, int, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        public final void setBackoffPolicy(BackoffPolicy backoffPolicy2) {
            Intrinsics.checkNotNullParameter(backoffPolicy2, "<set-?>");
            this.backoffPolicy = backoffPolicy2;
        }

        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        public final void setBackoffDelayDuration(long j) {
            this.backoffDelayDuration = j;
        }

        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        public final void setLastEnqueueTime(long j) {
            this.lastEnqueueTime = j;
        }

        public final int getPeriodCount() {
            return this.periodCount;
        }

        public final void setPeriodCount(int i) {
            this.periodCount = i;
        }

        public final int getGeneration() {
            return this.generation;
        }

        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        public final int getStopReason() {
            return this.stopReason;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final List<Data> getProgress() {
            return this.progress;
        }

        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        public final WorkInfo toWorkInfo() {
            Data data = this.progress.isEmpty() ^ true ? this.progress.get(0) : Data.EMPTY;
            UUID fromString = UUID.fromString(this.id);
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(id)");
            return new WorkInfo(fromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            if (this.intervalDuration != 0) {
                return new WorkInfo.PeriodicityInfo(this.intervalDuration, this.flexDuration);
            }
            return null;
        }

        private final long calculateNextRunTimeMillis() {
            return this.state == WorkInfo.State.ENQUEUED ? WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride) : LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\b8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/model/WorkSpec$Companion;", "", "()V", "SCHEDULE_NOT_REQUESTED_YET", "", "TAG", "", "WORK_INFO_MAPPER", "Landroidx/arch/core/util/Function;", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "Landroidx/work/WorkInfo;", "calculateNextRunTime", "isBackedOff", "", "runAttemptCount", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "backoffDelayDuration", "lastEnqueueTime", "periodCount", "isPeriodic", "initialDelay", "flexDuration", "intervalDuration", "nextScheduleTimeOverride", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkSpec.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long calculateNextRunTime(boolean z, int i, BackoffPolicy backoffPolicy, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
            long j7;
            int i3 = i;
            BackoffPolicy backoffPolicy2 = backoffPolicy;
            long j8 = j;
            long j9 = j6;
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            if (j9 != LocationRequestCompat.PASSIVE_INTERVAL && z2) {
                return i2 == 0 ? j9 : RangesKt.coerceAtLeast(j9, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS + j2);
            }
            if (z) {
                if (backoffPolicy2 == BackoffPolicy.LINEAR) {
                    j7 = ((long) i3) * j8;
                } else {
                    j7 = (long) Math.scalb((float) j8, i3 - 1);
                }
                return j2 + RangesKt.coerceAtMost(j7, WorkRequest.MAX_BACKOFF_MILLIS);
            } else if (z2) {
                long j10 = i2 == 0 ? j2 + j3 : j2 + j5;
                if (j4 != j5 && i2 == 0) {
                    j10 += j5 - j4;
                }
                return j10;
            } else if (j2 == -1) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            } else {
                return j2 + j3;
            }
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = tagWithPrefix;
    }

    /* access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        Iterable<WorkInfoPojo> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (WorkInfoPojo workInfo : iterable) {
            arrayList.add(workInfo.toWorkInfo());
        }
        return (List) arrayList;
    }
}
