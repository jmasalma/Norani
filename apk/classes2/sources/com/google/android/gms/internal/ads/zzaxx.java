package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxx extends zzayk {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzaxx(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "d4PN2fwB2P9jxIUN6NPwGCD1vcjTZd510+VTbYWnWivlqPuX4Pd9jb/zoaClHGV2", "B7r3opNSMuM8FMoC6aVwUNpehxdhrcT61rhsqayMJbM=", zzast, i, 1);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzz("E");
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke((Object) null, new Object[0]);
                }
            }
        }
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzz(zzh);
        }
    }
}
