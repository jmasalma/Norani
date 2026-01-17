package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegd implements zzeds {
    private final Context zza;
    private final zzdhb zzb;
    private final Executor zzc;

    public zzegd(Context context, zzdhb zzdhb, Executor executor) {
        this.zza = context;
        this.zzb = zzdhb;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcn zzfcn, int i) {
        return zzfcn.zza.zza.zzg.contains(Integer.toString(i));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd, zzehf {
        zzdit zzdit;
        zzfdu zzfdu = (zzfdu) zzedp.zzb;
        zzbqb zzD = zzfdu.zzD();
        zzbqc zzE = zzfdu.zzE();
        zzbqf zzd = zzfdu.zzd();
        if (zzd != null && zzc(zzfcn, 6)) {
            zzdit = zzdit.zzt(zzd);
        } else if (zzD != null && zzc(zzfcn, 6)) {
            zzdit = zzdit.zzai(zzD);
        } else if (zzD != null && zzc(zzfcn, 2)) {
            zzdit = zzdit.zzag(zzD);
        } else if (zzE != null && zzc(zzfcn, 6)) {
            zzdit = zzdit.zzaj(zzE);
        } else if (zzE == null || !zzc(zzfcn, 1)) {
            throw new zzehf(1, "No native ad mappers");
        } else {
            zzdit = zzdit.zzah(zzE);
        }
        if (zzdit != null) {
            zzfcw zzfcw = zzfcn.zza.zza;
            if (zzfcw.zzg.contains(Integer.toString(zzdit.zzc()))) {
                zzdiv zze = this.zzb.zze(new zzcrq(zzfcn, zzfca, zzedp.zza), new zzdjf(zzdit), new zzdky(zzE, zzD, zzd));
                ((zzefd) zzedp.zzc).zzc(zze.zzk());
                zze.zzd().zzo(new zzcmg(zzfdu), this.zzc);
                return zze.zza();
            }
        }
        throw new zzehf(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfcn zzfcn, zzfca zzfca, zzedp zzedp) throws zzfdd {
        zzfcw zzfcw = zzfcn.zza.zza;
        String jSONObject = zzfca.zzv.toString();
        String zzm = zzbs.zzm(zzfca.zzs);
        zzbge zzbge = zzfcw.zzi;
        ArrayList arrayList = zzfcw.zzg;
        ((zzfdu) zzedp.zzb).zzp(this.zza, zzfcw.zzd, jSONObject, zzm, (zzbpw) zzedp.zzc, zzbge, arrayList);
    }
}
