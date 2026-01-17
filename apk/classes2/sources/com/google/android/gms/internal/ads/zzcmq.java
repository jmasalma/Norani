package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcmq {
    zzbup zza;
    zzbup zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    private final zzg zzd;
    private final zzedi zze;
    private final zzdpo zzf;
    /* access modifiers changed from: private */
    public final zzgdy zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcmq(Context context, zzg zzg2, zzedi zzedi, zzdpo zzdpo, zzgdy zzgdy, zzgdy zzgdy2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzg2;
        this.zze = zzedi;
        this.zzf = zzdpo;
        this.zzg = zzgdy;
        this.zzh = zzgdy2;
        this.zzi = scheduledExecutorService;
    }

    public static /* synthetic */ ListenableFuture zzb(zzcmq zzcmq, Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkH), "1");
            buildUpon.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkG), "12");
            if (str.contains((CharSequence) zzbd.zzc().zzb(zzbde.zzkI))) {
                buildUpon.authority((String) zzbd.zzc().zzb(zzbde.zzkJ));
            }
            return (zzgde) zzgdn.zzn(zzgde.zzw(zzcmq.zze.zzb(buildUpon.build(), inputEvent)), new zzcmm(builder), zzcmq.zzh);
        }
        builder.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkG), "10");
        return zzgdn.zzh(builder.toString());
    }

    public static /* synthetic */ ListenableFuture zzd(zzcmq zzcmq, Uri.Builder builder, Throwable th) {
        zzcmq.zzg.zza(new zzcmi(zzcmq, th));
        builder.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkG), "9");
        return zzgdn.zzh(builder.toString());
    }

    public static /* synthetic */ void zzg(zzcmq zzcmq, Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkL)).booleanValue()) {
            zzbup zzc2 = zzbun.zzc(zzcmq.zzc);
            zzcmq.zzb = zzc2;
            zzc2.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbup zza2 = zzbun.zza(zzcmq.zzc);
        zzcmq.zza = zza2;
        zza2.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public static /* synthetic */ void zzh(zzcmq zzcmq, Throwable th) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkL)).booleanValue()) {
            zzbup zzc2 = zzbun.zzc(zzcmq.zzc);
            zzcmq.zzb = zzc2;
            zzc2.zzh(th, "AttributionReporting");
            return;
        }
        zzbup zza2 = zzbun.zza(zzcmq.zzc);
        zzcmq.zza = zza2;
        zza2.zzh(th, "AttributionReportingSampled");
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzbd.zzc().zzb(zzbde.zzkE));
    }

    private final ListenableFuture zzk(String str, InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) zzbd.zzc().zzb(zzbde.zzkE)) || this.zzd.zzN()) {
                return zzgdn.zzh(str);
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            long nextInt = (long) random.nextInt(IntCompanionObject.MAX_VALUE);
            buildUpon.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkF), String.valueOf(nextInt));
            if (inputEvent != null) {
                return (zzgde) zzgdn.zzf((zzgde) zzgdn.zzn(zzgde.zzw(this.zze.zza()), new zzcmk(this, buildUpon, str, inputEvent), this.zzh), Throwable.class, new zzcml(this, buildUpon), this.zzg);
            }
            buildUpon.appendQueryParameter((String) zzbd.zzc().zzb(zzbde.zzkG), "11");
            return zzgdn.zzh(buildUpon.toString());
        } catch (Exception e) {
            return zzgdn.zzg(e);
        }
    }

    public final ListenableFuture zze(String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgdn.zzh(str);
        }
        return zzgdn.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzcmh(this, str), this.zzg);
    }

    public final void zzi(String str, zzfjy zzfjy, Random random, zzv zzv) {
        if (!TextUtils.isEmpty(str)) {
            ListenableFuture zzk = zzk(str, this.zzf.zza(), random);
            zzbcv zzbcv = zzbde.zzkK;
            zzgdn.zzr(zzgdn.zzo(zzk, (long) ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmp(this, zzfjy, str, zzv), this.zzg);
        }
    }
}
