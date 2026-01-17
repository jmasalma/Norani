package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzayh extends zzayk {
    private final View zzh;

    public zzayh(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, View view) {
        super(zzawx, "h7NW4UTeHoapcAfHjNS1jSIEsdu+S9XbBUhqH3zqKlRoFqG3FEF52d6iyzd+cmzU", "UQVAYGHTy6RzP6i5dxbs04Nz2BVdis2XDzzm3D3JwpQ=", zzast, i, 57);
        this.zzh = view;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) zzbd.zzc().zzb(zzbde.zzdI);
            Boolean bool2 = (Boolean) zzbd.zzc().zzb(zzbde.zzlt);
            zzaxb zzaxb = new zzaxb((String) this.zze.invoke((Object) null, new Object[]{view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2}));
            zzato zza = zzatp.zza();
            zza.zzb(zzaxb.zza.longValue());
            zza.zzd(zzaxb.zzb.longValue());
            zza.zze(zzaxb.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzaxb.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzaxb.zzd.longValue());
            }
            this.zzd.zzW((zzatp) zza.zzbr());
        }
    }
}
