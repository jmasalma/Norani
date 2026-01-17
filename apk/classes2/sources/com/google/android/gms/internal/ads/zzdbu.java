package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdbu {
    /* access modifiers changed from: private */
    public final Set zza = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzb = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzc = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzd = new HashSet();
    /* access modifiers changed from: private */
    public final Set zze = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzf = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzg = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzh = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzi = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzj = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzk = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzl = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzm = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzn = new HashSet();
    /* access modifiers changed from: private */
    public zzezo zzo;

    public final zzdbu zza(zza zza2, Executor executor) {
        this.zzc.add(new zzddv(zza2, executor));
        return this;
    }

    public final zzdbu zzb(zzcwb zzcwb, Executor executor) {
        this.zzi.add(new zzddv(zzcwb, executor));
        return this;
    }

    public final zzdbu zzc(zzcwo zzcwo, Executor executor) {
        this.zzl.add(new zzddv(zzcwo, executor));
        return this;
    }

    public final zzdbu zzd(zzcws zzcws, Executor executor) {
        this.zzf.add(new zzddv(zzcws, executor));
        return this;
    }

    public final zzdbu zze(zzcvy zzcvy, Executor executor) {
        this.zze.add(new zzddv(zzcvy, executor));
        return this;
    }

    public final zzdbu zzf(zzcxm zzcxm, Executor executor) {
        this.zzh.add(new zzddv(zzcxm, executor));
        return this;
    }

    public final zzdbu zzg(zzcxx zzcxx, Executor executor) {
        this.zzg.add(new zzddv(zzcxx, executor));
        return this;
    }

    public final zzdbu zzh(zzr zzr, Executor executor) {
        this.zzn.add(new zzddv(zzr, executor));
        return this;
    }

    public final zzdbu zzi(zzcyk zzcyk, Executor executor) {
        this.zzm.add(new zzddv(zzcyk, executor));
        return this;
    }

    public final zzdbu zzj(zzcza zzcza, Executor executor) {
        this.zzb.add(new zzddv(zzcza, executor));
        return this;
    }

    public final zzdbu zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzddv(appEventListener, executor));
        return this;
    }

    public final zzdbu zzl(zzded zzded, Executor executor) {
        this.zzd.add(new zzddv(zzded, executor));
        return this;
    }

    public final zzdbu zzm(zzezo zzezo) {
        this.zzo = zzezo;
        return this;
    }

    public final zzdbw zzn() {
        return new zzdbw(this, (zzdbv) null);
    }
}
