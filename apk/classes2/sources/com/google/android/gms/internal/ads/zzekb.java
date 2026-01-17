package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzr;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzekb extends zzbs {
    final zzfcu zza;
    final zzdjc zzb = new zzdjc();
    private final Context zzc;
    private final zzche zzd;
    private zzbk zze;

    public zzekb(zzche zzche, Context context, String str) {
        zzfcu zzfcu = new zzfcu();
        this.zza = zzfcu;
        this.zzd = zzche;
        zzfcu.zzu(str);
        this.zzc = context;
    }

    public final zzbq zze() {
        zzdje zzg = this.zzb.zzg();
        ArrayList zzi = zzg.zzi();
        zzfcu zzfcu = this.zza;
        zzfcu.zzF(zzi);
        zzfcu.zzG(zzg.zzh());
        if (zzfcu.zzi() == null) {
            zzfcu.zzt(zzr.zzc());
        }
        return new zzekc(this.zzc, this.zzd, zzfcu, zzg, this.zze);
    }

    public final void zzf(zzbhn zzbhn) {
        this.zzb.zza(zzbhn);
    }

    public final void zzg(zzbhq zzbhq) {
        this.zzb.zzb(zzbhq);
    }

    public final void zzh(String str, zzbhw zzbhw, zzbht zzbht) {
        this.zzb.zzc(str, zzbhw, zzbht);
    }

    public final void zzi(zzbmy zzbmy) {
        this.zzb.zzd(zzbmy);
    }

    public final void zzj(zzbia zzbia, zzr zzr) {
        this.zzb.zze(zzbia);
        this.zza.zzt(zzr);
    }

    public final void zzk(zzbid zzbid) {
        this.zzb.zzf(zzbid);
    }

    public final void zzl(zzbk zzbk) {
        this.zze = zzbk;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    public final void zzn(zzbmp zzbmp) {
        this.zza.zzx(zzbmp);
    }

    public final void zzo(zzbge zzbge) {
        this.zza.zzE(zzbge);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzI(publisherAdViewOptions);
    }

    public final void zzq(zzcs zzcs) {
        this.zza.zzY(zzcs);
    }
}
