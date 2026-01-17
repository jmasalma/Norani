package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxm extends zzayk {
    public zzaxm(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "ptULCqFpkxWHwh0HVZoMpk0Xr91rKWbEROvrSrbrHF8bfcD+J1G9qxssmqT2HcO0", "gABvx04l+Prrr7UIzRlxJTdbXEyGkYLmeTdDcw+INuA=", zzast, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzast zzast = this.zzd;
        zzast.zzm(-1);
        zzast.zzl(-1);
        int[] iArr = (int[]) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()});
        synchronized (zzast) {
            zzast.zzm((long) iArr[0]);
            zzast.zzl((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                zzast.zzk((long) i);
            }
        }
    }
}
