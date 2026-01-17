package androidx.work;

import androidx.core.app.NotificationCompat;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u0003123B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r¢\u0006\u0002\u0010\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010/\u001a\u00020\rH\u0016J\b\u00100\u001a\u00020\bH\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\f\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0016\u001a\u00020\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Landroidx/work/WorkInfo;", "", "id", "Ljava/util/UUID;", "state", "Landroidx/work/WorkInfo$State;", "tags", "", "", "outputData", "Landroidx/work/Data;", "progress", "runAttemptCount", "", "generation", "constraints", "Landroidx/work/Constraints;", "initialDelayMillis", "", "periodicityInfo", "Landroidx/work/WorkInfo$PeriodicityInfo;", "nextScheduleTimeMillis", "stopReason", "(Ljava/util/UUID;Landroidx/work/WorkInfo$State;Ljava/util/Set;Landroidx/work/Data;Landroidx/work/Data;IILandroidx/work/Constraints;JLandroidx/work/WorkInfo$PeriodicityInfo;JI)V", "getConstraints", "()Landroidx/work/Constraints;", "getGeneration", "()I", "getId", "()Ljava/util/UUID;", "getInitialDelayMillis", "()J", "getNextScheduleTimeMillis", "getOutputData", "()Landroidx/work/Data;", "getPeriodicityInfo", "()Landroidx/work/WorkInfo$PeriodicityInfo;", "getProgress", "getRunAttemptCount", "getState", "()Landroidx/work/WorkInfo$State;", "getStopReason", "getTags", "()Ljava/util/Set;", "equals", "", "other", "hashCode", "toString", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkInfo.kt */
public final class WorkInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set) {
        this(uuid, state2, set, (Data) null, (Data) null, 0, 0, (Constraints) null, 0, (PeriodicityInfo) null, 0, 0, 4088, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data) {
        this(uuid, state2, set, data, (Data) null, 0, 0, (Constraints) null, 0, (PeriodicityInfo) null, 0, 0, 4080, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2) {
        this(uuid, state2, set, data, data2, 0, 0, (Constraints) null, 0, (PeriodicityInfo) null, 0, 0, 4064, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i) {
        this(uuid, state2, set, data, data2, i, 0, (Constraints) null, 0, (PeriodicityInfo) null, 0, 0, 4032, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2) {
        this(uuid, state2, set, data, data2, i, i2, (Constraints) null, 0, (PeriodicityInfo) null, 0, 0, 3968, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints2) {
        this(uuid, state2, set, data, data2, i, i2, constraints2, 0, (PeriodicityInfo) null, 0, 0, 3840, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints2, long j) {
        this(uuid, state2, set, data, data2, i, i2, constraints2, j, (PeriodicityInfo) null, 0, 0, 3584, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints2, long j, PeriodicityInfo periodicityInfo2) {
        this(uuid, state2, set, data, data2, i, i2, constraints2, j, periodicityInfo2, 0, 0, 3072, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints2, long j, PeriodicityInfo periodicityInfo2, long j2) {
        this(uuid, state2, set, data, data2, i, i2, constraints2, j, periodicityInfo2, j2, 0, 2048, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
    }

    public WorkInfo(UUID uuid, State state2, Set<String> set, Data data, Data data2, int i, int i2, Constraints constraints2, long j, PeriodicityInfo periodicityInfo2, long j2, int i3) {
        Intrinsics.checkNotNullParameter(uuid, "id");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(set, "tags");
        Intrinsics.checkNotNullParameter(data, "outputData");
        Intrinsics.checkNotNullParameter(data2, NotificationCompat.CATEGORY_PROGRESS);
        Intrinsics.checkNotNullParameter(constraints2, "constraints");
        this.id = uuid;
        this.state = state2;
        this.tags = set;
        this.outputData = data;
        this.progress = data2;
        this.runAttemptCount = i;
        this.generation = i2;
        this.constraints = constraints2;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo2;
        this.nextScheduleTimeMillis = j2;
        this.stopReason = i3;
    }

    public final UUID getId() {
        return this.id;
    }

    public final State getState() {
        return this.state;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WorkInfo(java.util.UUID r18, androidx.work.WorkInfo.State r19, java.util.Set r20, androidx.work.Data r21, androidx.work.Data r22, int r23, int r24, androidx.work.Constraints r25, long r26, androidx.work.WorkInfo.PeriodicityInfo r28, long r29, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r6 = r1
            goto L_0x000c
        L_0x000a:
            r6 = r21
        L_0x000c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0014
            androidx.work.Data r1 = androidx.work.Data.EMPTY
            r7 = r1
            goto L_0x0016
        L_0x0014:
            r7 = r22
        L_0x0016:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r8 = r2
            goto L_0x001f
        L_0x001d:
            r8 = r23
        L_0x001f:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0025
            r9 = r2
            goto L_0x0027
        L_0x0025:
            r9 = r24
        L_0x0027:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002f
            androidx.work.Constraints r1 = androidx.work.Constraints.NONE
            r10 = r1
            goto L_0x0031
        L_0x002f:
            r10 = r25
        L_0x0031:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r1 = 0
            r11 = r1
            goto L_0x003b
        L_0x0039:
            r11 = r26
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            r13 = r1
            goto L_0x0044
        L_0x0042:
            r13 = r28
        L_0x0044:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004f
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = r1
            goto L_0x0051
        L_0x004f:
            r14 = r29
        L_0x0051:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005a
            r0 = -256(0xffffffffffffff00, float:NaN)
            r16 = r0
            goto L_0x005c
        L_0x005a:
            r16 = r31
        L_0x005c:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Data getOutputData() {
        return this.outputData;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final Constraints getConstraints() {
        return this.constraints;
    }

    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    public final int getStopReason() {
        return this.stopReason;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && Intrinsics.areEqual(this.id, workInfo.id) && this.state == workInfo.state && Intrinsics.areEqual(this.outputData, workInfo.outputData) && Intrinsics.areEqual(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && Intrinsics.areEqual(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && Intrinsics.areEqual(this.tags, workInfo.tags)) {
            return Intrinsics.areEqual(this.progress, workInfo.progress);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.id.hashCode() * 31) + this.state.hashCode()) * 31) + this.outputData.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.runAttemptCount) * 31) + this.generation) * 31) + this.constraints.hashCode()) * 31) + Long.hashCode(this.initialDelayMillis)) * 31;
        PeriodicityInfo periodicityInfo2 = this.periodicityInfo;
        return ((((hashCode + (periodicityInfo2 != null ? periodicityInfo2.hashCode() : 0)) * 31) + Long.hashCode(this.nextScheduleTimeMillis)) * 31) + Integer.hashCode(this.stopReason);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{id='");
        sb.append(this.id).append("', state=").append(this.state).append(", outputData=").append(this.outputData).append(", tags=").append(this.tags).append(", progress=").append(this.progress).append(", runAttemptCount=").append(this.runAttemptCount).append(", generation=").append(this.generation).append(", constraints=").append(this.constraints).append(", initialDelayMillis=").append(this.initialDelayMillis).append(", periodicityInfo=").append(this.periodicityInfo).append(", nextScheduleTimeMillis=").append(this.nextScheduleTimeMillis).append("}, stopReason=");
        sb.append(this.stopReason);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "(Ljava/lang/String;I)V", "isFinished", "", "()Z", "ENQUEUED", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkInfo.kt */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "repeatIntervalMillis", "", "flexIntervalMillis", "(JJ)V", "getFlexIntervalMillis", "()J", "getRepeatIntervalMillis", "equals", "", "other", "hashCode", "", "toString", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkInfo.kt */
    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        public PeriodicityInfo(long j, long j2) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j2;
        }

        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
                return false;
            }
            PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
            if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.repeatIntervalMillis) * 31) + Long.hashCode(this.flexIntervalMillis);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/work/WorkInfo$Companion;", "", "()V", "STOP_REASON_APP_STANDBY", "", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkInfo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
