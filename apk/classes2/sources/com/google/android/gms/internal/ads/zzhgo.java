package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhgo {
    static HashSet zza(int i) {
        return new HashSet(zzd(i));
    }

    public static LinkedHashMap zzb(int i) {
        return new LinkedHashMap(zzd(i));
    }

    public static List zzc(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    private static int zzd(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE;
    }
}
