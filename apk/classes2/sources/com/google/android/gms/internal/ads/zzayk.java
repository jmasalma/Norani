package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzayk implements Callable {
    protected final zzawx zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzast zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzayk(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzawx;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzast;
        this.zzf = i;
        this.zzg = i2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zzawx zzawx = this.zza;
            Method zzi = zzawx.zzi(this.zzb, this.zzc);
            this.zze = zzi;
            if (zzi == null) {
                return null;
            }
            zza();
            zzavo zzd2 = zzawx.zzd();
            if (zzd2 == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzd2.zzc(this.zzg, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zza() throws IllegalAccessException, InvocationTargetException;
}
