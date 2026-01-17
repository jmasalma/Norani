package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlinx.coroutines.flow.Flow;

public final class WorkSpecDao_Impl implements WorkSpecDao {
    /* access modifiers changed from: private */
    public final RoomDatabase __db;
    private final EntityInsertionAdapter<WorkSpec> __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementGeneration;
    private final SharedSQLiteStatement __preparedStmtOfIncrementPeriodCount;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecNextScheduleTimeOverride;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetCancelledState;
    private final SharedSQLiteStatement __preparedStmtOfSetLastEnqueueTime;
    private final SharedSQLiteStatement __preparedStmtOfSetNextScheduleTimeOverride;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetState;
    private final SharedSQLiteStatement __preparedStmtOfSetStopReason;
    private final EntityDeletionOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* access modifiers changed from: protected */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                supportSQLiteStatement.bindString(1, workSpec.id);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, (long) WorkTypeConverters.stateToInt(workSpec.state));
                supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                supportSQLiteStatement.bindBlob(5, Data.toByteArrayInternalV1(workSpec.input));
                supportSQLiteStatement.bindBlob(6, Data.toByteArrayInternalV1(workSpec.output));
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, (long) workSpec.runAttemptCount);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(11, (long) WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1 : 0);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(17, (long) WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, (long) workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, (long) workSpec.getGeneration());
                supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
                supportSQLiteStatement.bindLong(21, (long) workSpec.getNextScheduleTimeOverrideGeneration());
                supportSQLiteStatement.bindLong(22, (long) workSpec.getStopReason());
                if (workSpec.getTraceTag() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, workSpec.getTraceTag());
                }
                Constraints constraints = workSpec.constraints;
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(24, (long) WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindBlob(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                supportSQLiteStatement.bindLong(26, constraints.requiresCharging() ? 1 : 0);
                supportSQLiteStatement.bindLong(27, constraints.requiresDeviceIdle() ? 1 : 0);
                supportSQLiteStatement.bindLong(28, constraints.requiresBatteryNotLow() ? 1 : 0);
                supportSQLiteStatement.bindLong(29, constraints.requiresStorageNotLow() ? 1 : 0);
                supportSQLiteStatement.bindLong(30, constraints.getContentTriggerUpdateDelayMillis());
                supportSQLiteStatement.bindLong(31, constraints.getContentTriggerMaxDelayMillis());
                WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindBlob(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeletionOrUpdateAdapter<WorkSpec>(roomDatabase) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                supportSQLiteStatement.bindString(1, workSpec.id);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, (long) WorkTypeConverters.stateToInt(workSpec.state));
                supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                supportSQLiteStatement.bindBlob(5, Data.toByteArrayInternalV1(workSpec.input));
                supportSQLiteStatement.bindBlob(6, Data.toByteArrayInternalV1(workSpec.output));
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, (long) workSpec.runAttemptCount);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(11, (long) WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1 : 0);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(17, (long) WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, (long) workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, (long) workSpec.getGeneration());
                supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
                supportSQLiteStatement.bindLong(21, (long) workSpec.getNextScheduleTimeOverrideGeneration());
                supportSQLiteStatement.bindLong(22, (long) workSpec.getStopReason());
                if (workSpec.getTraceTag() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, workSpec.getTraceTag());
                }
                Constraints constraints = workSpec.constraints;
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(24, (long) WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindBlob(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                supportSQLiteStatement.bindLong(26, constraints.requiresCharging() ? 1 : 0);
                supportSQLiteStatement.bindLong(27, constraints.requiresDeviceIdle() ? 1 : 0);
                supportSQLiteStatement.bindLong(28, constraints.requiresBatteryNotLow() ? 1 : 0);
                supportSQLiteStatement.bindLong(29, constraints.requiresStorageNotLow() ? 1 : 0);
                supportSQLiteStatement.bindLong(30, constraints.getContentTriggerUpdateDelayMillis());
                supportSQLiteStatement.bindLong(31, constraints.getContentTriggerMaxDelayMillis());
                WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindBlob(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
                supportSQLiteStatement.bindString(33, workSpec.id);
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetCancelledState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementPeriodCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetLastEnqueueTime = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetNextScheduleTimeOverride = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.__preparedStmtOfIncrementGeneration = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetStopReason = new SharedSQLiteStatement(roomDatabase) {
            public String createQuery() {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
        };
    }

    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void updateWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfWorkSpec.handle(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfDelete.release(acquire);
            throw th;
        }
    }

    public int setState(WorkInfo.State state, String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetState.acquire();
        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
        acquire.bindLong(1, (long) WorkTypeConverters.stateToInt(state));
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetState.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfSetState.release(acquire);
            throw th;
        }
    }

    public int setCancelledState(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetCancelledState.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetCancelledState.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfSetCancelledState.release(acquire);
            throw th;
        }
    }

    public void incrementPeriodCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementPeriodCount.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementPeriodCount.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfIncrementPeriodCount.release(acquire);
            throw th;
        }
    }

    public void setOutput(String str, Data data) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        acquire.bindBlob(1, Data.toByteArrayInternalV1(data));
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfSetOutput.release(acquire);
            throw th;
        }
    }

    public void setLastEnqueueTime(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetLastEnqueueTime.acquire();
        acquire.bindLong(1, j);
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetLastEnqueueTime.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfSetLastEnqueueTime.release(acquire);
            throw th;
        }
    }

    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
            throw th;
        }
    }

    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
            throw th;
        }
    }

    public void setNextScheduleTimeOverride(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetNextScheduleTimeOverride.acquire();
        acquire.bindLong(1, j);
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetNextScheduleTimeOverride.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfSetNextScheduleTimeOverride.release(acquire);
            throw th;
        }
    }

    public void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.acquire();
        acquire.bindString(1, str);
        acquire.bindLong(2, (long) i);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.release(acquire);
            throw th;
        }
    }

    public int markWorkSpecScheduled(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        acquire.bindLong(1, j);
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
            throw th;
        }
    }

    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        try {
            this.__db.beginTransaction();
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
            return executeUpdateDelete;
        } catch (Throwable th) {
            this.__preparedStmtOfResetScheduledState.release(acquire);
            throw th;
        }
    }

    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
            throw th;
        }
    }

    public void incrementGeneration(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementGeneration.acquire();
        acquire.bindString(1, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementGeneration.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfIncrementGeneration.release(acquire);
            throw th;
        }
    }

    public void setStopReason(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetStopReason.acquire();
        acquire.bindLong(1, (long) i);
        acquire.bindString(2, str);
        try {
            this.__db.beginTransaction();
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfSetStopReason.release(acquire);
        } catch (Throwable th) {
            this.__preparedStmtOfSetStopReason.release(acquire);
            throw th;
        }
    }

    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        boolean z;
        int i;
        String str2;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                if (query.moveToFirst()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i7);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    long j6 = query.getLong(columnIndexOrThrow14);
                    long j7 = query.getLong(columnIndexOrThrow15);
                    if (query.getInt(columnIndexOrThrow16) != 0) {
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i10 = query.getInt(i);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i10);
                    int i11 = query.getInt(columnIndexOrThrow18);
                    int i12 = query.getInt(columnIndexOrThrow19);
                    long j8 = query.getLong(columnIndexOrThrow20);
                    int i13 = query.getInt(columnIndexOrThrow21);
                    int i14 = query.getInt(columnIndexOrThrow22);
                    int i15 = columnIndexOrThrow23;
                    if (query.isNull(i15)) {
                        i2 = columnIndexOrThrow24;
                        str2 = null;
                    } else {
                        str2 = query.getString(i15);
                        i2 = columnIndexOrThrow24;
                    }
                    int i16 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i16);
                    byte[] blob = query.getBlob(columnIndexOrThrow25);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    if (query.getInt(columnIndexOrThrow26) != 0) {
                        i3 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        i3 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        i4 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        i4 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        i5 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        i5 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        i6 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        i6 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    long j10 = query.getLong(columnIndexOrThrow31);
                    byte[] blob2 = query.getBlob(columnIndexOrThrow32);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    workSpec = new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i11, i12, j8, i13, i14, str2);
                } else {
                    workSpec = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                int i = query.getInt(1);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                arrayList.add(new WorkSpec.IdAndState(string, WorkTypeConverters.intToState(i)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new Callable<List<String>>() {
            public List<String> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(0));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public WorkInfo.State getState(String str) {
        Integer num;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        WorkInfo.State state = null;
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                if (query.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(0));
                }
                if (num != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    state = WorkTypeConverters.intToState(num.intValue());
                }
            }
            return state;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        Cursor query;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            query = DBUtil.query(this.__db, acquire, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = query.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            if (query.moveToFirst()) {
                String string3 = query.getString(0);
                int i = query.getInt(1);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                int i2 = query.getInt(3);
                int i3 = query.getInt(4);
                long j = query.getLong(14);
                long j2 = query.getLong(15);
                long j3 = query.getLong(16);
                int i4 = query.getInt(17);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                long j4 = query.getLong(18);
                long j5 = query.getLong(19);
                int i5 = query.getInt(20);
                long j6 = query.getLong(21);
                int i6 = query.getInt(22);
                int i7 = query.getInt(5);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                byte[] blob = query.getBlob(6);
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                boolean z = query.getInt(7) != 0;
                boolean z2 = query.getInt(8) != 0;
                boolean z3 = query.getInt(9) != 0;
                boolean z4 = query.getInt(10) != 0;
                long j7 = query.getLong(11);
                long j8 = query.getLong(12);
                byte[] blob2 = query.getBlob(13);
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                workInfoPojo = new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0)));
            }
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return workInfoPojo;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        Cursor query;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String bindString : list) {
            acquire.bindString(i, bindString);
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            query = DBUtil.query(this.__db, acquire, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = query.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string3 = query.getString(0);
                int i2 = query.getInt(1);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                WorkInfo.State intToState = WorkTypeConverters.intToState(i2);
                Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                int i3 = query.getInt(3);
                int i4 = query.getInt(4);
                long j = query.getLong(14);
                long j2 = query.getLong(15);
                long j3 = query.getLong(16);
                int i5 = query.getInt(17);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i5);
                long j4 = query.getLong(18);
                long j5 = query.getLong(19);
                int i6 = query.getInt(20);
                long j6 = query.getLong(21);
                int i7 = query.getInt(22);
                int i8 = query.getInt(5);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i8);
                byte[] blob = query.getBlob(6);
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                boolean z = query.getInt(7) != 0;
                boolean z2 = query.getInt(8) != 0;
                boolean z3 = query.getInt(9) != 0;
                boolean z4 = query.getInt(10) != 0;
                long j7 = query.getLong(11);
                long j8 = query.getLong(12);
                byte[] blob2 = query.getBlob(13);
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i3, intToBackoffPolicy, j4, j5, i6, i4, j6, i7, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
            }
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String bindString : list) {
            acquire.bindString(i, bindString);
            i++;
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String bindString : list) {
            acquire.bindString(i, bindString);
            i++;
        }
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        Cursor query;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            query = DBUtil.query(this.__db, acquire, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = query.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string3 = query.getString(0);
                int i = query.getInt(1);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                int i2 = query.getInt(3);
                int i3 = query.getInt(4);
                long j = query.getLong(14);
                long j2 = query.getLong(15);
                long j3 = query.getLong(16);
                int i4 = query.getInt(17);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                long j4 = query.getLong(18);
                long j5 = query.getLong(19);
                int i5 = query.getInt(20);
                long j6 = query.getLong(21);
                int i6 = query.getInt(22);
                int i7 = query.getInt(5);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                byte[] blob = query.getBlob(6);
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                boolean z = query.getInt(7) != 0;
                boolean z2 = query.getInt(8) != 0;
                boolean z3 = query.getInt(9) != 0;
                boolean z4 = query.getInt(10) != 0;
                long j7 = query.getLong(11);
                long j8 = query.getLong(12);
                byte[] blob2 = query.getBlob(13);
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
            }
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        acquire.bindString(1, str);
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        acquire.bindString(1, str);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        Cursor query;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            query = DBUtil.query(this.__db, acquire, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = query.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string3 = query.getString(0);
                int i = query.getInt(1);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                int i2 = query.getInt(3);
                int i3 = query.getInt(4);
                long j = query.getLong(14);
                long j2 = query.getLong(15);
                long j3 = query.getLong(16);
                int i4 = query.getInt(17);
                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                long j4 = query.getLong(18);
                long j5 = query.getLong(19);
                int i5 = query.getInt(20);
                long j6 = query.getLong(21);
                int i6 = query.getInt(22);
                int i7 = query.getInt(5);
                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                byte[] blob = query.getBlob(6);
                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                boolean z = query.getInt(7) != 0;
                boolean z2 = query.getInt(8) != 0;
                boolean z3 = query.getInt(9) != 0;
                boolean z4 = query.getInt(10) != 0;
                long j7 = query.getLong(11);
                long j8 = query.getLong(12);
                byte[] blob2 = query.getBlob(13);
                WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
            }
            this.__db.setTransactionSuccessful();
            query.close();
            acquire.release();
            this.__db.endTransaction();
            return arrayList;
        } catch (Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        acquire.bindString(1, str);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        acquire.bindString(1, str);
        return CoroutinesRoom.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new Callable<List<WorkSpec.WorkInfoPojo>>() {
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                Cursor query;
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true, (CancellationSignal) null);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        String string = query.getString(0);
                        if (!hashMap.containsKey(string)) {
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(0);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                    }
                    query.moveToPosition(-1);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = query.getString(0);
                        int i = query.getInt(1);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        WorkInfo.State intToState = WorkTypeConverters.intToState(i);
                        Data fromByteArray = Data.fromByteArray(query.getBlob(2));
                        int i2 = query.getInt(3);
                        int i3 = query.getInt(4);
                        long j = query.getLong(14);
                        long j2 = query.getLong(15);
                        long j3 = query.getLong(16);
                        int i4 = query.getInt(17);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i4);
                        long j4 = query.getLong(18);
                        long j5 = query.getLong(19);
                        int i5 = query.getInt(20);
                        long j6 = query.getLong(21);
                        int i6 = query.getInt(22);
                        int i7 = query.getInt(5);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i7);
                        byte[] blob = query.getBlob(6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                        boolean z = query.getInt(7) != 0;
                        boolean z2 = query.getInt(8) != 0;
                        boolean z3 = query.getInt(9) != 0;
                        boolean z4 = query.getInt(10) != 0;
                        long j7 = query.getLong(11);
                        long j8 = query.getLong(12);
                        byte[] blob2 = query.getBlob(13);
                        WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i2, intToBackoffPolicy, j4, j5, i5, i3, j6, i6, (ArrayList) hashMap.get(query.getString(0)), (ArrayList) hashMap2.get(query.getString(0))));
                    }
                    WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                    query.close();
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    return arrayList;
                } catch (Throwable th) {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(Data.fromByteArray(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        acquire.bindString(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public Flow<Boolean> hasUnfinishedWorkFlow() {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"workspec"}, new Callable<Boolean>() {
            public Boolean call() throws Exception {
                boolean z;
                boolean z2 = false;
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    if (query.moveToFirst()) {
                        if (query.getInt(0) != 0) {
                            z2 = true;
                        }
                        z = Boolean.valueOf(z2);
                    } else {
                        z = false;
                    }
                    return z;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        acquire.bindString(1, str);
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new Callable<Long>() {
            public Long call() throws Exception {
                Long l = null;
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, false, (CancellationSignal) null);
                try {
                    if (query.moveToFirst()) {
                        if (!query.isNull(0)) {
                            l = Long.valueOf(query.getLong(0));
                        }
                    }
                    return l;
                } finally {
                    query.close();
                }
            }

            /* access modifiers changed from: protected */
            public void finalize() {
                acquire.release();
            }
        });
    }

    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i2;
        String str;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i8 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i9 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i9);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i10 = query.getInt(columnIndexOrThrow10);
                    int i11 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i12 = i8;
                    long j6 = query.getLong(i12);
                    int i13 = columnIndexOrThrow;
                    int i14 = columnIndexOrThrow15;
                    long j7 = query.getLong(i14);
                    columnIndexOrThrow15 = i14;
                    int i15 = columnIndexOrThrow16;
                    if (query.getInt(i15) != 0) {
                        columnIndexOrThrow16 = i15;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i15;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    int i16 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i16);
                    columnIndexOrThrow17 = i2;
                    int i17 = columnIndexOrThrow18;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow18 = i17;
                    int i19 = columnIndexOrThrow19;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow19 = i19;
                    int i21 = columnIndexOrThrow20;
                    long j8 = query.getLong(i21);
                    columnIndexOrThrow20 = i21;
                    int i22 = columnIndexOrThrow21;
                    int i23 = query.getInt(i22);
                    columnIndexOrThrow21 = i22;
                    int i24 = columnIndexOrThrow22;
                    int i25 = query.getInt(i24);
                    columnIndexOrThrow22 = i24;
                    int i26 = columnIndexOrThrow23;
                    if (query.isNull(i26)) {
                        columnIndexOrThrow23 = i26;
                        i3 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i26);
                        columnIndexOrThrow23 = i26;
                        i3 = columnIndexOrThrow24;
                    }
                    int i27 = query.getInt(i3);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i27);
                    columnIndexOrThrow24 = i3;
                    int i28 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i28);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i28;
                    int i29 = columnIndexOrThrow26;
                    if (query.getInt(i29) != 0) {
                        columnIndexOrThrow26 = i29;
                        i4 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i29;
                        i4 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow28 = i5;
                        i6 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i5;
                        i6 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i6) != 0) {
                        columnIndexOrThrow29 = i6;
                        i7 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i6;
                        i7 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i7);
                    columnIndexOrThrow30 = i7;
                    int i30 = columnIndexOrThrow31;
                    long j10 = query.getLong(i30);
                    columnIndexOrThrow31 = i30;
                    int i31 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i31);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i31;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i10, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i18, i20, j8, i23, i25, str));
                    columnIndexOrThrow = i13;
                    i8 = i12;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i8 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i8);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i11 = i7;
                    long j6 = query.getLong(i11);
                    int i12 = columnIndexOrThrow;
                    int i13 = columnIndexOrThrow15;
                    long j7 = query.getLong(i13);
                    columnIndexOrThrow15 = i13;
                    int i14 = columnIndexOrThrow16;
                    if (query.getInt(i14) != 0) {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i15 = query.getInt(i);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i15);
                    columnIndexOrThrow17 = i;
                    int i16 = columnIndexOrThrow18;
                    int i17 = query.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow19 = i18;
                    int i20 = columnIndexOrThrow20;
                    long j8 = query.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow21 = i21;
                    int i23 = columnIndexOrThrow22;
                    int i24 = query.getInt(i23);
                    columnIndexOrThrow22 = i23;
                    int i25 = columnIndexOrThrow23;
                    if (query.isNull(i25)) {
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i25);
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                    }
                    int i26 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i26);
                    columnIndexOrThrow24 = i2;
                    int i27 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i27);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i27;
                    int i28 = columnIndexOrThrow26;
                    if (query.getInt(i28) != 0) {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    columnIndexOrThrow30 = i6;
                    int i29 = columnIndexOrThrow31;
                    long j10 = query.getLong(i29);
                    columnIndexOrThrow31 = i29;
                    int i30 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i30);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i30;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i9, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i17, i19, j8, i22, i24, str));
                    columnIndexOrThrow = i12;
                    i7 = i11;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i2;
        String str;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        acquire.bindLong(1, (long) i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i8 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i9 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i9);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i10 = query.getInt(columnIndexOrThrow10);
                    int i11 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i11);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i12 = i8;
                    long j6 = query.getLong(i12);
                    int i13 = columnIndexOrThrow;
                    int i14 = columnIndexOrThrow15;
                    long j7 = query.getLong(i14);
                    columnIndexOrThrow15 = i14;
                    int i15 = columnIndexOrThrow16;
                    if (query.getInt(i15) != 0) {
                        columnIndexOrThrow16 = i15;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i15;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    int i16 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i16);
                    columnIndexOrThrow17 = i2;
                    int i17 = columnIndexOrThrow18;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow18 = i17;
                    int i19 = columnIndexOrThrow19;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow19 = i19;
                    int i21 = columnIndexOrThrow20;
                    long j8 = query.getLong(i21);
                    columnIndexOrThrow20 = i21;
                    int i22 = columnIndexOrThrow21;
                    int i23 = query.getInt(i22);
                    columnIndexOrThrow21 = i22;
                    int i24 = columnIndexOrThrow22;
                    int i25 = query.getInt(i24);
                    columnIndexOrThrow22 = i24;
                    int i26 = columnIndexOrThrow23;
                    if (query.isNull(i26)) {
                        columnIndexOrThrow23 = i26;
                        i3 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i26);
                        columnIndexOrThrow23 = i26;
                        i3 = columnIndexOrThrow24;
                    }
                    int i27 = query.getInt(i3);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i27);
                    columnIndexOrThrow24 = i3;
                    int i28 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i28);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i28;
                    int i29 = columnIndexOrThrow26;
                    if (query.getInt(i29) != 0) {
                        columnIndexOrThrow26 = i29;
                        i4 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i29;
                        i4 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow28 = i5;
                        i6 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i5;
                        i6 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i6) != 0) {
                        columnIndexOrThrow29 = i6;
                        i7 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i6;
                        i7 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i7);
                    columnIndexOrThrow30 = i7;
                    int i30 = columnIndexOrThrow31;
                    long j10 = query.getLong(i30);
                    columnIndexOrThrow31 = i30;
                    int i31 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i31);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i31;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i10, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i18, i20, j8, i23, i25, str));
                    columnIndexOrThrow = i13;
                    i8 = i12;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i8 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i8);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i11 = i7;
                    long j6 = query.getLong(i11);
                    int i12 = columnIndexOrThrow;
                    int i13 = columnIndexOrThrow15;
                    long j7 = query.getLong(i13);
                    columnIndexOrThrow15 = i13;
                    int i14 = columnIndexOrThrow16;
                    if (query.getInt(i14) != 0) {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i15 = query.getInt(i);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i15);
                    columnIndexOrThrow17 = i;
                    int i16 = columnIndexOrThrow18;
                    int i17 = query.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow19 = i18;
                    int i20 = columnIndexOrThrow20;
                    long j8 = query.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow21 = i21;
                    int i23 = columnIndexOrThrow22;
                    int i24 = query.getInt(i23);
                    columnIndexOrThrow22 = i23;
                    int i25 = columnIndexOrThrow23;
                    if (query.isNull(i25)) {
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i25);
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                    }
                    int i26 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i26);
                    columnIndexOrThrow24 = i2;
                    int i27 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i27);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i27;
                    int i28 = columnIndexOrThrow26;
                    if (query.getInt(i28) != 0) {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    columnIndexOrThrow30 = i6;
                    int i29 = columnIndexOrThrow31;
                    long j10 = query.getLong(i29);
                    columnIndexOrThrow31 = i29;
                    int i30 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i30);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i30;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i9, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i17, i19, j8, i22, i24, str));
                    columnIndexOrThrow = i12;
                    i7 = i11;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i8 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i8);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i11 = i7;
                    long j6 = query.getLong(i11);
                    int i12 = columnIndexOrThrow;
                    int i13 = columnIndexOrThrow15;
                    long j7 = query.getLong(i13);
                    columnIndexOrThrow15 = i13;
                    int i14 = columnIndexOrThrow16;
                    if (query.getInt(i14) != 0) {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i15 = query.getInt(i);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i15);
                    columnIndexOrThrow17 = i;
                    int i16 = columnIndexOrThrow18;
                    int i17 = query.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow19 = i18;
                    int i20 = columnIndexOrThrow20;
                    long j8 = query.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow21 = i21;
                    int i23 = columnIndexOrThrow22;
                    int i24 = query.getInt(i23);
                    columnIndexOrThrow22 = i23;
                    int i25 = columnIndexOrThrow23;
                    if (query.isNull(i25)) {
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i25);
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                    }
                    int i26 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i26);
                    columnIndexOrThrow24 = i2;
                    int i27 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i27);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i27;
                    int i28 = columnIndexOrThrow26;
                    if (query.getInt(i28) != 0) {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    columnIndexOrThrow30 = i6;
                    int i29 = columnIndexOrThrow31;
                    long j10 = query.getLong(i29);
                    columnIndexOrThrow31 = i29;
                    int i30 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i30);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i30;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i9, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i17, i19, j8, i22, i24, str));
                    columnIndexOrThrow = i12;
                    i7 = i11;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public List<WorkSpec> getRecentlyCompletedWork(long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        boolean z;
        int i;
        String str;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        acquire.bindLong(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "trace_tag");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "required_network_request");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow31 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow32 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(columnIndexOrThrow);
                    int i8 = query.getInt(columnIndexOrThrow2);
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    WorkInfo.State intToState = WorkTypeConverters.intToState(i8);
                    String string2 = query.getString(columnIndexOrThrow3);
                    String string3 = query.getString(columnIndexOrThrow4);
                    Data fromByteArray = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                    Data fromByteArray2 = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                    long j2 = query.getLong(columnIndexOrThrow7);
                    long j3 = query.getLong(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    int i9 = query.getInt(columnIndexOrThrow10);
                    int i10 = query.getInt(columnIndexOrThrow11);
                    WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i10);
                    long j5 = query.getLong(columnIndexOrThrow12);
                    long j6 = query.getLong(columnIndexOrThrow13);
                    int i11 = i7;
                    long j7 = query.getLong(i11);
                    int i12 = columnIndexOrThrow;
                    int i13 = columnIndexOrThrow15;
                    long j8 = query.getLong(i13);
                    columnIndexOrThrow15 = i13;
                    int i14 = columnIndexOrThrow16;
                    if (query.getInt(i14) != 0) {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i14;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i15 = query.getInt(i);
                    WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(i15);
                    columnIndexOrThrow17 = i;
                    int i16 = columnIndexOrThrow18;
                    int i17 = query.getInt(i16);
                    columnIndexOrThrow18 = i16;
                    int i18 = columnIndexOrThrow19;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow19 = i18;
                    int i20 = columnIndexOrThrow20;
                    long j9 = query.getLong(i20);
                    columnIndexOrThrow20 = i20;
                    int i21 = columnIndexOrThrow21;
                    int i22 = query.getInt(i21);
                    columnIndexOrThrow21 = i21;
                    int i23 = columnIndexOrThrow22;
                    int i24 = query.getInt(i23);
                    columnIndexOrThrow22 = i23;
                    int i25 = columnIndexOrThrow23;
                    if (query.isNull(i25)) {
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                        str = null;
                    } else {
                        str = query.getString(i25);
                        columnIndexOrThrow23 = i25;
                        i2 = columnIndexOrThrow24;
                    }
                    int i26 = query.getInt(i2);
                    WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(i26);
                    columnIndexOrThrow24 = i2;
                    int i27 = columnIndexOrThrow25;
                    byte[] blob = query.getBlob(i27);
                    WorkTypeConverters workTypeConverters5 = WorkTypeConverters.INSTANCE;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(blob);
                    columnIndexOrThrow25 = i27;
                    int i28 = columnIndexOrThrow26;
                    if (query.getInt(i28) != 0) {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = true;
                    } else {
                        columnIndexOrThrow26 = i28;
                        i3 = columnIndexOrThrow27;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = true;
                    } else {
                        columnIndexOrThrow27 = i3;
                        i4 = columnIndexOrThrow28;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = true;
                    } else {
                        columnIndexOrThrow28 = i4;
                        i5 = columnIndexOrThrow29;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = true;
                    } else {
                        columnIndexOrThrow29 = i5;
                        i6 = columnIndexOrThrow30;
                        z5 = false;
                    }
                    long j10 = query.getLong(i6);
                    columnIndexOrThrow30 = i6;
                    int i29 = columnIndexOrThrow31;
                    long j11 = query.getLong(i29);
                    columnIndexOrThrow31 = i29;
                    int i30 = columnIndexOrThrow32;
                    byte[] blob2 = query.getBlob(i30);
                    WorkTypeConverters workTypeConverters6 = WorkTypeConverters.INSTANCE;
                    columnIndexOrThrow32 = i30;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, z5, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(blob2)), i9, intToBackoffPolicy, j5, j6, j7, j8, z, intToOutOfQuotaPolicy, i17, i19, j9, i22, i24, str));
                    columnIndexOrThrow = i12;
                    i7 = i11;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    public int countNonFinishedContentUriTriggerWorkers() {
        int i = 0;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
                i = query.getInt(0);
            }
            return i;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(HashMap<String, ArrayList<String>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                RelationUtil.recursiveFetchHashMap(hashMap, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda0(this));
                return;
            }
            StringBuilder newStringBuilder = StringUtil.newStringBuilder();
            newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            StringUtil.appendPlaceholders(newStringBuilder, size);
            newStringBuilder.append(")");
            RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
            int i = 1;
            for (String bindString : keySet) {
                acquire.bindString(i, bindString);
                i++;
            }
            Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
                if (columnIndex != -1) {
                    while (query.moveToNext()) {
                        ArrayList arrayList = hashMap.get(query.getString(columnIndex));
                        if (arrayList != null) {
                            arrayList.add(query.getString(0));
                        }
                    }
                    query.close();
                }
            } finally {
                query.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$__fetchRelationshipWorkTagAsjavaLangString$0$androidx-work-impl-model-WorkSpecDao_Impl  reason: not valid java name */
    public /* synthetic */ Unit m61lambda$__fetchRelationshipWorkTagAsjavaLangString$0$androidxworkimplmodelWorkSpecDao_Impl(HashMap hashMap) {
        __fetchRelationshipWorkTagAsjavaLangString(hashMap);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(HashMap<String, ArrayList<Data>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                RelationUtil.recursiveFetchHashMap(hashMap, true, new WorkSpecDao_Impl$$ExternalSyntheticLambda1(this));
                return;
            }
            StringBuilder newStringBuilder = StringUtil.newStringBuilder();
            newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            StringUtil.appendPlaceholders(newStringBuilder, size);
            newStringBuilder.append(")");
            RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
            int i = 1;
            for (String bindString : keySet) {
                acquire.bindString(i, bindString);
                i++;
            }
            Cursor query = DBUtil.query(this.__db, acquire, false, (CancellationSignal) null);
            try {
                int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
                if (columnIndex != -1) {
                    while (query.moveToNext()) {
                        ArrayList arrayList = hashMap.get(query.getString(columnIndex));
                        if (arrayList != null) {
                            arrayList.add(Data.fromByteArray(query.getBlob(0)));
                        }
                    }
                    query.close();
                }
            } finally {
                query.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1$androidx-work-impl-model-WorkSpecDao_Impl  reason: not valid java name */
    public /* synthetic */ Unit m60lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1$androidxworkimplmodelWorkSpecDao_Impl(HashMap hashMap) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
        return Unit.INSTANCE;
    }
}
