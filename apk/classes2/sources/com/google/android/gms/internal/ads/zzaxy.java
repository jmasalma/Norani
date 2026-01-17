package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxy extends zzayk {
    public zzaxy(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2) {
        super(zzawx, "+T/U1hw7+KZ4U7a2mmAOu7BJ15632T6q77fmzX/Xgjcy3uK841Ng+VsVpINIYuXP", "GzjxqsxzxT+aATwD+mE+LGwR24OtaI/aqws6qGNlH18=", zzast, i, 3);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawd zzawd = new zzawd((String) this.zze.invoke((Object) null, new Object[]{this.zza.zzb(), Boolean.valueOf(((Boolean) zzbd.zzc().zzb(zzbde.zzdf)).booleanValue())}));
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzj(zzawd.zza);
            zzast.zzA(zzawd.zzb);
        }
    }
}
