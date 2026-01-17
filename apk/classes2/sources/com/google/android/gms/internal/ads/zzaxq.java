package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxq extends zzayk {
    private final zzawy zzh;

    public zzaxq(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, zzawy zzawy) {
        super(zzawx, "L3kNtlg7QY6D9Xl7pPswVVS/MCBOYXcB4vflYd8GjH187tfdUwj4wLKq5xN70kha", "7KShiw4CrXn9e1sAZ1bf68KLoTIikFllvC3ALPO42ag=", zzast, i, 85);
        this.zzh = zzawy;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzawy zzawy = this.zzh;
        long[] jArr = (long[]) method.invoke((Object) null, new Object[]{Long.valueOf(zzawy.zzd()), Long.valueOf(zzawy.zzh()), Long.valueOf(zzawy.zzb()), Long.valueOf(zzawy.zzf())});
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzt(jArr[0]);
            zzast.zzs(jArr[1]);
        }
    }
}
