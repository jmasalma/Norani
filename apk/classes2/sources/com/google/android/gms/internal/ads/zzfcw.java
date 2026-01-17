package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfcw {
    public final zzgc zza;
    public final zzbmp zzb;
    public final zzeky zzc;
    public final zzm zzd;
    public final zzr zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbge zzi;
    public final zzx zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzco zzn;
    public final zzfcj zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final AtomicLong zzt;
    public final zzcs zzu;

    /* synthetic */ zzfcw(zzfcu zzfcu, zzfcv zzfcv) {
        zzgc zzgc;
        zzbge zzbge;
        this.zze = zzfcu.zzb;
        this.zzf = zzfcu.zzc;
        this.zzu = zzfcu.zzv;
        int i = zzfcu.zza.zza;
        long j = zzfcu.zza.zzb;
        Bundle bundle = zzfcu.zza.zzc;
        int i2 = zzfcu.zza.zzd;
        List list = zzfcu.zza.zze;
        boolean z = zzfcu.zza.zzf;
        int i3 = zzfcu.zza.zzg;
        boolean z2 = true;
        if (!zzfcu.zza.zzh && !zzfcu.zze) {
            z2 = false;
        }
        zzm zzm2 = new zzm(i, j, bundle, i2, list, z, i3, z2, zzfcu.zza.zzi, zzfcu.zza.zzj, zzfcu.zza.zzk, zzfcu.zza.zzl, zzfcu.zza.zzm, zzfcu.zza.zzn, zzfcu.zza.zzo, zzfcu.zza.zzp, zzfcu.zza.zzq, zzfcu.zza.zzr, zzfcu.zza.zzs, zzfcu.zza.zzt, zzfcu.zza.zzu, zzfcu.zza.zzv, zzs.zza(zzfcu.zza.zzw), zzfcu.zza.zzx, zzfcu.zza.zzy, zzfcu.zza.zzz, zzfcu.zza.zzA);
        this.zzd = zzm2;
        if (zzfcu.zzd != null) {
            zzgc = zzfcu.zzd;
        } else {
            zzgc = zzfcu.zzh != null ? zzfcu.zzh.zzf : null;
        }
        this.zza = zzgc;
        this.zzg = zzfcu.zzf;
        this.zzh = zzfcu.zzg;
        if (zzfcu.zzf == null) {
            zzbge = null;
        } else {
            zzbge = zzfcu.zzh == null ? new zzbge(new NativeAdOptions.Builder().build()) : zzfcu.zzh;
        }
        this.zzi = zzbge;
        this.zzj = zzfcu.zzi;
        this.zzk = zzfcu.zzm;
        this.zzl = zzfcu.zzj;
        this.zzm = zzfcu.zzk;
        this.zzn = zzfcu.zzl;
        this.zzb = zzfcu.zzn;
        this.zzo = new zzfcj(zzfcu.zzo, (zzfci) null);
        this.zzp = zzfcu.zzp;
        this.zzq = zzfcu.zzq;
        this.zzc = zzfcu.zzr;
        this.zzr = zzfcu.zzs;
        this.zzs = zzfcu.zzt;
        if (zzm2.zzA != 0) {
            this.zzt = new AtomicLong(zzm2.zzA);
        } else {
            this.zzt = zzfcu.zzu;
        }
    }

    public final boolean zza() {
        zzbcv zzbcv = zzbde.zzdx;
        return this.zzf.matches((String) zzbd.zzc().zzb(zzbcv));
    }
}
