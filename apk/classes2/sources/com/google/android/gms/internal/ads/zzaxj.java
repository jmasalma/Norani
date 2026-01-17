package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxj extends zzayk {
    public zzaxj(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "WQkp0526ddrUi1BRkagos9QKSJQ1uugrJcxnlXdGVtysNEwcyhf7H4AuLi1Daa/J", "bIxRlixcWzGpKi+RzORPGFA/CCK1ebxNEgd5yxb9Upc=", zzast, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzast zzast = this.zzd;
        zzast.zzY(3);
        try {
            int i = 1;
            if (true == ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue()) {
                i = 2;
            }
            zzast.zzY(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
