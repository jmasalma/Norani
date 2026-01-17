package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzlr {
    private final zzph zza;
    private final List zzb = new ArrayList();
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final zzlq zze;
    private final HashMap zzf;
    private final Set zzg;
    /* access modifiers changed from: private */
    public final zzmo zzh;
    /* access modifiers changed from: private */
    public final zzdt zzi;
    private boolean zzj;
    private zzhj zzk;
    private zzxc zzl = new zzxc(0);

    public zzlr(zzlq zzlq, zzmo zzmo, zzdt zzdt, zzph zzph) {
        this.zza = zzph;
        this.zze = zzlq;
        this.zzh = zzmo;
        this.zzi = zzdt;
        this.zzf = new HashMap();
        this.zzg = new HashSet();
    }

    private final void zzr(int i, int i2) {
        while (true) {
            List list = this.zzb;
            if (i < list.size()) {
                ((zzlp) list.get(i)).zzd += i2;
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzs(zzlp zzlp) {
        zzlo zzlo = (zzlo) this.zzf.get(zzlp);
        if (zzlo != null) {
            zzlo.zza.zzi(zzlo.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlp zzlp = (zzlp) it.next();
            if (zzlp.zzc.isEmpty()) {
                zzs(zzlp);
                it.remove();
            }
        }
    }

    private final void zzu(zzlp zzlp) {
        if (zzlp.zze && zzlp.zzc.isEmpty()) {
            zzlo zzlo = (zzlo) this.zzf.remove(zzlp);
            zzlo.getClass();
            zzlo zzlo2 = zzlo;
            zzvj zzvj = zzlo.zza;
            zzvj.zzp(zzlo.zzb);
            zzln zzln = zzlo.zzc;
            zzvj.zzs(zzln);
            zzvj.zzr(zzln);
            this.zzg.remove(zzlp);
        }
    }

    private final void zzv(zzlp zzlp) {
        zzvc zzvc = zzlp.zza;
        zzlh zzlh = new zzlh(this);
        zzln zzln = new zzln(this, zzlp);
        this.zzf.put(zzlp, new zzlo(zzvc, zzlh, zzln));
        zzvc.zzh(new Handler(zzex.zzz(), (Handler.Callback) null), zzln);
        zzvc.zzg(new Handler(zzex.zzz(), (Handler.Callback) null), zzln);
        zzvc.zzm(zzlh, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                zzlp zzlp = (zzlp) this.zzb.remove(i2);
                this.zzd.remove(zzlp.zzb);
                zzr(i2, -zzlp.zza.zzC().zzc());
                zzlp.zze = true;
                if (this.zzj) {
                    zzu(zzlp);
                }
            } else {
                return;
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbl zzb() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbl.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzlp zzlp = (zzlp) list.get(i2);
            zzlp.zzd = i;
            i += zzlp.zza.zzC().zzc();
        }
        return new zzly(list, this.zzl);
    }

    public final zzbl zzc(int i, int i2, List list) {
        boolean z = true;
        zzdd.zzd(i >= 0 && i <= i2 && i2 <= zza());
        if (list.size() != i2 - i) {
            z = false;
        }
        zzdd.zzd(z);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzlp) this.zzb.get(i3)).zza.zzt((zzap) list.get(i3 - i));
        }
        return zzb();
    }

    public final void zzg(zzhj zzhj) {
        zzdd.zzf(!this.zzj);
        this.zzk = zzhj;
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i < list.size()) {
                zzlp zzlp = (zzlp) list.get(i);
                zzv(zzlp);
                this.zzg.add(zzlp);
                i++;
            } else {
                this.zzj = true;
                return;
            }
        }
    }

    public final void zzh() {
        for (zzlo zzlo : this.zzf.values()) {
            try {
                zzlo.zza.zzp(zzlo.zzb);
            } catch (RuntimeException e) {
                zzea.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzvj zzvj = zzlo.zza;
            zzln zzln = zzlo.zzc;
            zzvj.zzs(zzln);
            zzvj.zzr(zzln);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzvf zzvf) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlp zzlp = (zzlp) identityHashMap.remove(zzvf);
        zzlp.getClass();
        zzlp zzlp2 = zzlp;
        zzlp.zza.zzG(zzvf);
        zzlp.zzc.remove(((zzuz) zzvf).zza);
        if (!identityHashMap.isEmpty()) {
            zzt();
        }
        zzu(zzlp);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbl zzk(int i, List list, zzxc zzxc) {
        if (!list.isEmpty()) {
            this.zzl = zzxc;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzlp zzlp = (zzlp) list.get(i2 - i);
                if (i2 > 0) {
                    zzlp zzlp2 = (zzlp) this.zzb.get(i2 - 1);
                    zzlp.zzc(zzlp2.zzd + zzlp2.zza.zzC().zzc());
                } else {
                    zzlp.zzc(0);
                }
                zzr(i2, zzlp.zza.zzC().zzc());
                this.zzb.add(i2, zzlp);
                this.zzd.put(zzlp.zzb, zzlp);
                if (this.zzj) {
                    zzv(zzlp);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlp);
                    } else {
                        zzs(zzlp);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbl zzl(int i, int i2, int i3, zzxc zzxc) {
        zzdd.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbl zzm(int i, int i2, zzxc zzxc) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzdd.zzd(z);
        this.zzl = zzxc;
        zzw(i, i2);
        return zzb();
    }

    public final zzbl zzn(List list, zzxc zzxc) {
        List list2 = this.zzb;
        zzw(0, list2.size());
        return zzk(list2.size(), list, zzxc);
    }

    public final zzbl zzo(zzxc zzxc) {
        int zza2 = zza();
        if (zzxc.zzc() != zza2) {
            zzxc = zzxc.zzf().zzg(0, zza2);
        }
        this.zzl = zzxc;
        return zzb();
    }

    public final zzvf zzp(zzvh zzvh, zzzm zzzm, long j) {
        int i = zzly.zzb;
        Pair pair = (Pair) zzvh.zza;
        Object obj = pair.first;
        zzvh zza2 = zzvh.zza(pair.second);
        zzlp zzlp = (zzlp) this.zzd.get(obj);
        zzlp.getClass();
        zzlp zzlp2 = zzlp;
        this.zzg.add(zzlp);
        zzlo zzlo = (zzlo) this.zzf.get(zzlp);
        if (zzlo != null) {
            zzlo.zza.zzk(zzlo.zzb);
        }
        zzlp.zzc.add(zza2);
        zzuz zzH = zzlp.zza.zzI(zza2, zzzm, j);
        this.zzc.put(zzH, zzlp);
        zzt();
        return zzH;
    }

    public final zzxc zzq() {
        return this.zzl;
    }
}
