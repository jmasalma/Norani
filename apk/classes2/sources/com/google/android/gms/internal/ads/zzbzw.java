package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbzw implements zzazw {
    final zzbzt zza;
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private final Object zzd = new Object();
    private final zzg zze;
    private final zzbzu zzf;
    private boolean zzg = false;

    public zzbzw(String str, zzg zzg2) {
        this.zza = new zzbzt(str, zzg2);
        this.zze = zzg2;
        this.zzf = new zzbzu();
    }

    public final void zza(boolean z) {
        long currentTimeMillis = zzv.zzD().currentTimeMillis();
        if (z) {
            zzg zzg2 = this.zze;
            if (currentTimeMillis - zzg2.zzd() > ((Long) zzbd.zzc().zzb(zzbde.zzbh)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = zzg2.zzc();
            }
            this.zzg = true;
            return;
        }
        zzg zzg3 = this.zze;
        zzg3.zzr(currentTimeMillis);
        zzg3.zzG(this.zza.zzd);
    }

    public final int zzb() {
        int zza2;
        synchronized (this.zzd) {
            zza2 = this.zza.zza();
        }
        return zza2;
    }

    public final zzbzl zzc(Clock clock, String str) {
        return new zzbzl(clock, this, this.zzf.zza(), str);
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    public final void zze(zzbzl zzbzl) {
        synchronized (this.zzd) {
            this.zzb.add(zzbzl);
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzd();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zze();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzj(zzm zzm, long j) {
        synchronized (this.zzd) {
            this.zza.zzg(zzm, j);
        }
    }

    public final void zzk() {
        synchronized (this.zzd) {
            this.zza.zzh();
        }
    }

    public final void zzl(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    public final Bundle zzn(Context context, zzfed zzfed) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzb(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zzbzl) it2.next()).zza());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzfed.zzc(hashSet);
            return bundle;
        }
        zzbzv zzbzv = (zzbzv) it.next();
        throw null;
    }
}
