package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzup extends zzug {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhj zzc;

    protected zzup() {
    }

    /* access modifiers changed from: protected */
    public abstract void zzA(Object obj, zzvj zzvj, zzbl zzbl);

    /* access modifiers changed from: protected */
    public final void zzB(Object obj, zzvj zzvj) {
        HashMap hashMap = this.zza;
        zzdd.zzd(!hashMap.containsKey(obj));
        zzum zzum = new zzum(this, obj);
        zzun zzun = new zzun(this, obj);
        hashMap.put(obj, new zzuo(zzvj, zzum, zzun));
        Handler handler = this.zzb;
        handler.getClass();
        Handler handler2 = handler;
        zzvj.zzh(handler, zzun);
        Handler handler3 = this.zzb;
        handler3.getClass();
        Handler handler4 = handler3;
        zzvj.zzg(handler3, zzun);
        zzvj.zzm(zzum, this.zzc, zzb());
        if (!zzu()) {
            zzvj.zzi(zzum);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zzuo zzuo : this.zza.values()) {
            zzuo.zza.zzi(zzuo.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zzuo zzuo : this.zza.values()) {
            zzuo.zza.zzk(zzuo.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzhj zzhj) {
        this.zzc = zzhj;
        this.zzb = zzex.zzy((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        HashMap hashMap = this.zza;
        for (zzuo zzuo : hashMap.values()) {
            zzvj zzvj = zzuo.zza;
            zzvj.zzp(zzuo.zzb);
            zzun zzun = zzuo.zzc;
            zzvj.zzs(zzun);
            zzvj.zzr(zzun);
        }
        hashMap.clear();
    }

    /* access modifiers changed from: protected */
    public int zzw(Object obj, int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long zzx(Object obj, long j, zzvh zzvh) {
        return j;
    }

    /* access modifiers changed from: protected */
    public zzvh zzy(Object obj, zzvh zzvh) {
        throw null;
    }

    public void zzz() throws IOException {
        for (zzuo zzuo : this.zza.values()) {
            zzuo.zza.zzz();
        }
    }
}
