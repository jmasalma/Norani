package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzug implements zzvj {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzvr zzc = new zzvr();
    private final zzsc zzd = new zzsc();
    private Looper zze;
    private zzbl zzf;
    private zzph zzg;

    public /* synthetic */ zzbl zzM() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzph zzb() {
        zzph zzph = this.zzg;
        zzdd.zzb(zzph);
        zzph zzph2 = zzph;
        return zzph;
    }

    /* access modifiers changed from: protected */
    public final zzsc zzc(zzvh zzvh) {
        return this.zzd.zza(0, zzvh);
    }

    /* access modifiers changed from: protected */
    public final zzsc zzd(int i, zzvh zzvh) {
        return this.zzd.zza(0, zzvh);
    }

    /* access modifiers changed from: protected */
    public final zzvr zze(zzvh zzvh) {
        return this.zzc.zza(0, zzvh);
    }

    /* access modifiers changed from: protected */
    public final zzvr zzf(int i, zzvh zzvh) {
        return this.zzc.zza(0, zzvh);
    }

    public final void zzg(Handler handler, zzsd zzsd) {
        this.zzd.zzb(handler, zzsd);
    }

    public final void zzh(Handler handler, zzvs zzvs) {
        this.zzc.zzb(handler, zzvs);
    }

    public final void zzi(zzvi zzvi) {
        HashSet hashSet = this.zzb;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(zzvi);
        if (z && hashSet.isEmpty()) {
            zzj();
        }
    }

    /* access modifiers changed from: protected */
    public void zzj() {
    }

    public final void zzk(zzvi zzvi) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zzvi);
        if (isEmpty) {
            zzl();
        }
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    public final void zzm(zzvi zzvi, zzhj zzhj, zzph zzph) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (!(looper == null || looper == myLooper)) {
            z = false;
        }
        zzdd.zzd(z);
        this.zzg = zzph;
        zzbl zzbl = this.zzf;
        this.zza.add(zzvi);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzvi);
            zzn(zzhj);
        } else if (zzbl != null) {
            zzk(zzvi);
            zzvi.zza(this, zzbl);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzn(zzhj zzhj);

    /* access modifiers changed from: protected */
    public final void zzo(zzbl zzbl) {
        this.zzf = zzbl;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzvi) arrayList.get(i)).zza(this, zzbl);
        }
    }

    public final void zzp(zzvi zzvi) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzvi);
        if (arrayList.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzvi);
    }

    /* access modifiers changed from: protected */
    public abstract void zzq();

    public final void zzr(zzsd zzsd) {
        this.zzd.zzc(zzsd);
    }

    public final void zzs(zzvs zzvs) {
        this.zzc.zzi(zzvs);
    }

    public /* synthetic */ void zzt(zzap zzap) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzu() {
        return !this.zzb.isEmpty();
    }

    public /* synthetic */ boolean zzv() {
        return true;
    }
}
