package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzaqd implements Comparable {
    /* access modifiers changed from: private */
    public final zzaqo zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaqh zzf;
    private Integer zzg;
    private zzaqg zzh;
    private boolean zzi;
    private zzapm zzj;
    private zzaqc zzk;
    private final zzapr zzl;

    public zzaqd(int i, String str, zzaqh zzaqh) {
        Uri parse;
        String host;
        this.zza = zzaqo.zza ? new zzaqo() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaqh;
        this.zzl = new zzapr();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaqd) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzapm zzd() {
        return this.zzj;
    }

    public final zzaqd zze(zzapm zzapm) {
        this.zzj = zzapm;
        return this;
    }

    public final zzaqd zzf(zzaqg zzaqg) {
        this.zzh = zzaqg;
        return this;
    }

    public final zzaqd zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzaqj zzh(zzapz zzapz);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzapl {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzaqo.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaqm zzaqm) {
        zzaqh zzaqh;
        synchronized (this.zze) {
            zzaqh = this.zzf;
        }
        zzaqh.zza(zzaqm);
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzaqg zzaqg = this.zzh;
        if (zzaqg != null) {
            zzaqg.zzb(this);
        }
        if (zzaqo.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaqb(this, str, id));
                return;
            }
            zzaqo zzaqo = this.zza;
            zzaqo.zza(str, id);
            zzaqo.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzaqc zzaqc;
        synchronized (this.zze) {
            zzaqc = this.zzk;
        }
        if (zzaqc != null) {
            zzaqc.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzaqj zzaqj) {
        zzaqc zzaqc;
        synchronized (this.zze) {
            zzaqc = this.zzk;
        }
        if (zzaqc != null) {
            zzaqc.zzb(this, zzaqj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i) {
        zzaqg zzaqg = this.zzh;
        if (zzaqg != null) {
            zzaqg.zzc(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzaqc zzaqc) {
        synchronized (this.zze) {
            this.zzk = zzaqc;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzapl {
        return null;
    }

    public final zzapr zzy() {
        return this.zzl;
    }
}
