package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzehi implements zzgcu {
    private final zzfha zza;
    private final zzcwa zzb;
    private final zzfju zzc;
    private final zzfjy zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrd zzg;
    private final zzehb zzh;
    private final zzedr zzi;
    private final Context zzj;
    private final zzfhu zzk;
    private final zzegl zzl;
    private final zzdsd zzm;

    zzehi(Context context, zzfha zzfha, zzehb zzehb, zzcwa zzcwa, zzfju zzfju, zzfjy zzfjy, zzcrd zzcrd, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedr zzedr, zzfhu zzfhu, zzegl zzegl, zzdsd zzdsd) {
        this.zzj = context;
        this.zza = zzfha;
        this.zzh = zzehb;
        this.zzb = zzcwa;
        this.zzc = zzfju;
        this.zzd = zzfjy;
        this.zzg = zzcrd;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedr;
        this.zzk = zzfhu;
        this.zzl = zzegl;
        this.zzm = zzdsd;
    }

    public static /* synthetic */ ListenableFuture zzb(zzehi zzehi, zzfca zzfca, zzfcn zzfcn, zzedm zzedm, Throwable th) {
        zzfhj zza2 = zzfhi.zza(zzehi.zzj, 12);
        zza2.zzd(zzfca.zzE);
        zza2.zzi();
        ListenableFuture zzo = zzgdn.zzo(zzedm.zza(zzfcn, zzfca), (long) zzfca.zzR, TimeUnit.MILLISECONDS, zzehi.zzf);
        zzehi.zzh.zzf(zzfcn, zzfca, zzo, zzehi.zzc);
        zzfht.zza(zzo, zzehi.zzk, zza2);
        return zzo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzfP)).booleanValue() == false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String zzc(com.google.android.gms.internal.ads.zzfcn r5) {
        /*
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfQ
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L_0x0018
            java.lang.String r0 = "No ad config."
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            com.google.android.gms.internal.ads.zzfcm r5 = r5.zzb
            com.google.android.gms.internal.ads.zzfcd r5 = r5.zzb
            int r2 = r5.zzf
            if (r2 == 0) goto L_0x0054
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L_0x003c
            if (r2 >= r4) goto L_0x003c
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzfP
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0054
            goto L_0x0055
        L_0x003c:
            if (r2 < r4) goto L_0x0045
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L_0x0045
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L_0x0055
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Received error HTTP response code: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L_0x0055
        L_0x0054:
            r1 = r0
        L_0x0055:
            com.google.android.gms.internal.ads.zzfcc r5 = r5.zzj
            if (r5 == 0) goto L_0x005e
            java.lang.String r5 = r5.zza()
            return r5
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehi.zzc(com.google.android.gms.internal.ads.zzfcn):java.lang.String");
    }

    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        zzfcn zzfcn = (zzfcn) obj;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = zzfcn.zzb.zzd) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcr)).booleanValue()) {
            this.zzm.zza().putLong(zzdrr.RENDERING_START.zza(), zzv.zzD().currentTimeMillis());
        }
        String zzc2 = zzc(zzfcn);
        zzedr zzedr = this.zzi;
        zzfcm zzfcm = zzfcn.zzb;
        zzfcd zzfcd = zzfcm.zzb;
        zzedr.zzi(zzfcd);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zziI)).booleanValue() && (i = zzfcd.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgdn.zzg(new zzehf(3, zzc2));
        }
        String str = zzfcd.zzq;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdR)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfca zzfca : zzfcm.zza) {
                zzedr.zzd(zzfca);
                Iterator it = zzfca.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzedr.zzf(zzfca, 0, zzfdx.zzd(1, (String) null, (zze) null));
                        break;
                    }
                    zzedm zza2 = this.zzg.zza(zzfca.zzb, (String) it.next());
                    if (zza2 != null && zza2.zzb(zzfcn, zzfca)) {
                        break;
                    }
                }
            }
        } else {
            zzedr.zzh(str, zzfcm.zza);
        }
        zzcwa zzcwa = this.zzb;
        zzcmu zzcmu = new zzcmu(zzfcn, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcwa.zzo(zzcmu, executor);
        if (zzfcd.zzr > 1) {
            return this.zzl.zzb(zzfcn);
        }
        String zzc3 = zzc(zzfcn);
        zzfha zzfha = this.zza;
        zzfgu zzfgu = zzfgu.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfha);
        zzfgg zza3 = zzfgk.zzc(zzgdn.zzg(new zzehf(3, zzc3)), zzfgu, zzfha).zza();
        zzehb zzehb = this.zzh;
        zzehb.zzl();
        int i2 = 0;
        for (zzfca zzfca2 : zzfcm.zza) {
            Iterator it2 = zzfca2.zza.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    zzedm zza4 = this.zzg.zza(zzfca2.zzb, str2);
                    if (zza4 != null && zza4.zzb(zzfcn, zzfca2)) {
                        zzfgq zzb2 = zzfha.zzb(zzfgu.RENDER_CONFIG_WATERFALL, zza3);
                        zza3 = zzb2.zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzehg(this, zzfca2, zzfcn, zza4)).zza();
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzehb);
        zza3.addListener(new zzehh(zzehb), executor);
        return zza3;
    }
}
