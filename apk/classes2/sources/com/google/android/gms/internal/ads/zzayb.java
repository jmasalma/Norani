package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayb extends zzayk {
    private final boolean zzh;

    public zzayb(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "jIv42z2v6FXxayFh75bTXtsxRSsCK/ciQjkFKmgks8cLq7HP+HDebRZyGvyOBC97", "2wHbvH170oRSgA6rj2BMxMfMsZs+WbUtizDquheRwWE=", zzast, i, 61);
        this.zzh = zzawx.zzq();
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke((Object) null, new Object[]{this.zza.zzb(), Boolean.valueOf(this.zzh)})).longValue();
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzC(longValue);
        }
    }
}
