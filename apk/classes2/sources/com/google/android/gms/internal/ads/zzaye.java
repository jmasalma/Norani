package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaye extends zzayk {
    private final zzaxe zzh;
    private long zzi;

    public zzaye(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, zzaxe zzaxe) {
        super(zzawx, "YdsvNQpLn71zCPsmNiBmaxgvKAoUotN+t67Ej8NmXEez61kI/ElwL7USsI8xuH+E", "BTo9KBR1VAIklcWQcnKn1k6hpYvG+18rom++PUlQVcU=", zzast, i, 53);
        this.zzh = zzaxe;
        if (zzaxe != null) {
            this.zzi = zzaxe.zza();
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzN(((Long) this.zze.invoke((Object) null, new Object[]{Long.valueOf(this.zzi)})).longValue());
        }
    }
}
