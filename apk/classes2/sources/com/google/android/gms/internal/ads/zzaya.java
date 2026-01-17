package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaya extends zzayk {
    private List zzh = null;
    private final Context zzi;

    public zzaya(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, Context context) {
        super(zzawx, "G1O+5tqulLBNCxZxcYiJSAGrazgAMWmQ49z8g8PEPhhOgnBizp9p2UWwJMiSx+ju", "xfUFYLaeYlsk7z1gy27YVxCq/UzpfsdVkNtosT4BuNc=", zzast, i, 31);
        this.zzi = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzast zzast = this.zzd;
        zzast.zzU(-1);
        zzast.zzQ(-1);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke((Object) null, new Object[]{context});
        }
        List list = this.zzh;
        if (list != null && list.size() == 2) {
            synchronized (zzast) {
                zzast.zzU(((Long) this.zzh.get(0)).longValue());
                zzast.zzQ(((Long) this.zzh.get(1)).longValue());
            }
        }
    }
}
