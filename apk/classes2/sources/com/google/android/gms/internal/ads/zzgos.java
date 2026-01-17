package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgos {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    private zzgos() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgos zza(zzgoq zzgoq) throws GeneralSecurityException {
        if (zzgoq != null) {
            zzgot zzgot = new zzgot(zzgoq.zzc(), zzgoq.zzd(), (zzgou) null);
            Map map = this.zza;
            if (map.containsKey(zzgot)) {
                zzgoq zzgoq2 = (zzgoq) map.get(zzgot);
                if (!zzgoq2.equals(zzgoq) || !zzgoq.equals(zzgoq2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgot.toString()));
                }
            } else {
                map.put(zzgot, zzgoq);
            }
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgos zzb(zzgow zzgow) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb2 = zzgow.zzb();
        if (map.containsKey(zzb2)) {
            zzgow zzgow2 = (zzgow) map.get(zzb2);
            if (!zzgow2.equals(zzgow) || !zzgow.equals(zzgow2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb2.toString()));
            }
        } else {
            map.put(zzb2, zzgow);
        }
        return this;
    }

    public final zzgov zzc() {
        return new zzgov(this, (zzgou) null);
    }

    /* synthetic */ zzgos(zzgou zzgou) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgos(zzgov zzgov, zzgou zzgou) {
        this.zza = new HashMap(zzgov.zza);
        this.zzb = new HashMap(zzgov.zzb);
    }
}
