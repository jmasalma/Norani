package androidx.work.impl.model;

import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001\u001a&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006*\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001\"\u0010\u0010\u0000\u001a\u00020\u00018\u0002XT¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00018\u0002XT¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u00018\u0002XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"WORK_INFO_BY_IDS", "", "WORK_INFO_BY_NAME", "WORK_INFO_BY_TAG", "WORK_INFO_COLUMNS", "dedup", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/work/WorkInfo;", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getWorkStatusPojoFlowDataForIds", "Landroidx/work/impl/model/WorkSpecDao;", "id", "Ljava/util/UUID;", "getWorkStatusPojoFlowForName", "name", "getWorkStatusPojoFlowForTag", "tag", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkSpecDao.kt */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    public static final Flow<WorkInfo> getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID uuid) {
        Intrinsics.checkNotNullParameter(workSpecDao, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "id");
        return FlowKt.distinctUntilChanged(new WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1(workSpecDao.getWorkStatusPojoFlowDataForIds(CollectionsKt.listOf(String.valueOf(uuid)))));
    }

    public static final Flow<List<WorkInfo>> getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, CoroutineDispatcher coroutineDispatcher, String str) {
        Intrinsics.checkNotNullParameter(workSpecDao, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(str, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(str), coroutineDispatcher);
    }

    public static final Flow<List<WorkInfo>> getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, CoroutineDispatcher coroutineDispatcher, String str) {
        Intrinsics.checkNotNullParameter(workSpecDao, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(str, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(str), coroutineDispatcher);
    }

    public static final Flow<List<WorkInfo>> dedup(Flow<? extends List<WorkSpec.WorkInfoPojo>> flow, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(new WorkSpecDaoKt$dedup$$inlined$map$1(flow)), (CoroutineContext) coroutineDispatcher);
    }
}
