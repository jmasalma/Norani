package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayc extends zzayk {
    private final StackTraceElement[] zzh;

    public zzayc(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzawx, "UtW7g7feJqOHsjIRMP7TbkL8M4VYsmVrsaULCIKJGwvBOELKcxTQZfT6AHg6wl4V", "3s4OpKjyDjUzqtut1o8wCVCKFRdtRePXWRu+sqk/xG8=", zzast, i, 45);
        this.zzh = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzawo zzawo = new zzawo((String) this.zze.invoke((Object) null, new Object[]{stackTraceElementArr}));
            zzast zzast = this.zzd;
            synchronized (zzast) {
                zzast.zzD(zzawo.zza.longValue());
                if (zzawo.zzb.booleanValue()) {
                    int i = 1;
                    if (true != zzawo.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzast.zzZ(i);
                } else {
                    zzast.zzZ(3);
                }
            }
        }
    }
}
