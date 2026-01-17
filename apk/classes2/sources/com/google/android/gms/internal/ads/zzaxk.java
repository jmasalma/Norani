package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxk extends zzayk {
    private static final zzayl zzh = new zzayl();
    private final Context zzi;

    public zzaxk(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, Context context) {
        super(zzawx, "agDdf5wrmtJ0cP5XVK0JCsJ4BViR17o/n9P6hmH0muvYwmpx2DZ552/tAJvOo6qR", "48yXjRp5G93PEoVZx8WBMAeqgOhil0yQSUdmW98nZyI=", zzast, i, 29);
        this.zzi = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzn("E");
        Context context = this.zzi;
        AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((String) this.zze.invoke((Object) null, new Object[]{context}));
                }
            }
        }
        String str = (String) zza.get();
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzn(zzaul.zza(str.getBytes(), true));
        }
    }
}
