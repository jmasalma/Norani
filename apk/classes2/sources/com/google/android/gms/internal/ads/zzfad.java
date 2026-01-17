package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfad implements zzelo {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzche zzc;
    /* access modifiers changed from: private */
    public final zzeky zzd;
    /* access modifiers changed from: private */
    public final zzfbd zze;
    private zzbdz zzf;
    /* access modifiers changed from: private */
    public final zzfhx zzg;
    private final zzfcu zzh;
    /* access modifiers changed from: private */
    public ListenableFuture zzi;

    public zzfad(Context context, Executor executor, zzche zzche, zzeky zzeky, zzfbd zzfbd, zzfcu zzfcu) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzche;
        this.zzd = zzeky;
        this.zzh = zzfcu;
        this.zze = zzfbd;
        this.zzg = zzche.zzy();
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final boolean zzb(zzm zzm, String str, zzelm zzelm, zzeln zzeln) {
        zzdgf zzf2;
        zzfhu zzfhu;
        if (str == null) {
            int i = zze.zza;
            zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzezx(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() && zzm.zzf) {
                this.zzc.zzk().zzo(true);
            }
            zzr zzr = ((zzezw) zzelm).zza;
            Bundle zza2 = zzdrt.zza(new Pair(zzdrr.PUBLIC_API_CALL.zza(), Long.valueOf(zzm.zzz)), new Pair(zzdrr.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzD().currentTimeMillis())));
            zzfcu zzfcu = this.zzh;
            zzfcu.zzu(str);
            zzfcu.zzt(zzr);
            zzfcu.zzJ(zzm);
            zzfcu.zzB(zza2);
            Context context = this.zza;
            zzfcw zzL = zzfcu.zzL();
            zzfhj zzb2 = zzfhi.zzb(context, zzfht.zzf(zzL), 4, zzm);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zziC)).booleanValue()) {
                zzdge zzf3 = this.zzc.zzf();
                zzcvf zzcvf = new zzcvf();
                zzcvf.zzf(context);
                zzcvf.zzk(zzL);
                zzf3.zze(zzcvf.zzl());
                zzdbu zzdbu = new zzdbu();
                zzeky zzeky = this.zzd;
                Executor executor = this.zzb;
                zzdbu.zzj(zzeky, executor);
                zzdbu.zzk(zzeky, executor);
                zzf3.zzd(zzdbu.zzn());
                zzf3.zzc(new zzejh(this.zzf));
                zzf2 = zzf3.zzf();
            } else {
                zzdbu zzdbu2 = new zzdbu();
                zzfbd zzfbd = this.zze;
                if (zzfbd != null) {
                    Executor executor2 = this.zzb;
                    zzdbu2.zze(zzfbd, executor2);
                    zzdbu2.zzf(zzfbd, executor2);
                    zzdbu2.zzb(zzfbd, executor2);
                }
                zzdge zzf4 = this.zzc.zzf();
                zzcvf zzcvf2 = new zzcvf();
                zzcvf2.zzf(context);
                zzcvf2.zzk(zzL);
                zzf4.zze(zzcvf2.zzl());
                zzeky zzeky2 = this.zzd;
                Executor executor3 = this.zzb;
                zzdbu2.zzj(zzeky2, executor3);
                zzdbu2.zze(zzeky2, executor3);
                zzdbu2.zzf(zzeky2, executor3);
                zzdbu2.zzb(zzeky2, executor3);
                zzdbu2.zza(zzeky2, executor3);
                zzdbu2.zzl(zzeky2, executor3);
                zzdbu2.zzk(zzeky2, executor3);
                zzdbu2.zzi(zzeky2, executor3);
                zzdbu2.zzc(zzeky2, executor3);
                zzf4.zzd(zzdbu2.zzn());
                zzf4.zzc(new zzejh(this.zzf));
                zzf2 = zzf4.zzf();
            }
            zzdgf zzdgf = zzf2;
            if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
                zzfhu zze2 = zzdgf.zze();
                zze2.zzi(4);
                zze2.zzb(zzm.zzp);
                zze2.zzf(zzm.zzm);
                zzfhu = zze2;
            } else {
                zzfhu = null;
            }
            zzcse zza3 = zzdgf.zza();
            ListenableFuture zzh2 = zza3.zzh(zza3.zzi());
            this.zzi = zzh2;
            zzgdn.zzr(zzh2, new zzfac(this, zzeln, zzfhu, zzb2, zzdgf), this.zzb);
            return true;
        }
    }

    public final void zzi(zzbdz zzbdz) {
        this.zzf = zzbdz;
    }
}
