package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgmp {
    private static final Logger zza = Logger.getLogger(zzgmp.class.getName());
    private static final zzgmp zzb = new zzgmp();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgmp zzc() {
        return zzb;
    }

    private final synchronized zzgfa zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzc;
        if (concurrentMap.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzgfa) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgfa zzgfa, boolean z, boolean z2) throws GeneralSecurityException {
        String str = ((zzgmz) zzgfa).zza;
        ConcurrentMap concurrentMap = this.zzd;
        if (concurrentMap.containsKey(str)) {
            if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
        }
        ConcurrentMap concurrentMap2 = this.zzc;
        zzgfa zzgfa2 = (zzgfa) concurrentMap2.get(str);
        if (zzgfa2 != null) {
            if (!zzgfa2.getClass().equals(zzgfa.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, zzgfa2.getClass().getName(), zzgfa.getClass().getName()}));
            }
        }
        concurrentMap2.putIfAbsent(str, zzgfa);
        concurrentMap.put(str, true);
    }

    public final zzgfa zza(String str, Class cls) throws GeneralSecurityException {
        zzgfa zzg = zzg(str);
        if (zzg.zzb().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzb().toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", which only supports: " + obj);
    }

    public final zzgfa zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgfa zzgfa, boolean z) throws GeneralSecurityException {
        zzf(zzgfa, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgfa zzgfa, int i, boolean z) throws GeneralSecurityException {
        if (zzgmg.zza(i)) {
            zzh(zzgfa, false, true);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
