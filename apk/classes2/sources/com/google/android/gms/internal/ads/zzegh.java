package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegh implements zzeds {
    private final Context zza;
    private final zzdhb zzb;
    /* access modifiers changed from: private */
    public zzbqf zzc;
    private final VersionInfoParcel zzd;

    public zzegh(Context context, zzdhb zzdhb, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdhb;
        this.zzd = versionInfoParcel;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        ArrayList arrayList = zzfcn.zza.zza.zzg;
        if (arrayList.contains(Integer.toString(6))) {
            zzdit zzt = zzdit.zzt(this.zzc);
            if (arrayList.contains(Integer.toString(zzt.zzc()))) {
                zzdiv zze = this.zzb.zze(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdjf(zzt), new zzdky((zzbqc) null, (zzbqb) null, this.zzc));
                ((zzefd) zzedp.zzc).zzc(zze.zzj());
                return zze.zza();
            }
            throw new zzehf(1, "No corresponding native ad listener");
        }
        throw new zzehf(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        try {
            zzbrp zzbrp = (zzbrp) zzedp.zzb;
            zzbrp.zzq(zzfca.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) zzbd.zzc().zzb(zzbde.zzbT)).intValue()) {
                zzbrp.zzm(zzfca.zzU, zzfca.zzv.toString(), zzfcn.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegf(this, zzedp, (zzegg) null), (zzbpw) zzedp.zzc);
                return;
            }
            String str = zzfca.zzU;
            String jSONObject = zzfca.zzv.toString();
            zzfcw zzfcw = zzfcn.zza.zza;
            zzbrp.zzn(str, jSONObject, zzfcw.zzd, ObjectWrapper.wrap(this.zza), new zzegf(this, zzedp, (zzegg) null), (zzbpw) zzedp.zzc, zzfcw.zzi);
        } catch (RemoteException e) {
            throw new zzfdd(e);
        }
    }
}
