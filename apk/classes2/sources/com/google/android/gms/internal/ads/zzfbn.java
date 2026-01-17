package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
public final class zzfbn implements zzelo {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzche zzc;
    /* access modifiers changed from: private */
    public final zzfbd zzd;
    /* access modifiers changed from: private */
    public final zzezr zze;
    private final zzfco zzf;
    /* access modifiers changed from: private */
    public final zzfhx zzg;
    private final zzfcu zzh;
    private ListenableFuture zzi;

    public zzfbn(Context context, Executor executor, zzche zzche, zzezr zzezr, zzfbd zzfbd, zzfcu zzfcu, zzfco zzfco) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzche;
        this.zze = zzezr;
        this.zzd = zzfbd;
        this.zzh = zzfcu;
        this.zzf = zzfco;
        this.zzg = zzche.zzy();
    }

    /* access modifiers changed from: private */
    public final zzdor zzk(zzezp zzezp) {
        zzdor zzh2 = this.zzc.zzh();
        zzcvf zzcvf = new zzcvf();
        zzcvf.zzf(this.zza);
        zzcvf.zzk(((zzfbl) zzezp).zza);
        zzcvf.zzj(this.zzf);
        zzh2.zzd(zzcvf.zzl());
        zzh2.zzc(new zzdbu().zzn());
        return zzh2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzm zzm, String str, zzelm zzelm, zzeln zzeln) throws RemoteException {
        zzfhu zzfhu;
        zzbwj zzbwj = new zzbwj(zzm, str);
        zzfbf zzfbf = (zzfbf) zzelm;
        String str2 = zzbwj.zzb;
        if (str2 == null) {
            int i = zze.zza;
            zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfbg(this));
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
            zzezr zzezr = this.zze;
            if (zzezr.zzd() != null) {
                zzfhu zzg2 = ((zzdos) zzezr.zzd()).zzg();
                zzg2.zzi(5);
                zzm zzm2 = zzbwj.zza;
                zzg2.zzb(zzm2.zzp);
                zzg2.zzf(zzm2.zzm);
                zzfhu = zzg2;
                Context context = this.zza;
                zzm zzm3 = zzbwj.zza;
                boolean z = zzm3.zzf;
                zzfdt.zza(context, z);
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() && z) {
                    this.zzc.zzk().zzo(true);
                }
                Bundle zza2 = zzdrt.zza(new Pair(zzdrr.PUBLIC_API_CALL.zza(), Long.valueOf(zzm3.zzz)), new Pair(zzdrr.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzD().currentTimeMillis())));
                zzfcu zzfcu = this.zzh;
                zzfcu.zzu(str2);
                zzfcu.zzt(zzr.zzd());
                zzfcu.zzJ(zzm3);
                zzfcu.zzB(zza2);
                zzfcw zzL = zzfcu.zzL();
                zzfhj zzb2 = zzfhi.zzb(context, zzfht.zzf(zzL), 5, zzm3);
                zzfbl zzfbl = new zzfbl((zzfbm) null);
                zzfbl.zza = zzL;
                ListenableFuture zzc2 = this.zze.zzc(new zzezs(zzfbl, (zzbvq) null), new zzfbh(this), (Object) null);
                this.zzi = zzc2;
                zzgdn.zzr(zzc2, new zzfbk(this, zzeln, zzfhu, zzb2, zzfbl), this.zzb);
                return true;
            }
        }
        zzfhu = null;
        Context context2 = this.zza;
        zzm zzm32 = zzbwj.zza;
        boolean z2 = zzm32.zzf;
        zzfdt.zza(context2, z2);
        this.zzc.zzk().zzo(true);
        Bundle zza22 = zzdrt.zza(new Pair(zzdrr.PUBLIC_API_CALL.zza(), Long.valueOf(zzm32.zzz)), new Pair(zzdrr.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzD().currentTimeMillis())));
        zzfcu zzfcu2 = this.zzh;
        zzfcu2.zzu(str2);
        zzfcu2.zzt(zzr.zzd());
        zzfcu2.zzJ(zzm32);
        zzfcu2.zzB(zza22);
        zzfcw zzL2 = zzfcu2.zzL();
        zzfhj zzb22 = zzfhi.zzb(context2, zzfht.zzf(zzL2), 5, zzm32);
        zzfbl zzfbl2 = new zzfbl((zzfbm) null);
        zzfbl2.zza = zzL2;
        ListenableFuture zzc22 = this.zze.zzc(new zzezs(zzfbl2, (zzbvq) null), new zzfbh(this), (Object) null);
        this.zzi = zzc22;
        zzgdn.zzr(zzc22, new zzfbk(this, zzeln, zzfhu, zzb22, zzfbl2), this.zzb);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzq().zza(i);
    }
}
