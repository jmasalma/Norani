package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzos {
    private final zzbj zza;
    /* access modifiers changed from: private */
    public zzfyq zzb = zzfyq.zzn();
    private zzfyt zzc = zzfyt.zzd();
    private zzvh zzd;
    private zzvh zze;
    private zzvh zzf;

    public zzos(zzbj zzbj) {
        this.zza = zzbj;
    }

    private static zzvh zzj(zzbh zzbh, zzfyq zzfyq, zzvh zzvh, zzbj zzbj) {
        zzbl zzo = zzbh.zzo();
        int zzf2 = zzbh.zzf();
        Object zzf3 = zzo.zzo() ? null : zzo.zzf(zzf2);
        int zzc2 = (zzbh.zzx() || zzo.zzo()) ? -1 : zzo.zzd(zzf2, zzbj, false).zzc(zzex.zzs(zzbh.zzl()));
        for (int i = 0; i < zzfyq.size(); i++) {
            zzvh zzvh2 = (zzvh) zzfyq.get(i);
            if (zzm(zzvh2, zzf3, zzbh.zzx(), zzbh.zzc(), zzbh.zzd(), zzc2)) {
                return zzvh2;
            }
        }
        if (zzfyq.isEmpty() && zzvh != null) {
            if (zzm(zzvh, zzf3, zzbh.zzx(), zzbh.zzc(), zzbh.zzd(), zzc2)) {
                return zzvh;
            }
        }
        return null;
    }

    private final void zzk(zzfys zzfys, zzvh zzvh, zzbl zzbl) {
        if (zzvh != null) {
            if (zzbl.zza(zzvh.zza) != -1) {
                zzfys.zza(zzvh, zzbl);
                return;
            }
            zzbl zzbl2 = (zzbl) this.zzc.get(zzvh);
            if (zzbl2 != null) {
                zzfys.zza(zzvh, zzbl2);
            }
        }
    }

    private final void zzl(zzbl zzbl) {
        zzfys zzfys = new zzfys();
        if (this.zzb.isEmpty()) {
            zzk(zzfys, this.zze, zzbl);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzfys, this.zzf, zzbl);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzfys, this.zzd, zzbl);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfys, (zzvh) this.zzb.get(i), zzbl);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfys, this.zzd, zzbl);
            }
        }
        this.zzc = zzfys.zzc();
    }

    private static boolean zzm(zzvh zzvh, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzvh.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzvh.zzb == i && zzvh.zzc == i2)) {
                return false;
            }
        } else if (!(zzvh.zzb == -1 && zzvh.zze == i3)) {
            return false;
        }
        return true;
    }

    public final zzbl zza(zzvh zzvh) {
        return (zzbl) this.zzc.get(zzvh);
    }

    public final zzvh zzb() {
        return this.zzd;
    }

    public final zzvh zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfyq zzfyq = this.zzb;
        if (zzfyq instanceof List) {
            List list = zzfyq;
            if (!list.isEmpty()) {
                obj = list.get(list.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator it = zzfyq.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzvh) obj;
    }

    public final zzvh zzd() {
        return this.zze;
    }

    public final zzvh zze() {
        return this.zzf;
    }

    public final void zzg(zzbh zzbh) {
        this.zzd = zzj(zzbh, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzvh zzvh, zzbh zzbh) {
        this.zzb = zzfyq.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzvh) list.get(0);
            zzvh.getClass();
            zzvh zzvh2 = zzvh;
            this.zzf = zzvh;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbh, this.zzb, this.zze, this.zza);
        }
        zzl(zzbh.zzo());
    }

    public final void zzi(zzbh zzbh) {
        this.zzd = zzj(zzbh, this.zzb, this.zze, this.zza);
        zzl(zzbh.zzo());
    }
}
