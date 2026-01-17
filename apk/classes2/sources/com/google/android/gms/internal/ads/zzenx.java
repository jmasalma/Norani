package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzenx implements zzeub {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final zzg zze;
    private final String zzf;
    private final zzcte zzg;

    public zzenx(Context context, Bundle bundle, String str, String str2, zzg zzg2, String str3, zzcte zzcte) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzg2;
        this.zzf = str3;
        this.zzg = zzcte;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfU)).booleanValue()) {
            try {
                zzv.zzr();
                bundle.putString("_app_id", zzs.zzq(this.zza));
            } catch (RemoteException | RuntimeException e) {
                zzv.zzp().zzw(e, "AppStatsSignal_AppId");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcva) obj).zzb;
        bundle.putBundle("quality_signals", this.zzb);
        zzc(bundle);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcva) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        zzg zzg2 = this.zze;
        if (!zzg2.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !zzg2.zzN());
        zzc(bundle);
        String str = this.zzf;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            zzcte zzcte = this.zzg;
            bundle2.putLong("dload", zzcte.zzb(str));
            bundle2.putInt("pcc", zzcte.zza(str));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkh)).booleanValue() && zzv.zzp().zza() > 0) {
            bundle.putInt("nrwv", zzv.zzp().zza());
        }
    }
}
