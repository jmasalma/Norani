package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcqa implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzcqa(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        this.zza = zzhha2;
        this.zzb = zzhha3;
    }

    public static zzcqa zza(zzhha zzhha, zzhha zzhha2, zzhha zzhha3) {
        return new zzcqa(zzhha, zzhha2, zzhha3);
    }

    public final /* synthetic */ Object zzb() {
        Boolean valueOf = Boolean.valueOf(zzcpy.zza());
        Boolean bool = valueOf;
        boolean booleanValue = valueOf.booleanValue();
        zzegt zza2 = ((zzegu) this.zza).zzb();
        zzegt zzegt = zza2;
        zzeit zza3 = ((zzeiu) this.zzb).zzb();
        zzeit zzeit = zza3;
        if (true != booleanValue) {
            zza2 = zza3;
        }
        return zza2;
    }
}
