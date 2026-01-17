package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgpg {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    /* synthetic */ zzgpg(zzgpc zzgpc, zzgpf zzgpf) {
        this.zza = new HashMap(zzgpc.zza);
        this.zzb = new HashMap(zzgpc.zzb);
        this.zzc = new HashMap(zzgpc.zzc);
        this.zzd = new HashMap(zzgpc.zzd);
    }

    public final zzgez zza(zzgpb zzgpb, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        zzgpd zzgpd = new zzgpd(zzgpb.getClass(), zzgpb.zzd(), (zzgpf) null);
        Map map = this.zzb;
        if (map.containsKey(zzgpd)) {
            return ((zzgmt) map.get(zzgpd)).zza(zzgpb, zzgfn);
        }
        String obj = zzgpd.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgfm zzb(zzgpb zzgpb) throws GeneralSecurityException {
        zzgpd zzgpd = new zzgpd(zzgpb.getClass(), zzgpb.zzd(), (zzgpf) null);
        Map map = this.zzd;
        if (map.containsKey(zzgpd)) {
            return ((zzgod) map.get(zzgpd)).zza(zzgpb);
        }
        String obj = zzgpd.toString();
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
    }

    public final zzgpb zzc(zzgez zzgez, Class cls, @Nullable zzgfn zzgfn) throws GeneralSecurityException {
        zzgpe zzgpe = new zzgpe(zzgez.getClass(), cls, (zzgpf) null);
        Map map = this.zza;
        if (map.containsKey(zzgpe)) {
            return ((zzgmx) map.get(zzgpe)).zza(zzgez, zzgfn);
        }
        String obj = zzgpe.toString();
        throw new GeneralSecurityException("No Key serializer for " + obj + " available");
    }

    public final zzgpb zzd(zzgfm zzgfm, Class cls) throws GeneralSecurityException {
        zzgpe zzgpe = new zzgpe(zzgfm.getClass(), cls, (zzgpf) null);
        Map map = this.zzc;
        if (map.containsKey(zzgpe)) {
            return ((zzgoh) map.get(zzgpe)).zza(zzgfm);
        }
        String obj = zzgpe.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean zzi(zzgpb zzgpb) {
        return this.zzb.containsKey(new zzgpd(zzgpb.getClass(), zzgpb.zzd(), (zzgpf) null));
    }

    public final boolean zzj(zzgpb zzgpb) {
        return this.zzd.containsKey(new zzgpd(zzgpb.getClass(), zzgpb.zzd(), (zzgpf) null));
    }
}
