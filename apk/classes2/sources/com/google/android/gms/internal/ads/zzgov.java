package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgov {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    /* synthetic */ zzgov(zzgos zzgos, zzgou zzgou) {
        this.zza = new HashMap(zzgos.zza);
        this.zzb = new HashMap(zzgos.zzb);
    }

    public static zzgos zza() {
        return new zzgos((zzgou) null);
    }

    public final Object zzb(zzgez zzgez, Class cls) throws GeneralSecurityException {
        zzgot zzgot = new zzgot(zzgez.getClass(), cls, (zzgou) null);
        Map map = this.zza;
        if (map.containsKey(zzgot)) {
            return ((zzgoq) map.get(zzgot)).zza(zzgez);
        }
        String obj = zzgot.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final Object zzc(zzgmy zzgmy, zzgnh zzgnh, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (map.containsKey(cls)) {
            zzgow zzgow = (zzgow) map.get(cls);
            return zzgow.zze(zzgmy, zzgnh, new zzgor(this, zzgow));
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
