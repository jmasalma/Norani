package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdtp {
    private final zzble zza;

    zzdtp(zzble zzble) {
        this.zza = zzble;
    }

    private final void zzs(zzdtn zzdtn) throws RemoteException {
        String zza2 = zzdtn.zza(zzdtn);
        String concat = "Dispatching AFMA event on publisher webview: ".concat(zza2);
        int i = zze.zza;
        zzo.zzi(concat);
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdtn("initialize", (zzdto) null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdClicked";
        this.zza.zzb(zzdtn.zza(zzdtn));
    }

    public final void zzc(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdClosed";
        zzs(zzdtn);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdFailedToLoad";
        zzdtn.zzd = Integer.valueOf(i);
        zzs(zzdtn);
    }

    public final void zze(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdLoaded";
        zzs(zzdtn);
    }

    public final void zzf(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtn);
    }

    public final void zzg(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("interstitial", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdOpened";
        zzs(zzdtn);
    }

    public final void zzh(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("creation", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "nativeObjectCreated";
        zzs(zzdtn);
    }

    public final void zzi(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("creation", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "nativeObjectNotCreated";
        zzs(zzdtn);
    }

    public final void zzj(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdClicked";
        zzs(zzdtn);
    }

    public final void zzk(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onRewardedAdClosed";
        zzs(zzdtn);
    }

    public final void zzl(long j, zzbws zzbws) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onUserEarnedReward";
        zzdtn.zze = zzbws.zzf();
        zzdtn.zzf = Integer.valueOf(zzbws.zze());
        zzs(zzdtn);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onRewardedAdFailedToLoad";
        zzdtn.zzd = Integer.valueOf(i);
        zzs(zzdtn);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onRewardedAdFailedToShow";
        zzdtn.zzd = Integer.valueOf(i);
        zzs(zzdtn);
    }

    public final void zzo(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onAdImpression";
        zzs(zzdtn);
    }

    public final void zzp(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onRewardedAdLoaded";
        zzs(zzdtn);
    }

    public final void zzq(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtn);
    }

    public final void zzr(long j) throws RemoteException {
        zzdtn zzdtn = new zzdtn("rewarded", (zzdto) null);
        zzdtn.zza = Long.valueOf(j);
        zzdtn.zzc = "onRewardedAdOpened";
        zzs(zzdtn);
    }
}
