package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzefo implements zzeds {
    private final Context zza;
    private final zzdgf zzb;
    /* access modifiers changed from: private */
    public final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefo(Context context, VersionInfoParcel versionInfoParcel, zzdgf zzdgf, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdgf;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzdfc zzd2 = this.zzb.zzd(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdff(new zzefn(this, zzedp, zzfca), (zzcfg) null));
        zzd2.zzd().zzo(new zzcmg((zzfdu) zzedp.zzb), this.zzd);
        ((zzefd) zzedp.zzc).zzc(zzd2.zzk());
        return zzd2.zzg();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        zzfcw zzfcw = zzfcn.zza.zza;
        String jSONObject = zzfca.zzv.toString();
        String zzm = zzbs.zzm(zzfca.zzs);
        ((zzfdu) zzedp.zzb).zzo(this.zza, zzfcw.zzd, jSONObject, zzm, (zzbpw) zzedp.zzc);
    }
}
