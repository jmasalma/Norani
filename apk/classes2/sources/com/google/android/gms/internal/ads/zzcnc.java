package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcnc implements zzcvy, zzcxm, zzcws, zza, zzcwo, zzddu, zzcyo {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfcn zze;
    /* access modifiers changed from: private */
    public final zzfca zzf;
    /* access modifiers changed from: private */
    public final zzfju zzg;
    /* access modifiers changed from: private */
    public final zzfdi zzh;
    private final zzavu zzi;
    private final zzbel zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcuy zzm;
    /* access modifiers changed from: private */
    public final zzcyi zzn;
    /* access modifiers changed from: private */
    public final zzcuu zzo;
    private boolean zzp;
    private final AtomicBoolean zzq = new AtomicBoolean();

    zzcnc(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfcn zzfcn, zzfca zzfca, zzfju zzfju, zzfdi zzfdi, View view, zzcfg zzcfg, zzavu zzavu, zzbel zzbel, zzben zzben, zzfhu zzfhu, zzcuy zzcuy, zzcyi zzcyi, zzcuu zzcuu) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfcn;
        this.zzf = zzfca;
        this.zzg = zzfju;
        this.zzh = zzfdi;
        this.zzi = zzavu;
        View view2 = view;
        this.zzk = new WeakReference(view);
        zzcfg zzcfg2 = zzcfg;
        this.zzl = new WeakReference(zzcfg);
        this.zzj = zzbel;
        this.zzm = zzcuy;
        this.zzn = zzcyi;
        this.zzo = zzcuu;
    }

    /* access modifiers changed from: private */
    public final List zzx() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlP)).booleanValue()) {
            zzv.zzr();
            Context context = this.zza;
            if (zzs.zzC(context)) {
                zzv.zzr();
                Integer zzt = zzs.zzt(context);
                if (zzt != null) {
                    Integer valueOf = Integer.valueOf(Math.min(zzt.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    for (String parse : this.zzf.zzd) {
                        arrayList.add(Uri.parse(parse).buildUpon().appendQueryParameter("dspct", Integer.toString(valueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* access modifiers changed from: private */
    public final void zzy() {
        String str;
        int i;
        zzfca zzfca = this.zzf;
        List list = zzfca.zzd;
        if (list != null && !list.isEmpty()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdO)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), (Activity) null);
            } else {
                str = null;
            }
            if ((!((Boolean) zzbd.zzc().zzb(zzbde.zzaH)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbfd.zzh.zze()).booleanValue()) {
                if (((Boolean) zzbfd.zzg.zze()).booleanValue() && ((i = zzfca.zzb) == 1 || i == 2 || i == 5)) {
                    zzcfg zzcfg = (zzcfg) this.zzl.get();
                }
                zzgdn.zzr((zzgde) zzgdn.zzo(zzgde.zzw(zzgdn.zzh((Object) null)), ((Long) zzbd.zzc().zzb(zzbde.zzbi)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnb(this, str), this.zzb);
                return;
            }
            this.zzh.zza(this.zzg.zze(this.zze, zzfca, false, str, (String) null, zzx(), this.zzo), this.zzn);
        }
    }

    /* access modifiers changed from: private */
    public final void zzz(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzy();
        } else {
            this.zzd.schedule(new zzcmy(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzbd.zzc().zzb(zzbde.zzaH)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbfd.zzd.zze()).booleanValue()) {
            zzgdn.zzr((zzgde) zzgdn.zze(zzgde.zzw(this.zzj.zza()), Throwable.class, new zzcmw(), zzcaf.zzg), new zzcna(this), this.zzb);
            return;
        }
        zzfdi zzfdi = this.zzh;
        zzfju zzfju = this.zzg;
        zzfcn zzfcn = this.zze;
        zzfca zzfca = this.zzf;
        Context context = this.zza;
        List zzd2 = zzfju.zzd(zzfcn, zzfca, zzfca.zzc);
        int i = 1;
        if (true == zzv.zzp().zzA(context)) {
            i = 2;
        }
        zzfdi.zzc(zzd2, i);
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
        zzfju zzfju = this.zzg;
        zzfdi zzfdi = this.zzh;
        zzfca zzfca = this.zzf;
        zzfdi.zza(zzfju.zzf(zzfca, zzfca.zzh, zzbwc), (zzcyi) null);
    }

    public final void zze() {
        zzfju zzfju = this.zzg;
        zzfcn zzfcn = this.zze;
        zzfdi zzfdi = this.zzh;
        zzfca zzfca = this.zzf;
        zzfdi.zza(zzfju.zzd(zzfcn, zzfca, zzfca.zzi), (zzcyi) null);
    }

    public final void zzf() {
        zzfju zzfju = this.zzg;
        zzfcn zzfcn = this.zze;
        zzfdi zzfdi = this.zzh;
        zzfca zzfca = this.zzf;
        zzfdi.zza(zzfju.zzd(zzfcn, zzfca, zzfca.zzg), (zzcyi) null);
    }

    public final void zzs(zze zze2) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbH)).booleanValue()) {
            int i = zze2.zza;
            zzfca zzfca = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String zzc2 : zzfca.zzo) {
                arrayList.add(zzfju.zzc(zzc2, "@gw_mpe@", "2." + i));
            }
            this.zzh.zza(this.zzg.zzd(this.zze, zzfca, arrayList), (zzcyi) null);
        }
    }

    public final void zzt() {
        if (this.zzq.compareAndSet(false, true)) {
            int intValue = ((Integer) zzbd.zzc().zzb(zzbde.zzdX)).intValue();
            if (intValue > 0) {
                zzz(intValue, ((Integer) zzbd.zzc().zzb(zzbde.zzdY)).intValue());
                return;
            }
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdW)).booleanValue()) {
                this.zzc.execute(new zzcmv(this));
            } else {
                zzy();
            }
        }
    }

    public final synchronized void zzu() {
        zzcuy zzcuy;
        if (this.zzp) {
            ArrayList arrayList = new ArrayList(zzx());
            zzfca zzfca = this.zzf;
            arrayList.addAll(zzfca.zzf);
            this.zzh.zza(this.zzg.zze(this.zze, zzfca, true, (String) null, (String) null, arrayList, (zzcuu) null), (zzcyi) null);
        } else {
            zzfdi zzfdi = this.zzh;
            zzfju zzfju = this.zzg;
            zzfcn zzfcn = this.zze;
            zzfca zzfca2 = this.zzf;
            zzfdi.zza(zzfju.zzd(zzfcn, zzfca2, zzfca2.zzm), (zzcyi) null);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdT)).booleanValue() && (zzcuy = this.zzm) != null) {
                List<String> list = zzcuy.zzb().zzm;
                String zzg2 = zzcuy.zza().zzg();
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (String zzc2 : list) {
                    arrayList2.add(zzfju.zzc(zzc2, "@gw_adnetstatus@", zzg2));
                }
                long zza2 = zzcuy.zza().zza();
                ArrayList arrayList3 = new ArrayList();
                for (String zzc3 : arrayList2) {
                    arrayList3.add(zzfju.zzc(zzc3, "@gw_ttr@", Long.toString(zza2, 10)));
                }
                zzfdi.zza(zzfju.zzd(zzcuy.zzc(), zzcuy.zzb(), arrayList3), (zzcyi) null);
            }
            zzfdi.zza(zzfju.zzd(zzfcn, zzfca2, zzfca2.zzf), (zzcyi) null);
        }
        this.zzp = true;
    }

    public final void zzv() {
        zzfca zzfca = this.zzf;
        if (zzfca.zze == 4) {
            this.zzh.zza(this.zzg.zzd(this.zze, zzfca, zzfca.zzaA), (zzcyi) null);
        }
    }

    public final void zzw() {
        zzfju zzfju = this.zzg;
        zzfcn zzfcn = this.zze;
        zzfdi zzfdi = this.zzh;
        zzfca zzfca = this.zzf;
        zzfdi.zza(zzfju.zzd(zzfcn, zzfca, zzfca.zzau), (zzcyi) null);
    }
}
