package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxh extends zzayk {
    private final Activity zzh;
    private final View zzi;

    public zzaxh(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, View view, Activity activity) {
        super(zzawx, "YX3pd3fZ/j0e82Z3yXv98nYqAI3nsN+d0YAKVHjoLLbjd+BRZ45hNatoujYNmZM/", "2IfMUy5zOuVT1ilWAqZrt9PNbHCY94WGDxwYlYOFZTM=", zzast, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view != null) {
            boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzcS)).booleanValue();
            Object[] objArr = (Object[]) this.zze.invoke((Object) null, new Object[]{view, this.zzh, Boolean.valueOf(booleanValue)});
            zzast zzast = this.zzd;
            synchronized (zzast) {
                zzast.zzc(((Long) objArr[0]).longValue());
                zzast.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    zzast.zzd((String) objArr[2]);
                }
            }
        }
    }
}
