package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeik implements zzeds {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdos zzc;

    public zzeik(Context context, Executor executor, zzdos zzdos) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdos;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) {
        try {
            ((zzfdu) zzedp.zzb).zzk(zzfcn.zza.zza.zzd, zzfca.zzv.toString());
        } catch (Exception e) {
            String str = zzedp.zza;
            int i = zze.zza;
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzdoo zzd = this.zzc.zzd(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdop(new zzeii(this, zzedp, zzfca)));
        zzd.zzd().zzo(new zzcmg((zzfdu) zzedp.zzb), this.zzb);
        zzcxf zze = zzd.zze();
        zzcvw zzb2 = zzd.zzb();
        ((zzefe) zzedp.zzc).zzc(new zzeij(this, zzd.zza(), zzb2, zze, zzd.zzg()));
        return zzd.zzi();
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        zzfdu zzfdu = (zzfdu) zzedp.zzb;
        if (!zzfdu.zzC()) {
            zzeih zzeih = new zzeih(this, zzfcn, zzfca, zzedp);
            zzcxi zzcxi = zzedp.zzc;
            ((zzefe) zzcxi).zzd(zzeih);
            Context context = this.zza;
            zzfcw zzfcw = zzfcn.zza.zza;
            String jSONObject = zzfca.zzv.toString();
            zzfdu.zzh(context, zzfcw.zzd, (String) null, (zzbwn) zzcxi, jSONObject);
            return;
        }
        zze(zzfcn, zzfca, zzedp);
    }
}
