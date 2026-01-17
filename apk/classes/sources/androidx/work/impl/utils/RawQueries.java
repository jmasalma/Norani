package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t¨\u0006\n"}, d2 = {"bindings", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "count", "", "toRawQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/work/WorkQuery;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RawQueries.kt */
public final class RawQueries {
    public static final SupportSQLiteQuery toRawQuery(WorkQuery workQuery) {
        String str;
        Intrinsics.checkNotNullParameter(workQuery, "<this>");
        List arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        String str2 = " AND";
        if (!workQuery.getStates().isEmpty()) {
            Iterable<WorkInfo.State> states = workQuery.getStates();
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(states, 10));
            for (WorkInfo.State stateToInt : states) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(stateToInt)));
            }
            List list = (List) arrayList2;
            sb.append(" WHERE state IN (");
            bindings(sb, list.size());
            sb.append(")");
            arrayList.addAll(list);
            str = str2;
        } else {
            str = " WHERE";
        }
        if (!workQuery.getIds().isEmpty()) {
            Iterable<UUID> ids = workQuery.getIds();
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ids, 10));
            for (UUID uuid : ids) {
                arrayList3.add(uuid.toString());
            }
            sb.append(str.concat(" id IN ("));
            bindings(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll((List) arrayList3);
            str = str2;
        }
        if (!workQuery.getTags().isEmpty()) {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            arrayList.addAll(workQuery.getTags());
        } else {
            str2 = str;
        }
        if (!workQuery.getUniqueWorkNames().isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            arrayList.addAll(workQuery.getUniqueWorkNames());
        }
        sb.append(";");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return new SimpleSQLiteQuery(sb2, arrayList.toArray(new Object[0]));
    }

    private static final void bindings(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add("?");
            }
            sb.append(CollectionsKt.joinToString$default(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }
}
