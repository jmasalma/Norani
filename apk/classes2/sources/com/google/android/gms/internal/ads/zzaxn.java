package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxn extends zzayk {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzaxn(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "n8+dbEkb8sSSkj8RrAZPAIBpRkB5kUln+00UVnn84X80gYgRIiK8WSxHPJEqxXHc", "yKnJQpgvAxtK/oRpf77IDthT8ZJJ6VXKsBNJ0lMvjYQ=", zzast, i, 44);
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
            zzast.zzo(zzh.longValue());
        }
    }
}
