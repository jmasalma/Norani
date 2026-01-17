package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxo extends zzayk {
    private final long zzh;

    public zzaxo(zzawx zzawx, String str, String str2, zzast zzast, long j, int i, int i2) {
        super(zzawx, "bz3lIaHWpCquphICM8d57wBZcB7vA3QBLpLSSF22FzCVTv7HI8nqsTojeybBUatg", "nJy2u10FH1OsIt1ONuXNmQ7d3Q3+he826LogUVDBAds=", zzast, i, 25);
        this.zzh = j;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke((Object) null, new Object[0])).longValue();
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzr(longValue);
            long j = this.zzh;
            if (j != 0) {
                zzast.zzR(longValue - j);
                zzast.zzS(j);
            }
        }
    }
}
