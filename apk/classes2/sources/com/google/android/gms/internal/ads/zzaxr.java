package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxr extends zzayk {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaxr(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, Map map, View view, Context context) {
        super(zzawx, "q8irn8XqClynUBOsRuq73Jawzwc3gJeVDnk3iDYtMcevrbEAuNWFzcNhN+feXrfp", "dam+Wb9GR7yMSr36KIsK6PGM3yrtzGfNR9lAtk4lliE=", zzast, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) map.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke((Object) null, new Object[]{jArr, context, this.zzi});
        long j = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzt(j);
            zzast.zzs(j2);
        }
    }
}
