package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdam implements AppEventListener, OnAdMetadataChangedListener, zzcvy, zza, zzcyk, zzcws, zzcxx, zzr, zzcwo, zzded {
    private final zzdaj zza = new zzdaj(this, (zzdal) null);
    /* access modifiers changed from: private */
    @Nullable
    public zzeky zzb;
    /* access modifiers changed from: private */
    @Nullable
    public zzelc zzc;
    /* access modifiers changed from: private */
    @Nullable
    public zzexy zzd;
    /* access modifiers changed from: private */
    @Nullable
    public zzfbd zze;

    private static void zzn(Object obj, zzdak zzdak) {
        if (obj != null) {
            zzdak.zza(obj);
        }
    }

    public final void onAdClicked() {
        zzn(this.zzb, new zzczc());
        zzn(this.zzc, new zzczd());
    }

    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzczi());
    }

    public final void onAppEvent(String str, String str2) {
        zzn(this.zzb, new zzczo(str, str2));
    }

    public final void zza() {
        zzn(this.zzb, new zzdah());
        zzn(this.zze, new zzdai());
    }

    public final void zzb() {
        zzn(this.zzb, new zzdaa());
        zzn(this.zze, new zzdab());
    }

    public final void zzc() {
        zzn(this.zzb, new zzczj());
        zzn(this.zze, new zzczk());
    }

    public final void zzd() {
        zzn(this.zzd, new zzczv());
    }

    public final void zzdH() {
        zzn(this.zzb, new zzczp());
    }

    public final void zzdf() {
        zzn(this.zzb, new zzczx());
        zzn(this.zzc, new zzdac());
        zzn(this.zze, new zzdad());
        zzn(this.zzd, new zzdae());
    }

    public final void zzdk() {
        zzn(this.zzd, new zzczh());
    }

    public final void zzds() {
        zzn(this.zzd, new zzczu());
    }

    public final void zzdt() {
        zzn(this.zzd, new zzczq());
    }

    public final void zzdu(zzbwc zzbwc, String str, String str2) {
        zzn(this.zzb, new zzczl(zzbwc, str, str2));
        zzn(this.zze, new zzczn(zzbwc, str, str2));
    }

    public final void zzdv() {
        zzn(this.zzd, new zzczw());
    }

    public final void zzdw(int i) {
        zzn(this.zzd, new zzczy(i));
    }

    public final void zze() {
        zzn(this.zzb, new zzczb());
        zzn(this.zze, new zzczm());
    }

    public final void zzf() {
        zzn(this.zzb, new zzcze());
        zzn(this.zze, new zzczf());
    }

    public final void zzg() {
        zzn(this.zzd, new zzczz());
    }

    public final void zzh(zzt zzt) {
        zzn(this.zzb, new zzczr(zzt));
        zzn(this.zze, new zzczs(zzt));
        zzn(this.zzd, new zzczt(zzt));
    }

    public final zzdaj zzi() {
        return this.zza;
    }

    public final void zzs(zze zze2) {
        zzn(this.zze, new zzdaf(zze2));
        zzn(this.zzb, new zzdag(zze2));
    }

    public final void zzt() {
        zzn(this.zzb, new zzczg());
    }
}
