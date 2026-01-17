package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelv implements zzelo {
    private final zzfcu zza;
    /* access modifiers changed from: private */
    public final zzche zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzell zzd;
    /* access modifiers changed from: private */
    public final zzfhx zze;
    private zzcrp zzf;

    public zzelv(zzche zzche, Context context, zzell zzell, zzfcu zzfcu) {
        this.zzb = zzche;
        this.zzc = context;
        this.zzd = zzell;
        this.zza = zzfcu;
        this.zze = zzche.zzy();
        zzfcu.zzw(zzell.zzd());
    }

    public final boolean zza() {
        zzcrp zzcrp = this.zzf;
        return zzcrp != null && zzcrp.zzf();
    }

    public final boolean zzb(zzm zzm, String str, zzelm zzelm, zzeln zzeln) throws RemoteException {
        zzfhu zzfhu;
        zzv.zzr();
        Context context = this.zzc;
        if (zzs.zzI(context) && zzm.zzs == null) {
            int i = zze.zza;
            zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new zzelq(this));
            return false;
        } else if (str == null) {
            int i2 = zze.zza;
            zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new zzelr(this));
            return false;
        } else {
            boolean z = zzm.zzf;
            zzfdt.zza(context, z);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue() && z) {
                this.zzb.zzk().zzo(true);
            }
            int i3 = ((zzelp) zzelm).zza;
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            String zza2 = zzdrr.PUBLIC_API_CALL.zza();
            Long valueOf = Long.valueOf(currentTimeMillis);
            Bundle zza3 = zzdrt.zza(new Pair(zza2, valueOf), new Pair(zzdrr.DYNAMITE_ENTER.zza(), valueOf));
            zzfcu zzfcu = this.zza;
            zzfcu.zzJ(zzm);
            zzfcu.zzB(zza3);
            zzfcu.zzD(i3);
            zzfcw zzL = zzfcu.zzL();
            zzfhj zzb2 = zzfhi.zzb(context, zzfht.zzf(zzL), 8, zzm);
            zzco zzco = zzL.zzn;
            if (zzco != null) {
                this.zzd.zzd().zzm(zzco);
            }
            zzche zzche = this.zzb;
            zzdha zzg = zzche.zzg();
            zzcvf zzcvf = new zzcvf();
            zzcvf.zzf(context);
            zzcvf.zzk(zzL);
            zzg.zzf(zzcvf.zzl());
            zzdbu zzdbu = new zzdbu();
            zzell zzell = this.zzd;
            zzdbu.zzk(zzell.zzd(), zzche.zzA());
            zzg.zze(zzdbu.zzn());
            zzg.zzd(zzell.zzc());
            zzg.zzc(new zzcop((ViewGroup) null));
            zzdhb zzg2 = zzg.zzg();
            if (((Boolean) zzbex.zzc.zze()).booleanValue()) {
                zzfhu zzf2 = zzg2.zzf();
                zzf2.zzi(8);
                zzf2.zzb(zzm.zzp);
                zzf2.zzf(zzm.zzm);
                zzfhu = zzf2;
            } else {
                zzfhu = null;
            }
            zzche.zzx().zzc(1);
            zzgdy zzc2 = zzffu.zzc();
            ScheduledExecutorService zzB = zzche.zzB();
            zzcse zza4 = zzg2.zza();
            zzcrp zzcrp = new zzcrp(zzc2, zzB, zza4.zzh(zza4.zzi()));
            this.zzf = zzcrp;
            zzcrp.zze(new zzelu(this, zzeln, zzfhu, zzb2, zzg2));
            return true;
        }
    }
}
