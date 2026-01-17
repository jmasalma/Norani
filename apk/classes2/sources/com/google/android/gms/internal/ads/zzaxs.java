package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxs extends zzayk {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxs(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "2yqQbpMMcqKX38M442dN+dCyzykwnAxluzbiBDnzfSZwwykVdh1BxKbQaA6qVZBU", "1XIQFsxUhHfLRHhylour2btyczZCL08SFkmijCbkayQ=", zzast, i, 22);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke((Object) null, new Object[0]);
                }
            }
        }
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzw(zzh.longValue());
        }
    }
}
