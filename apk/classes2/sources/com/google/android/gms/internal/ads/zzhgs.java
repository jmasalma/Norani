package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhgs implements zzhgr, zzhgl {
    private static final zzhgs zza = new zzhgs((Object) null);
    private final Object zzb;

    private zzhgs(Object obj) {
        this.zzb = obj;
    }

    public static zzhgr zza(Object obj) {
        zzhgz.zza(obj, "instance cannot be null");
        return new zzhgs(obj);
    }

    public static zzhgr zzc(Object obj) {
        return obj == null ? zza : new zzhgs(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
