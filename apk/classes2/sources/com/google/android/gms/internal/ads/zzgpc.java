package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgpc {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgpc() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgpc zza(zzgmt zzgmt) throws GeneralSecurityException {
        zzgpd zzgpd = new zzgpd(zzgmt.zzd(), zzgmt.zzc(), (zzgpf) null);
        Map map = this.zzb;
        if (map.containsKey(zzgpd)) {
            zzgmt zzgmt2 = (zzgmt) map.get(zzgpd);
            if (!zzgmt2.equals(zzgmt) || !zzgmt.equals(zzgmt2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpd.toString()));
            }
        } else {
            map.put(zzgpd, zzgmt);
        }
        return this;
    }

    public final zzgpc zzb(zzgmx zzgmx) throws GeneralSecurityException {
        zzgpe zzgpe = new zzgpe(zzgmx.zzc(), zzgmx.zzd(), (zzgpf) null);
        Map map = this.zza;
        if (map.containsKey(zzgpe)) {
            zzgmx zzgmx2 = (zzgmx) map.get(zzgpe);
            if (!zzgmx2.equals(zzgmx) || !zzgmx.equals(zzgmx2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpe.toString()));
            }
        } else {
            map.put(zzgpe, zzgmx);
        }
        return this;
    }

    public final zzgpc zzc(zzgod zzgod) throws GeneralSecurityException {
        zzgpd zzgpd = new zzgpd(zzgod.zzd(), zzgod.zzc(), (zzgpf) null);
        Map map = this.zzd;
        if (map.containsKey(zzgpd)) {
            zzgod zzgod2 = (zzgod) map.get(zzgpd);
            if (!zzgod2.equals(zzgod) || !zzgod.equals(zzgod2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpd.toString()));
            }
        } else {
            map.put(zzgpd, zzgod);
        }
        return this;
    }

    public final zzgpc zzd(zzgoh zzgoh) throws GeneralSecurityException {
        zzgpe zzgpe = new zzgpe(zzgoh.zzc(), zzgoh.zzd(), (zzgpf) null);
        Map map = this.zzc;
        if (map.containsKey(zzgpe)) {
            zzgoh zzgoh2 = (zzgoh) map.get(zzgpe);
            if (!zzgoh2.equals(zzgoh) || !zzgoh.equals(zzgoh2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpe.toString()));
            }
        } else {
            map.put(zzgpe, zzgoh);
        }
        return this;
    }

    public zzgpc(zzgpg zzgpg) {
        this.zza = new HashMap(zzgpg.zza);
        this.zzb = new HashMap(zzgpg.zzb);
        this.zzc = new HashMap(zzgpg.zzc);
        this.zzd = new HashMap(zzgpg.zzd);
    }
}
