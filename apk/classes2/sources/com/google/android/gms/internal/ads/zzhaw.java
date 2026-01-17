package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhaw implements zzhbl {
    private final zzhas zza;
    private final zzhbx zzb;
    private final boolean zzc;
    private final zzgys zzd;

    private zzhaw(zzhbx zzhbx, zzgys zzgys, zzhas zzhas) {
        this.zzb = zzhbx;
        this.zzc = zzhas instanceof zzgzd;
        this.zzd = zzgys;
        this.zza = zzhas;
    }

    static zzhaw zzc(zzhbx zzhbx, zzgys zzgys, zzhas zzhas) {
        return new zzhaw(zzhbx, zzgys, zzhas);
    }

    public final int zza(Object obj) {
        zzhby zzhby = ((zzgzh) obj).zzt;
        zzhby zzhby2 = zzhby;
        int zzb2 = zzhby.zzb();
        return this.zzc ? zzb2 + ((zzgzd) obj).zza.zzd() : zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zzgzh) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzgzd) obj).zza.zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzhas zzhas = this.zza;
        if (zzhas instanceof zzgzh) {
            return ((zzgzh) zzhas).zzbj();
        }
        return zzhas.zzcY().zzbs();
    }

    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzhbn.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhbn.zzp(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzhbf zzhbf, zzgyr zzgyr) throws IOException {
        this.zzb.zza(obj);
        zzgzd zzgzd = (zzgzd) obj;
        throw null;
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgxn zzgxn) throws IOException {
        zzgzh zzgzh = (zzgzh) obj;
        if (zzgzh.zzt == zzhby.zzc()) {
            zzgzh.zzt = zzhby.zzf();
        }
        zzgzd zzgzd = (zzgzd) obj;
        throw null;
    }

    public final void zzj(Object obj, zzhcm zzhcm) throws IOException {
        Iterator zzf = ((zzgzd) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgyv zzgyv = (zzgyv) entry.getKey();
            if (zzgyv.zzc() != zzhcl.MESSAGE || zzgyv.zze() || zzgyv.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzgzz) {
                zzhcm.zzw(zzgyv.zza(), ((zzgzz) entry).zza().zzb());
            } else {
                zzhcm.zzw(zzgyv.zza(), entry.getValue());
            }
        }
        zzhby zzhby = ((zzgzh) obj).zzt;
        zzhby zzhby2 = zzhby;
        zzhby.zzk(zzhcm);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgzh) obj).zzt.equals(((zzgzh) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgzd) obj).zza.equals(((zzgzd) obj2).zza);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return ((zzgzd) obj).zza.zzi();
    }
}
