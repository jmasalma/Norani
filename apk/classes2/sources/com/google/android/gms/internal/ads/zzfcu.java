package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfcu {
    /* access modifiers changed from: private */
    public zzm zza;
    /* access modifiers changed from: private */
    public zzr zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzgc zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbge zzh;
    /* access modifiers changed from: private */
    public zzx zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzco zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbmp zzn;
    /* access modifiers changed from: private */
    public final zzfch zzo = new zzfch();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public boolean zzq = false;
    /* access modifiers changed from: private */
    public zzeky zzr;
    /* access modifiers changed from: private */
    public boolean zzs = false;
    /* access modifiers changed from: private */
    public Bundle zzt;
    /* access modifiers changed from: private */
    public final AtomicLong zzu = new AtomicLong();
    /* access modifiers changed from: private */
    public zzcs zzv;

    public final zzfcu zzA(boolean z) {
        this.zzs = true;
        return this;
    }

    public final zzfcu zzB(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfcu zzC(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfcu zzD(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfcu zzE(zzbge zzbge) {
        this.zzh = zzbge;
        return this;
    }

    public final zzfcu zzF(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfcu zzG(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfcu zzH(long j) {
        this.zzu.set(j);
        return this;
    }

    public final zzfcu zzI(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzb();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfcu zzJ(zzm zzm2) {
        this.zza = zzm2;
        return this;
    }

    public final zzfcu zzK(zzgc zzgc) {
        this.zzd = zzgc;
        return this;
    }

    public final zzfcw zzL() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcw(this, (zzfcv) null);
    }

    public final String zzN() {
        return this.zzc;
    }

    public final boolean zzV() {
        return this.zzp;
    }

    public final boolean zzW() {
        return this.zzq;
    }

    public final zzfcu zzY(zzcs zzcs) {
        this.zzv = zzcs;
        return this;
    }

    public final long zzb() {
        return this.zzu.get();
    }

    public final zzm zzg() {
        return this.zza;
    }

    public final zzr zzi() {
        return this.zzb;
    }

    public final zzfch zzq() {
        return this.zzo;
    }

    public final zzfcu zzr(zzfcw zzfcw) {
        this.zzo.zza(zzfcw.zzo.zza);
        this.zza = zzfcw.zzd;
        this.zzb = zzfcw.zze;
        this.zzv = zzfcw.zzu;
        this.zzc = zzfcw.zzf;
        this.zzd = zzfcw.zza;
        this.zzf = zzfcw.zzg;
        this.zzg = zzfcw.zzh;
        this.zzh = zzfcw.zzi;
        this.zzi = zzfcw.zzj;
        zzs(zzfcw.zzl);
        zzI(zzfcw.zzm);
        this.zzp = zzfcw.zzp;
        this.zzq = zzfcw.zzq;
        this.zzr = zzfcw.zzc;
        this.zzs = zzfcw.zzr;
        this.zzt = zzfcw.zzs;
        this.zzu.set(zzfcw.zzt.get());
        return this;
    }

    public final zzfcu zzs(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfcu zzt(zzr zzr2) {
        this.zzb = zzr2;
        return this;
    }

    public final zzfcu zzu(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfcu zzv(zzx zzx) {
        this.zzi = zzx;
        return this;
    }

    public final zzfcu zzw(zzeky zzeky) {
        this.zzr = zzeky;
        return this;
    }

    public final zzfcu zzx(zzbmp zzbmp) {
        this.zzn = zzbmp;
        this.zzd = new zzgc(false, true, false);
        return this;
    }

    public final zzfcu zzy(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfcu zzz(boolean z) {
        this.zzq = z;
        return this;
    }
}
