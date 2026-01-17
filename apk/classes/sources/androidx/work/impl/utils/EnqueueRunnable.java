package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import java.util.List;

public class EnqueueRunnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");

    private EnqueueRunnable() {
    }

    public static void enqueue(WorkContinuationImpl workContinuationImpl) {
        if (workContinuationImpl.hasCycles()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl + ")");
        } else if (addToDatabase(workContinuationImpl)) {
            scheduleWorkInBackground(workContinuationImpl);
        }
    }

    public static boolean addToDatabase(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), workContinuationImpl);
            boolean processContinuation = processContinuation(workContinuationImpl);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public static void scheduleWorkInBackground(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean z = false;
        if (parents != null) {
            for (WorkContinuationImpl next : parents) {
                if (!next.isEnqueued()) {
                    z |= processContinuation(next);
                } else {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", next.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuationImpl) | z;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r16, java.util.List<? extends androidx.work.WorkRequest> r17, java.lang.String[] r18, java.lang.String r19, androidx.work.ExistingWorkPolicy r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            androidx.work.Configuration r3 = r16.getConfiguration()
            androidx.work.Clock r3 = r3.getClock()
            long r3 = r3.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r16.getWorkDatabase()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x001f
            int r8 = r0.length
            if (r8 <= 0) goto L_0x001f
            r8 = r6
            goto L_0x0020
        L_0x001f:
            r8 = r7
        L_0x0020:
            if (r8 == 0) goto L_0x006c
            int r9 = r0.length
            r11 = r6
            r10 = r7
            r12 = r10
            r13 = r12
        L_0x0027:
            if (r10 >= r9) goto L_0x006f
            r14 = r0[r10]
            androidx.work.impl.model.WorkSpecDao r15 = r5.workSpecDao()
            androidx.work.impl.model.WorkSpec r15 = r15.getWorkSpec(r14)
            if (r15 != 0) goto L_0x0054
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Prerequisite "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.error(r1, r2)
            return r7
        L_0x0054:
            androidx.work.WorkInfo$State r14 = r15.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L_0x005c
            r15 = r6
            goto L_0x005d
        L_0x005c:
            r15 = r7
        L_0x005d:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L_0x0064
            r13 = r6
            goto L_0x0069
        L_0x0064:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L_0x0069
            r12 = r6
        L_0x0069:
            int r10 = r10 + 1
            goto L_0x0027
        L_0x006c:
            r11 = r6
            r12 = r7
            r13 = r12
        L_0x006f:
            boolean r9 = android.text.TextUtils.isEmpty(r19)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0153
            if (r8 != 0) goto L_0x0153
            androidx.work.impl.model.WorkSpecDao r10 = r5.workSpecDao()
            java.util.List r10 = r10.getWorkSpecIdAndStatesForName(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0153
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 == r14) goto L_0x00d5
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x008f
            goto L_0x00d5
        L_0x008f:
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r14) goto L_0x00b3
            java.util.Iterator r2 = r10.iterator()
        L_0x0097:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00b3
            java.lang.Object r14 = r2.next()
            androidx.work.impl.model.WorkSpec$IdAndState r14 = (androidx.work.impl.model.WorkSpec.IdAndState) r14
            androidx.work.WorkInfo$State r15 = r14.state
            androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.ENQUEUED
            if (r15 == r6) goto L_0x00b2
            androidx.work.WorkInfo$State r6 = r14.state
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.RUNNING
            if (r6 != r14) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r6 = 1
            goto L_0x0097
        L_0x00b2:
            return r7
        L_0x00b3:
            r6 = r16
            androidx.work.impl.utils.CancelWorkRunnable.forNameInline(r1, r6)
            androidx.work.impl.model.WorkSpecDao r2 = r5.workSpecDao()
            java.util.Iterator r10 = r10.iterator()
        L_0x00c0:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00d2
            java.lang.Object r14 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r14 = (androidx.work.impl.model.WorkSpec.IdAndState) r14
            java.lang.String r14 = r14.id
            r2.delete(r14)
            goto L_0x00c0
        L_0x00d2:
            r2 = 1
            goto L_0x0154
        L_0x00d5:
            r6 = r16
            androidx.work.impl.model.DependencyDao r8 = r5.dependencyDao()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00e4:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x011b
            java.lang.Object r15 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r15 = (androidx.work.impl.model.WorkSpec.IdAndState) r15
            java.lang.String r7 = r15.id
            boolean r7 = r8.hasDependents(r7)
            if (r7 != 0) goto L_0x0117
            androidx.work.WorkInfo$State r7 = r15.state
            androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r6) goto L_0x0100
            r6 = 1
            goto L_0x0101
        L_0x0100:
            r6 = 0
        L_0x0101:
            r6 = r6 & r11
            androidx.work.WorkInfo$State r7 = r15.state
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r11) goto L_0x010a
            r13 = 1
            goto L_0x0111
        L_0x010a:
            androidx.work.WorkInfo$State r7 = r15.state
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r11) goto L_0x0111
            r12 = 1
        L_0x0111:
            java.lang.String r7 = r15.id
            r14.add(r7)
            r11 = r6
        L_0x0117:
            r6 = r16
            r7 = 0
            goto L_0x00e4
        L_0x011b:
            androidx.work.ExistingWorkPolicy r6 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0147
            if (r12 != 0) goto L_0x0123
            if (r13 == 0) goto L_0x0147
        L_0x0123:
            androidx.work.impl.model.WorkSpecDao r2 = r5.workSpecDao()
            java.util.List r6 = r2.getWorkSpecIdAndStatesForName(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x012f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0141
            java.lang.Object r7 = r6.next()
            androidx.work.impl.model.WorkSpec$IdAndState r7 = (androidx.work.impl.model.WorkSpec.IdAndState) r7
            java.lang.String r7 = r7.id
            r2.delete(r7)
            goto L_0x012f
        L_0x0141:
            java.util.List r14 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0147:
            java.lang.Object[] r0 = r14.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0152
            r8 = 1
            goto L_0x0153
        L_0x0152:
            r8 = 0
        L_0x0153:
            r2 = 0
        L_0x0154:
            java.util.Iterator r6 = r17.iterator()
        L_0x0158:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01e5
            java.lang.Object r7 = r6.next()
            androidx.work.WorkRequest r7 = (androidx.work.WorkRequest) r7
            androidx.work.impl.model.WorkSpec r10 = r7.getWorkSpec()
            if (r8 == 0) goto L_0x017f
            if (r11 != 0) goto L_0x017f
            if (r13 == 0) goto L_0x0173
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.FAILED
            r10.state = r14
            goto L_0x0181
        L_0x0173:
            if (r12 == 0) goto L_0x017a
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.CANCELLED
            r10.state = r14
            goto L_0x0181
        L_0x017a:
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo.State.BLOCKED
            r10.state = r14
            goto L_0x0181
        L_0x017f:
            r10.lastEnqueueTime = r3
        L_0x0181:
            androidx.work.WorkInfo$State r14 = r10.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 != r15) goto L_0x0188
            r2 = 1
        L_0x0188:
            androidx.work.impl.model.WorkSpecDao r14 = r5.workSpecDao()
            java.util.List r15 = r16.getSchedulers()
            androidx.work.impl.model.WorkSpec r10 = androidx.work.impl.utils.EnqueueUtilsKt.wrapWorkSpecIfNeeded(r15, r10)
            r14.insertWorkSpec(r10)
            if (r8 == 0) goto L_0x01ba
            int r10 = r0.length
            r14 = 0
        L_0x019b:
            if (r14 >= r10) goto L_0x01ba
            r15 = r0[r14]
            r18 = r0
            androidx.work.impl.model.Dependency r0 = new androidx.work.impl.model.Dependency
            r17 = r2
            java.lang.String r2 = r7.getStringId()
            r0.<init>(r2, r15)
            androidx.work.impl.model.DependencyDao r2 = r5.dependencyDao()
            r2.insertDependency(r0)
            int r14 = r14 + 1
            r2 = r17
            r0 = r18
            goto L_0x019b
        L_0x01ba:
            r18 = r0
            r17 = r2
            androidx.work.impl.model.WorkTagDao r0 = r5.workTagDao()
            java.lang.String r2 = r7.getStringId()
            java.util.Set r10 = r7.getTags()
            r0.insertTags(r2, r10)
            if (r9 == 0) goto L_0x01df
            androidx.work.impl.model.WorkNameDao r0 = r5.workNameDao()
            androidx.work.impl.model.WorkName r2 = new androidx.work.impl.model.WorkName
            java.lang.String r7 = r7.getStringId()
            r2.<init>(r1, r7)
            r0.insert(r2)
        L_0x01df:
            r2 = r17
            r0 = r18
            goto L_0x0158
        L_0x01e5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }
}
