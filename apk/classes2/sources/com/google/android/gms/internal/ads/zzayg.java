package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayg extends zzayk {
    public zzayg(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "1BnW1+pN8ACAA5SCwHeu4aDyUa+GdAsZQaTQjOE/fWA7hyCouT0ju5bDmhkUNXUI", "kp4jwXczzGPw0lGC8OB8RleYASbnnNEZzgNaMBT0Bfw=", zzast, i, 48);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzast zzast = this.zzd;
        zzast.zzad(3);
        boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
        synchronized (zzast) {
            if (booleanValue) {
                zzast.zzad(2);
            } else {
                zzast.zzad(1);
            }
        }
    }
}
