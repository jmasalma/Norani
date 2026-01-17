package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdti implements AppEventListener, zzcza, zza, zzcvy, zzcws, zzcwt, zzcxm, zzcwb, zzfhb {
    private final List zza;
    private final zzdsw zzb;
    private long zzc;

    public zzdti(zzdsw zzdsw, zzche zzche) {
        this.zzb = zzdsw;
        this.zza = Collections.singletonList(zzche);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    public final void onAdClicked() {
        zzg(zza.class, "onAdClicked", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void zza() {
        zzg(zzcvy.class, "onAdClosed", new Object[0]);
    }

    public final void zzb() {
        zzg(zzcvy.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzc() {
        zzg(zzcvy.class, "onAdOpened", new Object[0]);
    }

    public final void zzd(zzfgu zzfgu, String str) {
        zzg(zzfgt.class, "onTaskSucceeded", str);
    }

    public final void zzdD(zze zze) {
        zzg(zzcwb.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zzdE(zzfgu zzfgu, String str) {
        zzg(zzfgt.class, "onTaskCreated", str);
    }

    public final void zzdF(zzfgu zzfgu, String str, Throwable th) {
        zzg(zzfgt.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzdG(zzfgu zzfgu, String str) {
        zzg(zzfgt.class, "onTaskStarted", str);
    }

    public final void zzdj(Context context) {
        zzg(zzcwt.class, "onDestroy", context);
    }

    public final void zzdl(Context context) {
        zzg(zzcwt.class, "onPause", context);
    }

    public final void zzdm(Context context) {
        zzg(zzcwt.class, "onResume", context);
    }

    public final void zzdn(zzbvq zzbvq) {
        this.zzc = zzv.zzD().elapsedRealtime();
        zzg(zzcza.class, "onAdRequest", new Object[0]);
    }

    public final void zzdo(zzfcn zzfcn) {
    }

    @ParametersAreNonnullByDefault
    public final void zzdu(zzbwc zzbwc, String str, String str2) {
        zzg(zzcvy.class, "onRewarded", zzbwc, str, str2);
    }

    public final void zze() {
        zzg(zzcvy.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzf() {
        zzg(zzcvy.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzt() {
        zzg(zzcws.class, "onAdImpression", new Object[0]);
    }

    public final void zzu() {
        long elapsedRealtime = zzv.zzD().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zzg(zzcxm.class, "onAdLoaded", new Object[0]);
    }
}
