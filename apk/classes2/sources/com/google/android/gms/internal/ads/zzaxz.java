package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxz extends zzayk {
    public zzaxz(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "4HRSTLOwWZkuNJXWodn1qJJgWaIIvv19EC2kc5Tc35PPh8H51LV3J7XsfwYf6N8B", "x59qZ2C8s/H9o8A43vx+gBO6K2fFzzXR0hkzA9nrVNs=", zzast, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
            zzast zzast = this.zzd;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            zzast.zzac(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzac(3);
        }
    }
}
