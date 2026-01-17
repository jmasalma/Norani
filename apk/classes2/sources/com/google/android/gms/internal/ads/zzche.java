package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzche implements zzcld {
    @Nullable
    private static zzche zza;

    private static synchronized zzche zzE(Context context, @Nullable zzbpq zzbpq, int i, boolean z, int i2, zzcik zzcik) {
        synchronized (zzche.class) {
            zzche zzche = zza;
            if (zzche != null) {
                return zzche;
            }
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            zzbde.zza(context);
            if (((Boolean) zzbew.zze.zze()).booleanValue()) {
                zzbco.zzd(context);
            }
            zzfds zzd = zzfds.zzd(context);
            VersionInfoParcel zzc = zzd.zzc(252530000, false, i2);
            zzd.zzf(zzbpq);
            zzciz zzciz = new zzciz((zzcjs) null);
            zzchf zzchf = new zzchf();
            zzchf.zzf(zzc);
            zzchf.zze(context);
            zzchf.zzd(currentTimeMillis);
            zzciz.zzb(new zzchh(zzchf, (zzchg) null));
            zzciz.zzc(new zzcjt(zzcik));
            zzche zza2 = zzciz.zza();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznS)).booleanValue()) {
                zzv.zzq().zzb(zzffu.zzc(), zza2.zzi());
                zzv.zzq().zzc();
            }
            zzv.zzp().zzu(context, zzc);
            zzv.zzc().zzi(context);
            zzv.zzr().zzm(context);
            zzv.zzr().zzl(context);
            zzd.zza(context);
            zzv.zzb().zzd(context);
            zzv.zzx().zzb(context);
            ((zzcb) ((zzcio) zza2).zzak.zzb()).zzc();
            zzbyp.zzb(context);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue()) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaM)).booleanValue()) {
                    new zzebn(context, zzc, new zzbcc(new zzbci(context)), new zzeas(new zzeao(context), (zzgdy) ((zzcio) zza2).zzd.zzb())).zzb(zzv.zzp().zzi().zzN());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzche zza(Context context, @Nullable zzbpq zzbpq, int i) {
        return zzE(context, zzbpq, 252530000, false, i, new zzcik());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzbzh zzC();

    public final zzbzh zzD() {
        return zzC();
    }

    public abstract zzcke zzb();

    public abstract zzcof zzc();

    public abstract zzcpw zzd();

    public abstract zzcyv zze();

    public abstract zzdge zzf();

    public abstract zzdha zzg();

    public abstract zzdor zzh();

    public abstract zzdsj zzi();

    public abstract zzdtt zzj();

    public abstract zzdvi zzk();

    public abstract zzdwf zzl();

    public abstract zzecl zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzn();

    public abstract zzab zzo();

    public abstract zzau zzp();

    public final zzevf zzq(zzbvq zzbvq, int i) {
        return zzr(new zzewi(zzbvq, i));
    }

    /* access modifiers changed from: protected */
    public abstract zzevf zzr(zzewi zzewi);

    public abstract zzexa zzs();

    public abstract zzeyo zzt();

    public abstract zzfaf zzu();

    public abstract zzfbt zzv();

    public abstract zzfdl zzw();

    public abstract zzfdv zzx();

    public abstract zzfhx zzy();

    public abstract zzfkj zzz();
}
