package androidx.work;

import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011BG\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/work/WorkQuery;", "", "ids", "", "Ljava/util/UUID;", "uniqueWorkNames", "", "tags", "states", "Landroidx/work/WorkInfo$State;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "getStates", "getTags", "getUniqueWorkNames", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: WorkQuery.kt */
public final class WorkQuery {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<UUID> ids;
    private final List<WorkInfo.State> states;
    private final List<String> tags;
    private final List<String> uniqueWorkNames;

    public WorkQuery() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final WorkQuery fromIds(List<UUID> list) {
        return Companion.fromIds(list);
    }

    @JvmStatic
    public static final WorkQuery fromIds(UUID... uuidArr) {
        return Companion.fromIds(uuidArr);
    }

    @JvmStatic
    public static final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
        return Companion.fromStates(list);
    }

    @JvmStatic
    public static final WorkQuery fromStates(WorkInfo.State... stateArr) {
        return Companion.fromStates(stateArr);
    }

    @JvmStatic
    public static final WorkQuery fromTags(List<String> list) {
        return Companion.fromTags(list);
    }

    @JvmStatic
    public static final WorkQuery fromTags(String... strArr) {
        return Companion.fromTags(strArr);
    }

    @JvmStatic
    public static final WorkQuery fromUniqueWorkNames(List<String> list) {
        return Companion.fromUniqueWorkNames(list);
    }

    @JvmStatic
    public static final WorkQuery fromUniqueWorkNames(String... strArr) {
        return Companion.fromUniqueWorkNames(strArr);
    }

    public WorkQuery(List<UUID> list, List<String> list2, List<String> list3, List<? extends WorkInfo.State> list4) {
        Intrinsics.checkNotNullParameter(list, "ids");
        Intrinsics.checkNotNullParameter(list2, "uniqueWorkNames");
        Intrinsics.checkNotNullParameter(list3, "tags");
        Intrinsics.checkNotNullParameter(list4, "states");
        this.ids = list;
        this.uniqueWorkNames = list2;
        this.tags = list3;
        this.states = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkQuery(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final List<UUID> getIds() {
        return this.ids;
    }

    public final List<String> getUniqueWorkNames() {
        return this.uniqueWorkNames;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<WorkInfo.State> getStates() {
        return this.states;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/work/WorkQuery$Builder;", "", "()V", "ids", "", "Ljava/util/UUID;", "states", "Landroidx/work/WorkInfo$State;", "tags", "", "uniqueWorkNames", "addIds", "", "addStates", "addTags", "addUniqueWorkNames", "build", "Landroidx/work/WorkQuery;", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkQuery.kt */
    public static final class Builder {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final List<UUID> ids;
        private final List<WorkInfo.State> states;
        private final List<String> tags;
        private final List<String> uniqueWorkNames;

        public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final Builder fromIds(List<UUID> list) {
            return Companion.fromIds(list);
        }

        @JvmStatic
        public static final Builder fromStates(List<? extends WorkInfo.State> list) {
            return Companion.fromStates(list);
        }

        @JvmStatic
        public static final Builder fromTags(List<String> list) {
            return Companion.fromTags(list);
        }

        @JvmStatic
        public static final Builder fromUniqueWorkNames(List<String> list) {
            return Companion.fromUniqueWorkNames(list);
        }

        private Builder() {
            this.ids = new ArrayList();
            this.uniqueWorkNames = new ArrayList();
            this.tags = new ArrayList();
            this.states = new ArrayList();
        }

        public final Builder addIds(List<UUID> list) {
            Intrinsics.checkNotNullParameter(list, "ids");
            CollectionsKt.addAll(this.ids, list);
            return this;
        }

        public final Builder addUniqueWorkNames(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "uniqueWorkNames");
            CollectionsKt.addAll(this.uniqueWorkNames, list);
            return this;
        }

        public final Builder addTags(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "tags");
            CollectionsKt.addAll(this.tags, list);
            return this;
        }

        public final Builder addStates(List<? extends WorkInfo.State> list) {
            Intrinsics.checkNotNullParameter(list, "states");
            CollectionsKt.addAll(this.states, list);
            return this;
        }

        public final WorkQuery build() {
            if (!this.ids.isEmpty() || !this.uniqueWorkNames.isEmpty() || !this.tags.isEmpty() || !this.states.isEmpty()) {
                return new WorkQuery(this.ids, this.uniqueWorkNames, this.tags, this.states);
            }
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/work/WorkQuery$Builder$Companion;", "", "()V", "fromIds", "Landroidx/work/WorkQuery$Builder;", "ids", "", "Ljava/util/UUID;", "fromStates", "states", "Landroidx/work/WorkInfo$State;", "fromTags", "tags", "", "fromUniqueWorkNames", "uniqueWorkNames", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: WorkQuery.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Builder fromIds(List<UUID> list) {
                Intrinsics.checkNotNullParameter(list, "ids");
                Builder builder = new Builder((DefaultConstructorMarker) null);
                builder.addIds(list);
                return builder;
            }

            @JvmStatic
            public final Builder fromUniqueWorkNames(List<String> list) {
                Intrinsics.checkNotNullParameter(list, "uniqueWorkNames");
                Builder builder = new Builder((DefaultConstructorMarker) null);
                builder.addUniqueWorkNames(list);
                return builder;
            }

            @JvmStatic
            public final Builder fromTags(List<String> list) {
                Intrinsics.checkNotNullParameter(list, "tags");
                Builder builder = new Builder((DefaultConstructorMarker) null);
                builder.addTags(list);
                return builder;
            }

            @JvmStatic
            public final Builder fromStates(List<? extends WorkInfo.State> list) {
                Intrinsics.checkNotNullParameter(list, "states");
                Builder builder = new Builder((DefaultConstructorMarker) null);
                builder.addStates(list);
                return builder;
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007J!\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\"\u00020\fH\u0007¢\u0006\u0002\u0010\rJ\u0016\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0007J!\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0006\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0007J!\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0006\"\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0007¨\u0006\u0014"}, d2 = {"Landroidx/work/WorkQuery$Companion;", "", "()V", "fromIds", "Landroidx/work/WorkQuery;", "ids", "", "Ljava/util/UUID;", "([Ljava/util/UUID;)Landroidx/work/WorkQuery;", "", "fromStates", "states", "Landroidx/work/WorkInfo$State;", "([Landroidx/work/WorkInfo$State;)Landroidx/work/WorkQuery;", "fromTags", "tags", "", "([Ljava/lang/String;)Landroidx/work/WorkQuery;", "fromUniqueWorkNames", "uniqueWorkNames", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: WorkQuery.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WorkQuery fromIds(List<UUID> list) {
            Intrinsics.checkNotNullParameter(list, "ids");
            return new WorkQuery(list, (List) null, (List) null, (List) null, 14, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromIds(UUID... uuidArr) {
            Intrinsics.checkNotNullParameter(uuidArr, "ids");
            return new WorkQuery(ArraysKt.toList(uuidArr), (List) null, (List) null, (List) null, 14, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromTags(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "tags");
            return new WorkQuery((List) null, (List) null, list, (List) null, 11, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromTags(String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "tags");
            return new WorkQuery((List) null, (List) null, ArraysKt.toList(strArr), (List) null, 11, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromUniqueWorkNames(String... strArr) {
            Intrinsics.checkNotNullParameter(strArr, "uniqueWorkNames");
            return new WorkQuery((List) null, ArraysKt.toList(strArr), (List) null, (List) null, 13, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromUniqueWorkNames(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "uniqueWorkNames");
            return new WorkQuery((List) null, list, (List) null, (List) null, 13, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromStates(List<? extends WorkInfo.State> list) {
            Intrinsics.checkNotNullParameter(list, "states");
            return new WorkQuery((List) null, (List) null, (List) null, list, 7, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final WorkQuery fromStates(WorkInfo.State... stateArr) {
            Intrinsics.checkNotNullParameter(stateArr, "states");
            return new WorkQuery((List) null, (List) null, (List) null, ArraysKt.toList(stateArr), 7, (DefaultConstructorMarker) null);
        }
    }
}
