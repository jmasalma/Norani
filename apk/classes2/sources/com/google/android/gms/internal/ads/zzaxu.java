package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxu extends zzayk {
    private final zzawp zzh;

    public zzaxu(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, zzawp zzawp) {
        super(zzawx, "LLos9e8Ql/sv7oIXEM/FCVf2w4qxksYVSJjnFOiKAZfJ/fOB+3TAGyZw1OkiJRsU", "lmzfMnrRinUoapvwdylnImZxEAh1S0BzbHZ4/bdyts0=", zzast, i, 94);
        this.zzh = zzawp;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke((Object) null, new Object[]{this.zzh.zza()})).intValue();
        zzast zzast = this.zzd;
        synchronized (zzast) {
            zzast.zzab(zzatf.zza(intValue));
        }
    }
}
